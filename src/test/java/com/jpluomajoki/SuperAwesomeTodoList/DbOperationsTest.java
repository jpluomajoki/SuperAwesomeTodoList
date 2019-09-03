package com.jpluomajoki.SuperAwesomeTodoList;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Collections;

public class DbOperationsTest {
    static DbConnection conn;
    final TodoItem TODO_ITEM_1 = new TodoItem("explanation1", 1, LocalDateTime.of(2020, 1, 15, 12, 12));
    final TodoItem TODO_ITEM_2 = new TodoItem("explanation2", 2, LocalDateTime.of(2020, 1, 15, 12, 12));
    final TodoItem TODO_ITEM_3 = new TodoItem("explanation3", 3, LocalDateTime.of(2020, 1, 15, 12, 12));
    final TodoItem TODO_ITEM_4 = new TodoItem("explanation4", 4, LocalDateTime.of(2020, 1, 15, 12, 12));

    @BeforeClass
    public static void init() throws SQLException {
        conn = new DbConnection("jdbc:mariadb://localhost:3306/test", "root", "pass");

        DbOperations.customQuery(conn.getConnection(), "DELETE FROM TodoItems");

        DbOperations.addItem(conn.getConnection(), new TodoItem("explanation", 1, LocalDateTime.of(2020, 1, 15, 12, 12)));
    }

    @AfterClass
    public void finalize() throws SQLException {
        DbOperations.customQuery(conn.getConnection(), "DELETE FROM TodoItems");
    }

    @Test
    public void testGetAllTodoItems() {
        TodoList expected = new TodoList(Collections.singletonList(TODO_ITEM_1));
        TodoList actual = DbOperations.getAllItems();
        Assert.assertEquals(expected, actual);
    }

}
