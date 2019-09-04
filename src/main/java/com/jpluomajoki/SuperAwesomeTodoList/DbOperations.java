package com.jpluomajoki.SuperAwesomeTodoList;

import java.sql.*;

public class DbOperations {

    public static void addItem(Connection connection, TodoItem todoItem) throws SQLException {
        String query = "INSERT INTO TodoItems (explanation, priority, deadline) VALUES (?, ?, ?)";
        PreparedStatement pstmt = connection.prepareStatement(query);

        pstmt.setString(1, todoItem.getExplanation());
        pstmt.setInt(2, todoItem.getPriority());
        pstmt.setTimestamp(3, Timestamp.valueOf(todoItem.getDeadline()));

        pstmt.executeUpdate();
    }

    public static void customQuery(Connection connection, String query) throws SQLException {
        Statement stmt = connection.createStatement();
        stmt.execute(query);
    }

    public static TodoList getAllItems(Connection connection) throws SQLException {
        Statement stmt = connection.createStatement();
        // Limit the amount of items for now just in case.
        // TODO: implement pagination
        String query = "SELECT explanation, priority, deadline, isCompleted from TodoItems LIMIT 1000";
        ResultSet rs = stmt.executeQuery(query);

        return new TodoList();
    }
}
