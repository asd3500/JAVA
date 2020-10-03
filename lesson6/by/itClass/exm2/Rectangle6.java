package by.itClass.exm2;

public class Rectangle6 extends Figure6 {
    private double a;
    private double b;

    public Rectangle6() {
    }

    public Rectangle6(String color) {
        super(color);
    }

    public Rectangle6(String color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public double getSquare() {
        return a * b;
    }

    @Override
    public String show() {
        return "a=" + a +
                ", b=" + b +
                ", " + super.show();
    }
}
