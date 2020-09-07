package lesson10;

/**
 * JavaAdvanced
 * 28.07.20 19: 11
 */
public class Person {
    private String name;
    private String surname;
    private String middleName;

    public Person(String surname, String name, String middleName) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
    }

    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public Person(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        if (name == null && middleName == null) return "surname=" + surname;
        if (middleName == null) return "surname=" + surname + " " + " name=" + " " + name;
        else
            return "surname=" + " " + surname + " " + "name=" + " " + name + " " + " middleName= " + middleName;
    }


//    @Override
//    public String toString() {
//        return "lesson20200832TaskListPersonAndEmail.Main.Person{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", middleName='" + middleName + '\'' +
//                '}';
//    }
}
