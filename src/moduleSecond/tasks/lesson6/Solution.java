package moduleSecond.tasks.lesson6;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaAdvanced
 * 26.01.21 12 46
 */

//Простым (prime) числом называется число, не имеющее делителей, кроме 1 и самого себя (кроме 1). Написать метод,
// находящий все простные числа от 2 до N. List<Integer> getPrimes(int upperBound)
public class Solution {
    public List<Integer> getPrimes(int upperBound) {

        List<Integer> list = new ArrayList<>();

        if (upperBound == 2) {
            list.add(upperBound);
        }

        for (int i = 2; i < upperBound; i++) {
            if (numberIsPrimes(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public boolean numberIsPrimes(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
