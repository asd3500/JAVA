import by.itClass.Person17;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * LinkedHashSet
 */
public class Runner17_exm2 {
    public static void main(String[] args) {
        Set<Person17> set1 = new LinkedHashSet<>();

        Person17 person1 = new Person17("Alex", 23);
        Person17 person2 = new Person17("Alex", 30);

        set1.add(person1);
        set1.add(person2);

        System.out.println(set1);
        System.out.println("hashCode:" + person2.hashCode());
        System.out.println("contains:" + set1.contains(person2));
        person2.setAge(18);
        System.out.println("hashCode:" + person2.hashCode());
        System.out.println("contains:" + set1.contains(person2));

        for (Person17 person : set1) {
            System.out.println(person);
        }
    }
}
