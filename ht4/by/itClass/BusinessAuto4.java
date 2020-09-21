package by.itClass;
/**
 * for task #5
 */
public class BusinessAuto4 extends Auto4{

    public BusinessAuto4() {
        setModel("");
        setMaxSpeed(0);
    }

    public BusinessAuto4(String paramModel, int paramMaxSpeed) {
        setModel(paramModel);
        setMaxSpeed(paramMaxSpeed);
    }

    /**
     * evaluates and returns the cost of the business auto
     * @return cost
     */
    public int getCost() {
        return getMaxSpeed() * 250;
    }

    /**
     * updates business auto by increasing max speed by 25
     */
    public void updateAuto() {
        setMaxSpeed(getMaxSpeed() + 25);
    }
}
