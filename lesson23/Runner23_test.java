import java.sql.*;
import java.util.Scanner;

public class Runner23_test {
    public static void main(String[] args) {
        final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost/userdb?serverTimezone=Europe/Minsk";
        final String DB_USER = "root";
        System.out.println("PASSWORD");
        final String DB_PASSWORD = (new Scanner(System.in)).nextLine();

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
            rs = st.executeQuery("select * from users");

            while (rs.next()) {
                String name = rs.getString("firstname");
                int age = rs.getInt("age");
                System.out.printf("name: %s, age: %d\n", name, age);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

    }
}
