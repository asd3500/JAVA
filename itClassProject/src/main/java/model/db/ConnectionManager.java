package model.db;

import static constants.Constants.*;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Objects;
import java.util.Properties;

public class ConnectionManager {
    private static Connection cn;
    private static Properties properties;

    static {
        try {
            properties = new Properties();
            properties.load(new FileReader(DB_PROPERTIES_FILE));
        } catch (IOException e) {
            properties = null;
            e.printStackTrace();
        }
    }

    static {
        if (Objects.nonNull(properties)) {
            try {
                Class.forName(getProperty(DB_DRIVER));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            // ....
        }
    }

    public static Connection getConnection() throws SQLException {
        if (Objects.isNull(cn) || cn.isClosed()) {
            cn = DriverManager.getConnection(
                    getProperty(DB_URL),
                    getProperty(DB_USER),
                    getProperty(DB_PASSWORD)
            );
        }
        return cn;
    }

    public static void close() {
        if(Objects.nonNull(cn)) {
            try {
                cn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Statement st) {
        if(Objects.nonNull(st)) {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(ResultSet rs) {
        if(Objects.nonNull(rs)) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    private static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
