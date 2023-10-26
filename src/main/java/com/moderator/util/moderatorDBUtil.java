package com.moderator.util;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
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
				String date = rs.getString(4);
				String time = rs.getString(5);
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

	public static boolean insertCustomer(String firstName, String lastName, String email,
			String number, String password,String username,String type) {
		try (Connection con = DBconnect.getConnection()) {
			java.util.Date utilDate = new java.util.Date(); // Current date and time
			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			java.sql.Time sqlTime = new java.sql.Time(utilDate.getTime());

			String sql = "INSERT INTO Users (firstName, lastName,Date, Time, email, pNo,pwd, username,type,pPhoto) VALUES (?, ?, ?, ?, ?, ?, ?,?,?,?)";
			java.sql.PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			pstmt.setDate(3, sqlDate);
			pstmt.setTime(4, sqlTime);
			pstmt.setString(5, email);
			pstmt.setString(6, number);
			pstmt.setString(7, password);
			pstmt.setString(8, username);
			pstmt.setString(9, type);
			pstmt.setString(10, "null");

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
				String date = rs.getString(7);
				String time = rs.getString(8);

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

				Video video = new Video(videoID, title, subTitle, userID, description, thumbnail, videoPath, category,
						visibility, status, date, time);
				videos.add(video);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return videos;
	}

	public static List<Comment> getComment() {
		ArrayList<Comment> comments = new ArrayList<>();

		try {
			Connection con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "SELECT * FROM comment";

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int commentID = rs.getInt("commentID");
				int videoID = rs.getInt("videoID");
				int userID = rs.getInt("userID");
				String comment = rs.getString("comment");
				String date = rs.getString("Date");
				String time = rs.getString("Time");

				Comment com = new Comment(commentID, videoID, userID, comment, date, time);
				comments.add(com);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return comments;
	}

	private static final String INSERT_LOG_SQL = "INSERT INTO activitylogs (userName, userID, date, time, log) VALUES (?, ?, ?, ?, ?)";

	public static void logActivity(String userName, int userID, String log) {
	    try (Connection connection = DBconnect.getConnection();
	         PreparedStatement preparedStatement = connection.prepareStatement(INSERT_LOG_SQL)) {
	        // Set the current date and time
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
	        String currentDate = dateFormat.format(new Date()); // Current date
	        String currentTime = timeFormat.format(new Date()); // Current time

	        preparedStatement.setString(1, userName);
	        preparedStatement.setInt(2, userID);
	        preparedStatement.setString(3, currentDate);
	        preparedStatement.setString(4, currentTime);
	        preparedStatement.setString(5, log);

	        int rowsAffected = preparedStatement.executeUpdate();

	        if (rowsAffected > 0) {
	            System.out.println("Log entry added successfully.");
	        } else {
	            System.err.println("Failed to add log entry.");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	
	public static List<UserActivityLog> getActivityLogs() {
	    ArrayList<UserActivityLog> logs = new ArrayList<>();

	    try {
	        Connection con = DBconnect.getConnection();
	        Statement stmt = con.createStatement();
	        String sql = "SELECT * FROM activitylogs ORDER BY logID DESC;";
	        System.out.println("getActivity");
	        ResultSet rs = stmt.executeQuery(sql);

	        while (rs.next()) {
	            int logID = rs.getInt("logID");
	            String userName = rs.getString("userName");
	            int userID = rs.getInt("userID");
	            String log = rs.getString("log");
	            String date = rs.getString("date");
	            String time = rs.getString("time");

	            UserActivityLog logEntry = new UserActivityLog(logID, userName, userID, date, time, log);
	            logs.add(logEntry);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return logs;
	}

}
	 

