package by.itClass.db;

import java.sql.*;

public class ConnectionManager {
    private static final String FILE_NAME = "lesson23/db.properties";
    private static final PropertiesUtil properties;
    private static Connection cn = null;

    static {
        properties = new PropertiesUtil(FILE_NAME);
        try {
            Class.forName(properties.get("db.driver"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        if (cn == null || cn.isClosed()) {
            cn = DriverManager.getConnection(
                    properties.get("db.url"),
                    properties.get("db.user"),
                    properties.get("db.password")
            );
        }
        return cn;
    }

    public static void closeConnection() {
        if (cn != null) {
            try {
                cn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void closeStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
