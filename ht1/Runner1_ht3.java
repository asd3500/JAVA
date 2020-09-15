/**
 * Task #3 (lesson1)
 * @author Alexander Butkevich
 */
public class Runner1_ht3 {
    /**
     * вывод в консоль аргументов
     * методами println, print
     */
    public static void main(String[] args) {

        // вывод каждого аргумета в отдельном методе println()
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);

        // вывод каждого аргумента в отдельном методе print()
        System.out.print(args[0] + ' ');
        System.out.print(args[1] + ' ');
        System.out.print(args[2] + '\n');

    }
}
