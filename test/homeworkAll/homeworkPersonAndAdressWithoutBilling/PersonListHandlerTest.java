package homeworkAll.homeworkPersonAndAdressWithoutBilling;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonListHandlerTest {
    @Test
    public void PersonListHandler_ListPerson__ListPersonOnlyWithoutBilling_true() {
        List<Person> personList = new ArrayList<>();
        List<Address> addresses = new ArrayList<>();
        Person p1 = new Person("Olga1", "Loran1", Arrays.asList(new Address("Berlin", AddressType.POST),
                new Address("email1@gmail.com", AddressType.EMAIL),
                new Address("1234", AddressType.BILLING)));
        Person p2 = new Person("Olga2", "Loran2", Arrays.asList(new Address("London", AddressType.POST),
                new Address("email2@gmail.com", AddressType.EMAIL)));
        Person p3 = new Person("Olga3", "Loran3", Arrays.asList(new Address("Dresden", AddressType.POST),
                new Address("email3@gmail.com", AddressType.EMAIL)));
        Person p4 = new Person("Olga4", "Loran4", Arrays.asList(new Address("Dresden", AddressType.POST),
                new Address("email4@gmail.com", AddressType.EMAIL), new Address("email41@gmail.com", AddressType.EMAIL)));
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        List<Person> expected = new ArrayList<>();
        expected.add(p2);
        expected.add(p3);
        expected.add(p4);
        assertEquals(expected, PersonListHandler.personListHandler(personList));
    }
    @Test
    public void PersonListHandler_ListPersonAllWithBilling__ListPersonEmpty_true() {
        List<Person> personList = new ArrayList<>();
        List<Address> addresses = new ArrayList<>();
        Person p1 = new Person("Olga1", "Loran1", Arrays.asList(new Address("Berlin", AddressType.POST),
                new Address("email1@gmail.com", AddressType.EMAIL),  new Address("1234", AddressType.BILLING)));
        Person p2 = new Person("Olga2", "Loran2", Arrays.asList(new Address("London", AddressType.POST),
                new Address("email2@gmail.com", AddressType.EMAIL),  new Address("1234", AddressType.BILLING)));
        Person p3 = new Person("Olga3", "Loran3", Arrays.asList(new Address("Dresden", AddressType.POST),
                new Address("email3@gmail.com", AddressType.EMAIL),  new Address("1234", AddressType.BILLING)));
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        List<Person> expected = new ArrayList<>();
        assertEquals(expected, PersonListHandler.personListHandler(personList));
    }
}
