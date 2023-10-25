package com.moderator.servlet;

import com.moderator.model.User;
import com.moderator.util.moderatorDBUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/profileServlet")
public class profileServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("uid");
        String password = request.getParameter("pwd"); 

        try {
            List<User> userDetails = moderatorDBUtil.validate(username, password);

            if (!userDetails.isEmpty()) {
                // Log the successful login activity
                moderatorDBUtil.logActivity(username, userDetails.get(0).getUserID(),"User " + username + " logged in successfully");
                request.setAttribute("userDetails", userDetails);
            } else {
                request.setAttribute("loginError", "Invalid username or password");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        RequestDispatcher dis = request.getRequestDispatcher("views/admin/profile.jsp");
        dis.forward(request, response);
    }
}
