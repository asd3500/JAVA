package by.itClass.exm2;

public abstract class Figure6 {
    private String color;

    public Figure6() {
    }

    public Figure6(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String show() {
        return "color=" + color;
    }

    public abstract double getPerimeter();
    public abstract double getSquare();
}
