package lesson02.entity;

/**
 * JavaAdvanced
 * 30.06.20 19: 31
 */
public abstract class Programmer extends Employee { // extends - наследование
    public Programmer(String name, double salary) {
        super(name, salary); // добавили super
    }

    public void work() {
        System.out.println("Programmer works");
    }

    public abstract void codeReview();

}
