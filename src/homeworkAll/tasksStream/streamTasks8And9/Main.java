package homeworkAll.tasksStream.streamTasks8And9;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //9. Написать функцию, которая по списку persons возвращает список их банковских счетов с звездочками с третьего
        // символа. Подсказка - flatMap()
        Person p1 = new Person("Lora", Arrays.asList("12345678901245", "12345678901277"));
        Person p2 = new Person("Lora", Arrays.asList("12345678901233", "12345678901211"));
        List<Person> list = Arrays.asList(p1, p2);
        list.stream().flatMap(person -> person.getBanAccounts().stream()).map(Main::makeNewStringWithStars).
                forEach(System.out::println);
    }

    public static String makeNewStringWithStars(String s){
        String result = "";
        for (int i = 3; i < s.length(); i++) {
            result +="*";
        }
        return s.substring(0, 3).concat(result);
    }
}
