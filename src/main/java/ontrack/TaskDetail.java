package ontrack;

public class TaskDetail {
    private String taskId;
    private String studentId;
    private String feedbackStatus;
    private String[] chatMessages;

    public TaskDetail(String taskId, String studentId, String feedbackStatus, String[] chatMessages) {
        this.taskId = taskId;
        this.studentId = studentId;
        this.feedbackStatus = feedbackStatus;
        this.chatMessages = chatMessages;
    }

    
    public String getTaskId() {
        return taskId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getFeedbackStatus() {
        return feedbackStatus;
    }

    public String[] getChatMessages() {
        return chatMessages;
    }
}
