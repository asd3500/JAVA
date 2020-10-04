import by.itClass.exm1.Role6;
import by.itClass.exm1.Security6;
import by.itClass.exm1.User6;

import java.util.Arrays;

/**
 * ENUM
 * @author Alexander Butkevich
 */
public class Runner6_exm1 {
    public static void main(String[] args) {
        User6 user1 = new User6("Admin", "12345", "ADMIN");
        User6 user2 = new User6("Alex", "123", "GUEST");

        System.out.println("user1 is admin:" + Security6.isAccess(user1, "ADMIN"));
        System.out.println("user2 is admin:" + Security6.isAccess(user2, "ADMIN"));
        System.out.println("user2 is guest:" + Security6.isAccess(user2, "GUEST"));

        Role6 role1 = Role6.ADMIN; // ADMIN
        System.out.println(role1);

        Role6 role2 = Role6.MODERATOR;

        System.out.println(role1.equals(role2));
        System.out.println(role1 == role2);
        System.out.println("role1.id=" + role1.getId());
        System.out.println("role2.id=" + role2.getId());

        user1 = new User6("Admin", "12345", role1);
        user2 = new User6("Alex", "123", role2);
        User6 user3 = new User6("Max", "123123", Role6.GUEST);

        // методы Enum
        int ordinal = role1.ordinal();
        System.out.println("role=" + role1 + ", ordinal=" + ordinal);
        System.out.println("role=" + Role6.MODERATOR + ", ordinal=" + Role6.MODERATOR.ordinal());

        Role6[] roles = Role6.values();
        System.out.println(Arrays.toString(roles));

        Role6 role3 = Role6.valueOf("ADMIN");
        System.out.println(role3);




    }
}
