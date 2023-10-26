package com.moderator.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.moderator.model.UserActivityLog;
import com.moderator.util.moderatorDBUtil;

@WebServlet("/getActivityServlet")
public class getActivityServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<UserActivityLog> activityLogs = moderatorDBUtil.getActivityLogs();
            request.setAttribute("activityLogs", activityLogs);
        } catch (Exception e) {
            e.printStackTrace();
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("views/admin/index.jsp");
        dispatcher.forward(request, response);
    }
}
