package homeworkAll.homeworkPersonAndAddress;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * JavaAdvanced
 * 30.08.20 20: 08
 */
public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("email", "cat.dog@mail.com");
        Address address2 = new Address("post", "Login2");
        Address address3 = new Address("post1", "Login3");

        List<Address> addressList1 = new ArrayList<>();
        addressList1.add(address1);
        addressList1.add(address2);
        addressList1.add(address3);

        List<Address> addressList2 = new ArrayList<>();
        Address address5 = new Address("email", "olga89@gmail.com");
        Address address6 = new Address("post", "Login6");
        addressList2.add(address5);
        addressList2.add(address6);

        List<Address> addressList3 = new ArrayList<>();
        Address address7 = new Address("email", "klkljh56@gmail.com");
        addressList3.add(address7);
        List<Address> addressList4 = new ArrayList<>();
        Address address8 = new Address("post", "Berlin 10871");
        addressList4.add(address8);
        addressList4.add(new Address("email", null));

        Person person1 = new Person("Leo1", "Loran1", addressList1);
        Person person2 = new Person(" ", "Loran2", addressList2);
        Person person3 = new Person("", "", addressList3);
        Person person4 = new Person("Leo4", "Loran4", addressList4);

        List<Person> listPerson = new ArrayList<>();
        listPerson.add(person1);
        listPerson.add(person2);
        listPerson.add(person3);
        listPerson.add(person4);
        Predicate<Person> predicate = new AddressTypesEmail();
        Function<Person, String> operator = new OperatorStringWithNameAndEmailType();

        List<String> list1 = ListHandler(listPerson, predicate, operator);
        System.out.println(list1.toString());
    }

    public static List<String> ListHandler(List<Person> list, Predicate<Person> predicate,
                                           Function<Person, String> operator) {
        List<String> resList = new ArrayList<>();
        for (Person person : list) {
            if (predicate.test(person)) {
                resList.add(operator.apply(person));
            }
        }
        return resList;
    }
}
