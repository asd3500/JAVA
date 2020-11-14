import by.itClass.Department17;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner17_ht4_1 {
    public static void main(String[] args) {

        final String FILE_NAME = "lesson17/itClass1.txt";
        List<Department17> departments = readFile(FILE_NAME);

        for (Department17 depart : departments) {
            System.out.println(depart);
        }

    }

    private static List<Department17> readFile(final String filename) {
        List<Department17> departments = new ArrayList<>();

        try (Scanner sc = new Scanner(new FileReader(filename))) {
            while (sc.hasNextLine()) {
                Department17 depart = getDepart(sc.nextLine());
                departments.add(depart);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return departments;
    }

    private static Department17 getDepart(String line) {
        final String DELIMITER = ";";
        Department17 depart = null;
        String[] values = line.split(DELIMITER);

        String name = values[0];
        int firstShift = Integer.parseInt(values[1]);
        int secondShift = Integer.parseInt(values[2]);

        return new Department17(name, firstShift, secondShift);
    }
}
