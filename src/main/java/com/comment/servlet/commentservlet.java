package com.comment.servlet;
  

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.comment.model.comment;
import com.comment.util.commentDButil;
 

 
@WebServlet("/commentservlet")
public class commentservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
		 
	        
	        String comm = request.getParameter("coms");

	        comment Comment = new comment(28,1,comm);
	        
	        
	        commentDButil.addComment(Comment);

	        // Redirect to a success page or show a success message
	        response.sendRedirect(request.getContextPath() + "/viewCommentServlet");
	    }
}