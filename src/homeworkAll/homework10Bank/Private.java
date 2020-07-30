package homeworkAll.homework10Bank;

/**
 * JavaAdvanced
 * 30.07.20 13: 06
 */
public class Private {
    private String name;
    private String surname;

    public Private(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Private{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

