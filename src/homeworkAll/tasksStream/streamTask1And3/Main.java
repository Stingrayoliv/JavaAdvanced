package homeworkAll.tasksStream.streamTask1And3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

/**
 * JavaAdvanced
 * 15.10.20 00 23
 */


public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Lora", 18, new Address("Rosenheimer", 32));
        Person p2 = new Person("Oleg", 47, new Address("Bundesallee", 323));
        Person p3 = new Person("Leo", 16, new Address("Rosenheimer2", 32));
        Person p4 = new Person("Oleg", 47, new Address("Bundesallee44", 1));
        List<Person> people = Arrays.asList(p1, p2, p3, p4);

        //1.Нужно написать функцию, которая по списку persons вернет список адресов техлюдей, чей возраст больше 17 лет.
        System.out.println("//----//----Task 1----//----//");
        people.stream().filter((p) -> p.getAge() > 17).map(Person::getAddress).forEach(System.out::println);

        //3.Есть список людей, нужно написать функцию, которая вернет мапу, где ключом является возраст, а значением
        // список людей этого возраста
        Map<Integer, List<Person>> personsByAge = people
                .stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println("//----//----Task 3----//----//");
        personsByAge
                .forEach((age, p) -> System.out.format("age %s: %s\n", age, p));
    }
}
