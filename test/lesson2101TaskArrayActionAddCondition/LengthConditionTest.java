package lesson2101TaskArrayActionAddCondition;

import lesson2101TaskArrayActionAddCondition.condition.LengthCondition;
import lesson2101TaskArrayActionAddCondition.condition.Condition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JavaAdvanced
 * 19.08.20 19: 33
 */
class LengthConditionTest {
    @Test
    public void test_LengthMoreThanZero_true() {
        String s = "1";
        Condition condition = new LengthCondition(0);
        boolean res = (condition.test("1") == true) &&
                (condition.test("123") == true) &&
                (condition.test("") == false) &&
                (condition.test(null) == false);
        assertTrue(res);
    }

    @Test
    public void test_LengthEqualFour_false() {
        String s = "1234";
        Condition condition = new LengthCondition(4);
        assertFalse(condition.test(s));
    }

    @Test
    public void test_LengthLessEqualFour_false() {
        String s = "123";
        Condition condition = new LengthCondition(4);
        assertFalse(condition.test(s));
    }

    @Test
    public void test_EmptyNotEqualFour_false() {
        String s = "";
        Condition condition = new LengthCondition(4);
        assertFalse(condition.test(s));
    }

    @Test
    public void test_NullNotEqualFour_false() {
        String s = null;
        Condition condition = new LengthCondition(4);
        assertFalse(condition.test(s));
    }

}