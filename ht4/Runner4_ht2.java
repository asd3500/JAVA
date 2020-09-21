/**
 * Task #2 (lesson4)
 * @author Alexander Butkevich
 */
public class Runner4_ht2 {
    /**
     * работа с классом Box
     */
    public static void main(String[] args) {

        // создание объектов box1, box2
        Box4 box1 = new Box4();
        Box4 box2 = new Box4();

        // инициализация полей объектов
        box1.width = 10.;
        box1.height = 20.;
        box1.depth = 15.;

        box2.width = 3.;
        box2.height = 6.;
        box2.depth = 9.;

        // вывод информации об объектах
        box1.show();
        box2.show();

        // вывод объемов
        System.out.printf("box1 volume: %.2f\n", box1.getVolume());
        System.out.printf("box2 volume: %.2f\n", box2.getVolume());

    }
}
