package ontrack;

import java.util.HashMap;
import java.util.Map;

public class TaskService {
    private Map<String, TaskDetail> taskDatabase;

    public TaskService() {
        taskDatabase = new HashMap<>();

        // Mock data
        taskDatabase.put("task101", new TaskDetail(
            "task101",
            "student001",
            "Reviewed",
            new String[]{"Great job!", "Fix formatting", "Resubmit if possible"}
        ));

        taskDatabase.put("task102", new TaskDetail(
            "task102",
            "student002",
            "Pending",
            new String[]{"Waiting for tutor response"}
        ));
    }

    public TaskDetail viewTaskDetails(String taskId) {
        return taskDatabase.get(taskId);
    }
}
