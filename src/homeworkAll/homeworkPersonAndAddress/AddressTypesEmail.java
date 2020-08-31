package homeworkAll.homeworkPersonAndAddress;

import java.util.function.Predicate;

/**
 * JavaAdvanced
 * 30.08.20 21: 29
 */
public class AddressTypesEmail implements Predicate<Person> {
    // если у person нет фамилии, то добавлять в список
    @Override
    public boolean test(Person person) {
        if (person.fingEmailType() == null || person.fingEmailType().equals("")) {
            return false;
        }
        for (Address address : person.getListAddress()) {
            if (address.getType().equals("email") && person.getSurname() != "" && person.getSurname() != null) {
                return true;
            }
        }
        return false;
    }

}
