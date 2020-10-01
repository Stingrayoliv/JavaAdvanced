package homeworkAll.homeworkPersonAndAddressCheck;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> emailWithPerson = new ArrayList<>();
        emailWithPerson.add("qwe@mail.com1 Jack1 Nicolson1");
//        emailWithPerson.add("qwe@mail.com2 Jack2 Nicolson2");
//        emailWithPerson.add("qwe@mail.com3 Jack3 Nicolson3");

        List<PersonAddress> personAddresses1 = new ArrayList<>();
        List<PersonAddress> personAddresses2 = new ArrayList<>();
        List<PersonAddress> personAddresses3 = new ArrayList<>();
        personAddresses1.add(new PersonAddress("qwe@mail.com1", AddressType.EMAIL));
        personAddresses2.add(new PersonAddress("Berlin", AddressType.POST));
        personAddresses2.add(new PersonAddress("EMAIL@gmail.com", AddressType.EMAIL));
        personAddresses3.add(new PersonAddress("Berlin", AddressType.POST));
        personAddresses3.add(new PersonAddress("qwe@mail.com3", AddressType.EMAIL));

        Person p1 = new Person("Jack1", "Nicolson1", personAddresses1);// полностью совпал - убрать из списка
        Person p2 = new Person("Jack2", "Nicolson2", personAddresses2);// добавить email
        Person p3 = new Person("Jack3", "Nicolson3", personAddresses3);
        List<Person> people = new ArrayList<>();
        //people.add(p1);
        people.add(p2);
        people.add(p3);
        //System.out.println(people);

        Email email1 = new Email("qwe@mail.com1", "Jack1", "Nicolson1");
//       System.out.println(PersonHandler.getNewListPersons(people, emailWithPerson));
        //System.out.println("Массив emails: " + PersonHandler.getNewEmailsList(emailWithPerson));
        //System.out.println(PersonHandler.checkAvailabilityEmailAndPerson(p1, email2, AddressType.EMAIL));
        //System.out.println(PersonHandler.checkAvailabilityEmailAndPerson(p1, email1, AddressType.EMAIL));
       System.out.println(PersonHandler.getNewListPersons(people, emailWithPerson, PersonHandler.getNewEmailsList(emailWithPerson)));
    }
}

