package com.User.servelet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.User.model.User;
import com.User.util.UserValidationUtil;

import java.io.IOException;

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
        	
            response.sendRedirect("index.jsp");
        } else {
            response.sendRedirect("views/login.jsp?error=usernotfound");
        }
    }
}
