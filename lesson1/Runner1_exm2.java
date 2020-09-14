/**
 * Переменные
 * @author Alexander Butkevich
 */
public class Runner1_exm2 {

    public static void main(String[] args) {

        /*   типы дынных

     примитивные типы (базовые)

         целочилсенные
            byte    1 байт
            short   2 байта
            int     4 байта
            long    8 байт

         с плавающей точкой
            float   4 байта
            double  8 байт

         символьные
            char    2 байта

         булевые
            boolean 1 байт

     ссылочный тип (объектный)

         объекты
         массивы

     операции с примитивами

         арифметические + - * / %
         сравнение == > < >= <= !=
         логические операторы && || !
         присваивание = += -= *= /= %= &= |=
          тернарный оператор x = (a>b)? a : b
*/
        int age = 34;
        int count = 111;
        byte number = 1;
        float cost = 19.5f;     // 4 байта
        double price = 20.1;    // 8 байт
        char sing = '!';

        boolean flag = (age>count) ? true : false;

        System.out.println("age " + ((age>count)? ">" : "<") + " count" + sing);
    }

}
