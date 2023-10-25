package com.User.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.User.model.User;

public class UserValidationUtil {
	
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/vidquest";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";

    public static User validateUser(String username, String password) {
    	try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    	
    	
            String query = "SELECT * FROM users WHERE username = ? AND pwd = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            
            
            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();
            	User us = new User(resultSet.getInt("UserID"),resultSet.getString("firstName"), resultSet.getString("lastName"), resultSet.getString("email"), resultSet.getString("pNo"), resultSet.getString("pwd"), resultSet.getString("username"));

            
            return us;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static User SignupValidateUser(String username, String email) {
    	try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    	
    	
            String query = "SELECT * FROM users WHERE username = ? OR email = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            
            
            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();
            	User us = new User(resultSet.getInt("UserID"),resultSet.getString("firstName"), resultSet.getString("lastName"), resultSet.getString("email"), resultSet.getString("pNo"), resultSet.getString("pwd"), resultSet.getString("username"));

            
            return us;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}

