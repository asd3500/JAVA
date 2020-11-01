import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * InputStream (byte)
 */
public class Runner13_exm2 {
    public static void main(String[] args) {

        final String FILE_NAME = "lesson13/in_itClass.txt";

        InputStream in = null;

        // чтение данных из файла

        try {
            in = new FileInputStream(FILE_NAME);
            //
            int value = in.read();
            System.out.println("value=" + value);
            char ch = (char)value;
            System.out.println("ch=" + ch);
            int i = 0;
//            in.reset();
            while ((i = in.read()) != -1) {
                ch = (char) i;
                System.out.print(ch);
            }

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            }
        }

    }
}
