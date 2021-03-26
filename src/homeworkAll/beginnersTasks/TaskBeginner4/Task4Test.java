package homeworkAll.beginnersTasks.TaskBeginner4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {
    @Test
    public void commonEnd_sameLastElements() {
        int[] a = {1, 2, 3};
        int[] b = {7, 3};
        assertTrue(Task4.commonEnd(a, b));
    }

    @Test
    public void commonEnd_differentElements() {
        int[] a = {1, 2, 3};
        int[] b = {7, 3, 2};
        assertFalse(Task4.commonEnd(a, b));
    }

    @Test
    public void commonEnd_sameLastAndFirstElements() {
        int[] a = {1, 2, 3};
        int[] b = {1, 3};
        assertTrue(Task4.commonEnd(a, b));
    }
}
