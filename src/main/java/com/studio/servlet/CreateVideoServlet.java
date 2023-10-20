package com.studio.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.Part;

import com.studio.model.video;
import com.studio.utill.VideoUtil;

import java.io.IOException;
import java.util.UUID;
import java.io.File;

@WebServlet("/createVideoServlet")
@MultipartConfig
public class CreateVideoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String uploadPath = getServletContext().getRealPath("/") + "videos";
        String uniqueVideoName = UUID.randomUUID().toString() + ".mp4"; // Change the extension as needed
        String uniqueThumbnailName = UUID.randomUUID().toString() + ".jpg"; // Change the extension as needed

        // Handle video upload
        Part videoPart = request.getPart("videoUpload");
        videoPart.write(uploadPath + File.separator + uniqueVideoName);

        // Handle thumbnail upload
        Part thumbnailPart = request.getPart("thumbnail");
        thumbnailPart.write(uploadPath + File.separator + uniqueThumbnailName);

        video videol = new video();
        videol.setTitle(request.getParameter("title"));
        videol.setSubTitle(request.getParameter("sub-title"));
        videol.setUserID(1);
        videol.setDescription(request.getParameter("description"));
        videol.setThumbnail(uniqueThumbnailName);
        videol.setVideo(uniqueVideoName);
        videol.setCategory(request.getParameter("category"));
        videol.setVisibility(request.getParameter("visibility"));

        if (VideoUtil.createVideo(videol)) {
        	response.sendRedirect("views/studio/dashboard.jsp");
        } else {
            // Data insertion failed
            // You can redirect to an error page or display an error message
        }
    }
}
