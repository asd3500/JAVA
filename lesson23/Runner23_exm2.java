import java.sql.*;

public class Runner23_exm2 {
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
        ResultSet rs = null;

        try {
            cn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            pst = cn.prepareStatement("select id, login from users where id > ? and login like ?");
            System.out.println(pst);
            pst.setInt(1,7);
            pst.setString(2,"us%");
            System.out.println(pst);
            rs = pst.executeQuery();


            while (rs.next()) {
                int id = rs.getInt("id");
                String login = rs.getString("login");
                System.out.printf("id: %d, login: %s\n", id, login);
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
