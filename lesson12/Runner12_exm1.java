import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * exception
 */
public class Runner12_exm1 {
    public static void main(String[] args) {

        // exception
        System.out.println("Hello Java");
        int zero = 0;
        int a = 8;

        // Object
        // Throwable    // Error
                        // Exception
        // RuntimeException -> ArrayIndexOutOfBoundException... (unchecked)
        // IOException -> FileNotFoundException... (checked)


        //try-catch
        try {
            int result = a / zero;
            System.out.println(result);
        } catch (ArithmeticException exception) {
            System.err.println("Error: " + exception.getMessage());
            exception.printStackTrace();
        }

        System.out.println("Java after exception");

//        try {
//            new FileReader("src/itClass.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
