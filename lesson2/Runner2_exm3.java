import java.util.Arrays;
import java.util.Comparator;

/**
 * Матрица
 * @author Alexander Butkevich
 */
public class Runner2_exm3 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random() * 100); // double -> [0;1)
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }

        // сортировка массива

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }
}
