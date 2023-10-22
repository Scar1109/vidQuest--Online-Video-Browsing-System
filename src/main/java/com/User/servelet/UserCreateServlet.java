package com.User.servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.User.model.User;
import com.User.util.UserDbUtill;




@WebServlet( urlPatterns ="/UserControllerServlet")


public class UserCreateServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		   
		    String firstName = request.getParameter("first-name");
	        String lastName = request.getParameter("last-name");
	        String email = request.getParameter("email");
	        String pno = request.getParameter("pno");
	        String pwd = request.getParameter("pwd");
	        String username = request.getParameter("username");
	        
	        User user = new  User(firstName,lastName,email,pno,pwd,username);
	        
	        UserDbUtill.adduser(user);
			
	     // Redirect to a success page or show a success message
	        response.sendRedirect("index.jsp");
	}

	
}