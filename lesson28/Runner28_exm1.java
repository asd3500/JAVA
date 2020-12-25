import by.itClass.User28;
import by.itClass.annotation.Table28;

/**
 * Annotation attributes
 */
public class Runner28_exm1 {
    public static void main(String[] args) {
        Class class1 = User28.class;

        if (class1.isAnnotationPresent(Table28.class)) {
            Table28 tableAnnotation = (Table28) class1.getDeclaredAnnotation(Table28.class);
            String name = tableAnnotation.name();
            int type = tableAnnotation.type();
            System.out.printf("name=%s; type=%d\n", name, type);
        }
    }
}
