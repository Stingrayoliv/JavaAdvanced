package homeworkAll.beginnersTasks.TaskBeginner5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {
    @Test
    public void sum2() {
        int[] a = {1, 2, 3};
        assertEquals(3, Task5.sum2(a));
    }

    @Test
    public void sum2_lengthEquals2() {
        int[] b = {1, 1};
        assertEquals(2, Task5.sum2(b));
    }

    @Test
    public void sum2_lengthMore2() {
        int[] c = {1, 1, 1, 1};
        assertEquals(2, Task5.sum2(c));
    }
}
