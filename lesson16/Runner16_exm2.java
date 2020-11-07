import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Collection
 */
public class Runner16_exm2 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        //elementData[] = {}
        //size = 0;
        //capacity = 10;
        list1.add("Java");
        System.out.println(list1);
        System.out.println("size=" + list1.size());
        list1.add(0,"C++");
        list1.add("JS");
        list1.add("C#");
        list1.add("Python");
        System.out.println(list1);

        boolean result = list1.remove("Java");
        System.out.println(list1);

        String word = list1.remove(0);
        System.out.println("word=" + word);
        System.out.println(list1);

        boolean isEmpty = list1.isEmpty();
        System.out.println("isEmpty=" + isEmpty);

        System.out.println("\nIteration:");
        Iterator<String> it = list1.iterator();
        while (it.hasNext()) {
            String item = it.next();
            System.out.println(item);
            if (item.equals("C++")) {
                it.remove();
            }
        }
        System.out.println(list1);

        System.out.println("\nforEach:");
        for (String item : list1) {
            System.out.println(item);
        }

        System.out.println("\nfor:");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println("index" + i + "=" + list1.get(i));
        }

        boolean isContains = list1.contains("C#");
        System.out.println("\ncontains(C#)=" + isContains);

        int index = list1.indexOf("Python");
        System.out.println("indexOf(Python)=" + index);

    }
}
