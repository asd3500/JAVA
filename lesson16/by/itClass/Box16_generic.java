package by.itClass;

public class Box16_generic<T, N extends Integer> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
