import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner25_ht6 {
    public static void main(String[] args) {
        final String FILE_NAME = "lesson25/itClass.properties";
        final String REGEX_INDEX = "index(\\d+)";
        final String HEAD = "sum(";
        final String EMPTY = "";
        final String EQUAL = ")=";
        final char PLUS = '+';
        final char MINUS = '-';
        int errLines = 0;

        Properties properties = new Properties();
        StringBuilder result = new StringBuilder(HEAD);
        Pattern pattern = Pattern.compile(REGEX_INDEX);


        try (Reader reader = new FileReader(FILE_NAME)){
            properties.load(reader);
            Set<Object> keys = properties.keySet();

            for(Object item : keys) {
                String key = (String) item;
                Matcher matcher = pattern.matcher(key);
                if (matcher.matches()) {
                    int i = Integer.parseInt(matcher.group(1));
                    String value = properties.getProperty(key);
                    System.out.println("key: " + key + "; val=" + value + "; i:" + i);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
