package com.User.servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.User.model.User;
import com.User.util.UserDbUtill;
import com.User.util.deleteuserDbUtill;
import com.User.util.deleteuserDbUtill;


@WebServlet("/DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 int userId = Integer.parseInt(request.getParameter("userId"));
        
        // Call the service to delete the user
        boolean success = deleteuserDbUtill.deleteuser(userId);

        if (success) {
            // user deleted successfully
            response.sendRedirect(request.getContextPath() + "/index.jsp"); // Redirect to the user list page
        } else {
            // Handle the case where the user couldn't be deleted
            // You can set an error message or perform other actions here
        }
	
	}

}
