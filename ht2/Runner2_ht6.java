import java.util.Arrays;

/**
 * Task #6 (lesson2)
 * @author Alexander Butkevich
 */
public class Runner2_ht6 {
    /**
     * работа с двумерным массивом int[5][5] #2
     */
    public static void main(String[] args) {

        // объявление и создание массива
        int[][] arr = new int[5][5];

        // вспомогательные переменные
        int minRand = -25;
        int maxRand = 25;
        double avgAbovePD = 0.;
        double avgAboveSD = 0.;
        int[] minCol = null;
        int sumMinCol = 0;
        int maxNeg = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                // инициализация массива случайными значениями
                arr[i][j] = (int)(Math.random() * (maxRand - minRand + 1)) + minRand;

                // суммы элементов стоящих выше главной/побочной диагональю
                if (j>i) {
                    avgAbovePD += arr[i][j];
                }
                if (j<(arr[i].length - 1 - i)) {
                    avgAboveSD += arr[i][j];
                }

                // минимальные элементы столбцов матрицы
                if (i > 0) {
                    if (arr[i][j] < minCol[j]) {
                        minCol[j] = arr[i][j];
                    }
                }

                // максимальный отрицательный элемент
                if (arr[i][j] < 0 && (arr[i][j] > maxNeg || maxNeg == 0)) {
                    maxNeg = arr[i][j];
                }

                // минимальный элемент
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }

            // инициализация массива минимальных элементов столбцов, первой строкой матрицы
            if (i == 0) {
                minCol = Arrays.copyOf(arr[0], arr[0].length);
            }
        }

        // средние арифметические значения элементов стоящих выше главной/побочной диагонали
        avgAbovePD /= arr.length * (arr.length - 1) / 2.;
        avgAboveSD /= arr.length * (arr.length - 1) / 2.;

        // сумма минимальных элементов столбцов матрицы
        for (int item: minCol) {
            sumMinCol += item;
        }

        // вывод исходного массива в консоль
        System.out.println("array:");
        for (int[] row : arr) {
            for (int item : row) {
                System.out.printf("%7d", item);
            }
            System.out.println();
        }

        // замена элементов главной диагонали массива
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = min;
        }

        // вывод результатов
        System.out.printf("\naverage above primary diagonal: %.2f" +
                "\naverage above secondary diagonal: %.2f" +
                "\nsum of columns minimal values: %d" +
                "\nmaximal negative value: %s\n",
                avgAbovePD, avgAboveSD, sumMinCol, maxNeg == 0 ? "all are positive" : Integer.toString(maxNeg));
        System.out.println("new array:");
        for (int[] row : arr) {
            for (int item : row) {
                System.out.printf("%7d", item);
            }
            System.out.println();
        }

    }
}
