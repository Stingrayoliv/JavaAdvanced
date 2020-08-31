package lesson20200826WithPredicateAndActionTask;

import java.util.function.Predicate;

/**
 * JavaAdvanced
 * 27.08.20 20: 21
 */
public class LengthEvenPredicate implements Predicate<String> {
    @Override
    public boolean test(String s) {
        if(s==null) return false;// обезопасит от пустой строки
        return s.length()%2==0;
    }
}
