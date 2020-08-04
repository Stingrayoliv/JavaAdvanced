package lesson02.entity;

/**
 * JavaAdvanced
 * 02.07.20 21: 53
 */
public class Manager extends Employee implements ManageAble {
    private double managerBonus;

    public Manager(String name, double salary, double managerBonus) {
        super(name, salary);
        this.managerBonus = managerBonus;
    }

    @Override
    public void pay() {
        System.out.println("pay for manager" + getSalary() + "bonus " + managerBonus + " euro for " + getName());
    }

    @Override
    public void work() {
        System.out.println("A good manager doesn't work");
    }

    public void manager() {
        System.out.println("all managers can manage!");
    }

    @Override
    public void manage() {

    }
}
