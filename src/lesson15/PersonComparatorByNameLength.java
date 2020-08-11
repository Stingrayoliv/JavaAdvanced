package lesson15;

import java.util.Comparator;

/**
 * JavaAdvanced
 * 06.08.20 21: 45
 */
public class PersonComparatorByNameLength implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().length() - o2.getName().length();
    }
}
