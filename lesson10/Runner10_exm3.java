import by.itClass.Phone10;
import by.itClass.User10;

/**
 * clone
 */
public class Runner10_exm3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        User10 user = new User10(1, "admin", "Alex", 25);

        user.setPhone("12-34-56");

        User10 userCopy = (User10) user.clone();

        System.out.println("before:");
        System.out.println("user: " + user);
        System.out.println("userCopy: " + userCopy);

        /**/
            user.setId(100);
            user.setPhone("99-99-99");
            userCopy.setName("Max");
        /**/

        System.out.println("\nafter:");
        System.out.println("user: " + user);
        System.out.println("userCopy: " + userCopy);


    }
}
