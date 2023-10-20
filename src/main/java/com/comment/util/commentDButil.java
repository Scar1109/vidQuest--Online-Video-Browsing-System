package com.comment.util;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.comment.model.comment;
 

//Add comments
 
	public class commentDButil {
		
	    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/vidquest";
	    private static final String JDBC_USER = "root";
	    private static final String JDBC_PASSWORD = "";

	    
	     public static void addComment (comment Comment) {
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
	            
	            
	            
	            String sql = "INSERT INTO comment(VideoID, UserID,comment) VALUES (?, ?, ?)";
	            
	            preparedStatement = connection.prepareStatement(sql);
	            
	            preparedStatement.setInt(1, Comment.getVideoID());
	            preparedStatement.setInt(2, Comment.getUserID());
	            preparedStatement.setString(3, Comment.getComment());

	            preparedStatement.executeUpdate();
	            
	            System.out.println("Insertion Sc");
	            
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
	
  
	     public List<comment> getAllComments(int vid) {
	    	 
	    	 Connection connection = null;
		        PreparedStatement preparedStatement = null;
	         List<comment> com = new ArrayList<>();
	         
	         try {
	             Class.forName("com.mysql.cj.jdbc.Driver");
	             connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
	             
	             String sql = "SELECT * FROM comments where VideoID = ?";
	              
	             
	             preparedStatement = connection.prepareStatement(sql);
		            
		         preparedStatement.setInt(1, vid);
		        
	            
	             ResultSet resultSet =  preparedStatement.executeQuery();
	             
	             //while- to create objects for all comments
	             while (resultSet.next()) {
	            	 
	             	//create objects
	                 comment comm = new comment( resultSet.getInt("VideoID"), resultSet.getInt("UserID"), resultSet.getString("comment"));
	                 
	              
	                 com.add(comm);
	             }
	             
	             resultSet.close();
	             connection.close();
	             
	         } catch (SQLException | ClassNotFoundException e) {
	             e.printStackTrace();
	         }
	         return com;
	     }
	     
	    
	}



