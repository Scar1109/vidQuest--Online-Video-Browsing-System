package com.User.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.User.model.User;

 

public class EditDButil {
	 private static final String JDBC_URL = "jdbc:mysql://localhost:3306/customerdb";
	    private static final String JDBC_USER = "root";
	    private static final String JDBC_PASSWORD = "";
	    
	  public static void updateUser(User user) {
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;

	        try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

	            // Define the SQL update query
	            String sql = "UPDATE customers SET first_name = ?, last_name = ?, email = ?, pNo = ? , pwd =?, username = ? WHERE id = ?";

	            // Create a PreparedStatement
	            preparedStatement = connection.prepareStatement(sql);

	            // Set the parameters for the query
	            
	            preparedStatement.setString(1, user.getFirstName());
	            preparedStatement.setString(2, user.getFirstName());
	            preparedStatement.setString(2, user.getLastName());
	            preparedStatement.setString(3, user.getEmail());
	            preparedStatement.setString(3, user.getpNo());
	            preparedStatement.setString(3, user.getPwd());
	            preparedStatement.setString(3, user.getUsername());

	            // Execute the update query
	            int rowsAffected = preparedStatement.executeUpdate();

	            if (rowsAffected > 0) {
	                // The update was successful
	            } else {
	                System.out.println("Error");
	            }
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	            // Handle any SQL errors here
	        } finally {
	            // Close resources (connection and preparedStatement) in a finally block
	            if (preparedStatement != null) {
	                try {
	                    preparedStatement.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	            if (connection != null) {
	                try {
	                    connection.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }

}

