package com.comment.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.comment.model.comment;
import com.comment.util.commentDButil;
 

 
@WebServlet("/viewCommentServlet")
public class viewCommentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve customer data from the database using a DAO class
    	
    	commentDButil commentDao = new commentDButil();
        List<comment> comments = commentDao.getAllComments(1);

        // Pass the customer data to the JSP view
        request.setAttribute("comment", comments);
        request.getRequestDispatcher("vidplay.jsp").forward(request, response);
    }
}

