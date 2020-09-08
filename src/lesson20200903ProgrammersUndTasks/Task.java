package lesson20200903ProgrammersUndTasks;

import java.util.Objects;

public class Task implements Comparable<Task> {
    private int id;
    private Status status;
    private String description;
    private Priority priority;

    public Task(int id, Status status, String description, Priority priority) {
        this.id = id;
        this.status = status;
        this.description = description;
        this.priority = priority;
    }

    // если нет на входе приоритета, то по умолчанию ставим null
    public Task(int id, Status status, String description) {
        this(id, status, description, Priority.LOW); // по сути вызваем Task(int id, Status status, String description, Priority priority,
        // но Task не ставим, вместо него this

        // еще один вариант, как записать конструктор
//        this.id = id;
//        this.status = status;
//        this.description = description;
//        this.priority = Priority.LOW;
    }

    public int getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", status=" + status +
                ", description='" + description + " " + priority+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (id != task.id) return false;
        if (status != task.status) return false;
        return description != null ? description.equals(task.description) : task.description == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    public int getPrioritiesInNumbers(Priority priority) {
        if (priority.equals(Priority.HIGH)) {
            return 3;
        } else if (priority.equals(Priority.NORMAL)) {
                return 2;
        } else {
                return 1;
        }
    }

    @Override
    public int compareTo(Task task) {
        return (getPrioritiesInNumbers(this.priority)-getPrioritiesInNumbers(task.priority));
    }
}
