package lesson20200914TaskSetPerson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class TaskList {
    public static void main(String[] args) {
        List<String> listOfString = new ArrayList<>();
        listOfString.add("Olga");
        listOfString.add("Lora");
        listOfString.add("Vadim");
        listOfString.add("Olga");
        listOfString.add("Lora");

        System.out.println("to show elements without repeating" + getUniqueString(listOfString).toString());

        List<Person> personList = Arrays.asList(
                new Person("David"),
                new Person("David"),
                new Person("Olga"),
                new Person("Oleg"),
                new Person("Olga"),
                new Person("Anna"),
                new Person("Lora")
        );
        System.out.println("to show elements without repeating" + getUniquePerson(personList));
    }

    public static List<String> getUniqueString(List<String> list) {
        if (list == null) return new ArrayList<String>();
        List<String> newList = new ArrayList<>(new HashSet<String>(list)); //HashSet не гарантирует порядок элементов, поэтому тут может не сработать корректно equals()
        return newList;
    }

    public static List<Person> getUniquePerson(List<Person> list) {
        if (list == null) return new ArrayList<Person>();
        List<Person> newList = new ArrayList<>(new HashSet<Person>(list)); // HashSet не гарантирует порядок элементов,
        return newList;
    }
}
