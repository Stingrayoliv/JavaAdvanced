package Homework.Homework02;
/**
 * JavaAdvanced
 * 01.07.20 18: 10
 */
public class JavaScriptProgrammer extends Employee {

    public JavaScriptProgrammer(String name, String surname, int ID, double salary, boolean bonusStatus) {
        super(name, surname, ID, salary, bonusStatus);
    }

    @Override
    public void work() { // полиморфизм переопределение (override)
        System.out.println("I am a java script programmer. I write a javaScript program");
    }

    public void codeReview() { //доступен только программистам
        System.out.println("This javaScript code is good.");
    }
}
