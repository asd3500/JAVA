/**
 * Массивы, циклы, условные операторы
 * @author Alexander Butkevich
 */
public class Runner2_exm2 {
    public static void main(String[] args) {
        // объявление переменной и создание массива
        int[] arr = new int[15];

        // инициализация массива значениями
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 18 * i;
        }

        // вывод значений в консоль
        System.out.println("for i");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }

        // вывод элементов массива в цикле forEach
        System.out.println("forEach");
        for (int item : arr) {
            System.out.print(item+";");
        }

        // вывод элементов массива в цикле while
        System.out.println("\nwhile");
        int i = 0;
        while(i<arr.length) {
            System.out.print(arr[i++]+";");
        }

        // вывод элементов массива в цикле do while
        System.out.println("\ndo..while");
        i = 0;
        do {
            System.out.print(arr[i++]+";");
        } while(i < arr.length);

        // операторы принятия решения
        // оператор if..else
        System.out.println("\nif");
        if (arr[10] < arr[14]) {
            System.out.printf("%d < %d\n", arr[10], arr[14]);
        }

        System.out.println("if..else");
        if (arr[14] < arr[10]) {
            System.out.printf("%d < %d\n", arr[14], arr[10]);
        } else {
            System.out.printf("%d > %d\n", arr[14], arr[10]);
        }

        /*if(1 > 2) {
            ...
        } else if(1 < 0) {
            ...
        } else {
            ...
        }*/

        // оператор switch(примитив, строка, enum)
        System.out.println("\nswitch");
        switch (1+1) {
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
            default:
                System.out.println("default case");
        }
    }
}
