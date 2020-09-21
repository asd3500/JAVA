import by.itClass.Auto4;
import by.itClass.BusinessAuto4;

/**
 * Task #5 (lesson4)
 * @author Alexander Butkevich
 */
public class Runner4_ht5 {
    /**
     * работа с классами Auto и BusinessAuto
     */
    public static void main(String[] args) {

        // создание объектов auto1, auto2
        Auto4 auto1 = new Auto4("Volvo", 180);
        BusinessAuto4 auto2 = new BusinessAuto4("Mercedes", 250);

        // вывод информации auto1, auto2
        System.out.println("\nInformation about Auto1");
        auto1.show();
        System.out.println("\nInformation about Auto2");
        auto2.show();

        // обновление моделей
        auto1.updateAuto();
        auto2.updateAuto();

        // вывод новой информации
        System.out.println("\nInformation about updated Auto1");
        auto1.show();
        System.out.println("\nInformation about updated Auto2");
        auto2.show();

    }
}
