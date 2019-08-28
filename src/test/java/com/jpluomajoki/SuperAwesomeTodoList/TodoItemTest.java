package com.jpluomajoki.SuperAwesomeTodoList;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class TodoItemTest {

    private final String EXPLANATION = "Test explanation";
    private final int PRIORITY = 1;
    private final Date DEADLINE = new Date(1970, Calendar.JANUARY, 0, 12, 0);
    private final boolean ISCOMPLETED = false;

    /**
     * Super important test
     * I mean, if this fails, something is horribly, horribly wrong.
     */
    @Test
    public void createTodoItem() {
        TodoItem todoItem = new TodoItem(EXPLANATION, PRIORITY, DEADLINE, ISCOMPLETED);

        assertEquals(todoItem.getExplanation(), EXPLANATION);
        assertEquals(todoItem.getPriority(), PRIORITY);
        assertEquals(todoItem.getDeadline(), DEADLINE);
        assertEquals(todoItem.isCompleted(), ISCOMPLETED);
    }
}
