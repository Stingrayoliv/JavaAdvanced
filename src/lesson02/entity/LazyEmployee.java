package lesson02.entity;

/**
 * JavaAdvanced
 * 30.06.20 21: 01
 */
public class LazyEmployee extends Employee {
    public LazyEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {

    }

}
