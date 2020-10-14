package moduleSecond.lesson01102020;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * JavaAdvanced
 * 13.10.20 20 25
 */

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(transform("abc defG ikl"));
    }

    //"abc defG ikl" -> "ABC defG IKL"
    // length == 3 -> toUpperCase
    public static String transform(String s, Predicate<String> p, Function<String, String>f) {
        String[] temp = s.split(" ");

        for (int i = 0; i < temp.length; i++) {
            if (temp[i].length() == 3) {
                temp[i] = f.apply(temp[i]);
            }
        }
        return String.join(" ", temp);
    }
    public static String transform(String s){
        return transform(s, (str)->str.length()==3, String::toUpperCase);
    }
}
