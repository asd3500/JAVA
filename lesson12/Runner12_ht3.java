import by.itClass.Employee12;
import by.itClass.exceptions.SalaryException12;

public class Runner12_ht3 {
    public static void main(String[] args) {
        Employee12 employee = getEmployee("Bob", "junior", 1800.37);

        System.out.println(employee);

        try {
            employee.setSalary("2200.Java87");
        } catch (SalaryException12 salaryException12) {
            salaryException12.printStackTrace();
        }

        System.out.println(employee);

        getEmployee("Alex", "senior", -10000);
    }

    private static Employee12 getEmployee(String name, String position, double salary) {
        Employee12 employee = null;
        try {
            employee = new Employee12(name, position, salary);
        } catch (SalaryException12 e) {
            System.err.println(e.getMessage() + ", salaryErr=" + e.getSalary());
        }
        return  employee;
    }
}
