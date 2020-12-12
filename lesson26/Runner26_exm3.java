import by.itClass.annotations.MyAnn26;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * method annotation
 */
public class Runner26_exm3 {
    public static void main(String[] args) {

        Class runner = Runner26_exm3.class;

        Method[] methods = runner.getDeclaredMethods();

        for(Method method : methods) {
            String name = method.getName();
            boolean ann = method.isAnnotationPresent(MyAnn26.class);
            System.out.printf("method name: %s, ann is present: %s\n", name, ann);
            System.out.println(Arrays.toString(method.getDeclaredAnnotations()));
        }

    }

    @MyAnn26
    private static void doSmth() {
        System.out.println("Hello Annotation");
    }
}
