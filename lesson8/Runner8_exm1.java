import by.itClass.MyClass8;

import java.util.Comparator;

/**
 * anonymous classes
 * @author Alexander Butkevich
 */
public class Runner8_exm1 {
    public static void main(String[] args) {

        // анонимные классы
        MyClass8 obj = new MyClass8() {// начало анонимного класса
            private int count;

            // конструкторы определить нельзя (т.к. анонимный класс не имеет имени)

            @Override
            public String doSmthng() {
                return "Hello Java";
            }
        }; // {} - опредиление анонимного класса

        System.out.println(obj.doSmthng());

        MyClass8 myclass = new MyClass8();
        System.out.println(myclass.doSmthng());

        String result = new MyClass8() {
            @Override
            public String doSmthng() {
                return "Hello Java WEB";
            }
        }.doSmthng();

        System.out.println(result);

        // создание анонимной реализации интерфейса
        Comparator<Object> comparator = new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };


    }
}
