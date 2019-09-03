package com.jpluomajoki.SuperAwesomeTodoList;

import java.sql.SQLException;
import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        DbConnection conn = new DbConnection("jdbc:mariadb://localhost:3306/todolist", "root", "pass");
        try {
            DbOperations.addItem(conn.getConnection(), new TodoItem("eplanation", 1, LocalDateTime.now()));
        } catch (SQLException e) {
            conn.getConnection().close();
            e.printStackTrace();
        }
    }
}
