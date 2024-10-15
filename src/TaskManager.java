class TaskManager {
    private final TaskProcessor taskProcessor = new TaskProcessor();

    public void addTask(Task task) {
        taskProcessor.addTask(task);
    }

    public void processTasks() {
        taskProcessor.processTasks();
    }
}