package moduleSecond.tasks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    @Test
    public void checkCondition_listIntegerAndNumber15_false() {
        assertFalse(Task2.checkCondition(Arrays.asList(1, 5, 8, 20), 15));
    }

    @Test
    public void checkCondition_listIntegerAndNumber40_true() {
        assertTrue(Task2.checkCondition(Arrays.asList(1, 5, 8, 20), 40));
    }

    @Test
    public void checkCondition_listIntegerAndNumber25_false() {
        assertFalse(Task2.checkCondition(Arrays.asList(1, 5, 8, 20), 25));
    }
}
