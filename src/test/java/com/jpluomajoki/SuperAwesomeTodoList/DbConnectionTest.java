package com.jpluomajoki.SuperAwesomeTodoList;


import org.junit.Test;
import org.junit.runner.RunWith;


import static org.junit.Assert.*;

public class DbConnectionTest {
    @Test
    public void testCreateConnectionUrl() {
        final String DB_URL = "jdbc:mariadb://localhost:3306/DB";
        final String DB_USER = "test_user";
        final String DB_PASSWORD = "test_password";
        DbConnection dbConnection = new DbConnection(DB_URL, DB_USER, DB_PASSWORD);
        assertEquals("jdbc:mariadb://localhost:3306/DB?user=test_user&password=test_password", dbConnection.getConnectionString());
    }
}
