import java.util.Arrays;

/**
 * Task #1 (lesson2)
 * @author Alexander Butkevich
 */
public class Runner2_ht1 {
    /**
     * работа с массивом int[7]
     */
    public static void main(String[] args) {

        // объявление и создание массива
        int[] arr = new int[7];

        // вспомогательные переменные, и переменные результата
        int minRand = -9;
        int maxRand = 9;
        int sumEvenN = 0;
        int sumOddN = 0;
        int maxNegInd = -1;

        for (int i = 0; i < arr.length; i++) {

            // инициализация массива случайными значениями
            arr[i] = (int)(Math.random() * (maxRand - minRand + 1) + minRand);

            // вычисление суммы элементов с четными/нечетными номерами
            if ((i+1)%2 == 0) {
                sumEvenN += arr[i];
            } else {
                sumOddN += arr[i];
            }

            // поиск наибольшего отрицательного числа
            if (arr[i] < 0 && (maxNegInd == -1 || arr[i] > arr[maxNegInd])) {
                maxNegInd = i;
            }

        }

        // вывод результатов в консоль
        System.out.printf("array: %s\n", Arrays.toString(arr));
        System.out.printf("even pos numbers sum: %d\nodd pos numbers sum: %d\n", sumEvenN, sumOddN);
        System.out.println("max negative number - " +
                (maxNegInd == -1 ? "all are positive" : ("#" + (maxNegInd + 1) + ": " + arr[maxNegInd])));

    }
}
