package exm1;

/**
 * ООП
 * @author Alexander Butkevich
 */
public class Runner4_exm1 {
    public static void main(String[] args) {

        Car4 lada = null;

        // создание объекта конструктором без параметров
        // такой конструктор всегда доступен, если в классе
        // нет других конструкторов,
        // поля инициализируются значениями по умолчанию
        lada = new Car4();

        // определение свойств объекта
        lada.model = "Lada sedan";
        lada.color = "white";
        lada.maxSpeed = 180;
        System.out.printf("\nlada\nmodel: %s\ncolor: %s\nmaxSpeed: %d\n",
                lada.model, lada.color, lada.maxSpeed);

        Car4 bmw = new Car4();
        bmw.model = "BMW X6";
        bmw.color = "black";
        bmw.maxSpeed = 250;

        System.out.printf("\nBMW\nmodel: %s\ncolor: %s\nmaxSpeed: %d\n",
                bmw.model, bmw.color, bmw.maxSpeed);

        Car4 ford = new Car4("ford escort", "red", 180);
        System.out.printf("\nford\nmodel: %s\ncolor: %s\nmaxSpeed: %d\n",
                ford.model, ford.color, ford.maxSpeed);

        Car4 opel = new Car4("opel zafira", 180);
        System.out.printf("\nopel\nmodel: %s\ncolor: %s\nmaxSpeed: %d\n",
                opel.model, opel.color, opel.maxSpeed);

        // вызов методов у объектов
        bmw.doSmth("bmw.doSmth", 2020);
        System.out.println("opel.start:" + opel.start());
        System.out.println("ford.stop:" + ford.start());
        bmw.info();
    }
}
