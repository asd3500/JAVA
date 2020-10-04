import by.itClass.Car5;
/**
 * OOP
 * @author Alexander Butkevich
 */
public class Runner5_exm2 {
    public static void main(String[] args) {
        final String VALUE = "2";
        final String FIRST_VALUE = "1";

        Car5.count = 500;
        System.out.println(Car5.getCount());

        Car5 car1 = new Car5();
        Car5 car2 = new Car5();

        car1.model = "Lada";
        car1.setCount(100);
        System.out.println(car1.getCount());

    }
}
