import by.itClass.Box16;
import by.itClass.Box16_generic;

/**
 * Generic
 */
public class Runner16_exm1 {
    public static void main(String[] args) {
        Box16 box1 = new Box16();

        box1.setItem(555);
        System.out.println("item: " + box1.getItem());

        Box16_generic<String, Integer> box2 = new Box16_generic<>();

        box2.setItem("abc");
        System.out.println("item: " + box2.getItem());

        System.out.println(print(888, "Java"));
        System.out.println(print(new int[4], 78.9));

    }

    public static <P1, P2> String print(P1 param1, P2 param2) {
        return "param1=" + param1 + ", param2=" + param2;
    }
}
