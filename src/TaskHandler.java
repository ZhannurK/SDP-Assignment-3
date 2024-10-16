abstract class TaskHandler {
    protected TaskHandler nextHandler;

    public TaskHandler(TaskHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleTask(Task task) {
        if (canHandle(task)) {
            executeCommand(task);
        } else if (nextHandler != null) {
            nextHandler.handleTask(task);
        }
    }

    protected abstract boolean canHandle(Task task);

    protected void executeCommand(Task task) {
        System.out.println("Executing task: " + task.getName());
    }
}