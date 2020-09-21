import by.itClass.Stack4;

/**
 * Task #4 (lesson4)
 * @author Alexander Butkevich
 */
public class Runner4_ht4 {
    /**
     * работа с классом Stack
     */
    public static void main(String[] args) {

        // создание объектов stack1, stack2
        Stack4 stack1 = new Stack4();
        Stack4 stack2 = new Stack4();

        // запись в stack1 10 значений
        for (int i = 0; i < 10; i++) {
            stack1.push(i + 1);
        }

        // запись в stack1 еще 2 значения
        stack1.push(11);
        stack1.push(12);

        // вывод в консоль содержимого stack1
        System.out.print("\nstack 1: ");
        int item = 0;
        while (true){
            item = stack1.pop();
            if (item == -999) break;
            System.out.print(item + ";");
        }

        // вывод в консоль содержимого stack2
        System.out.print("\nstack 2: ");
        while (true){
            item = stack2.pop();
            if (item == -999) break;
            System.out.print(item + ";");
        }

    }
}
