package com.comment.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.comment.util.comment;
import com.comment.util.commentDButil;

 
@WebServlet("/commentservlet")
public class commentservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		// Retrieve user input from the form
		String VideoID =  request.getParameter( "vID");
		String comment = request.getParameter("comm");
	    String UserID = request.getParameter("UserID");
	    
	    boolean isTrue;
		
		isTrue= commentDButil.insertcomment(VideoID,UserID,comment);
		
		if (isTrue==true) {
			
		RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
		dis.forward(request, response);
		
		} else {
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
			
		}
		
		
		
	
		try {
		
		List <comment> comDetails= commentDButil.validate(comment);
		request.setAttribute("comDetails", comDetails);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("vidplay.jsp");
		dis.forward (request, response);
		
		 // Redirect back to the video page after submitting the comment
        response.sendRedirect("video.jsp");
	}

}
