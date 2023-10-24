package com.moderator.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.moderator.model.*;

public class moderatorDBUtil {

	private static Connection con = null;
	private static Statement stmt = null;
	private static boolean isSuccess;
	private static ResultSet rs = null;

	public static List<User> validate(String username, String password) {

		ArrayList<User> usr = new ArrayList<>();

		try {

			Connection con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "SELECT * FROM users WHERE username = '" + username + "' AND pwd = '" + password + "'";

			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {
				int UserID = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				String date=rs.getString(4);
				String time=rs.getString(5);
				String email = rs.getString(6);
				String mobile = rs.getString(7);
				String passwdu = rs.getString(8);
				String usernameu = rs.getString(9);
				

				User u = new User(UserID, firstName, lastName, date, time, email, mobile, passwdu, usernameu);
				usr.add(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return usr;
	}

	
	public static boolean insertCustomer(String firstName, String lastName, String username, String email, String number, String password) {
	    try (Connection con = DBconnect.getConnection()) {
	        java.util.Date utilDate = new java.util.Date(); // Current date and time
	        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
	        java.sql.Time sqlTime = new java.sql.Time(utilDate.getTime());

	        String sql = "INSERT INTO Users (firstName, lastName, username, email, pNo, Date, Time, pwd) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	        java.sql.PreparedStatement pstmt = con.prepareStatement(sql);
	        pstmt.setString(1, firstName);
	        pstmt.setString(2, lastName);
	        pstmt.setString(3, username);
	        pstmt.setString(4, email);
	        pstmt.setString(5, number);
	        pstmt.setDate(6, sqlDate);
	        pstmt.setTime(7, sqlTime);
	        pstmt.setString(8, password);

	        int rowsInserted = pstmt.executeUpdate();
	        isSuccess = rowsInserted > 0;
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return isSuccess;
	}


	public static boolean updateUser(String id, String firstName, String lastName, String username, String email,
			String mobile, String password) {

		try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "UPDATE users set firstname='" + firstName + "',lastName='" + lastName + "',username='"
					+ username + "',email='" + email + "',mobile='" + mobile + "',password='" + password
					+ "' WHERE UserID='" + id + "'";
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

	public static List<User> getUserDetails(String id) {

		int covertedID = Integer.parseInt(id);

		ArrayList<User> usr = new ArrayList<>();

		try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "SELECT * FROM users WHERE UserID='" + covertedID + "'";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int UserID = rs.getInt(1);
				String firstname = rs.getString(2);
				String lastname = rs.getString(3);
				String email = rs.getString(4);
				String mobile = rs.getString(5);
				String passwdu = rs.getString(6);
				String usernameu = rs.getString(7);
				String date=rs.getString(7);
				String time=rs.getString(8);

				User u = new User(UserID, firstname, lastname, date, time, email, mobile, passwdu, usernameu);
				usr.add(u);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return usr;
	}

	public static boolean deleteUser(String id) {

		int convId = Integer.parseInt(id);

		try {

			con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "DELETE from users WHERE UserID='" + convId + "'";
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
	
	
	public static List<User> getAllUsers() {
	    ArrayList<User> users = new ArrayList<>();

	    try {
	        Connection con = DBconnect.getConnection();
	        stmt = con.createStatement();
	        String sql = "SELECT * FROM users";

	        ResultSet rs = stmt.executeQuery(sql);

	        while (rs.next()) {
	            int UserID = rs.getInt("UserID");
	            String firstName = rs.getString("firstName");
	            String lastName = rs.getString("lastName");
	            String date = rs.getString("Date"); 
	            String time = rs.getString("Time");  
	            String email = rs.getString("email");
	            String mobile = rs.getString("pNo");
	            String password = rs.getString("pwd");
	            String username = rs.getString("username");

	            User user = new User(UserID, firstName, lastName, date, time, email, mobile, password, username);
	            users.add(user);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return users;
	}
	public static List<Video> getAllVideos() {
	    ArrayList<Video> videos = new ArrayList<>();

	    try {
	        Connection con = DBconnect.getConnection();
	        stmt = con.createStatement();
	        String sql = "SELECT * FROM videos";

	        ResultSet rs = stmt.executeQuery(sql);

	        while (rs.next()) {
	            int videoID = rs.getInt("VideoID");
	            String title = rs.getString("Title");
	            String subTitle = rs.getString("SubTitle");
	            int userID = rs.getInt("UserID");
	            String description = rs.getString("Description");
	            String thumbnail = rs.getString("Thumbnail");
	            String videoPath = rs.getString("Video");
	            String category = rs.getString("Category");
	            String visibility = rs.getString("Visibility");
	            String status = rs.getString("Status");
	            String date = rs.getString("Date");
	            String time = rs.getString("Time");

	            Video video = new Video(videoID, title, subTitle, userID, description, thumbnail, videoPath, category, visibility, status, date, time);
	            videos.add(video);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return videos;
	}
	
	


}

