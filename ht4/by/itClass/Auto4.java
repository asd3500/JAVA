package by.itClass;
/**
 * for task #5
 */
public class Auto4 {

    private String model;
    private int maxSpeed;

    public Auto4() {
        model = "";
        maxSpeed = 0;
    }

    public Auto4(String paramModel, int paramMaxSpeed) {
        model = paramModel;
        maxSpeed = paramMaxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String paramModel) {
        model = paramModel;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int paramMaxSpeed) {
        maxSpeed = paramMaxSpeed;
    }

    /**
     * evaluates and returns the cost of the auto
     * @return cost
     */
    public int getCost() {
        return maxSpeed * 100;
    }

    /**
     * updates auto by increasing max speed by 10
     */
    public void updateAuto() {
        maxSpeed += 10;
    }

    /**
     * prints all info about the auto
     */
    public void show() {
        System.out.printf("Model - %s;\nMax speed - %d;\nCost - %d;\n",
                model, maxSpeed, getCost());
    }

}
