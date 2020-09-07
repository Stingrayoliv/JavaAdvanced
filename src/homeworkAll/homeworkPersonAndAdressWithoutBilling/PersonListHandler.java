package homeworkAll.homeworkPersonAndAdressWithoutBilling;
import java.util.ArrayList;
import java.util.List;

public class PersonListHandler {
    public static List<Person> personListHandler(List<Person> people, AddressType type) {
        List<Person> peopleOnlyWithBillingAddress = new ArrayList<>();
        if (people != null) {
            for (Person person : people) {
                if (person.getAddresses(type) != null) {
                    peopleOnlyWithBillingAddress.add(person);
                }
            }
        }
        return peopleOnlyWithBillingAddress;
    }

    public static List<Person> personListHandler(List<Person> people) { // этот метод нужен,
        // чтобы мы прямо не передавали тип email
        return personListHandler(people, AddressType.BILLING);
    }
}

