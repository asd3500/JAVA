import by.itClass.interfaces.MyInterface19;
import by.itClass.utils.Manager;

/**
 * Function Interface
 */
public class Runner19_exm1 {
    public static void main(String[] args) {

        // Java 8

        // Анонимный класс
        MyInterface19 myInt = new MyInterface19() {
            @Override
            public void doSmth(int a) {
                System.out.println("Hello World!");
            }
        };
        myInt.doSmth(0);

        // Анонимная реализация метода (лямбда выражение)
        MyInterface19 myInt2 = (param) -> {
            System.out.println("Hello Java 8!");
        };

        myInt2.doSmth(0);

        // конструкция лямбда выражения
        // (набор параметров) -> {реализация}

        myInt2 = param -> { // если 1 параметр - скобки не нужны
            System.out.println(param);
        };
        myInt2.doSmth(10);


        // Ссылки на метод (Имя Класса)::(имя метода)
        myInt2 = Manager::method; // реализация по ссылке
        myInt2.doSmth(10);

        myInt2 = (new Manager())::m1;
        myInt2.doSmth(20);

        //Взятие ссылки на конструктор
//        myInt2 = Manager::new;
//        Manager manager = myInt2.doSmth(55); // метод в интерфейсе должен возвращать тип Manager


    }
}
