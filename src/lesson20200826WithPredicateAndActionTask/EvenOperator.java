package lesson20200826WithPredicateAndActionTask;

import java.util.function.UnaryOperator;

/**
 * JavaAdvanced
 * 27.08.20 20: 28
 */
public class EvenOperator implements UnaryOperator<String> {
    @Override
    public String apply(String s) {
        if (s == null) return null; // String -> StringBuffer ->String
        StringBuilder sRes = new StringBuilder(s.length());// по умолчанию capacity 16
        for (int i = 1; i < s.length(); i += 2) {
           sRes.append(s.charAt(i)); //sRes += s.charAt(i); такая запись с использованием StringBuffer
        }
        return sRes.toString(); //вернуть строку
    }
}
