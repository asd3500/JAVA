package by.itClass.utils;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Objects;
import java.util.Properties;


public class MySQLUtil implements AutoCloseable {
    private final Connection cn;
    private final Statement st;
    private PreparedStatement pst;
    private ResultSet rs;

    public ResultSet getRs() {
        return rs;
    }

    public MySQLUtil(String filename) throws SQLException {

        // проверка на наличие драйвера
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            throw new SQLException(e);
        }

        // чтение параметров для подключения БД
        Properties dbProp = new Properties();
        try {
            dbProp.load(new FileReader(filename));
        } catch (IOException e) {
            throw new SQLException(e);
        }
        String user = dbProp.getProperty("user");
        String password = dbProp.getProperty("password");
        String db = dbProp.getProperty("db");
        String host = dbProp.getProperty("host");
        String url = URL_PREFIX + host + "/" + db + "?" + TIME_ZONE;

        // подключение БД
        cn = DriverManager.getConnection(url, user, password);
        st = cn.createStatement();
    }

    /**
     * Executes sql query in PreparedStatement pst
     */
    public void executeQuery() throws SQLException {
        checkConnection();
        if (Objects.nonNull(pst)) {
            rs = pst.executeQuery();
        } else {
            throw new SQLException("Prepared statement is null");
        }
    }

    /**
     * Executes sql query
     * @param sql query statement
     */
    public void executeQuery(String sql) throws SQLException {
        checkConnection();
        if (Objects.nonNull(st)) {
            rs = st.executeQuery(sql);
        } else {
            throw new SQLException("Statement is null");
        }
    }

    /**
     * Creates PreparedStatement and stores it to pst
     * @param sql query statement
     */
    public void prepareStatement(String sql) throws SQLException {
        checkConnection();
        pst = cn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
    }

    @Override
    public void close() {
        close(rs);
        close(st);
        close(pst);
        close(cn);
    }

    private void close(AutoCloseable item) {
        if (Objects.nonNull(item)) {
            try {
                item.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void checkConnection() throws SQLException {
        if(Objects.isNull(cn) || cn.isClosed()) {
            throw new SQLException("connection missed");
        }
    }

    final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    final static String URL_PREFIX = "jdbc:mysql://";
    final static String TIME_ZONE = "serverTimezone=Europe/Minsk";
}
