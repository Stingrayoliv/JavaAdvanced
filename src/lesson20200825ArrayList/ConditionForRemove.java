package lesson20200825ArrayList;

import java.util.function.Predicate;

/**
 * JavaAdvanced
 * 25.08.20 20: 37
 */
public class ConditionForRemove implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return s.startsWith("q");
    }
}
