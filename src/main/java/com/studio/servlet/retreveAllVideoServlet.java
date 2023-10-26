package com.studio.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.studio.model.video;
import com.studio.utill.videoUtil;

@WebServlet("/retreveAllVideoServlet")
public class retreveAllVideoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<video> videos = null;
		
		try {
			videos = videoUtil.getAllVideos();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Pass the customer data to the JSP view
		request.setAttribute("videos", videos);
		request.getRequestDispatcher("views/other/portfolio.jsp").forward(request, response);
	}
}
