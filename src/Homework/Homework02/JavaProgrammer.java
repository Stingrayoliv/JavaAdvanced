package Homework.Homework02;

/**
 * JavaAdvanced
 * 01.07.20 22: 30
 */
public class JavaProgrammer extends Employee {
    public JavaProgrammer(String name, String surname, int ID, double salary, boolean bonusStatus) {
        super(name, surname, ID, salary, bonusStatus);
    }

    @Override
    public void work() { // полиморфизм переопределение (override)
        System.out.println("I am a C programmer. I write a java program");
    }

    public void codeReview() { //доступен только программистам
        System.out.println("This Java code is good.");
    }
}
