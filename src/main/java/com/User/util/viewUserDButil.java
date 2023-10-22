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
	
	  private static final String JDBC_URL = "jdbc:mysql://localhost:3306/customerdb";
	    private static final String JDBC_USER = "root";
	    private static final String JDBC_PASSWORD = "";

	    public List<User> getAllUsers() {
	        List<User> user = new ArrayList<>();
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
	            String sql = "SELECT * FROM customers";
	            PreparedStatement statement = connection.prepareStatement(sql);
	            ResultSet resultSet = statement.executeQuery();
	            while (resultSet.next()) {
	                User User = new User(resultSet.getString("firstName"),resultSet.getString("lastName"),resultSet.getString("email"),resultSet.getString("pNo"),resultSet.getString("pwd"),resultSet.getString("username"));
	               
	               
	                
	                user.add(User);
	            }
	            resultSet.close();
	            statement.close();
	            connection.close();
	        } catch (SQLException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	        return user;
	    }
	

}
