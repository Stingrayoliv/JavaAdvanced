package lesson2101TaskArrayActionAddCondition;

import lesson2101TaskArrayActionAddCondition.action.Action;
import lesson2101TaskArrayActionAddCondition.action.ReverseStringAction2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JavaAdvanced
 * 18.08.20 21: 46
 */
class ReverseStringAction2Test {
    @Test
    public void doActionNormalStringShouldBeReversed(){
        String str = "1234";
        Action action = new ReverseStringAction2();
        assertEquals("4321",action.doAction(str));
    }

    @Test
    public void doActionEmptyStringShouldReturnEmptyString(){
        String str = "";
        Action action = new ReverseStringAction2();
        assertEquals("",action.doAction(str));
    }

    @Test
    public void doActionNullShouldReturnNull(){
        String str = null;
        Action action = new ReverseStringAction2();
        assertNull(action.doAction(str));
    }
}