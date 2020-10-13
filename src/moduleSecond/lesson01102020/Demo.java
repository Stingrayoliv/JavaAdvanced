package moduleSecond.lesson01102020;

import java.util.function.Function;
import java.util.function.Predicate;
/**
 * JavaAdvanced
 * 13.10.20 19 23
 */
public class Demo {
    public static void main(String[] args) {
        String str = "abc defG ikl";

        Predicate<String> predicate = s -> s.length() == 3;
        Function<String, String> function = s -> s.toUpperCase();
        System.out.println(transform(function, predicate, str));
    }

    public static String transform(Function<String, String> function, Predicate<String> predicate , String str) {
        String[] array = str.split(" ");
        String result = "";
        for (int i = 0; i < array.length ; i++) {
            if (predicate.test(array[i]))
        {
                result+=function.apply(array[i])+" ";
            }else{
                result+=array[i]+" ";
            }
        }
        return result;
    }
}
