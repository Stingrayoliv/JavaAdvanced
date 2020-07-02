package Homework.Homework02;

/**
 * JavaAdvanced
 * 01.07.20 17: 26
 */
public class Employee {
    private String name;
    private String surname;
    private int ID;
    private double salary;
    private boolean bonusStatus; // статус определяющий положен, ли бонус


    public Employee(String name, String surname, int ID, double salary, boolean bonusStatus) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.salary = salary;
        this.bonusStatus = bonusStatus;
    }

    public boolean getBonusStatus() {
        return bonusStatus;
    }

    public void work() {
        System.out.println("I am Java programmer. I write Java program");
    }

    //Перегрузка (параметрический полиморфизм)
    public void pay() {
        System.out.println(name + " " + surname + "earned: " + salary + " EUR");
    }

    public void pay(double bonus) {
        System.out.println(name + " " + surname + "earned salary with bonus: " + (salary + bonus) + " EUR");
    }
}
