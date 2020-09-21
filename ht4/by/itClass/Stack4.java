package by.itClass;
/**
 * for task #4
 */
public class Stack4 {

    private int[] elements;
    private int top;

    public Stack4() {
        elements = new int[10];
        top = -1;
    }

    /**
     * pushes new item into stack
     * @param item - value for pushing
     */
    public void push(int item) {

        // проверка на заполненность стека
        if (top >= 9) {
            System.out.println("The stack is full");
            return;
        }

        // добавление нового элемента
        elements[++top] = item;

    }

    /**
     * pops out an item from the stacks top
     * @return popped value
     */
    public int pop() {

        // проверка стека на пустоту
        if (top < 0) {
            System.out.println("The stack is empty");
            return -999;
        }

        // возврат элемента из стека
        return elements[top--];
    }

}
