package lesson20200901TaskPalindrome;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * JavaAdvanced
 * 01.09.20 21: 12
 */
public class FunctionToString implements BiFunction<List<String>, Predicate<String>, List<String>> {
//    private Predicate predicate;
//
//    public FunctionToString(Predicate predicate) {
//        this.predicate = predicate;
//    }
//    @Override
//    public List<String> apply(List<String> stringList) {
//        List<String> result = new ArrayList<>();
//        if (stringList==null) return result;
//        for (String s: stringList) {
//            if (predicate.test(s)) {
//                result.add(s);
//            }
//        }
//        return result;
//    }

    @Override
    public List<String> apply(List<String> stringList, Predicate<String> predicate) {
        List<String> result = new ArrayList<>();
        if (stringList==null) return result;
        for (String s: stringList) {
            if (predicate.test(s)) {
                result.add(s);
            }
        }
        return result;
    }
}
