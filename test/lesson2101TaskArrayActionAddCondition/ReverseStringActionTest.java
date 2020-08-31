package lesson2101TaskArrayActionAddCondition;

import static org.junit.jupiter.api.Assertions.*;

import lesson2101TaskArrayActionAddCondition.action.Action;
import lesson2101TaskArrayActionAddCondition.action.ReverseStringAction;
import org.junit.jupiter.api.Test;


/**
 * JavaAdvanced
 * 17.08.20 21: 28
 */
class ReverseStringActionTest {
    /*
    input data
    call the method
    check if result is expected
     */
    @Test
    public void doActionNormalStringShouldBeReversed(){
        String str = "1234";
        Action action = new ReverseStringAction();
        assertEquals("4321",action.doAction(str));
    }

    @Test
    public void doActionEmptyStringShouldReturnEmptyString(){
        String str = "";
        Action action = new ReverseStringAction();
        assertEquals("",action.doAction(str));
    }

    @Test
    public void doActionNullShouldReturnNull(){
        String str = null;
        Action action = new ReverseStringAction();
        assertNull(action.doAction(str));
    }
}