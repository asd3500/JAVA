
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
/**
 * Reader (char)
 */
public class Runner15_exm2 {
    public static void main(String[] args) {
        final String FILE_NAME = "lesson15/reader_itClass.txt";

        Reader reader = null;

        try {
            reader = new FileReader(FILE_NAME);
            int i = 0;
            while ((i = reader.read()) != -1) {
                char ch = (char) i;
                System.out.print(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
