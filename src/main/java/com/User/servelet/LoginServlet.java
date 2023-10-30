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
import com.User.util.UserValidationUtil;
import com.moderator.model.modUser;
import com.moderator.util.moderatorDBUtil;

@SuppressWarnings("serial")
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        System.out.println(username);
        System.out.println(password);
        
        User user = UserValidationUtil.validateUser(username, password);

        if (user != null){
        	
        	HttpSession session = request.getSession();
        	session.setAttribute("user", user);
        	
        	List<modUser> userDetails = moderatorDBUtil.validate(username, password);
        	
        	if(user.getType().equals("admin")) {
        		moderatorDBUtil.logActivity(username,user.getUid(),"User " + username + " logged in successfully");
                request.setAttribute("userDetails", userDetails);
                response.sendRedirect(request.getContextPath() + "/getActivityServlet");
        	}else {
            response.sendRedirect("index.jsp");
        	}
        	
        } else {
            response.sendRedirect("views/login.jsp?error=usernotfound");
        }
    }
}
