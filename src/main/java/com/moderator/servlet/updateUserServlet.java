package com.moderator.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.moderator.model.User;
import com.moderator.util.moderatorDBUtil;

@WebServlet("/updateUserServlet")
public class updateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
	    String firstName = request.getParameter("firstName");
	    String lastName = request.getParameter("lastName");
	    String email = request.getParameter("email");
	    String mobile = request.getParameter("mobile");
	    String password = request.getParameter("password");
	    String username = request.getParameter("username");
	    
	    boolean isTrue;
	   
	    isTrue=moderatorDBUtil.updateUser(id,firstName,lastName,username, email, mobile, password);

	    if(isTrue==true) {
	    	
	    	List<User> userDetails = moderatorDBUtil.getUserDetails(id);
	    	request.setAttribute("userDetails", userDetails);
	    	
	    	RequestDispatcher dis = request.getRequestDispatcher("/views/admin/profile.jsp");
	    	dis.forward(request, response);
	    }else {
	    	List<User> userDetails = moderatorDBUtil.getUserDetails(id);
	    	request.setAttribute("userDetails", userDetails);
	    	
	    	RequestDispatcher dis = request.getRequestDispatcher("/views/admin/profile.jsp");
	    	dis.forward(request, response);
	    }
	}

}
