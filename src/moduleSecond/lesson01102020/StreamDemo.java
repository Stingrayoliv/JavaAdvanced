package moduleSecond.lesson01102020;

import java.util.Arrays;
import java.util.List;

/**
 * JavaAdvanced
 * 13.10.20 21 05
 */


public class StreamDemo {
    public static void main(String[] args) {
        List<String>strings = Arrays.asList("ad", "abc", "abckjkj", "c", "cb");
        // конвеерные методы - возвращает немного переделанный массив
        // терминальный
        strings.stream().mapToInt(String::length).sum();
        //strings.stream().filter().forEach(System.out::println);
    }
}
