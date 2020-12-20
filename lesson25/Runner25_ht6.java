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
        final String REGEX_INDEX = "index(.+)";
        final String HEAD = "sum(";
        final String VALUE_KEY = "value";
        final String EQUAL = ")=";
        final char PLUS = '+';
        final char MINUS = '-';
        double sum = 0;
        int errLines = 0;

        Properties properties = new Properties();
        StringBuilder result = new StringBuilder();
        Pattern pattern = Pattern.compile(REGEX_INDEX);


        try (Reader reader = new FileReader(FILE_NAME)){
            properties.load(reader);
            Set<Object> keys = properties.keySet();

            for(Object item : keys) {
                String key = (String) item;
                Matcher matcher = pattern.matcher(key);
                if (matcher.matches()) {
                    try {
                        int indexI = Integer.parseInt(matcher.group(1));
                        int indexJ = Integer.parseInt(properties.getProperty(key));
                        String valueKey = VALUE_KEY + indexI + indexJ;
                        double valueK = Double.parseDouble(properties.getProperty(valueKey));
                        sum += valueK;
                        result.append((valueK>=0 ? PLUS : MINUS)).append(Math.abs(valueK));
                    } catch (NumberFormatException | NullPointerException e) {
                        errLines++;
                    }
                }
            }
            if (result.length()>0 && result.charAt(0) == PLUS) {
                result.deleteCharAt(0);
            }
            result.insert(0, HEAD);
            result.append(EQUAL).append(sum);
            System.out.println(result);
            System.out.println("errorLines=" + errLines);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
