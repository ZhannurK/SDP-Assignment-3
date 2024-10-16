class LowPriorityHandler extends TaskHandler {
    public LowPriorityHandler(TaskHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected boolean canHandle(Task task) {
        return task.getPriority() == 1;
    }

    @Override
    protected void executeCommand(Task task) {
        System.out.println("Low Priority Handler processing task: " + task.getName());
        super.executeCommand(task);
    }
}