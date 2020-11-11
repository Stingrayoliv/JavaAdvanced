package homeworkAll.lambdaExpressions;

/**
 * JavaAdvanced
 * 10.10.20 15 15
 */

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "salary: " + salary + " EUR";
    }
}
