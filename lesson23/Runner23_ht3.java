import by.itClass.beans.NumLen;
import by.itClass.db.ConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Runner23_ht3 {
    public static void main(String[] args) {
        List<NumLen> list = new ArrayList<>();
        Connection cn = null;
        Statement st = null;
        PreparedStatement pst = null;
        ResultSet rs = null;


        try {
            cn = ConnectionManager.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery("select abs(x2-x1) as len, count(*) as count" +
                    " from coordinates" +
                    " group by len" +
                    " order by len;");
            while (rs.next()) {
                double len = rs.getDouble("len");
                int count = rs.getInt("count");
                list.add(new NumLen(len, count));
            }
            list.forEach(System.out::println);

            pst = cn.prepareStatement("insert into frequencies(len, count) values (?, ?)");
            PreparedStatement finalPst = pst;
            for (NumLen obj : list) {
                pst.setDouble(1, obj.getLen());
                pst.setInt(2, obj.getCount());
                pst.executeUpdate();
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionManager.closeResultSet(rs);
            ConnectionManager.closeStatement(st);
            ConnectionManager.closeStatement(pst);
            ConnectionManager.closeConnection();
        }


    }
}
