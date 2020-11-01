import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Writer (char)
 */
public class Runner15_exm1 {
    public static void main(String[] args) {
        final String FILE_NAME = "lesson15/writer_itClass.txt";

        Writer writer = null;

        try {
            writer = new FileWriter(FILE_NAME); // append: true
            writer.write("Hello java from itClass");
            writer.append("\nFileWriter!");
//            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
