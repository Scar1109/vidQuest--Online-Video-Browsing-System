package com.moderator.servlet;

import com.moderator.util.DBconnect;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RemoveVideoServlet")
public class RemoveVideoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String videoId = request.getParameter("videoId");

        // Database connection and query to remove the video
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DBconnect.getConnection();

            // SQL query to remove the video
            String removeQuery = "DELETE FROM videos WHERE VideoID = ?";
            pstmt = con.prepareStatement(removeQuery);
            pstmt.setString(1, videoId);

            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                response.getWriter().write("Video removed successfully");
            } else {
                response.getWriter().write("Video removal failed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().write("Video removal failed");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
