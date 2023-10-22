package com.comment.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.comment.util.commentDButil;
 

/**
 * Servlet implementation class DeleteCommentServlet
 */
@WebServlet("/DeleteCommentServlet")
public class DeleteCommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int commentID = Integer.parseInt( request.getParameter("commentId"));
		
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		   // Call the service to delete the comment
        boolean success = commentDButil.deleteComment(commentID);

        if (success) {
            // Customer deleted successfully
            response.sendRedirect(request.getContextPath() + "/viewCommentServlet"); // Redirect to the customer list page
        } else {
            // Handle the case where the customer couldn't be deleted
            // You can set an error message or perform other actions here
        }
	}
 

}
