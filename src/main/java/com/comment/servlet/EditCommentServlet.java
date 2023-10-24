package com.comment.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.comment.model.comment;
import com.comment.util.commentDButil;
 
/**
 * Servlet implementation class EditCommentServlet
 */
@WebServlet("/EditCommentServlet")
public class EditCommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void dopost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		    int commentID = Integer.parseInt( request.getParameter("commentId"));
		    String comment = request.getParameter("commentId");
	         
	        
		    comment comm = new comment(commentID,comment);

	        commentDButil.updateCustomer(comm);

	        response.sendRedirect("viewCustomerServlet");
		
	}

	 

}
