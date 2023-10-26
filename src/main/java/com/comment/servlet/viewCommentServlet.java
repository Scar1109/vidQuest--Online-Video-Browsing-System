package com.comment.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.comment.model.comment;
import com.comment.util.commentDButil;
import com.studio.model.video;
import com.studio.utill.videoUtil;
 

 
@WebServlet("/viewCommentServlet")
public class viewCommentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve customer data from the database using a DAO class
    	int vid = Integer.parseInt(request.getParameter("vid"));
    	

	 	HttpSession session = request.getSession();
	 	
    	commentDButil commentDao = new commentDButil();
        List<comment> comments = commentDao.getAllComments(vid);
        
        video vdo = videoUtil.getVideo(vid);
    	session.setAttribute("video", vdo);

        // Pass the customer data to the JSP view
        request.setAttribute("Comment", comments);
        request.getRequestDispatcher("views/vidplay.jsp").forward(request, response);
    }
}

