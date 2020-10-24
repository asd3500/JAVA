package by.itClass.exceptions;

public class FullStackException12 extends Exception {
    private int item;

    public FullStackException12() {
        super();
    }

    public FullStackException12(String message, int item) {
        super(message);
        this.item = item;
    }

    public int getItem() {
        return item;
    }
}
