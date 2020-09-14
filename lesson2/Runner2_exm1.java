/**
 * Массивы
 * @author Alexander Butkevich
 */
public class Runner2_exm1 {
    public static void main(String[] args) {

        /*Массивы - структура данных, которая позволяет хранить элементы одного типа.
         * Размерность массива не изменяется.
         * Каждый элемент массива имеет индекс, который считается с 0.
         * Порядок добавления элементов равен порядку итерирования.
         */

        //Объявление массива
        int[] arr1 = null;
        int[] arr2 = null;
        int[] arr3 = null;

        //Создание массива
        arr1 = new int[5];  // arr1, arr2, arr3 - ссылки
        arr2 = arr1;        // [0,0,0,0,0] инициализируется 0
        arr1 = new int[10];
        arr3 = arr1;

        //Объявление и создание массива
        int[] arr4 = new int[20];   // Java
        int arr5[] = new int[5];    // C,C++

        //Объявление создание и инициализация значениями
        int[] arr6 = new int[] {7, 9, 15, 3, 8};
        int[] arr7 = {7, 9, 15, 3, 8};

        //Инициализация элементов массива значениями
        arr1[0] = 500;

        //Получение значений элементов массива
        int item = arr1[0];
        System.out.printf("arr1[0] = %d, item = %d\n", arr1[0], item);

        //Получение свойства: длина массива
        int length = arr1.length;
        System.out.printf("length = %d\n", length);

        //Многомерные массивы
        int[][] arr8 = new int[4][3];
        /* [0][0], [0][1], [0][2]
         *  [1][0], [1][1], [1][2]
         *  [2][0], [2][1], [2][2]
         *  [3][0], [3][1], [3][2]
         */
        System.out.println(arr8.length);
        System.out.println(arr8[0].length);

        int[][] arr9 = {
                {1,2,3},
                {4,5,6}
        };
    }
}
