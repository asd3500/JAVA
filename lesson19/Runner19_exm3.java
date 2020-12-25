import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stream API
 */
public class Runner19_exm3 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Java", "C++", "Java", "C++", "PHP", "PHP", "JavaScript", "VBasic");
        System.out.println("list1: " + list1);

        List<String> list2 = new ArrayList<>();

        list1.stream()
                .filter(item -> item.length() > 3)
                .forEach(list2::add);

        System.out.println("list2: " + list2);

        List<String> list3 = list1.stream()
                .distinct()     // уникальные элементы
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(list3.getClass().getSimpleName());
        System.out.println("list3: " + list3);

        long count = list3.stream().count();
        System.out.println("count=" + count);

        List<String> list4 = Arrays.asList("18", "2020", "35", "449", "1");

        list4.stream()
                .map(Integer::parseInt)
                .forEach(value -> System.out.println("value=" + value + "; class=" + value.getClass().getSimpleName()));

        int sum = list4.stream()
                .collect(Collectors.summingInt(Integer::parseInt));
        System.out.println("sum=" + sum);

        boolean result = list4.stream()
                .allMatch(String::isEmpty);
        System.out.println("all is empty: " + result);

        result = list4.stream()
                .map(Integer::parseInt)
                .anyMatch(item -> item > 100);
        System.out.println("any is > 100: " + result);

        result = list4.stream()
                .noneMatch(String::isEmpty);
        System.out.println("none is empty: " + result);

        System.out.println("dropWhile");
        list4.stream()
                .dropWhile(value -> value.length() == 2)
                .forEach(System.out::println);
    }
}
