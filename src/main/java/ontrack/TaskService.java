package ontrack;

import java.util.HashMap;
import java.util.Map;

public class TaskService {
    private Map<String, TaskDetail> taskDatabase;

    public TaskService() {
        taskDatabase = new HashMap<>();

        // Mock data
        taskDatabase.put("task1", new TaskDetail(
            "task1",
            "s224757274",
            "Reviewed",
            new String[]{"Great job!", "formatting has to be fixed", "Resubmit after formatting"}
        ));

        taskDatabase.put("task2", new TaskDetail(
            "task2",
            "s22334455",
            "Pending",
            new String[]{"Waiting for tutor response"}
        ));
    }

    public TaskDetail viewTaskDetails(String taskId) {
        return taskDatabase.get(taskId);
    }
}
