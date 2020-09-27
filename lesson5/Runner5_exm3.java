import by.itClass.comparators.SortedByLoginComparator5;
import by.itClass.User5;

import java.util.Arrays;

/**
 * ООП
 * @author Alexander Butkevich
 */
public class Runner5_exm3 {
    public static void main(String[] args) {
        User5[] users = {
                new User5(5, "user1", "123"),
                new User5(10, "user2", "123"),
                new User5(12, "user3", "123"),
                new User5(3, "user4", "123"),
                new User5(7, "user5", "123"),
        };

        System.out.println(users[0].compareTo(users[1]));

        Arrays.sort(users);

        for(User5 user : users) {
            System.out.println(user.info());
        }

        SortedByLoginComparator5 loginComparator = new SortedByLoginComparator5();
        Arrays.sort(users, loginComparator);

        System.out.println();
        for(User5 user : users) {
            System.out.println(user.info());
        }
    }
}
