package lesson20200901TaskPalindrome;

import java.util.function.Predicate;

/**
 * JavaAdvanced
 * 01.09.20 20: 50
 */
public class PredicatePalindrome implements Predicate<String> {
    @Override
    public boolean test(String s) {
        if (s ==null ) return false;
        return new StringBuffer(s).reverse().toString().equalsIgnoreCase(s);
// проверка палиндрома
//        StringBuffer rev = new StringBuffer(s).reverse();
//        String strRev = rev.toString();
//        if(variable.equalsIgnoreCase(strRev)) // проверяет наше условие
    }
}
