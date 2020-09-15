import java.util.Arrays;

/**
 * Task #1 (lesson2)
 * @author Alexander Butkevich
 */
public class Runner2_ht2 {
    /**
     * работа с массивом double[10]
     */
    public static void main(String[] args) {

        // объявление и создание массива
        double[] arr = new double[10];

        System.out.print("array:     [");
        for (int i = 0; i < arr.length; i++) {

            // инициализация массива случайными значениями
            arr[i] = Math.random() * 9 - 4;

            // вывод в консоль,
            System.out.printf("%s%5.2f", (i > 0 ? " " : ""), arr[i]);

            // изменение положительных/отрицательных элементов
            if (arr[i] > 0) {
                arr[i] /= 2.;
            } else if (arr[i] < 0) {
                arr[i] = i;
            }
        }
        System.out.println("]");

        // вывод измененного массива в консоль
        System.out.print("new array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s%5.2f", (i > 0 ? " " : ""), arr[i]);
        }
        System.out.println("]");

    }
}
