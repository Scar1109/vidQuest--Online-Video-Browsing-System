package com.User.servelet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.User.model.User;
import com.User.util.viewUserDButil;




@WebServlet("/viewUserServelet")
public class viewUserServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		User us = (User) session.getAttribute("user");
		int uid = us.getuid();
		
		 // Retrieve user data from the database using a DAO class
		viewUserDButil userDao = new viewUserDButil();
        List<User> users = userDao.getuser(uid);

	 // Pass the user data to the JSP view
    request.setAttribute("user", users);
    request.getRequestDispatcher("views/profile/profie.jsp").forward(request, response);
}


}
