import by.itClass.Stack12;
import by.itClass.exceptions.EmptyStackException12;
import by.itClass.exceptions.FullStackException12;

public class Runner12_ht6 {
    public static void main(String[] args) {
        Stack12 stack = new Stack12(15);

        for (int i = 0; i < 17; i++) {
            try {
                stack.push((int) (Math.random() * 101 - 50));
            } catch (FullStackException12 e) {
                System.err.println(e.getMessage() + ", errorValue=" + e.getItem());
            }
        }

        for (int i = 0; i < 18; i++) {
            try {
                System.out.print(stack.pop() + "; ");
            } catch (EmptyStackException12 e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
