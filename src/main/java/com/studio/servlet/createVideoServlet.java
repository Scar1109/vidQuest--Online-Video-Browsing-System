package com.studio.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.Part;

import com.User.model.User;
import com.studio.model.video;
import com.studio.utill.videoUtil;

import java.io.IOException;
import java.util.UUID;
import java.io.File;

@SuppressWarnings("serial")
@WebServlet("/createVideoServlet")
@MultipartConfig
public class createVideoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	String videouploadPath = getServletContext().getRealPath("/").replace(".metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\", "") + "\\src\\main\\webapp\\uploads\\videos";
    	String thumbnailploadPath = getServletContext().getRealPath("/").replace(".metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\", "") + "\\src\\main\\webapp\\uploads\\thumbnails";


        String uniqueVideoName = UUID.randomUUID().toString() + ".mp4"; // Change the extension as needed
        String uniqueThumbnailName = UUID.randomUUID().toString() + ".jpg"; // Change the extension as needed

        // Handle video upload
        Part videoPart = request.getPart("videoUpload");
        videoPart.write(videouploadPath + File.separator + uniqueVideoName);

        // Handle thumbnail upload
        Part thumbnailPart = request.getPart("thumbnail");
        thumbnailPart.write(thumbnailploadPath + File.separator + uniqueThumbnailName);
        
        HttpSession session = request.getSession();
		User us = (User) session.getAttribute("user");
		int uid = us.getuid();

        video videol = new video(request.getParameter("title"),
        		request.getParameter("sub-title"),
        		uid,
        		request.getParameter("description"),
        		uniqueThumbnailName,
        		uniqueVideoName,
        		request.getParameter("category"),
        		request.getParameter("visibility"));

        if (videoUtil.createVideo(videol)) {
        	response.sendRedirect("views/studio/dashboard.jsp");
        } else {
            // Data insertion failed
            // You can redirect to an error page or display an error message
        }
    }
}
