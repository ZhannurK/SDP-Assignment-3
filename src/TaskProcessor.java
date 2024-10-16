import java.util.ArrayList;
import java.util.List;

class TaskProcessor {
    private final List<Task> tasks = new ArrayList<>();
    private final TaskHandler firstHandler;

    public TaskProcessor(TaskHandler firstHandler) {
        this.firstHandler = firstHandler;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void processTasks() {
        for (Task task : tasks) {
            firstHandler.handleTask(task);
        }
    }
}