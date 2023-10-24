<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.studio.model.video"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/views/studio/asserts//creator.css">
<title>vidQuest</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/views/studio/asserts//upload.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/views/studio/asserts//contents.css">

</head>

<body>
	<nav>
		<div class="profileImg">
			<img
				src="${pageContext.request.contextPath}/views/studio/asserts//MyLogo.png"
				alt="">
		</div>

		<div class="profName">
			<span class="profileName">Kaveen Dinethma</span>
		</div>

		<div class="menu-items">
			<ul class="navLinks">
				<li class="navList"><a href="${pageContext.request.contextPath}/views/studio/dashboard.jsp"> <ion-icon
							name="apps-outline"></ion-icon> <span class="links">Dashboard</span>
				</a></li>
				<li class="navList"><a
					href="${pageContext.request.contextPath}/views/studio/vidUpload.jsp">
						<ion-icon name="cloud-upload-outline"></ion-icon> <span
						class="links">Create New</span>
				</a></li>
				<li class="navList active"><a href="#"> <ion-icon
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
						<img
							src="${pageContext.request.contextPath}/views/studio/asserts//logoWhite.png"
							alt="">
					</div></a>
			</div>
			<div class="logo light-logo">
				<a href="#"></a>
				<div class="logo-image">
					<img
						src="${pageContext.request.contextPath}/views/studio/asserts//logoBlack.png"
						alt="">
				</div>
				</a>
			</div>
		</div>

		<!-- Dashboard -->
		<div class="container">
			<div class="activity">
				<div class="title">
					<ion-icon name="play-circle-outline"></ion-icon>
					<span class="text">Recent Videos</span>
				</div>
				<div class="activity-data">
					<%
					List<video> videos = (List<video>) request.getAttribute("videos");
					if (videos != null && !videos.isEmpty()) {
					%>
					<table class="custom-table">
						<tr>
							<th class="thumbnail-s">Thumbnail</th>
							<th class="details-th">Details</th>
							<th>Visibility</th>
							<th>Comment</th>
							<th>Status</th>
							<th>Published Date</th>
							<th></th>
						</tr>




						<%
						for (video vid : videos) {
						%>

						<tr>
							<td class="thumbnail-s"><img
src="${pageContext.request.contextPath}/uploads/thumbnails/<%=vid.getThumbnail()%>"
								alt="Thumbnail" class="thumbnail"></td>
							<td class="details-td">
								<div class="title"><%=vid.getTitle()%></div>
								<div class="description"><%=vid.getDescription()%></div>
							</td>
							<td class="<%=vid.getVisibility()%>"><%=vid.getVisibility()%></td>
							<td>10</td>
							<td class="<%=vid.getStatus()%>"><%=vid.getStatus()%></td>
							<td><%=vid.getDate()%><br>Published</td>
							<td><a href=""><ion-icon name="create-outline"
										"></ion-icon></a> <a href="${pageContext.request.contextPath}/deleteVideoServlet?videoId=<%=vid.getVideoID()%>" onclick="return confirm('Are you sure you want to delete this video?');"><ion-icon
										name="trash-outline"></ion-icon></a></td>
						</tr>

						<%
						}
						} else {
						%>

						<p class="error-msg">No Video Found</p>

						<%
						}
						%>




					</table>
				</div>
			</div>
		</div>
	</section>


	<script type="module"
		src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
	<script nomodule
		src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
	<script
		src="${pageContext.request.contextPath}/views/studio/asserts//creator.js"></script>
	<script
		src="${pageContext.request.contextPath}/views/studio/asserts//upload.js"></script>
</body>

</html>