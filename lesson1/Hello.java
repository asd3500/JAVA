/**
 * Мой первый класс,
 * вывод в консоль
 * @author Alexander Butkevich
 */
public class Hello {
    /**
     * Метод входа в программу
     * @param args набор аргументов
     */
    // Ctrl + Q вызов javadoc
    public static void main(String[] args) {
        /*
            способы вывода информации в консоль
            1. print - вывод
            2. println - вывод с переходом на новую стоку после
            3. printf - форматированный вывод
            sout->tab - println
            souf->tab - printf

            %s - строка
            %d - целое число
            %f - веществ. число
            %.3f  (3.1415 -> 3.142)
         */

        System.out.println("Hello world");
        System.out.print("Alexander ");
        System.out.println("IT CLASS");
        System.out.printf("word: %s, number int: %d, number double: %.3f", "JAVA", 100500, 3.1415);
    }

}
