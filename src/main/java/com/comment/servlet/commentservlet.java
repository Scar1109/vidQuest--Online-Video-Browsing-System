package com.comment.servlet;
  

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.User.model.User;
import com.comment.model.comment;
import com.comment.util.commentDButil;
import com.studio.model.video;
import com.studio.utill.videoUtil;
 

 
@WebServlet("/commentservlet")
public class commentservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
		 
		 
		 
		 	HttpSession session = request.getSession();
			User us = (User) session.getAttribute("user");
			int uid = us.getUid();
		 
		 	int vid = Integer.parseInt(request.getParameter("vid"));
	        String comm = request.getParameter("coms");

	        comment Comment = comment.createComment(vid,uid,comm);
	        
	        
	        commentDButil.addComment(Comment);
	        video vdo = videoUtil.getVideo(vid);
	        
        	session.setAttribute("video", vdo);

	        // Redirect to a success page or show a success message
	        response.sendRedirect(request.getContextPath() + "/viewCommentServlet?vid=" + vid);
	    }
}