package moduleSecond.lesson01102020;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * JavaAdvanced
 * 13.10.20 21 05
 */


public class StreamDemo {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("ad", "abc", "abckjkj", "c", "cb");

        Stream<String> stream = strings.stream().filter(s -> s.length()>2);
        List<String> list=stream.collect(Collectors.toList());
        System.out.println(list);

        Stream<String> stream1 = strings.stream().filter(s -> s.length()>2);
        Set<String> set = stream1.collect(Collectors.toSet());
        System.out.println(set);

        // конвеерные методы - возвращает немного переделанный массив
        // терминальный
        //Stream<String> stream = strings.stream();

//        IntStream intStream=strings.stream().mapToInt(StreamDemo::getStringLength);
//        int sum = intStream.sum();
        List<String> collect = strings.stream().filter(s -> s.length() > 2).collect(Collectors.toList());
//        Map<Integer, List<String>> collect1 = strings.stream().collect(Collectors.groupingBy(String::length));
//        collect1.forEach((k, v) -> System.out.println(k + "=" + v));



        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
        Integer reduce = ints.stream().reduce(1, (x, y) -> x * y);
        //System.out.println(reduce);
    }

    public static Integer getStringLength(String input) {
        System.out.println("string=" + input);
        return input.length();
    }
}
