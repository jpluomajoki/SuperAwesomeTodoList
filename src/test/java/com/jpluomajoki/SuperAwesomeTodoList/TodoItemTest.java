package com.jpluomajoki.SuperAwesomeTodoList;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;

import static org.junit.Assert.*;

public class TodoItemTest {

    private final String EXPLANATION = "Test explanation";
    private final int PRIORITY = 1;
    private final LocalDateTime DEADLINE = LocalDateTime.of(1970, Month.JANUARY, 1, 12, 0);
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
