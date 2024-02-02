public class Task {
    private int taskId;
    private String description;
    private boolean isCompleted;

    // Constructors, getters, setters, and other methods

    public void markAsCompleted() {
        isCompleted = true;
        System.out.println("Task marked as completed: " + description);
    }

    public void displayTaskDetails() {
        System.out.println("Task ID: " + taskId);
        System.out.println("Description: " + description);
        System.out.println("Status: " + (isCompleted ? "Completed" : "Not Completed"));
    }
}
