import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * MAP
 */
public class Runner18_exm1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        // map -> key: value
        // key - Integer; value - String

        String value;

        map.put(10, "Java"); // <10; Java>
        map.put(5, "PHP");

        value = map.put(3, "C++");
        System.out.println(value);

        value = map.put(10, "JavaSE");
        System.out.println(value);

        System.out.println(map);

        value = map.get(10);
        System.out.println(value);

        value = map.putIfAbsent(5, "WWW");
        System.out.println(value);

        value = map.putIfAbsent(11, "C#");
        System.out.println(value);

        value = map.remove(5);
        System.out.println(value);

        value = map.remove(100);
        System.out.println(value);

        boolean flag = map.remove(3, "C++");
        System.out.println(flag);


        System.out.println(map);
    }
}
