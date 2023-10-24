package com.moderator.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {

	private static String url = "jdbc:mysql://localhost:3306/vidquest";
    private static String user = "root";
    private static String password = "1234";
    
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Updated driver class name
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            // Log or handle the exception as needed
        } catch (SQLException e) {
            e.printStackTrace();
            // Log or handle the exception as needed
        }
        return con;
    }
}
