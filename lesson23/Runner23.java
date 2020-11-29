import java.sql.*;

public class Runner23 {
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
        Statement st = null;
        ResultSet rs = null;

        try {
            cn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            st = cn.createStatement();
            //st.executeQuery(); // select...
            //st.executeUpdate(); // delete, update, insert
            rs = st.executeQuery("select id, login from users");

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
