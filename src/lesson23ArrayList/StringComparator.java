package lesson23ArrayList;

import java.util.Comparator;

/**
 * JavaAdvanced
 * 24.08.20 20: 53
 */
public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1); // сортировка написана в обратном порядке
    }
}
