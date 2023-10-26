package com.moderator.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.moderator.util.moderatorDBUtil;

@WebServlet("/addUserServelet")
public class addUserServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String username = request.getParameter("username");
        String email = request.getParameter("email");
        String number = request.getParameter("number");
        String password = request.getParameter("password");
        String type = request.getParameter("type");
        
        

        boolean isSuccess;

        isSuccess = moderatorDBUtil.insertCustomer(firstName,lastName,email, number, password,username,type);

        if (isSuccess) {
            // Redirect to login.jsp
        	RequestDispatcher dis = request.getRequestDispatcher("/views/admin/index.jsp");
	    	dis.forward(request, response);

        } else {
            // Redirect to profile.jsp
        	RequestDispatcher dis = request.getRequestDispatcher("index.jsp");
	    	dis.forward(request, response);
        }

		
	}

}
