package taskmanagement;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String description) { tasks.add(new Task(description)); }
    public void updateTask(int index, String newDescription) {
        if (index >= 0 && index < tasks.size()) tasks.get(index).setDescription(newDescription);
    }
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) tasks.remove(index);
    }
    public List<Task> getTasks() { return tasks; }
}
