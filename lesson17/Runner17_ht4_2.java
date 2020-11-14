import by.itClass.Department17;
import by.itClass.exceptions.TxtLineException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner17_ht4_2 {
    public static void main(String[] args) {

        final String FILE_NAME = "lesson17/itClass2.txt";
        List<Department17> departments = readFile(FILE_NAME);

        for (Department17 depart : departments) {
            System.out.println(depart);
        }

    }

    private static List<Department17> readFile(final String filename) {
        List<Department17> departments = new ArrayList<>();

        try (Scanner sc = new Scanner(new FileReader(filename))) {
            while (sc.hasNextLine()) {
                try {
                    Department17 depart = getDepart(sc.nextLine());
                    departments.add(depart);
                } catch (TxtLineException e) {
                    System.err.println("Error line: " + e.getErrorLine());
                    System.err.println(e.getCause());
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return departments;
    }

    private static Department17 getDepart(String line) throws TxtLineException {
        final String DELIMITER = ";";
        Department17 depart = null;

        String[] values = line.split(DELIMITER);
        try {
            depart = new Department17(values[0], values[1], values[2]);
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            throw new TxtLineException(line, e);
        }

        return depart;
    }
}
