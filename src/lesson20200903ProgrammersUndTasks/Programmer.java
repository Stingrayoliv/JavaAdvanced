package lesson20200903ProgrammersUndTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Programmer {
    private String name;
    private List<Task> tasksList;

    public Programmer(String name, List<Task> tasksList) {
        this.name = name;
        this.tasksList = tasksList;
    }

    public String getName() {
        return name;
    }

    public List<Task> getTasksList() {
        return tasksList;
    }

    @Override
    public String toString() {
        return "\nProgrammer:" + name + '\'' + ", tasksList=" + tasksList;
    }

    public List<Task> getTaskList(Status status) {
        List<Task> resList = new ArrayList<>();
        for (Task iTask : tasksList) {
            if (iTask.getStatus().equals(Status.NOTACCEPTED)) {
                resList.add(iTask);
            }
        }
        return resList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Programmer that = (Programmer) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return tasksList != null ? tasksList.equals(that.tasksList) : that.tasksList == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (tasksList != null ? tasksList.hashCode() : 0);
        return result;
    }
}
