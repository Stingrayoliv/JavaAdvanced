package homeworkAll.beginnersTasks.TaskBeginner1;

import homeworkAll.beginnersTasks.TaskBeginner1.Task1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    @Test
    public void diff21_less21() {
        assertEquals(2, Task1.diff21(19));
    }

    @Test
    public void diff21_lessThan21() {
        assertEquals(10, Task1.diff21(11));
    }

    @Test
    public void diff21_lessEquals21_resultIsnull() {
        assertEquals(0, Task1.diff21(21));
    }

    @Test
    public void diff21_lessMoreThan21() {
        assertEquals(8, Task1.diff21(25));
    }
}
