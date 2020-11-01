import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Scanner
 */
public class Runner15_exm3 {
    public static void main(String[] args) {
        final String FILE_NAME = "lesson15/reader_itClass.txt";

        Scanner sc = null;

        try {
            sc = new Scanner(new FileReader(FILE_NAME));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
//            System.exit(0);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
