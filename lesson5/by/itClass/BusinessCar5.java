package by.itClass;

public class BusinessCar5 extends Car5{
    private String type;

    public BusinessCar5() {
    }

    public BusinessCar5(String type) {
        this.type = type;
    }

    public BusinessCar5(String model, String color, int maxSpeed, String type) {
        super(model, color, maxSpeed); // только super() или this() и только на 1м месте
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String info() {
        return super.info() +
                ", type=" +
                type;
    }
}
