import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList
 */
public class Runner16_exm3 {
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        list1.add("Java");
        list1.add("C++");
        list1.add("PHP");

        String item = list1.get(1);
        System.out.println("item=" + item);
    }
}
