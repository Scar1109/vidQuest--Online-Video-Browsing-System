package com.moderator.util;

import java.sql.Connection;
import java.sql.Date;
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
				String email = rs.getString(4);
				String mobile = rs.getString(5);
				String passwdu = rs.getString(6);
				String usernameu = rs.getString(7);

				User u = new User(UserID, firstName, lastName, email, mobile, passwdu, usernameu);
				usr.add(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return usr;
	}

	
	public static boolean insertCustomer(String firstName, String lastName, String username, String email, String number, String password) {
	    try (Connection con = DBconnect.getConnection()) {
	        Date date = new Date(System.currentTimeMillis());  // Current date and time
	        String sql = "INSERT INTO Users (firstName, lastName, username, email, pNo, regDate, pwd) VALUES (?, ?, ?, ?, ?, ?, ?)";
	        java.sql.PreparedStatement pstmt = con.prepareStatement(sql);
	        pstmt.setString(1, firstName);
	        pstmt.setString(2, lastName);
	        pstmt.setString(3, username);
	        pstmt.setString(4, email);
	        pstmt.setString(5, number);
	        pstmt.setDate(6, date);
	        pstmt.setString(7, password);

	        int rowsInserted = pstmt.executeUpdate();
	        isSuccess = rowsInserted > 0;
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return isSuccess;
	}


	/*
	 * public static boolean insertCustomer(String firstName, String lastName,
	 * String username, String email, String number, String password) {
	 * 
	 * Date date = new Date(0); java.sql.Date sqldate=new
	 * java.sql.Date(date.getTime()); try { Connection con =
	 * DBconnect.getConnection(); stmt = con.createStatement(); String sql =
	 * "INSERT INTO users VALUES (0, '" + firstName + "','" + lastName + "','" +
	 * username + "', '" + email + "', '" + number + "','"+sqldate+"', '" + password
	 * + "',)"; int rs = stmt.executeUpdate(sql);
	 * 
	 * if (rs > 0) { isSuccess = true; } else { isSuccess = false; }
	 * 
	 * } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * return isSuccess; }
	 */

	public static boolean updateUser(String id, String firstName, String lastName, String username, String email,
			String mobile, String password) {

		try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "UPDATE users set firstname='" + firstName + "',lastName='" + lastName + "',username='"
					+ username + "',email='" + email + "',mobile='" + mobile + "',password='" + password
					+ "' WHERE id='" + id + "'";
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
			String sql = "SELECT * FROM users WHERE id='" + covertedID + "'";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int UserID = rs.getInt(1);
				String firstname = rs.getString(2);
				String lastname = rs.getString(3);
				String email = rs.getString(4);
				String mobile = rs.getString(5);
				String passwdu = rs.getString(6);
				String usernameu = rs.getString(7);

				User u = new User(UserID, firstname, lastname, email, mobile, passwdu, usernameu);
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
			String sql = "DELETE from users WHERE id='" + convId + "'";
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
}
