/**
 * Task #2 (lesson1)
 * @author Alexander Butkevich
 */
public class Runner1_ht2 {
    /**
     * вывод в консоль аргументов одной строкой
     * @param args массив переданных аргументов
     */
    public static void main(String[] args) {

        // вывод аргументов одной строкой
        System.out.printf("Arguments: %s %s %s %s\n", args[0], args[1], args[2], args[3]);

        // вывод аргументов одной строкой в обратном порядке
        System.out.printf("Reverse arguments: %s %s %s %s", args[3], args[2], args[1], args[0]);

    }
}
