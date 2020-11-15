import java.util.*;

/**
 * HASHMAP, ENTRY
 */
public class Runner18_exm2 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(10, "Java");
        map.put(5, "PHP");
        map.put(3, "C++");
        map.put(1, "JS");

        System.out.println(map);

        String value = map.get(3);
        System.out.println(value);

        Set<Integer> keys = map.keySet();
        System.out.println(keys);

        for (Integer key : keys) {
            System.out.println(map.get(key));
        }

        Collection<String> values = map.values();
        System.out.println(values);

//        List<String> list = (List<String>) values;
        List<String> list = new ArrayList<>(values);
        System.out.println(list);

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String val = entry.getValue();
            System.out.println("\t" + entry);
            System.out.println("key=" + key);
            System.out.println("val=" + val);
        }

        value = map.getOrDefault(12, "DEFAULT");
        System.out.println(value);
    }
}
