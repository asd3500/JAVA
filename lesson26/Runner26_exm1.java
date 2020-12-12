import by.itClass.annotations.MyAnn26;

import java.util.Date;

/**
 * Annotation
 */
@MyAnn26
public class Runner26_exm1 {

    @MyAnn26
    private final static String NAME = "IT CLASS";

    public static void main(String[] args) {

        /*
        @Override - переопределение метода
        @Native - нативная реализация
        @SuppressWarning() - отключение предупреждений об ошибках
        @Deprecated - аннотация для устаревшего метода
        @Target() - задание области работы аннотации (method, class)
        @Retention() - задание времени работы аннотации (source, runtime)
        @Documented - необходимость в javadoc для метода
         */

        Date date = new Date();

        @SuppressWarnings("unchecked")
        int a = (int) 8.2;

        System.out.println(NAME);
        System.out.println("ANNOTATION");
        doSmth();

        Class runner = Runner26_exm1.class;
        System.out.println("Runner. @MyAnn isPresent: " + runner.isAnnotationPresent(MyAnn26.class));

        Class string = String.class;
        System.out.println("String. @MyAnn isPresent: " + string.isAnnotationPresent(MyAnn26.class));

        Class ann = MyAnn26.class;
        System.out.println("MyAnn isAnnotation: " + ann.isAnnotation());
        System.out.println("Runner isAnnotation: " + runner.isAnnotation());
        System.out.println("String isAnnotation: " + string.isAnnotation());
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @MyAnn26
    private static void doSmth() {
        System.out.println("Hello Annotation");
    }
}
