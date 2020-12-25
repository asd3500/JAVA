import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * TREEMAP
 */
public class Runner18_exm3 {
    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>(); // Integer - comparable!

        map.put(10, "Java");
        map.put(5, "PHP");
        map.put(3, "C++");
        map.put(1, "JS");

        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer key1, Integer key2) {
                String value1 = map.get(key1);
                String value2 = map.get(key2);
                return value1.compareTo(value2);
            }
        };

        Map<Integer, String> map2 = new TreeMap<>(comparator);
        map2.putAll(map);

        System.out.println(map);
        System.out.println(map2);
    }
}
