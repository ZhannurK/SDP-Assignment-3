import java.util.ArrayList;
import java.util.List;

class TaskProcessor {
    private final List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void processTasks() {
        for (Task task : tasks) {
            if (task.getPriority() == 1) {
                handleLowPriority(task);
            } else if (task.getPriority() == 2) {
                handleMediumPriority(task);
            } else if (task.getPriority() == 3) {
                handleHighPriority(task);
            }
        }
    }

    private void handleLowPriority(Task task) {
        System.out.println("Low Priority Handler processing task: " + task.getName());
        executeCommand(task);
    }

    private void handleMediumPriority(Task task) {
        System.out.println("Medium Priority Handler processing task: " + task.getName());
        executeCommand(task);
    }

    private void handleHighPriority(Task task) {
        System.out.println("High Priority Handler processing task: " + task.getName());
        executeCommand(task);
    }

    private void executeCommand(Task task) {
        System.out.println("Executing task: " + task.getName());
    }
}