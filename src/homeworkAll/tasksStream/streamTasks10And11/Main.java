package homeworkAll.tasksStream.streamTasks10And11;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //10. Для списка persons посчитать общий возраст тех, кому больше 17 лет. Подсказка - reduce()
        List<Person> list = Arrays.asList(new Person("Lora", 18), new Person("Oleg", 78),
                new Person("Oleg", 78), new Person("Dima", 14));
        Optional<Integer> n = list.stream().filter(person -> person.getAge() > 17).map(Person::getAge).reduce(Integer::sum);
        // Displaying sum
        System.out.println("Task 10: ");
        n.ifPresent(System.out::println);

        //11. Написать функцию, которая для списка persons напечатает для тех, кто старше 17 лет: In Germany <name1>
        // and <name2> and ...<nameN> are of legal age. Подсказка - Collectors.joining();
        String result =list.stream().filter(person -> person.getAge() > 17).map(Person::getName).
                collect(Collectors.joining(" and "));
        System.out.println("Task 11: "+result);
    }
}
