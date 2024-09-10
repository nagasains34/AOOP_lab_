package taskmanagement;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        
        taskManager.addTask("Finish homework");
        taskManager.addTask("Buy groceries");
        taskManager.addTask("Clean the house");
        
        taskManager.updateTask(1, "Buy groceries and cook dinner");
        taskManager.removeTask(2);
        
        for (Task task : taskManager.getTasks()) {
            System.out.println(task.getDescription());
        }
    }
}
