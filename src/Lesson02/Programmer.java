package Lesson02;

/**
 * JavaAdvanced
 * 30.06.20 19: 31
 */
public class Programmer extends Employee { // extends - наследование
    public Programmer(String name, double salary) {
        super(name, salary); // добавили super
    }

    public void work() {
        System.out.println("programmer: I am writing code ");
    }

    public void codeReview() {
    }

}
