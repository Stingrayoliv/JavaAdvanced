package lesson15;
import java.util.Comparator;

/**
 * JavaAdvanced
 * 06.08.20 21: 04
 */
public class PersonComparatorByAge implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {// позволяет сравнивать 2 объекта
       return o1.getAge()-o2.getAge();
    }
}
