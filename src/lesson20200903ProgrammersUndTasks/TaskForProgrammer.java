package lesson20200903ProgrammersUndTasks;

public class TaskForProgrammer {
    Task task;
    Programmer programmer;

    public TaskForProgrammer(Task task, Programmer programmer) {
        this.task = task;
        this.programmer = programmer;
    }

    public Task getTask() {
        return task;
    }

    public Programmer getProgrammer() {
        return programmer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskForProgrammer that = (TaskForProgrammer) o;

        if (task != null ? !task.equals(that.task) : that.task != null) return false;
        return programmer != null ? programmer.equals(that.programmer) : that.programmer == null;
    }

    @Override
    public int hashCode() {
        int result = task != null ? task.hashCode() : 0;
        result = 31 * result + (programmer != null ? programmer.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "\ntask: " + task + ", programmer: " + programmer.getName();
    }
}
