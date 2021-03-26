package homeworkAll.beginnersTasks.TaskBeginner6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {
    @Test
    public void countEvens_threeEvenNumbers() {
        int[] a = {2, 1, 2, 3, 4};
        assertEquals(3, Task6.countEvens(a));
    }

    @Test
    public void countEvens_twoEvenNumbers() {
        int[] b = {2, 2, 0};
        assertEquals(2, Task6.countEvens(b));
    }

    @Test
    public void countEvens_withoutEvenNumbers() {
        int[] c = {1, 3, 5};
        assertEquals(0, Task6.countEvens(c));
    }
}
