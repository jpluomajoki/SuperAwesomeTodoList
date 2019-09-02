package com.jpluomajoki.SuperAwesomeTodoList;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TodoListTest {
    final LocalDateTime ldt1 = LocalDateTime.of(1970, Month.JANUARY, 1, 12, 0);
    final LocalDateTime ldt2 = LocalDateTime.of(1970, Month.JANUARY, 2, 12, 0);
    final LocalDate ld1 = LocalDate.of(1970, Month.JANUARY, 1);
    final TodoItem todoItem1 = new TodoItem("explanation1", 1, ldt1);
    final TodoItem todoItem2 = new TodoItem("explanation2", 2, ldt2);

    @Test
    public void createTodoList() {
        TodoList todoList = new TodoList();

        todoList.insert(todoItem1);
        todoList.insert(todoItem2);

        assertEquals(new ArrayList<>(Collections.singletonList(todoItem1)), new ArrayList<>(Collections.singletonList(todoItem1)));
        assertEquals(todoList.get(ld1), new TodoList(new ArrayList<>(Collections.singletonList(todoItem1))));
    }
}
