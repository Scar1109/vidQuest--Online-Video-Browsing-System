package com.studio.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.User.model.User;
import com.studio.model.video;
import com.studio.utill.videoUtil;

@WebServlet("/retrieveVideoServlet")
public class retrieveVideoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<video> videos = null;
		
		HttpSession session = request.getSession();
		User us = (User) session.getAttribute("user");
		
		try {
			int uid = us.getUid();
			videos = videoUtil.getUserVideos(uid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Pass the customer data to the JSP view
		request.setAttribute("videos", videos);
		request.getRequestDispatcher("views/studio/contents.jsp").forward(request, response);
	}
}
