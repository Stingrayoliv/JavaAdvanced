package homeworkAll.lambdaExpressions;

import java.time.LocalDate;
import java.util.function.*;

public class Lambda {
    public static void main(String[] args) {
        //1. Given an integer, return a power of integer: 5 -> 25
        Function<Integer, Integer> f1 = (a) -> a * a;
        System.out.println(f1.apply(5));

        //2.Given a string, return modulo 2 of string length: "abcde" -> 1
        Function<String, Integer> f2 = s -> s.length() % 2;
        System.out.println(f2.apply("abcde"));

        //3.Given a string, return its in upper case: "ivan" -> "IVAN"
        Function<String, String> f3 = s -> s.toUpperCase();
        System.out.println(f3.apply("ivan"));

        //4.Given 2 strings, return a sum of their lengths: "abc", "de" -> 5
        BiFunction<String, String, Integer> f4 = (s, s2) -> s.length() + s2.length();
        System.out.println(f4.apply("abc", "de"));

        //5.Given 2 strings, print a sum of their lengths.
        BiConsumer<String, String> f5 = (s, s2) -> System.out.println("Task5: " + (s.length() + s2.length()));
        f5.accept("abc", "de");

        //6.Return a date of one week prior to today: "2020-05-30"
        UnaryOperator<LocalDate> f6 = (d) -> LocalDate.of(2020, 05, 30).minusWeeks(1);
        System.out.println("date a week ago " + f6.apply(LocalDate.ofEpochDay(2020 - 05 - 30)));

        //7. Given a string, return a string, which consists of a first half of its character, if length is even,
        // returns an empty string otherwise: "abcde" -> "ab", "abcde" -> "".
        Function<String, String> f7 = s -> (s.length() % 2 == 0) ? s.substring(0, s.length() / 2) : "";
        System.out.println("length is even " + f7.apply("abcd"));
        System.out.println("length isn't even and a new String is empty" + f7.apply("abcde"));

        //8. Return a random number
        Supplier<Integer> f8 = () -> (int) (Math.random() * (10 - 1) + 1);
        System.out.println("random number: " + f8.get());

        //9.Given a string, return a reversed string: "abc" ->"cba"
        Function<String, String> f9 = s ->
                new StringBuilder(s.replaceAll("\\p{Punct}|\\s", "")).reverse().toString();
        System.out.println(f9.apply("abc"));

        //10.Given a number, return a reversed number: 12345 -> 54321
        Function<Integer, Integer> f10 = (a) -> {
            int reverse = 0;
            while (a > 0) {
                reverse = reverse + a % 10;
                reverse = reverse * 10;
                a = a / 10;
            }
            return reverse / 10;
        };
        System.out.println("reversed number should be 54321: " + f10.apply(12345));

        //11. Given a number, return true if it is even, false otherwise: 6 -> true, 25 -> false
        Predicate<Integer> p11 = (a) -> a % 2 == 0;
        System.out.println("must be true: " + p11.test(6));
        System.out.println("must be false: " + p11.test(25));

        //12.Given a string, return true, if its length is more than 3, false otherwise: "ab" -> false, "abc" -> true
        Predicate<String> p12 = (s) -> s.length() >= 3;
        System.out.println("must be false: " + p12.test("ab"));
        System.out.println("must be true: " + p12.test("abc"));

        //13.Given a string and a number x. Return true, if length of string is more than x, false otherwise.
        // Hint: BiPredicate.
        BiPredicate<String, Integer> bi13 = (s, integer) -> s.length() > integer;
        System.out.println("must be true: " + bi13.test("jhjh", 3));
        System.out.println("must be false: " + bi13.test("jherer", 12));
    }
}
