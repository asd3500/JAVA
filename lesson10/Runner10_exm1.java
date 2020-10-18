import by.itClass.User10;

import java.lang.reflect.Field;

/**
 *  equals, hashcode, Class, Field
 */
public class Runner10_exm1 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        User10 user = new User10(1, "admin", "Alex", 19);
        User10 user2 = new User10(1, "admin", "Alex", 19);

        String strUser = user.show();
        System.out.println(strUser);
        System.out.println(user.show());

        System.out.println(user);

        Class userClass = user.getClass();
        System.out.println(userClass.getName());
        System.out.println(userClass.getSimpleName());

//        Field[] fields = userClass.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field.getName());
//        }
//
//        Field fieldID = userClass.getDeclaredField("id");
//        System.out.println(fieldID.getName());
//        fieldID.setAccessible(true);
//        fieldID.set(user, 10000);
//
//        System.out.println(user);

        int hashCode1 = user.hashCode();
        int hashCode2 = user2.hashCode();
        System.out.println(hashCode1);
        System.out.println(hashCode2);

        boolean isEqual = user.equals(user2);
        System.out.println("isEqual=" + isEqual);

    }
}
