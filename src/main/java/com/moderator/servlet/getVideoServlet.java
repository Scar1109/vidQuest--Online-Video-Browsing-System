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

@WebServlet("/getVideoServlet")
public class getVideoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Video> videoDetails = moderatorDBUtil.getAllVideos();
            request.setAttribute("videoDetails", videoDetails);
        } catch (Exception e) {
            e.printStackTrace();
        }

        RequestDispatcher dis = request.getRequestDispatcher("views/admin/VideoList.jsp");
        dis.forward(request, response);
    }

}
