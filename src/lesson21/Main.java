package lesson21;

/**
 * JavaAdvanced
 * 17.08.20 20: 00
 */
public class Main {
    public static void main(String[] args) {
        Address address = new Address("Berlin", "Tauban str");
        Person p1 = new Person("Jack", address);
        //lesson20200832TaskListPersonAndEmail.Main.Person p2 = new lesson20200832TaskListPersonAndEmail.Main.Person("Nick", new Address("Berlin", "Tauban str"));
        Person p3 = new Person("Jack", address);

        System.out.println(p1.equals(p3));
    }


}
