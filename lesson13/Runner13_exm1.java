import java.io.*;

/**
 * Files
 */
public class Runner13_exm1 {
    public static void main(String[] args) {
        // System.out
        // System.err.println();

        final String FILE_NAME = "lesson13/out_itClass.txt";
        OutputStream out = null;

        // запись данных в файл
        try {
            System.out.println("try");
            out = new FileOutputStream(FILE_NAME); // , append: true
            //
            String str = "Hello Java from IT CLASS";
            byte[] bytes = str.getBytes();
            out.write(bytes, 0, 6);
            out.flush(); // запилить в файл
            out.write(bytes);

        } catch (FileNotFoundException | IndexOutOfBoundsException e) { // или | или - для исключений в разных иерархиях
            System.out.println("catch");
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("finally");
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            }
        }



    }
}
