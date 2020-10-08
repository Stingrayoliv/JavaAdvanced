package homeworkAll.beginnersTasks.TaskBeginner3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    @Test
    public void intMax_test1() {
        assertEquals(3, Task3.intMax(3, 2, 1));
    }

    @Test
    public void intMax_test2() {
        assertEquals(3, Task3.intMax(1, 3, 2));
    }

    @Test
    public void intMax_test3() {
        assertEquals(3, Task3.intMax(3, 2, 1));
    }

    @Test
    public void intMax_sameNumbers_test4() {
        assertEquals(0, Task3.intMax(0, 0, 0));
    }
}
