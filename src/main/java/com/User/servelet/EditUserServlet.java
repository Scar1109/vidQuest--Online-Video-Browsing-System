package com.User.servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.User.model.User;
import com.User.util.EditDButil;
 
 

/**
 * Servlet implementation class EditUserServlet
 */
@WebServlet("/EditUserServlet")
public class EditUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void dopost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		    int userID = Integer.parseInt( request.getParameter(" userId"));
		    
		    String firstName = request.getParameter("firstName");
	        String lastName = request.getParameter("lastName");
	        String email = request.getParameter("email");
	        String pNo = request.getParameter("pNo");
	        String pwd = request.getParameter("pwd");
	        String username = request.getParameter("username");
	        
	        User usr = new User( firstName,lastName,email,pNo,pwd,username);

	        EditDButil.updateUser(usr);

	        response.sendRedirect("viewUserServlet");
		
	}

	 

}

