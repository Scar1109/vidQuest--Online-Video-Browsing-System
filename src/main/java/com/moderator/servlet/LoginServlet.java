package com.moderator.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.moderator.model.*;
import com.moderator.util.moderatorDBUtil;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("uid");
		String password = request.getParameter("pwd");
		
		try {
		List<User> userDetails = moderatorDBUtil.validate(username, password);
		request.setAttribute("userDetails",userDetails);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("views/admin/index.jsp");
		dis.forward(request, response);
	}

}
