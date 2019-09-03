package com.jpluomajoki.SuperAwesomeTodoList;

import java.sql.*;

public class DbOperations {

    public static void addItem(Connection connection, TodoItem todoItem) throws SQLException {
        PreparedStatement pstmt = connection.prepareStatement("INSERT INTO TodoItems (explanation, priority, deadline) VALUES (?, ?, ?)");

        pstmt.setString(1, todoItem.getExplanation());
        pstmt.setInt(2, todoItem.getPriority());
        pstmt.setTimestamp(3, Timestamp.valueOf(todoItem.getDeadline()));

        pstmt.executeUpdate();
    }

    public static void customQuery(Connection connection, String query) throws SQLException {
        Statement stmt = connection.createStatement();
        stmt.execute(query);
    }
}
