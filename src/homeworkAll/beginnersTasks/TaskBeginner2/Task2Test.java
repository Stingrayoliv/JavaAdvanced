package homeworkAll.beginnersTasks.TaskBeginner2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    @Test
    public void endUps_stringLengthMore3() {
        assertEquals("HeLLO", Task2.endUp("Hello"));
    }

    @Test
    public void endUp() {
        assertEquals("hi thERE", Task2.endUp("hi there"));
    }

    @Test
    public void endUp_stringLengthLess3() {
        assertEquals("HI", Task2.endUp("hi"));
    }
}