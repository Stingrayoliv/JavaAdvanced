package lesson2101TaskArrayActionAddCondition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JavaAdvanced
 * 19.08.20 20: 07
 */
class StringArrayHandlerTest {
    @Test
    public void stringsHandle_normalCase() {
        String[] strings = {"12", "qwerty", "123456", "14", ""};
        String[] expectedArr = {"321", "ytrewq", "654321", "14", ""};
        StringArrayHandler stringArrayHandler = new StringArrayHandler(strings,
                new ReverseStringAction(), new LengthCondition(2));
        stringArrayHandler.stringsHandle();
        stringArrayHandler.stringsHandle();
        assertArrayEquals(expectedArr, stringArrayHandler.getStrings());
    }

    @Test
    public void stringsHandle_nullAction_noyhing() {// если передадим null в Condition
        String[] strings = {"12", "qwerty", "123456", "14", ""};
        String[] expectedArr = {"21", "ytrewq", "654321", "14", ""};
        StringArrayHandler stringArrayHandler = new StringArrayHandler(strings,
               null, new LengthCondition(2));
        stringArrayHandler.stringsHandle();
        stringArrayHandler.stringsHandle();
        assertArrayEquals(expectedArr, stringArrayHandler.getStrings());
    }

    @Test
    public void stringsHandle_nullCondition_doActionForAll() {// если передадим null в Action
        String[] strings = {"12", "qwerty", "123456", "14", ""};
        String[] expectedArr = {"21", "ytrewq", "654321", "14", ""};
        StringArrayHandler stringArrayHandler = new StringArrayHandler(strings,
                new ReverseStringAction(), null);
        stringArrayHandler.stringsHandle();
        stringArrayHandler.stringsHandle();
        assertArrayEquals(expectedArr, stringArrayHandler.getStrings());
    }

    @Test
    public void stringsHandle_nullArray_nothing() {// если передадим null в Action
        String[] strings = {"12", "qwerty", "123456", "14", ""};
        String[] expectedArr = {"21", "ytrewq", "654321", "14", ""};
        StringArrayHandler stringArrayHandler = new StringArrayHandler(strings,
                new ReverseStringAction(), new LengthCondition(2));
        stringArrayHandler.stringsHandle();
        stringArrayHandler.stringsHandle();
        assertArrayEquals(expectedArr, stringArrayHandler.getStrings());
    }

}