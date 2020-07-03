package Lesson02;

/**
 * JavaAdvanced
 * 02.07.20 20: 03
 */
public class JavaProgrammer extends Programmer{
    public JavaProgrammer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void codeReview() {
        System.out.println("The Java code is good");
    }
}
