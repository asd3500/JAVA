import java.util.SortedSet;
import java.util.TreeSet;

/**
 * TreeSet
 */
public class Runner17_exm3 {
    public static void main(String[] args) {
        SortedSet<Integer> set1 = new TreeSet<>();

        set1.add(1);
        set1.add(10);
        set1.add(8);
        set1.add(5);
        set1.add(2);
        set1.add(7);

        System.out.println(set1);

        SortedSet<Integer> subset = set1.subSet(2,8);

        System.out.println(subset);


    }
}
