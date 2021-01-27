package moduleSecond.tasks.lesson6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JavaAdvanced
 * 26.01.21 13 35
 */


class SolutionTest {
    Solution solution = new Solution();

    @Test
    void getPrimes() {
        List<Integer> list = new ArrayList<>();
        assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13), solution.getPrimes(14));
    }

    @Test
    void argumentLess2_emptyList_getPrimes() {
        List<Integer> list = new ArrayList<>();
        assertEquals(list, solution.getPrimes(1));
    }

    @Test
    void argumentEquals2_listWithOneElement2_getPrimes() {
        List<Integer> list = new ArrayList<>();
        assertEquals(Arrays.asList(2), solution.getPrimes(2));
    }


}