import by.itClass.Ferry;
import by.itClass.comparators.MassableKindComparator;
import by.itClass.entities.*;
import by.itClass.interfaces.IMassable;

import java.util.Arrays;

public class Runner10_ht3 {
    public static void main(String[] args) {

        Solid coal = new Solid("coal", 1400);
        Liquid oil0 = new Liquid("oil", 850);
        Liquid oil1 = new Liquid("oil", 900);

        Container container1 = new Container(coal);
        Container container2 = new Container(coal);
        Cistern cistern1 = new Cistern(oil0);
        Cistern cistern2 = new Cistern(oil1);
        Cistern cistern3 = new Cistern(oil0);
        Person person1 = new Person("Alex", 80);
        Person person2 = new Person("Max", 70);
        Person person3 = new Person("Bob", 75);

        Cargo auto = new Cargo("auto", 1500);
        Cargo blackBox = new Cargo("Black-box", 730);
        Cargo whiteBox = new Cargo("White-box", 380);

        IMassable[] massables = {
                container1, cistern2, person1, auto,
                container2, cistern1, person3, blackBox,
                cistern3, person2, whiteBox
        };

        Ferry ferry = new Ferry(massables);

        ferry.show();

        Arrays.sort(massables, new MassableKindComparator());

        System.out.println("\nSorted");
        ferry.show();

        System.out.println("Ferry is" + (ferry.isOverloaded() ? "" : " not") + " overloaded");
    }
}
