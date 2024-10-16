class HighPriorityHandler extends TaskHandler {
    public HighPriorityHandler(TaskHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected boolean canHandle(Task task) {
        return task.getPriority() == 3;
    }

    @Override
    protected void executeCommand(Task task) {
        System.out.println("High Priority Handler processing task: " + task.getName());
        super.executeCommand(task);
    }
}