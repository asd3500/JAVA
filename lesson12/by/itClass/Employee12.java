package by.itClass;

import by.itClass.exceptions.SalaryException12;

public class Employee12 {
    private String name;
    private String position;
    private int salary;

    public Employee12() {
    }

    public Employee12(String name, String position, double salary) throws SalaryException12 {
        this.name = name;
        this.position = position;
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public String getSalaryBYN() {
        return salary/100 + "." + salary%100/10 + salary%10 + "BYN";
    }

    public void setSalary(double salary) throws SalaryException12 {
        if (salary >= 0) {
            this.salary = (int) (salary * 100);
        } else {
            throw new SalaryException12("Negative salary", salary);
        }
    }

    public void setSalary(String salary) throws SalaryException12 {
        try {
            double dSalary = Double.parseDouble(salary);
            if(dSalary >= 0) {
                setSalary(dSalary);
            }
        } catch (NumberFormatException e) {
            throw new SalaryException12("Incorrect salary", e);
        }
    }

    @Override
    public String toString() {
        return "Employee12{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + getSalaryBYN() +
                '}';
    }
}
