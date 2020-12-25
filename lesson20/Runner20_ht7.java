import by.itClass.Car20;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
/**
 * Stream API
 */
public class Runner20_ht7 {
    public static void main(String[] args) {
        List<Car20> cars = Arrays.asList(
                new Car20("Lada", "3423 AB-3", LocalDate.of(2020, Month.AUGUST, 1)),
                new Car20("Lada", "1234 EE-3", LocalDate.of(2008, Month.AUGUST, 1)),
                new Car20("BMW", "1187 AC-3", LocalDate.of(2015, Month.JUNE, 1)),
                new Car20("Geely", null, LocalDate.of(2009, Month.OCTOBER, 1)),
                new Car20("Opel", "8346 PE-3", LocalDate.of(2010, Month.JANUARY, 1)),
                new Car20("VW", "5422 AA-3", LocalDate.of(2019, Month.MARCH, 1))
        );

        cars.forEach(System.out::println);

        System.out.println();

        cars.stream()
                .filter(car -> car.getYear() > 2010)
                .map(Car20::getRegNumber)
                .filter(Objects::nonNull)
                .forEach(System.out::println);

        List<String> regNumbers = cars.stream()
                .filter(car -> car.getYear() <= 2010)
                .map(Car20::getRegNumber)
                .filter(Objects::nonNull)
                .collect(Collectors.toCollection(LinkedList::new));

        System.out.println();
        System.out.println(regNumbers);
    }
}
