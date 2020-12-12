import by.itClass.annotations.MyAnn26;

import java.lang.reflect.Field;

/**
 * fields annotation
 */
public class Runner26_exm2 {
    private static int serialID = 1;
    @MyAnn26
    private final static String GROUP = "IT CLASS";


    public static void main(String[] args) {

        Class runner = Runner26_exm2.class;

        Field[] fields = runner.getDeclaredFields();

        for(Field field : fields) {
            String name = field.getName();
            boolean ann = field.isAnnotationPresent(MyAnn26.class);
            System.out.printf("field name: %s, ann is present: %s\n", name, ann);
        }


    }

}
