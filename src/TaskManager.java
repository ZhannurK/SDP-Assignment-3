class TaskManager {
    private final TaskProcessor taskProcessor;

    public TaskManager() {
        TaskHandler highPriorityHandler = new HighPriorityHandler(null);
        TaskHandler mediumPriorityHandler = new MediumPriorityHandler(highPriorityHandler);
        TaskHandler lowPriorityHandler = new LowPriorityHandler(mediumPriorityHandler);

        taskProcessor = new TaskProcessor(lowPriorityHandler);
    }

    public void addTask(Task task) {
        taskProcessor.addTask(task);
    }

    public void processTasks() {
        taskProcessor.processTasks();
    }
}