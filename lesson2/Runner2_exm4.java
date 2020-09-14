import java.util.Scanner;

/**
 * Scanner
 * @author Alexander Butkevich
 */
public class Runner2_exm4 {
    public static void main(String[] args) {

        // определение переменной для хранения объекта сканнера
        Scanner sc = null;

        // создание сканнера
        sc = new Scanner(System.in);

        // получение считанного значения
        System.out.println("enter some integer");
        int number = sc.nextInt();
        System.out.println("enter some double");
        double mass = sc.nextDouble();
        System.out.printf("int = %d\ndouble = %.2f", number, mass);

        String line = null;

        sc.skip(".*\n");

        System.out.println("\nenter line");
        line = sc.nextLine();

        System.out.println(line);

        // закрытие ресурса
        sc.close();

    }
}
