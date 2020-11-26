package moduleSecond.tasks;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskOneTest {
    @Test
    public void findNumberWithoutPair_list_returnInteger() {
        List<Integer> list = Arrays.asList(3, 5, 3);
        assertEquals(5, TaskOne.findNumberWithoutPair(list));
    }

    @Test
    public void findNumberWithoutPair_returnInteger() {
        List<Integer> list = Arrays.asList(3,5,3,3,3);
        assertEquals(5, TaskOne.findNumberWithoutPair(list));
    }

    @Test
    public void findNumberWithoutPairretur_returnInteger() {
        List<Integer> list = Arrays.asList(3,5,3,5,3);
        assertEquals(3, TaskOne.findNumberWithoutPair(list));
    }
}
