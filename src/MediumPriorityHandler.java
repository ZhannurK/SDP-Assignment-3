class MediumPriorityHandler extends TaskHandler {
    public MediumPriorityHandler(TaskHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected boolean canHandle(Task task) {
        return task.getPriority() == 2;
    }

    @Override
    protected void executeCommand(Task task) {
        System.out.println("Medium Priority Handler processing task: " + task.getName());
        super.executeCommand(task);
    }
}