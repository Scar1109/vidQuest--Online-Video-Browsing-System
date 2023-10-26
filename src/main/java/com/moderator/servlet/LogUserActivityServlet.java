package com.moderator.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.moderator.model.UserActivityLog;
import com.moderator.util.DBconnect;

@WebServlet("/LogUserActivity")
public class LogUserActivityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the user activity information from the request.
        String userName = request.getParameter("userName");
        int userID = Integer.parseInt(request.getParameter("userID"));
        String date = request.getParameter("date");
        String time = request.getParameter("time");
        String log = request.getParameter("log");
        System.out.println("writeActivity");
        // Timestamp for the current time
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        // Create a UserActivityLog instance with the provided data using the constructor
        UserActivityLog userActivityLog = new UserActivityLog(0, userName, userID, date, time, log);

        // Insert the log into the database
        Connection connection = null;
        try {
            connection = DBconnect.getConnection(); // Replace with your database connection method

            String insertQuery = "INSERT INTO user_activity_log (userName, userID, date, time, log) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, userActivityLog.getUserName());
            preparedStatement.setInt(2, userActivityLog.getUserID());
            preparedStatement.setString(3, userActivityLog.getDate());
            preparedStatement.setString(4, userActivityLog.getTime());
            preparedStatement.setString(5, userActivityLog.getLog());
           

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        // Redirect or send a response as appropriate
        response.sendRedirect("index.jsp"); // Redirect to the activity log page
    }
}
