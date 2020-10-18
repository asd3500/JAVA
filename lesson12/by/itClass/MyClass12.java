package by.itClass;

public class MyClass12 {
    private int count;

    public MyClass12() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) { // > 0
        if (count > 0) {
            this.count = count;
        } else {
            throw new IllegalArgumentException("Negative number");
        }
    }

    @Override
    public String toString() {
        return "MyClass12{" +
                "count=" + count +
                '}';
    }
}
