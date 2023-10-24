package com.moderator.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.moderator.model.User;
import com.moderator.util.moderatorDBUtil;

@WebServlet("/DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String id = request.getParameter("id");
	        boolean isTrue;

	        isTrue = moderatorDBUtil.deleteUser(id);

	        if (isTrue) {
	            RequestDispatcher dis = request.getRequestDispatcher("/views/admin/forms.jsp");
	            dis.forward(request, response);
	        } else {
	            List<User> userDetails = moderatorDBUtil.getUserDetails(id);
	            request.setAttribute("userDetails", userDetails);

	            RequestDispatcher dis = request.getRequestDispatcher("/views/admin/Profile.jsp");
	            dis.forward(request, response);
	        }
	}

}
