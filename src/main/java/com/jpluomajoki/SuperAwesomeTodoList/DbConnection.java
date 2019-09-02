package com.jpluomajoki.SuperAwesomeTodoList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.StringJoiner;

public class DbConnection {
    private String dbUrl;
    private String dbUsername;
    private String dbPassword;

    public DbConnection(String dbUrl, String dbUsername, String dbPassword) {
        this.dbUrl = dbUrl;
        this.dbUsername = dbUsername;
        this.dbPassword = dbPassword;
    }

    String getConnectionString() {
        StringJoiner s1 = new StringJoiner("?");
        StringJoiner s2 = new StringJoiner("&");
        String params = s2.add("user=" + this.dbUsername).add("password=" + this.dbPassword).toString();
        return s1.add(dbUrl).add(params).toString();
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.getConnectionString());
    }
}
