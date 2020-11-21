import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Runner19_exm2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "C++", "PHP", "JavaScript", "VBasic");
        // Stream API

        for (String value: list) {
            System.out.print(value + "; ");
        }

        System.out.println();
        Stream<String> stream = list.stream();
        stream.forEach(value -> System.out.print(value + "; "));

        System.out.println();
        list.forEach(value -> System.out.print(value + "; "));

        Consumer<Integer> consumer1 = value -> System.out.println("\n" + (value * 2));
        Consumer<Double> consumer2 = value -> value *= Math.random() * 100;
        Consumer<String> consumer3 = value -> System.out.print(value + "; ");

        consumer1.accept(100);
        list.forEach(consumer3);

        Predicate<String> predicate1 = value -> value.length() > 3;

        System.out.println("\nfiltered:");
        stream = list.stream();
        stream.filter(predicate1).forEach(consumer3);

        System.out.println("\n\n");
        list.stream()
                .filter(item -> item.startsWith("J"))
                .forEach(System.out::println);
    }
}
