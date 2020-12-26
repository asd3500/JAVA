import by.itClass.User28;
import by.itClass.handlers.UserHandler29;

/**
 * XML DOM
 */
public class Runner29_exm2 {
    public static void main(String[] args) {

        final String FILE_NAME = "lesson29/itClass.xml";
        User28 user = null;

        UserHandler29 handler = new UserHandler29();
        handler.parse(FILE_NAME);
        user = handler.getUser();

        System.out.println(user);


    }

}
