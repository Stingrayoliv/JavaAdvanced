package lesson2101TaskArrayActionAddCondition;
import lesson2101TaskArrayActionAddCondition.condition.LengthMoreThanFourCondition;
import lesson2101TaskArrayActionAddCondition.condition.Condition;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JavaAdvanced
 * 18.08.20 20: 20
 */
class ConditionTest {
    @Test
    public void test_LengthMoreThanFour_true() {
        String s = "12345";
        Condition condition = new LengthMoreThanFourCondition();
        assertTrue(condition.test(s));
    }
    @Test
    public void test_LengthEqualFour_false() {
        String s = "1234";
        Condition condition = new LengthMoreThanFourCondition();
        assertFalse(condition.test(s));
    }
    @Test
    public void test_LengthLessEqualFour_false() {
        String s = "123";
        Condition condition = new LengthMoreThanFourCondition();
        assertFalse(condition.test(s));
    }

    @Test
    public void test_EmptyNotEqualFour_false() {
        String s = "";
        Condition condition = new LengthMoreThanFourCondition();
        assertFalse(condition.test(s));
    }

    @Test
    public void test_NullNotEqualFour_false() {
        String s = null;
        Condition condition = new LengthMoreThanFourCondition();
        assertFalse(condition.test(s));
    }

}