package homeworkAll.beginnersTasks.TaskBeginner9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {
    @Test
    public void nonStart() {
        assertEquals("ellohere", Task9.nonStart("Hello", "There"));
        assertEquals("avaode", Task9.nonStart("java", "code"));
        assertEquals("hotlava", Task9.nonStart("shotl", "java"));
    }
}
