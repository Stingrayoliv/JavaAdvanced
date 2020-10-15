package homeworkAll.wordTransformer;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * JavaAdvanced
 * 15.10.20
 */


public class TransformerWord {
    public static void main(String[] args) {
        System.out.println(transform("abc defG ikl"));
        System.out.println(transform1("OOOOI defG ikl"));
        System.out.println(transform2("OO00IO defG ikl0"));
        System.out.println(transform3("Ojhjhj OOOO Oklk"));
    }

    //"abc defG ikl" -> "ABC defG IKL"
    // length == 3 -> toUpperCase
    public static String transform(String s, Predicate<String> p, Function<String, String> f) {
        String[] temp = s.split(" ");

        for (int i = 0; i < temp.length; i++) {
            if (p.test(temp[i])) {
                temp[i] = f.apply(temp[i]);
            }
        }
        return String.join(" ", temp);
    }

    // length == 3 -> toUpperCase
    public static String transform(String s) {
        if (s == null) return "";
        return transform(s, (str) -> str.length() == 3, String::toUpperCase);
    }

    // length == 5 -> toLowerCase
    public static String transform1(String s) {
        if (s == null) return "";
        return transform(s, (str) -> str.length() == 5, String::toLowerCase);
    }

    // length is even -> to UpperCase
    public static String transform2(String s) {
        if (s == null) return "";
        return transform(s, (str) -> str.length() % 2 == 0, String::toUpperCase);
    }

    // if String equals "OefG"-> to UpperCase
    public static String transform3(String s) {
        if (s == null) return "";
        return transform(s, (str) -> str.equals("OOOO"), String::toLowerCase);
    }
}
