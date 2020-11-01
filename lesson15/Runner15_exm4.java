import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.DayOfWeek;
import java.util.Scanner;

/**
 * try-catch-resources
 */
public class Runner15_exm4 {
    public static void main(String[] args) {
        final String FILE_NAME = "lesson15/reader_itClass.txt";


        try (Scanner sc = new Scanner(new FileReader(FILE_NAME));
             Scanner sc1 = new Scanner(new FileReader(FILE_NAME))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } //auto -> finally sc.close(), sc1.close()

    }
}
