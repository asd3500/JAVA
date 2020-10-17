package by.itClass;

public class Phone10 implements Cloneable {
    private String number;

    public Phone10() {
    }

    public Phone10(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "number=" + number;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
