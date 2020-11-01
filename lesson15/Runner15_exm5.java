import by.itClass.Car15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Object from file
 */
public class Runner15_exm5 {
    public static void main(String[] args) {
        final String FILE_NAME = "lesson15/car_itClass.txt";

        Car15[] cars = new Car15[3];

        try (Scanner sc = new Scanner(new FileReader(FILE_NAME))){
            int i = 0;
            while (sc.hasNextLine() && i < cars.length) {
                String[] values = sc.nextLine().split(";");
                cars[i++] = new Car15(Integer.parseInt(values[0]), values[1], values[2], Double.parseDouble(values[3]));
            }
            for (Car15 car : cars) {
                System.out.println(car);
            }
        } catch (FileNotFoundException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }
}
