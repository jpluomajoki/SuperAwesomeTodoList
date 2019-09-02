package com.jpluomajoki.SuperAwesomeTodoList;

import org.junit.Test;
import org.mockito.Mock;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DbOperationsTest {
    final TodoItem todoItem = new TodoItem("explanation", 1, LocalDateTime.of(1970, Month.JANUARY, 1, 12, 0));

    @Mock
    Connection connection;

    @Test
    public void testAddListItem() {
        try {
            DbOperations.addItem(connection, todoItem);
        } catch (SQLException ignored) {
        }
    }
}
