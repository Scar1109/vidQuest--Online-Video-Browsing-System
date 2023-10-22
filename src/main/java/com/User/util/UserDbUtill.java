package com.User.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.User.model.User;
customerdb

public class UserDbUtill{
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/vidquest";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";

	
       
    
    public  static void adduser(User user) {
    	Connection connection = null;
        PreparedStatement preparedStatement = null;

    
    try {
    	 Class.forName("com.mysql.cj.jdbc.Driver");
         connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
         String sql = "INSERT INTO user (First_Name, Last_Name,Email,Phone_NO,Password,Username) VALUES (?, ?, ?,,?,?,?)";
         preparedStatement = connection.prepareStatement(sql);


         preparedStatement.setString(1, user.getFirstName());
         preparedStatement.setString(2, user.getLastName());
         preparedStatement.setString(3, user.getEmail());
         preparedStatement.setString(4, user.getpNo());
         preparedStatement.setString(5, user.getPwd());
         preparedStatement.setString(6, user.getUsername());
         

         preparedStatement.executeUpdate();
         
     } catch (ClassNotFoundException | SQLException e) {
         e.printStackTrace();
     } finally {
         try {
             if (preparedStatement != null) {
                 preparedStatement.close();
             }
             if (connection != null) {
                 connection.close();
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }
       }
    }
}
