<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="com.User.model.User"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/views/studio/asserts/creator.css">
<title>vidQuest</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/views/studio/asserts/upload.css">

</head>

<body>
	<nav>
		<div class="profileImg">
			<img
				src="https://i.ibb.co/dMvJn2D/cool-profile-picture-87h46gcobjl5e4xu.jpg"
				alt="">
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
				<li class="navList"><a
					href="${pageContext.request.contextPath}/views/studio/dashboard.jsp">
						<ion-icon name="apps-outline"></ion-icon> <span class="links">Dashboard</span>
				</a></li>
				<li class="navList active"><a href="#"> <ion-icon
							name="cloud-upload-outline"></ion-icon> <span class="links">Create
							New</span>
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
				<li><a href="<%=request.getContextPath()%>/LogoutServlet"> <ion-icon name="log-out-outline"></ion-icon>
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
				<a href="index.jsp"><div class="logo-image">
						<img
							src="${pageContext.request.contextPath}/views/studio/asserts/logoWhite.png"
							alt="">
					</div></a>
			</div>
			<div class="logo light-logo">
				<a href="index.jsp"></a>
				<div class="logo-image">
					<img
						src="${pageContext.request.contextPath}/views/studio/asserts/logoBlack.png"
						alt="">
				</div>
				</a>
			</div>
		</div>

		<!-- Dashboard -->
		<div class="container">
			<div class="overview">

				<div class="title">
					<ion-icon name="videocam"></ion-icon>
					<span class="text">Upload New</span>
				</div>
				<div class="uploadBox">
					<div class="wrapper">



						<form
							action="${pageContext.request.contextPath}/createVideoServlet"
							method="post" enctype="multipart/form-data" class="upload-form">
							<div class="title-section">
								<input type="text" name="title" placeholder="Title" required>
							</div>
							<div class="middel-section">
								<div class="category-section">
									<select name="category">
										<option value="Nature">Nature</option>
										<option value="Food">Food</option>
										<option value="Technology">Technology</option>
										<option value="People">People</option>
										<option value="Animals">Animals</option>
									</select>
								</div>
								<div class="thumbnail-section">
									<p>Upload Thumbnail</p>
									<input class="thumbnail-input" type="file" name="thumbnail" accept=".png, .jpg" required>


								</div>
							</div>
							<div class="description-section">
								<textarea name="description" placeholder="Description" required></textarea>
							</div>
							<div class="title-section">
								<input type="text" name="sub-title"
									placeholder="Sub-title(optional)">
							</div>
							<div class="box video-section">
								<input class="file-input" type="file" name="videoUpload"
									accept=".mp4" required hidden>
								<ion-icon name="cloud-upload-outline" style="color:#6990F2;"></ion-icon>
								<p>Browse Video to Upload</p>
							</div>

							<section class="progress-area"></section>
							<section class="uploaded-area"></section>


							<div class="visibility-section">
								<select name="visibility">
									<option value="public">Public</option>
									<option value="private">Private</option>
									<option selected value="unlisted">Unlisted</option>
								</select>
							</div>
							<div class="submit-section">
								<input type="submit" value="Upload">
							</div>
						</form>
					</div>

				</div>
			</div>

		</div>
	</section>

	<script>
	document.querySelector('.thumbnail-input').addEventListener('change', function(event) {
	    const fileInput = event.target;
	    const fileName = fileInput.value;
	    const allowedExtensions = /(\.png|\.jpg)$/i;

	    if (!allowedExtensions.exec(fileName)) {
	        alert('Please select a PNG or JPG file.');
	        fileInput.value = '';
	});
	
	

	</script>
	<script type="module"
		src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
	<script nomodule
		src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
	<script
		src="${pageContext.request.contextPath}/views/studio/asserts/creator.js"></script>
	<script
		src="${pageContext.request.contextPath}/views/studio/asserts/upload.js"></script>
</body>

</html>