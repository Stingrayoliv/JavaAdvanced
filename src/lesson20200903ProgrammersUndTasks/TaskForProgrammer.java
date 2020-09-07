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
    public String toString() {
        return "\ntask: " + task + ", programmer: " + programmer.getName();
    }
}
