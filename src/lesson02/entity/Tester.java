package lesson02.entity;

/**
 * JavaAdvanced
 * 30.06.20 19: 37
 */
public class Tester extends Employee {

    public Tester(String name, double salary) {
        super(name, salary * 2); // ссылка на родительский object (this не надо)
    }

    public void work() {
        System.out.println("tester: I am testing code");
    }

// обращается в gettery через super.getSalary(), или getSalary()
  @Override
    public String toString() {
        return "Tester + name" +super.getName()+ "(" + super.getSalary() + ")";
    }


}
