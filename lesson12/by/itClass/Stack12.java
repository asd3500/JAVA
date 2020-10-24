package by.itClass;

import by.itClass.exceptions.EmptyStackException12;
import by.itClass.exceptions.FullStackException12;

public class Stack12 {
    private int[] box;
    private int head;

    public Stack12(int size) {
        box = new int[size];
        head = -1;
    }

    public void push(int item) throws FullStackException12{
        if (head < box.length - 1) {
            box[++head] = item;
        } else {
            throw new FullStackException12("Stack is full", item);
        }
    }

    public int pop() throws EmptyStackException12 {
        if (head >= 0) {
            return box[head--];
        } else {
            throw new EmptyStackException12("Stack is empty");
        }
    }
}
