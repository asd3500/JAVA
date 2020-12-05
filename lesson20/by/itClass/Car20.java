package by.itClass;

import java.time.LocalDate;

public class Car20 {
    private String model;
    private String regNumber;
    private LocalDate year;

    public Car20() {
        super();
    }

    public Car20(String model, String regNumber, LocalDate year) {
        this();
        this.model = model;
        this.regNumber = regNumber;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getYear() {
        return year.getYear();
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car20{" +
                "model='" + model + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", year=" + year.getYear() +
                '}';
    }
}
