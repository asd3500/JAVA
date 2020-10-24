package by.itClass.exceptions;

public class SalaryException12 extends Exception {
    private double salary;

    public SalaryException12() {
        super();
    }

    public SalaryException12(String message, double salary) {
        super(message);
        this.salary = salary;
    }

    public SalaryException12(String message, Throwable cause) {
        super(message, cause);
    }

    public double getSalary() {
        return salary;
    }
}
