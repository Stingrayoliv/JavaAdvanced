package homeworkAll.homework08;

/**
 * JavaAdvanced
 * 26.07.20 17: 17
 */
public class Person {
    private String name;
    private String surname;
    private int ID;

    public Person(String name, String surname, int ID) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Person" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ID=" + ID;
    }
}
