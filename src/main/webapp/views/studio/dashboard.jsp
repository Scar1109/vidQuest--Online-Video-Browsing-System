<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="com.User.model.User"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="asserts/creator.css">
<title>vidQuest</title>
</head>

<body>
	<nav>
		<div class="profileImg">
			<img src="https://i.ibb.co/dMvJn2D/cool-profile-picture-87h46gcobjl5e4xu.jpg" alt="">
		</div>
		
		<%
				    // Check if the session attribute 'user' is set
				    User us = (User) session.getAttribute("user");
		
		%>

		<div class="profName">
			<span class="profileName"><%=us.getUsername()%></span>
		</div>

		<div class="menu-items">
			<ul class="navLinks">
				<li class="navList active"><a href="#"> <ion-icon
							name="apps-outline"></ion-icon> <span class="links">Dashboard</span>
				</a></li>
				<li class="navList"><a
					href="${pageContext.request.contextPath}/views/studio/vidUpload.jsp">
						<ion-icon name="cloud-upload-outline"></ion-icon> <span
						class="links">Create New</span>
				</a></li>
				<li class="navList"><a
					href="<%=request.getContextPath()%>/retrieveVideoServlet"> <ion-icon
							name="videocam-outline"></ion-icon> <span class="links">Contents</span>
				</a></li>
				<li class="navList"><a href="#"> <ion-icon
							name="stats-chart-outline"></ion-icon> <span class="links">Analytics</span>
				</a></li>
				<li class="navList"><a href="#"> <ion-icon
							name="chatbubble-ellipses-outline"></ion-icon> <span
						class="links">Comments</span>
				</a></li>
			</ul>
			<ul class="bottom-link">
				<li><a href="#"> <ion-icon name="log-out-outline"></ion-icon>
						<span class="links">Logout</span>
				</a></li>
				<li class="mode"><a href="#"> <ion-icon name="moon-outline"></ion-icon>
						<span class="links">Dark Mode</span>
						<div class="darkToggle">
							<span class="switch"></span>
						</div>
				</a></li>
			</ul>
		</div>
	</nav>


	<section class="dashboard">
		<div class="top">
			<ion-icon class="navToggle" name="menu-outline"></ion-icon>
			<div class="searchBox">
				<ion-icon name="search-outline"></ion-icon>
				<input type="text" placeholder="Search">
			</div>
			<button class="button-39" role="button">
				<ion-icon name="videocam-outline"></ion-icon>
				&nbsp; Create
			</button>
			<div class="logo dark-logo">
				<a href="#"><div class="logo-image">
						<img src="asserts/logoWhite.png" alt="">
					</div></a>
			</div>
			<div class="logo light-logo">
				<a href="#"></a>
				<div class="logo-image">
					<img src="asserts/logoBlack.png" alt="">
				</div>
				</a>
			</div>
		</div>

		<!-- Dashboard -->
		<div class="container">
			
		</div>
	</section>


	<script type="module"
		src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
	<script nomodule
		src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
	<script src="asserts/creator.js"></script>
</body>

</html>