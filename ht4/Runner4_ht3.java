import by.itClass.Car4;

/**
 * Task #3 (lesson4)
 * @author Alexander Butkevich
 */
public class Runner4_ht3 {
    /**
     * работа с классом Car
     */
    public static void main(String[] args) {

        // создание объекта car1 конструктором по умолчанию
        Car4 car1 = new Car4();

        // инициализация объекта car1 сеттерами
        car1.setModel("Ford");
        car1.setType("Sedan");
        car1.setColor("White");
        car1.setCountry("USA");

        // создание объекта car2 конструктором с параметрами
        Car4 car2 = new Car4("Toyota", "Hatchback", "Red", "Japan");

        // вывод информации об объекте car1 в консоль
        System.out.println("Information about Car1");
        System.out.printf("Model - %s;\n", car1.getModel());
        System.out.printf("Type - %s;\n", car1.getType());
        System.out.printf("Color - %s;\n", car1.getColor());
        System.out.printf("Country - %s;\n\n", car1.getCountry());


        // вывод информации об объекте car2 в консоль
        System.out.println("Information about Car2");
        car2.show();

    }
}
