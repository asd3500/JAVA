import java.util.Arrays;

/**
 * Task #7 (lesson2)
 * @author Alexander Butkevich
 */
public class Runner2_ht7 {
    /**
     * работа с двумерным массивом int[7][7]
     */
    public static void main(String[] args) {

        // объявление и создание массива
        int[][] arr = new int[7][7];

        // вспомогательные переменные
        int minRand = -50;
        int maxRand = 100;
        double[] avgCol = new double[arr[0].length];
        int[] sumCol = new int[arr[0].length];
        int[] sumBlwSD = new int[arr[0].length - 1];
        int[] mulFstLast = new int[arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                // инициализация массива случайными значениями
                arr[i][j] = (int) (Math.random() * (maxRand - minRand + 1)) + minRand;

                // массив из сумм элементов каждого столбца
                sumCol[j] += arr[i][j];

                // массив из средних арифм. каждого столбца
                if(i == arr.length - 1) {
                    avgCol[j] = sumCol[j] / (double)(arr.length);
                }

                // массив из элементов стоящих ниже побочной диагонали, соответствующей строки
                if (j > (arr[i].length - 1 - i)) {
                    sumBlwSD[i-1] += arr[i][j];
                }
            }

            // массив из произведений первых и последних элементов соответствующих строк
            mulFstLast[i] = arr[i][0] * arr[i][arr[i].length - 1];
        }

        // вывод исходного массива в консоль
        System.out.println("array:");
        for (int[] row : arr) {
            for (int item : row) {
                System.out.printf("%7d", item);
            }
            System.out.println();
        }

        // вывод результатов
        System.out.print("columns elements sum array: [");
        for (int i = 0; i < sumCol.length; i++) {
            System.out.printf("%s%7d", (i == 0 ? "" : ";"), sumCol[i]);
        }
        System.out.print("]\ncolumns average array:  \t[");
        for (int i = 0; i < avgCol.length; i++) {
            System.out.printf("%s%7.2f", (i == 0 ? "" : ";"), avgCol[i]);
        }
        System.out.print("]\nbelow sec. diag. sum array: \t\t[");
        for (int i = 0; i < sumBlwSD.length; i++) {
            System.out.printf("%s%7d", (i == 0 ? "" : ";"), sumBlwSD[i]);
        }
        System.out.print("]\nrow 1st'n'last mul. array: \t[");
        for (int i = 0; i < mulFstLast.length; i++) {
            System.out.printf("%s%7d", (i == 0 ? "" : ";"), mulFstLast[i]);
        }
        System.out.println("]");
    }
}
