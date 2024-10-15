public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.addTask(new Task("Go to gym", 1));
        taskManager.addTask(new Task("Do the dishes", 2));
        taskManager.addTask(new Task("Finish SDP assignments", 3));

        taskManager.processTasks();
    }
}