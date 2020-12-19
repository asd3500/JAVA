package by.itClass.beans;

public class NumLen {
    private double len;
    private int count;

    public NumLen() {
        super();
    }

    public NumLen(double len, int count) {
        this();
        this.len = len;
        this.count = count;
    }

    public double getLen() {
        return len;
    }

    public void setLen(double len) {
        this.len = len;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "len=" + String.format("%.3f", len) +
                "; count=" + count;
    }
}
