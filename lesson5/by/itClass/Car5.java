package by.itClass;

public class Car5 {
    private final String CONST_VALUE = "const value";
    private final int CONST_INT_VALUE;
    public static int count;
    public String model;
    private String color;
    private int maxSpeed;

    public Car5() {
        CONST_INT_VALUE = 100;
//        model = "DEFAULT MODEL";
//        color = "DEFAULT COLOR";
//        maxSpeed = -1;
//        this("DEFAULT MODEL", "DEFAULT COLOR", -1);
    }

    public Car5(String model, String color, int maxSpeed) {
        this();
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String info() {
        return "model=" +
                model +
                ", color=" +
                color +
                ", maxSpeed=" +
                maxSpeed;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Car5.count = count;
    }
}
