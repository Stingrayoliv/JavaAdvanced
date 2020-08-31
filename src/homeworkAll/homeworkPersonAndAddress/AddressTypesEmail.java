package homeworkAll.homeworkPersonAndAddress;

import java.util.function.Predicate;

/**
 * JavaAdvanced
 * 30.08.20 21: 29
 */
public class AddressTypeIsEmail implements Predicate<Person> {
    // если у person нет фамилии, то не показывать в списке, даже, если есть имя.
    @Override
    public boolean test(Person person) {
        for (Address address : person.getListAddress()) {
            if (address.getType().equals("email") && person.getSurname() !=" " && person.getName() !=" ") {
                return true;
            }
        }

        return false;
    }

}
