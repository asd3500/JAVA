import by.itClass.BusinessCar5;
import by.itClass.Car5;

import java.sql.SQLOutput;

/**
 * ООП
 * @author Alexander Butkevich
 */
public class Runner5_exm1 {
    public static void main(String[] args) {
        Car5 car1 = new Car5("Lada", "baklazhan", 150);
        System.out.print("Car1: ");
        System.out.println(car1.info());

        Car5 car2 = new Car5();
        System.out.print("Car2: ");
        System.out.println(car2.info());

        BusinessCar5 car3 = new BusinessCar5("A");
        System.out.print("Car3: ");
        System.out.println(car3.info());

        BusinessCar5 car4 = new BusinessCar5("BMW", "Black", 250,"B");
        System.out.print("Car4: ");
        System.out.println(car4.info());
    }
}
