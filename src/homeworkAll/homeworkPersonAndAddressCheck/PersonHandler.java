package homeworkAll.homeworkPersonAndAddressCheck;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaAdvanced
 * 05.09.20 20: 30
 */
public class PersonHandler {
    private static List<String> stringList;
    private static List<Person> people;
    private List<Email> emails;

    public PersonHandler(List<String> stringList, List<Person> people, List<Email> emails) {
        this.stringList = stringList;
        this.people = people;
        this.emails = emails;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public List<Person> getPeople() {
        return people;
    }

    public static List<Email> getNewEmailsList(List<String> stringList) {
        String[] array;
        List<Email> emails = new ArrayList<>();
        for (String s : stringList) {
            array = s.split(" ");
            emails.add(new Email(array[0], array[1], array[2]));
        }
        return emails;
    }

    public static int checkAvailabilityEmailAndPerson(Person person, Email email, AddressType type) {
        List<PersonAddress> res = person.getAddresses(type);
        for (PersonAddress address : res) {
            if (res != null) {
                if (person == null && email != null) {
                    return 1; //добавить в новый список Person данные из списка Person
                } else if (person != null && email == null) {
                    return 2;//добавить в новый список Person данные из списка String
                } else if (email.getEmail().equals(address.getAddress()) && email.getName().equals(person.getFirstName())
                        && email.getSurname().equals(person.getSecondName())) {
                    return 3; // добавляем в новый список Person из начального Person
                } else if (!email.getSurname().equals(person.getSecondName())) { // если фамилии не совпали
                    return 4; // добавляем персоны со списка String персону и остальных person из персон
                } else {
                    return 5;
                }
            }
        }
        return 0;
    }

    public static List<Person> getNewListPersons(List<Person> people, List<String> stringList, List<Email> emails) {
        emails = getNewEmailsList(stringList);
        List<Person> newListPersons = new ArrayList<>();
        for (Person person : people) {
            for (Email email : emails) {
                switch (checkAvailabilityEmailAndPerson(person, email, AddressType.EMAIL)) {
                    case 2:
                    case 5:
                    case 4: // добавить всех персон из списка Person и и всех из Email
                         //добавляем все персоны из списка Person в newListPersons
                        List<PersonAddress> personAddresses11 = person.getAddresses();
                        newListPersons.add(new Person(person.getFirstName(), person.getSecondName(), personAddresses11));
                        // добавляем из списка String в newListPersons
                        List<PersonAddress> personAddresses1 = new ArrayList<>();
                        personAddresses1.add(new PersonAddress(email.getEmail(), AddressType.EMAIL));
                        newListPersons.add(new Person(email.getName(), email.getSurname(), personAddresses1));
                        break;
                    case 1:
                    case 3:
                        newListPersons.add(new Person(person.getFirstName(), person.getSecondName(), person.getAddresses()));
                        break;
                    default:
                        System.out.println("error");
                }
            }
        }
        return newListPersons;
    }
}
