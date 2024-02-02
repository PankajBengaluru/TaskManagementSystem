import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    // Constructors, getters, setters, and other methods

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task added: " + task.getDescription());
    }

    public void displayTasks() {
        System.out.println("Task List:");
        for (Task task : tasks) {
            task.displayTaskDetails();
            System.out.println("--------------");
        }
    }
}
