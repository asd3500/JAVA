import java.sql.*;
/**
 * JDBC API
 */
public class Runner23_exm3 {
    public static void main(String[] args) {
        // JDBC API
        final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost/itclass?serverTimezone=Europe/Minsk";
        final String DB_USER = "root";
        final String DB_PASSWORD = "";

        try {
            Class.forName(DRIVER_NAME);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection cn = null;
        PreparedStatement pst = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            cn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            pst = cn.prepareStatement("insert into users(id, login, password, date) values " +
                            "(99, 'Program1', 'q123', '2020-12-04'), " +
                            "(199, 'Program2', 'q567', '2020-12-04')",
                    PreparedStatement.RETURN_GENERATED_KEYS);
            pst.executeUpdate();

            rs = pst.getGeneratedKeys();

            while (rs.next()) {
                int key = rs.getInt(1);
                System.out.printf("key: %d\n", key);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
