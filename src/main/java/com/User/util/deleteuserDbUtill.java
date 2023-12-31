package com.User.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class deleteuserDbUtill {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/vidquest";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";

    public static boolean deleteuser(int userId) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            String sql = "DELETE FROM users WHERE UserID = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, userId);

            
            
            int rowsAffected = statement.executeUpdate();
            
            statement.close();
            connection.close();
            
            // If the delete operation was successful (at least one row affected), return true
            return rowsAffected > 0;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            // If an exception occurs, return false to indicate failure
            return false;
        }
    }
}

