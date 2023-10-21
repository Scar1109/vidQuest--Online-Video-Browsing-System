package com.moderator.util;
import com.moderator.model.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class moderatorDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static boolean isSuccess;
	private static ResultSet rs = null;
	
	
	
	public static List<User> validate(String name, String password) {
	    
		ArrayList<User> usr = new ArrayList<>();
	    
	    
	    try {
	    	
	    	Connection con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "SELECT * FROM users WHERE name = '" + name + "' AND password = '" + password + "'";
	        
	        // Print the SQL query for debugging
	       // System.out.println("SQL Query: " + sql);
	        
	        ResultSet rs = stmt.executeQuery(sql);
	        
	        if (rs.next()) {
	            int id = rs.getInt(1);
	            String name1 = rs.getString(2);
	            String email = rs.getString(3);
	            String number = rs.getString(4);
	            String passwdu = rs.getString(5);
	            String confirmpasswdu = rs.getString(6);
	            
	            User u = new User(id, name1, email, number, passwdu, confirmpasswdu);
	            usr.add(u);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    return usr;
	}


	public static boolean insertCustomer(String name, String email, String number, String password,
			String confirmpassword) {

		

		try {
			Connection con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "INSERT INTO users VALUES (0, '" + name + "', '" + email + "', '" + number + "', '" + password
					+ "','" + confirmpassword + "')";
			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}

	
	public static boolean updateUser(String id,String name,String email,String mobile,String password) {
		
		try {
			con=DBconnect.getConnection();
			stmt=con.createStatement();
			String sql= "UPDATE users set name='"+name+"',email='"+email+"',mobile='"+mobile+"',password='"+password+"' WHERE id='"+id+"'";
			int rs=stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess=true;
			}
			else {
				isSuccess=false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static List<User> getUserDetails(String id) {
		
		int covertedID =Integer.parseInt(id);
		
		ArrayList<User> usr = new ArrayList<>();	
		
		try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "SELECT * FROM users WHERE id='"+covertedID+"'";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int id1 = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String mobile = rs.getString(4);
				String password = rs.getString(5);
				String confirmPassword = rs.getString(6);
				
				User user = new User(id1, name, email, mobile, password, confirmPassword);
				usr.add(user);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return usr;
	}
	
	public static boolean deleteUser(String id){
		
		int convId = Integer.parseInt(id);
			
		try {

			con=DBconnect.getConnection();
			stmt=con.createStatement();
			String sql= "DELETE from users WHERE id='"+convId+"'";
			int rs=stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess =true;
			}else {
				isSuccess=false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
}