package lesson15;

import java.util.Comparator;

/**
 * JavaAdvanced
 * 06.08.20 21: 17
 */
public class PersonComparatorByName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
