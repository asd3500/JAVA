package by.itClass.utils;

import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Objects;
import java.util.Properties;


public class MySQLUtil implements Closeable {
    private final Connection cn;

    public Connection getCn() {
        return cn;
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
    }

    @Override
    public void close() {
        close(cn);
    }

    public MySQLUtil close(AutoCloseable item) {
        if (Objects.nonNull(item)) {
            try {
                item.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this;
    }

    final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    final static String URL_PREFIX = "jdbc:mysql://";
    final static String TIME_ZONE = "serverTimezone=Europe/Minsk";
}
