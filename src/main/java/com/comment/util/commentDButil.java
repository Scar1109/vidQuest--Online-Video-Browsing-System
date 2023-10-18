package com.comment.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class commentDButil {
    
	public static List <comment> validate (String vID){
		
		 ArrayList<comment> com = new ArrayList<> ();
		 
		 //create database connection
		 
		 String url = "jdbc:mysql://localhost:3306/vidquest";
		 String user = "root";
		 String password = "";
		 
		//validate
		 
		  try {
			  
			  Class.forName("com.mysql.jdbc.Driver");
			  Connection con = DriverManager.getConnection(url,user,password); 
			  Statement stmt = con.createStatement();
			  
			  String sql = "select * from comment where videoID= '"+vID+"'";
					  
			  ResultSet rs = stmt.executeQuery(sql);
			  
			  if(rs.next()) {
				   int commentID = rs.getInt(1);
				   int VideoID = rs.getInt(2);
				   int UserID = rs.getInt(3);
				   String comment =rs.getString(4);
				   
				    comment c = new comment(commentID,VideoID,UserID,comment);
				    com.add(c);
			  }
			  
		  }
			  catch (Exception e) {
				  e.printStackTrace();
			  }
		  
		  return com;
		  }
	
	public static boolean insertcomment (int commentID, int VideoID, int UserID,String comment) {
		 
	
	   boolean isSuccess = false;
	   
	   
		 //create database connection
		 
		 String url = "jdbc:mysql://localhost:3306/vidquest";
		 String user = "root";
		 String password = "";
		 
		 
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
			  Connection con = DriverManager.getConnection(url,user,password); 
			  Statement stmt = con.createStatement();
			  
			  String sql = "insert into comment values (0,0,0,'"+comment+"')";
			  int rs = stmt.executeUpdate(sql);
			  
			  if(rs>0) {
				  isSuccess = true;
			  }else {
				  isSuccess = false;
			  }
					  
		 }
		 
		 catch (Exception e){
			 e.printStackTrace();
			 
		 }
		 
		 
		 return isSuccess;
	   
	}
	   
	
	}

