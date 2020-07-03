package Lesson02;

/**
 * JavaAdvanced
 * 02.07.20 21: 53
 */
public class Manager extends Employee {
    private double managerBonus;

    public Manager(String name, double salary, double managerBonus) {
        super(name, salary);
        this.managerBonus = managerBonus;
    }

    @Override
    public void pay() {
        System.out.println("pay for manager" + getSalary() + "bonus " + managerBonus + " euro for " + getName());
    }
}
