package ontrack;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TaskServiceTest {
    private TaskService taskService;

    @Before
    public void setUp() {
        taskService = new TaskService();
    }

    @Test
    public void testViewTaskDetailsReturnsCorrectData() {
        TaskDetail detail = taskService.viewTaskDetails("task101");

        assertNotNull(detail);
        assertEquals("task1", detail.getTaskId());
        assertEquals("s224757274", detail.getStudentId());
        assertEquals("Reviewed", detail.getFeedbackStatus());

        String[] messages = detail.getChatMessages();
        assertEquals(3, messages.length);
        assertEquals("Great job!", messages[0]);
        assertEquals("formatting has to be fixed", messages[1]);
        assertEquals("Resubmit after formatting", messages[2]);
    }

    @Test
    public void testViewTaskDetailsForUnknownTask() {
        TaskDetail detail = taskService.viewTaskDetails("nonexistent");
        assertNull(detail);
    }
}
