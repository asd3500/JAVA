import by.itClass.User10;
import org.w3c.dom.ls.LSOutput;

public class Runner10_exm2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        User10 user1 = new User10(1, "admin", "Alex", 25);

        Object userCopy = user1.clone();
        //user1.setAge(30);

        System.out.println("user: " + user1);
        System.out.println("userCopy: " + userCopy);

        System.out.println("equals=" + user1.equals(userCopy));
        System.out.println("==: " + (user1 == userCopy));
        System.out.println("user.hash: " + user1.hashCode());
        System.out.println("userCopy.hash: " + userCopy.hashCode());

        User10 user2 = (User10) userCopy;
        User10 userCopy2 = (User10) user1.clone();

        user1.setId(100);
        user2.setName("Bob");
        System.out.println("user1: " + user1);
        System.out.println("user2: " + user2);


    }
}
