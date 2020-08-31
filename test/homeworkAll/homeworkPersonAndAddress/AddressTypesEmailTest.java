package homeworkAll.homeworkPersonAndAddress;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * JavaAdvanced
 * 31.08.20 00: 57
 */
class AddressTypesEmailTest {
    @Test
    public void check_EmailAndSurname_resultTrue() { // проверка, email на null
        List<Address> addressList1 = new ArrayList<>();
        addressList1.add(new Address("email", "cat.dog@mail.com"));
        addressList1.add(new Address("post1", "Login3"));

        Person person1 = new Person("Leo1", "Loran1", addressList1);
        Predicate<Person> predicate1 = new AddressTypesEmail();
        assertTrue(predicate1.test(person1));
    }

    @Test
    public void check_EmailNull_resultFalse() { // проверка, email на null
        List<Address> addressList = new ArrayList<>();
        addressList.add(new Address("post", "Berlin 10871"));
        addressList.add(new Address("email", null));
        Person person = new Person("Leo4", "Loran4", addressList);
        Predicate<Person> predicate1 = new AddressTypesEmail();
        assertFalse(predicate1.test(person));
    }

    @Test
    public void check_SurnameNull_resultFalse() { //// проверка, email на null
        List<Address> addressList = new ArrayList<>();
        addressList.add(new Address("email", "klkljh7777@gmail.com"));
        addressList.add(new Address("post", "klkljh7777@gmail.com"));
        Person person = new Person("Leo5", null, addressList);
        Predicate<Person> predicate = new AddressTypesEmail();
        assertFalse(predicate.test(person));
    }

    @Test
    public void check_SurnameEmpty_resultFalse() { //// проверка, email на null
        List<Address> addressList = new ArrayList<>();
        addressList.add(new Address("email", "klkljh56@gmail.com"));
        Person person = new Person("", "", addressList);
        Predicate<Person> predicate = new AddressTypesEmail();
        assertFalse(predicate.test(person));
    }


}