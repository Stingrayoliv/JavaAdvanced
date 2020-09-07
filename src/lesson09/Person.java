package lesson09;

/**
 * JavaAdvanced
 * 27.07.20 19: 18
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "lesson20200832TaskListPersonAndEmail.Main.Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
