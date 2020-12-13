import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

/**
 * *.properties
 */
public class Runner27_exm2 {
    public static void main(String[] args) {
        final String FILE_NAME = "lesson27/itClass.properties";

        Properties properties = new Properties();
        Reader rd = null;
        try {
            rd = new FileReader(FILE_NAME);
            properties.load(rd);
            String userName = properties.getProperty("user.name");
            String userPass = properties.getProperty("user.password");
            System.out.println("name: " + userName);
            System.out.println("pass: " + userPass);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (rd != null) {
                try {
                    rd.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
