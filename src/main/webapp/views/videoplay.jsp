<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="../css/vidplay.css" rel="stylesheet" />
   
</head>
<body>

<!-- video player UI --> 

<div class="video-container">
        <div class="video-player">
            <video controls>
                <source src="https://cdn.plyr.io/static/demo/View_From_A_Blue_Moon_Trailer-576p.mp4" type="video/mp4" />
            </video>
        </div>
        <div class="video-info">
            <h1 class="video-title">Video Title</h1>
            <div class="video-stats">
                <span class="views">1,234,567 views</span>
                <span class="date">Published on Oct 10, 2023</span>
            </div>
            <div class="video-description">
                <p>This is a description of the video. You can add more information here.</p>
            </div>
        </div>
    </div>
 
 <!--Collect comments from a form-->
    
<form action ="a" method ="post">

      <h2>Comments</h2><br>
      <input type = "text" name ="comment">
      <input type ="submit" name ="submit" value ="comment">


</form>
    <div class="comments-section">
       
        <!-- Add comment section here -->
    </div>

</body>
</html>