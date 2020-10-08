package homeworkAll.beginnersTasks.TaskBeginner8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {
    @Test
    public void shiftLeft() {
        int[] a = {6, 2, 5, 3};
        int[] expected = {2, 5, 3, 6};
        assertEquals(Arrays.toString(expected), Arrays.toString(Task8.shiftLeft(a)));
    }

    @Test
    public void shiftLeft_arrayLengthIs2_changedArray() {
        int[] a = {1, 2};
        int[] expected = {2, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(Task8.shiftLeft(a)));
    }

    @Test
    public void shiftLeft_arrayLengthIs1_sameArray() {
        int[] a = {1, 2};
        int[] expected = {2, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(Task8.shiftLeft(a)));
    }
}
