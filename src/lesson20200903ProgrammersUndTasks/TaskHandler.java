package lesson20200903ProgrammersUndTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

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

    public static Queue<Task> taskQueue(List<Task> tasks) {
        Queue<Task> result = new PriorityQueue<>(tasks);
        return result;

    }
}
