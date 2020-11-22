import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Runner21_exm3 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;

        LocalDate localDate = LocalDate.now();
        String dateStr = localDate.format(formatter);

        System.out.println(dateStr);


        dateStr = "20210612";
        localDate = LocalDate.parse(dateStr, formatter);
        System.out.println(localDate);

        formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println(localDate.format(formatter));

        // G - era
        // y - year
        // M - month
        // w - week (year)
        // W - week (month)
        // D - day (year)
        // d - day (month)
        // F - day (week)
        // E - day of week
        // H - hour (24)
        // h - hour (12)
        // m - minute
        // s - second
        // S - millisecond
        // z - GMT

    }
}
