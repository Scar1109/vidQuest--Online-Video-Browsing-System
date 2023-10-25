package com.User.servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.User.model.User;
import com.User.util.UserDbUtill;
import com.User.util.UserValidationUtil;

@SuppressWarnings("serial")
@WebServlet("/UserCreateServlet")


public class UserCreateServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
		   
		    String firstName = request.getParameter("first-name");
	        String lastName = request.getParameter("last-name");
	        String email = request.getParameter("email");
	        String pno = request.getParameter("pno");
	        String pwd = request.getParameter("pwd");
	        String username = request.getParameter("username");
	        
	        
	        User us = UserValidationUtil.SignupValidateUser(username, email);

	        if (us == null) {
	        	User user = new  User(firstName,lastName,email,pno,pwd,username);
		        UserDbUtill.adduser(user);
		        
		        HttpSession session = request.getSession();
	        	session.setAttribute("user", user);
	        	
	            response.sendRedirect("index.jsp");
	        } else {
	            // User already exists, handle this case
	            // You might want to display a different message or take other actions
	            response.sendRedirect("views/login.jsp?error=userexists");
	        }

	}

	
}