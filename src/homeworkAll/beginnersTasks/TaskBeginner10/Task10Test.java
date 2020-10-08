package homeworkAll.beginnersTasks.TaskBeginner10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {
    @Test
    public void middleTwo() {
        assertEquals("od", Task10.middleTwo("code"));
        assertEquals("ri", Task10.middleTwo("string"));
        assertEquals("ct", Task10.middleTwo("Practice"));
    }
}
