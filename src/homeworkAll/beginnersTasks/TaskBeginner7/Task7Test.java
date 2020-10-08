package homeworkAll.beginnersTasks.TaskBeginner7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {
    @Test
    public void zeroMax_someElementsWith0_changedArray() {
        int[] a = {0, 5, 0, 3};
        int[] b = {5, 5, 3, 3};
        assertEquals(Arrays.toString(b), Arrays.toString(Task7.zeroMax(a)));
    }

    @Test
    public void zeroMax_someElementsWith0_changed0OnMaxOdd() {
        int[] a = {0, 4, 0, 3};
        int[] b = {3, 4, 3, 3};
        assertEquals(Arrays.toString(b), Arrays.toString(Task7.zeroMax(a)));
    }

    @Test
    public void zeroMax_elementsWithout0_sameArray() {
        int[] a = {0, 1, 0};
        int[] b = {1, 1, 0};
        assertEquals(Arrays.toString(b), Arrays.toString(Task7.zeroMax(a)));
    }
}
