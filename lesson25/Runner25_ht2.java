
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner25_ht2 {
    public static void main(String[] args) {
        final String FILE_NAME = "lesson25/itclass.txt";
        final String REGEX = "[^\\n].*//.*\\n";

        StringBuilder sb = readFile(FILE_NAME);
        StringBuilder result = new StringBuilder(sb.length());
        //System.out.println(sb);

        //1. regex для многострочных коментов
        //2. regex универсальный

        Matcher matcher = Pattern.compile(REGEX).matcher(sb);
        while (matcher.find()) {

            int start = matcher.start();
            int end = matcher.end();
            sb.delete(start, end);
            matcher.reset();
        }
        System.out.println(sb);
//        matcher.reset();
//
//        int oldEnd = 0;
//        while (matcher.find()) {
//            int start = matcher.start();
//            String substr = sb.substring(oldEnd, start-1);
//            oldEnd = matcher.end() + 1;
//            result.append(substr);
//        }
//        System.out.println(result);

    }

    private static StringBuilder readFile(String filename) {
        StringBuilder result = new StringBuilder(1500);

        try(Scanner sc = new Scanner(new FileReader(filename))) {
            final char ENTER = '\n';
            while (sc.hasNextLine()) {
                result.append(sc.nextLine()).append(ENTER);
            }


        } catch (IOException e) {
            System.err.println(e.getMessage());
        }


        return result;
    }
}
