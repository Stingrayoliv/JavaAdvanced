package lesson20200903ProgrammersUndTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task(1, Status.NOTACCEPTED, "kjkj", Priority.HIGH);
        Task task2 = new Task(2, Status.READY, "zzzz", Priority.LOW);
        Task task3 = new Task(3, Status.NOTACCEPTED, "xxxx", Priority.LOW);
        Task task4 = new Task(4, Status.NOTACCEPTED, "kjkj", Priority.NORMAL);
        Task task5 = new Task(4, Status.NOTACCEPTED, "uuuu");
        Task task6 = new Task(6, Status.NOTACCEPTED, "wwww", Priority.HIGH);

        List<Task> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);
        tasks.add(task5);
        tasks.add(task6);

        Queue<Task> queue = TaskHandler.taskQueue(tasks);
        Task iTask = queue.poll(); // печатать через queue, после распечатки элемент удалится
        while (iTask!=null){
            System.out.println(iTask);
            iTask=queue.poll();
        }
        //System.out.println(queue);

    }
}
