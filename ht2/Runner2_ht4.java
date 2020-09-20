import java.util.Arrays;
import java.util.Scanner;

/**
 * Task #4 (lesson2)
 * @author Alexander Butkevich
 */
public class Runner2_ht4 {
    /**
     * работа с двумерным массивом int[3][4]
     */
    public static void main(String[] args) {

        // объявление и создание массива
        int[][] arr = new int[3][4];

        // инициализация массива с консоли
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("array item (%d;%d) = ", i + 1, j + 1);
                arr[i][j] = sc.nextInt();
            }
        }

        // вывод всего массива в консоль
        System.out.println("array:");
        for (int[] row: arr) {
            for (int item: row) {
                System.out.printf("%7d", item);
            }
            System.out.println();
        }

        // объявление переменных k,s и инициализация их с консоли
        int k = 0;
        System.out.printf("\ninput value for k [1;%d]: ", arr.length);
        while(k <= 0 || k > arr.length) {
            k = sc.nextInt();
            if (k <= 0 || k > arr.length) {
                System.out.print("incorrect value, repeat: ");
            }
        }
        int s = 0;
        System.out.printf("input value for s [1;%d]: ", arr[0].length);
        while(s <= 0 || s > arr[0].length) {
            s = sc.nextInt();
            if (s <= 0 || s > arr[0].length) {
                System.out.print("incorrect value, repeat: ");
            }
        }
        sc.close();

        // приведение введенных номеров строк/столбцов к индексам
        k--; s--;

        // замена значений в массиве
        Arrays.fill(arr[k], 5);
        for (int i = 0; i < arr.length; i++) {
            arr[i][s] = 10;
        }

        // вывод полученного массива в консоль
        System.out.println("new array:");
        for (int[] row: arr) {
            for (int item: row) {
                System.out.printf("%7d", item);
            }
            System.out.println();
        }

    }
}
