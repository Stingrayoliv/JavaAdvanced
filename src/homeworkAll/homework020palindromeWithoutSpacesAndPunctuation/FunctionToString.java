package homeworkAll.homework020palindromeWithoutSpacesAndPunctuation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class FunctionToString implements BiFunction<List<String>, Predicate<String>, List<String>> {
    //private Predicate predicate;

//    @Override
//    public List<String> apply(List<String> stringList) {
//        List<String> res = new ArrayList<>();
//        if (stringList == null) return res;
//        for (String s : stringList) {
//            if (predicate.test(s)) {
//                res.add(s);
//            }
//        }
//        return res;
//    }
//
//    public FunctionToString(Predicate predicate) {
//        this.predicate = predicate;
//    }

    @Override
    public List<String> apply(List<String> stringList, Predicate<String> predicate) {
        List<String> res = new ArrayList<>();
        if (stringList == null) return res;
        for (String s : stringList) {
            if (predicate.test(s)) {
                res.add(s);
            }
        }
        return res;
    }
}
