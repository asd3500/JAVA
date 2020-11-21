import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.round;

public class Runner18_ht4 {
    public static void main(String[] args) {
        final String FILE_NAME = "lesson18/by/itClass/itClass.txt";
        Map<Double, Integer> segments = new TreeMap<>();
        readFileIntoMap(FILE_NAME, segments);
        System.out.println("segments: " + segments);

        Comparator<Double> comparator1 = new Comparator<Double>() {
            @Override
            public int compare(Double len1, Double len2) {
                return segments.get(len1) - segments.get(len2);
            }
        };

        Comparator<Double> comparator2 = (len1, len2) -> segments.get(len2) - segments.get(len1);


        Map<Double, Integer> newMap = new TreeMap<>(comparator1);
        newMap.putAll(segments);
        System.out.println("newMap: " + newMap);
    }

    private static void readFileIntoMap(String filename, Map<Double, Integer> map) {
        final String REGEX = "[ ;]";

        try(Scanner out = new Scanner(new FileReader(filename))) {

            while (out.hasNextLine()) {
                String[] values = out.nextLine().split(REGEX);
                int x1 = Integer.parseInt(values[0]);
                int y1 = Integer.parseInt(values[1]);
                int x2 = Integer.parseInt(values[2]);
                int y2 = Integer.parseInt(values[3]);

                double length = round(sqrt(pow(x1-x2, 2) + pow(y1-y2, 2)) * 100) / 100.;
                int amount = map.getOrDefault(length, 0);
                map.put(length, ++amount);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
