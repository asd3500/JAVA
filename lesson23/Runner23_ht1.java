import by.itClass.utils.PropertiesUtil;

import java.sql.*;

public class Runner23_ht1 {
    public static void main(String[] args) {
        final String FILE_NAME = "lesson23/db.properties";

        PropertiesUtil util = new PropertiesUtil(FILE_NAME);

        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            Class.forName(util.get("db.driver"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            cn = DriverManager.getConnection(
                    util.get("db.url"),
                    util.get("db.user"),
                    util.get("db.password")
            );
            st = cn.createStatement();
            rs = st.executeQuery("select * from mytable");

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String email = rs.getString(3);
                System.out.printf("id=%d; name=%s; email=%s\n", id, name, email);
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
