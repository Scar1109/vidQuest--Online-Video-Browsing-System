package com.comment.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.comment.model.comment;
import com.comment.util.commentDButil;
 

@WebServlet("/EditCommentServlet")
public class EditCommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		    int commentID = Integer.parseInt( request.getParameter("commentId"));
		    String comment = request.getParameter("coms");
	         
	        
		    comment comments1 = new comment(commentID,comment);

	        commentDButil.updateCustomer(comments1);

	        response.sendRedirect(request.getContextPath() + "/viewCommentServlet");
		
	}

	 

}
