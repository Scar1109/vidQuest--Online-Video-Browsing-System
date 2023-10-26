package com.moderator.servlet;
import com.moderator.util.DBconnect;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateVideoStatusServlet")
public class UpdateVideoStatusServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String videoId = request.getParameter("videoId");

        try {
            Connection con = DBconnect.getConnection();

            // Update the status to "Approved" in the database.
            String updateQuery = "UPDATE videos SET Status = ? WHERE VideoID = ?";
            PreparedStatement pstmt = con.prepareStatement(updateQuery);
            pstmt.setString(1, "approved");
            pstmt.setString(2, videoId);

            int rowsUpdated = pstmt.executeUpdate();
            con.close();

            if (rowsUpdated > 0) {
                response.getWriter().write("Status updated to Approved");
            } else {
                response.getWriter().write("Status update failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("Status update failed");
        }
    }
}
