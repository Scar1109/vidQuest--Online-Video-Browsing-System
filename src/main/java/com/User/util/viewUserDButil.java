package com.User.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.User.model.User;



public class viewUserDButil {
	
	  private static final String JDBC_URL = "jdbc:mysql://localhost:3306/vidquest";
	    private static final String JDBC_USER = "root";
	    private static final String JDBC_PASSWORD = "";

	    public List<User> getuser(int uid) {
	        PreparedStatement preparedStatement = null;
	        Connection connection = null;
	        List<User> user = new ArrayList<>();
	        
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

	            String sql = "SELECT * FROM users where UserID = ?";

	            preparedStatement = connection.prepareStatement(sql);

	            // Set the value for the first parameter (uid)
	            preparedStatement.setInt(1, uid);

	            ResultSet resultSet = preparedStatement.executeQuery();

	            while (resultSet.next()) {
	                User us = new User(resultSet.getString("firstName"), resultSet.getString("lastName"), resultSet.getString("email"), resultSet.getString("pNo"), resultSet.getString("pwd"), resultSet.getString("username"));
	                user.add(us);
	            }

	            resultSet.close();
	            connection.close();
	        } catch (SQLException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }

	        return user;
	    }


}
