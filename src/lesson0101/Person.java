package lesson0101;

/**
 * JavaAdvanced
 * 28.07.20 20: 10
 */
public class Person {
    private String surname;
    private String firstName;
    private String secondName;

    public Person(String surname, String firstName, String secondName) {
        this.surname = surname;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Person(String surname, String firstName) {
        this(surname, firstName, "");
    }

    public Person(String surname) {
        this(surname, "", "");
    }

    @Override
    public String toString() {
        return "lesson20200832TaskListPersonAndEmail.Main.Person{" +
                "surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }


    public String toShortString() { // метод печати с инициалами

        return surname +" "+ ((firstName.length() >= 1) ? firstName.substring(0, 1) + "." : firstName) +
                ((secondName.length() >= 1) ? secondName.substring(0, 1) + "." : secondName);
    }
}
