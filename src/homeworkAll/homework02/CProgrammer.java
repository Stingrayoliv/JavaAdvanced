package homeworkAll.homework02;

/**
 * JavaAdvanced
 * 01.07.20 18: 00
 */
public class CProgrammer extends Employee {
    public CProgrammer(String name, String surname, int ID, double salary, boolean bonusStatus) {
        super(name, surname, ID, salary, bonusStatus);
    }

    @Override
    public void work() { // полиморфизм переопределение (override)
        System.out.println("I am a C programmer. I write a C program");
    }

    public void codeReview() { //доступен только программистам
        System.out.println("This C code is good.");
    }
}
