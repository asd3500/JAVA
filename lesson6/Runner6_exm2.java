import by.itClass.exm2.Figure6;
import by.itClass.exm2.Rectangle6;

public class Runner6_exm2 {
    public static void main(String[] args) {

        Figure6 figure1 = new Rectangle6("white", 10,20);
        System.out.println(figure1.show());
        System.out.println("perimeter=" + figure1.getPerimeter());
        System.out.println("square=" + figure1.getSquare());


    }
}
