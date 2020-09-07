package lesson20200903ProgrammersUndTasks;

import java.util.ArrayList;
import java.util.List;

public class TaskHandler {
    public static List<TaskForProgrammer> taskHandler(List<Programmer> programmers) {
        List<TaskForProgrammer> result = new ArrayList<>();
        for (Programmer iProgrammer : programmers) {
            List<Task> tempTasks = iProgrammer.getTaskList(Status.NOTACCEPTED);
            for (Task iTask : tempTasks) {
                result.add(new TaskForProgrammer(iTask, iProgrammer));
            }
        }
        return result;
    }
}
