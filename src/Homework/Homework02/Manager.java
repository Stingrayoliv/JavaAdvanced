package Homework.Homework02;

/**
 * JavaAdvanced
 * 01.07.20 17: 58
 */
public class Manager extends Employee {
    private double managerBonus;

    public Manager(String name, String surname, int ID, double salary, boolean bonusStatus, double managerBonus) {
        super(name, surname, ID, salary, bonusStatus);
        this.managerBonus = managerBonus;
    }

    public double getManagerBonus() {
        return managerBonus;
    }

    @Override
    public void work() { // полиморфизм переопределение (override)
        System.out.println("I am a project manager. I maintain project");
    }

//    @Override
//    public void pay(double bonus) {
//       super.pay(managerBonus);
//    }
}
