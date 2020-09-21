package by.itClass;
/**
 * for task #3
 */
public class Car4 {

    private String model;
    private String type;
    private String color;
    private String country;

    public Car4() {
        model = "";
        type = "";
        color = "";
        country = "";
    }

    public Car4(String paramModel, String paramType, String paramColor, String paramCountry) {
        model = paramModel;
        type = paramType;
        color = paramColor;
        country = paramCountry;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String paramModel) {
        model = paramModel;
    }

    public String getType() {
        return type;
    }

    public void setType(String paramType) {
        type = paramType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String paramColor) {
        color = paramColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String paramCountry) {
        country = paramCountry;
    }

    /**
     * prints all info about the car
     */
    public void show() {
        System.out.printf("Model - %s;\nType - %s;\nColor - %s;\nCountry - %s;\n",
                model, type, color, country);
    }
}
