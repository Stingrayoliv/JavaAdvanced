package lesson2101TaskArrayActionAddCondition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JavaAdvanced
 * 19.08.20 19: 21
 */
class ToUpperCaseActionTest {
    @Test
    public void doActionNormalStringShouldBeUpperCase() {
        String str = "qwe-.Ячс";
        Action action = new ToUpperCaseAction();
        assertEquals("QWE-.ЯЧС", action.doAction(str));
    }

    @Test
    public void doActionEmptyStringShouldReturnEmptyString() {
        String str = "";
        Action action = new ToUpperCaseAction();
        assertEquals("", action.doAction(str));
    }

    @Test
    public void doActionNullShouldReturnNull() {
        String str = null;
        Action action = new ToUpperCaseAction();
        assertNull(action.doAction(str));
    }
}