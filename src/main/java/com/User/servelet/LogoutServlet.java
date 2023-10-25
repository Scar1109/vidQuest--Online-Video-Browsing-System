package com.User.servelet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@SuppressWarnings("serial")
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the session
        HttpSession session = request.getSession(false); // Use "false" to prevent the creation of a new session if it doesn't exist

        // Check if the user is logged in (i.e., there's an active session)
        if (session != null) {
            // User is logged in, so invalidate the session (log them out)
            session.invalidate();
            // Redirect to a logout success page or the login page
            response.sendRedirect("index.jsp");
        } else {
            // If there's no active session, redirect to a login page or an error page
            response.sendRedirect("views/login.jsp");
        }
    }
}
