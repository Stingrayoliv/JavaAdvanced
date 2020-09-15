package lesson20200903ProgrammersUndTasks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskHandlerTest {
    @Test
    public void taskHandler_listProgrammers_listTaskForProgrammer() {
        Programmer p1 = new Programmer("Name1",
                Arrays.asList(new Task(17, Status.PENDING, "1"),
                        new Task(18, Status.NOTACCEPTED, "2"),
                        new Task(19, Status.READY, "3")));

        Programmer p2 = new Programmer("Name2",
                Arrays.asList(new Task(20, Status.READY, "4"),
                        new Task(21, Status.NOTACCEPTED, "5"),
                        new Task(22, Status.READY, "6")));

        Programmer p3 = new Programmer("Name3",
                Arrays.asList(new Task(23, Status.NOTACCEPTED, "7"),
                        new Task(24, Status.NOTACCEPTED, "8"),
                        new Task(25, Status.READY, "9")));

        List<Programmer> programmers = new ArrayList<>();
        programmers.add(p1);
        programmers.add(p2);
        programmers.add(p3);

        TaskForProgrammer taskForProgrammer1 = new TaskForProgrammer(new Task(18, Status.NOTACCEPTED, "2"), p1);
        TaskForProgrammer taskForProgrammer2 = new TaskForProgrammer(new Task(21, Status.NOTACCEPTED, "5"), p2);
        TaskForProgrammer taskForProgrammer3 = new TaskForProgrammer(new Task(23, Status.NOTACCEPTED, "7"), p3);
        TaskForProgrammer taskForProgrammer4 = new TaskForProgrammer(new Task(24, Status.NOTACCEPTED, "8"), p3);
        List<TaskForProgrammer> expectedList = new ArrayList<>();
        expectedList.add(taskForProgrammer1);
        expectedList.add(taskForProgrammer2);
        expectedList.add(taskForProgrammer3);
        expectedList.add(taskForProgrammer4);

        assertEquals(expectedList, TaskHandler.taskHandler(programmers));
    }

}