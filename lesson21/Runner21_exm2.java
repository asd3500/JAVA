import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * Date
 */
public class Runner21_exm2 {
    public static void main(String[] args) {
        String dateStr = "2020-10-22";
        //java.sql.Date / java.util.Date
        //java.sql.Time

        Date date1 = new Date(120, Calendar.NOVEMBER, 22);
        System.out.println(date1);

        Date date2 = new Date(1621217545412L);
        System.out.println(date2);

        Date date3 = new Date();

        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1);

        LocalDate localDate2 = LocalDate.of(2020, 12, 22);
        System.out.println(localDate2);

        LocalDate localDate3 = LocalDate.parse(dateStr);
        System.out.println(localDate3);

        System.out.println(localDate1 + " isBefore " + localDate2 + " = " + localDate1.isBefore(localDate2));
        System.out.println(localDate2 + " isAfter " + localDate3 + " = " + localDate2.isAfter(localDate3));

        LocalDate localDate4 = localDate1.plusDays(100);
        System.out.println(localDate4);

        localDate4 = localDate1.minusDays(50);
        System.out.println(localDate4);

        boolean flag = localDate1.isEqual(localDate2);
        System.out.println(flag);
    }
}
