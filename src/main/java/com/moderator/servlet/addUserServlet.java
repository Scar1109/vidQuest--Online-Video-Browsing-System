package com.moderator.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.moderator.util.moderatorDBUtil;

@WebServlet("/addUserServlet")
public class addUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String mobile = request.getParameter("number");
        String password = request.getParameter("password");
        String confirmpassword = request.getParameter("confirmPassword");

        boolean isSuccess;

        isSuccess = moderatorDBUtil.insertCustomer(name, email, mobile, password, confirmpassword);

        if (isSuccess) {
            // Redirect to login.jsp
        	response.sendRedirect(request.getContextPath() + "/views/admin/profile.jsp");

        } else {
            // Redirect to profile.jsp
            response.sendRedirect(request.getContextPath() + "/profile.jsp");
        }

    }
}
