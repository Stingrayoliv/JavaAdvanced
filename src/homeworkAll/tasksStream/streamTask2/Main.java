package homeworkAll.tasksStream.streamTask2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * JavaAdvanced
 * 15.10.20
 */

public class Main {
    public static void main(String[] args) {
        //2.2. Есть список имен, нужно написать функцию, которая вернет список имен бездупликатов.
        List<String> myList = Arrays.asList("Sergey", "Piotr", "Sergey", "Ivan", "Sergey", "Sarah", "John", "Sergey");
        myList.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
    }
}
