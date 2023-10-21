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
	    String name = request.getParameter("name");
	    String email = request.getParameter("email");
	    String mobile = request.getParameter("mobile");
	    String password = request.getParameter("password");
	    
	    boolean isTrue;
	   
	    isTrue=moderatorDBUtil.updateUser(id, name, email, mobile, password);

	    if(isTrue==true) {
	    	
	    	List<User> userDetails = moderatorDBUtil.getUserDetails(id);
	    	request.setAttribute("userDetails", userDetails);
	    	
	    	RequestDispatcher dis = request.getRequestDispatcher("/views/admin/demoprofile.jsp");
	    	dis.forward(request, response);
	    }else {
	    	List<User> userDetails = moderatorDBUtil.getUserDetails(id);
	    	request.setAttribute("userDetails", userDetails);
	    	
	    	RequestDispatcher dis = request.getRequestDispatcher("/views/admin/demoprofile.jsp");
	    	dis.forward(request, response);
	    }
	}

}
