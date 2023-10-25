package com.studio.servlet;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.studio.utill.videoUtil;

@MultipartConfig
@SuppressWarnings("serial")
@WebServlet("/updateVideoServlet")
public class updateVideoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    	
    	String thumbnailploadPath = getServletContext().getRealPath("/").replace(".metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\", "") + "\\src\\main\\webapp\\uploads\\thumbnails";
    	String uniqueThumbnailName = UUID.randomUUID().toString() + ".jpg";
    	
    	Part thumbnailPart = null;
		try {
			thumbnailPart = request.getPart("thumbnail");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (thumbnailPart == null || thumbnailPart.getSize() == 0) {
			
			String title = request.getParameter("title");
	        String subtitle = request.getParameter("subtitle");
	        int vid = Integer.parseInt(request.getParameter("vid"));
	        String category = request.getParameter("category");
	        String visibility = request.getParameter("visibility");
	        String description = request.getParameter("description");
	        

	        // Update the database
	        boolean success = videoUtil.updateVideo(vid, title, subtitle, category, visibility, description);

	        if (success) {
	        	response.sendRedirect(request.getContextPath() + "/retrieveVideoServlet");
	        } else {
	            response.sendRedirect("error.jsp");
	        }
			
		}else {
        thumbnailPart.write(thumbnailploadPath + File.separator + uniqueThumbnailName);
    	
        // Retrieve form data
        String title = request.getParameter("title");
        String subtitle = request.getParameter("subtitle");
        int vid = Integer.parseInt(request.getParameter("vid"));
        String category = request.getParameter("category");
        String visibility = request.getParameter("visibility");
        String description = request.getParameter("description");
        

        // Update the database
        boolean success = videoUtil.updateVideo(vid, title, subtitle, category, visibility, description, uniqueThumbnailName);

        if (success) {
        	response.sendRedirect(request.getContextPath() + "/retrieveVideoServlet");
        } else {
            response.sendRedirect("error.jsp");
        }
    }
   }
}
