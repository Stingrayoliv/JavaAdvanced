package lesson15;

import javax.xml.crypto.Data;
import java.util.Arrays;

/**
 * JavaAdvanced
 * 05.08.20 19: 29
 */
public class Main {
    public static void main(String[] args) {
        String[] names={"Jack", "Nick", "John", "Anna"}; // строки сравниваем через compareTo +сортировка
//        System.out.println("Jack".compareTo("John"));
//        System.out.println(names[0].compareTo(names[0]));
//        Arrays.sort(names);
//        System.out.println(Arrays.toString(names));

        Person[] people={new Person("Jack", 67),
                new Person("Nick", 25),
                new Person("John", 80),
                new Person("Anna", 18),
                new Person("Nick", 18),
                new Person("Anna", 23),
        };
        //System.out.println(people[0].compareTo(people[1]));

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}
