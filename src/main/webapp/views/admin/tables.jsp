<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.moderator.model.*"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>VidQuest My Admin</title>
<!-- loader-->
<link href="views/admin/assets/css/pace.min.css" rel="stylesheet" />
<script src="views/admin/assets/js/pace.min.js"></script>
<!--favicon-->
<link rel="icon" href="views/admin/assets/images/favicon.ico"
	type="image/x-icon">
<!-- simplebar CSS-->
<link href="views/admin/assets/plugins/simplebar/css/simplebar.css"
	rel="stylesheet" />
<!-- Bootstrap core CSS-->
<link href="views/admin/assets/css/bootstrap.min.css" rel="stylesheet" />
<!-- animate CSS-->
<link href="views/admin/assets/css/animate.css" rel="stylesheet"
	type="text/css" />
<!-- Icons CSS-->
<link href="views/admin/assets/css/icons.css" rel="stylesheet"
	type="text/css" />
<!-- Sidebar CSS-->
<link href="views/admin/assets/css/sidebar-menu.css" rel="stylesheet" />
<!-- Custom Style-->
<link href="views/admin/assets/css/app-style.css" rel="stylesheet" />

</head>

<body class="bg-theme bg-theme2">

	<!-- start loader -->
	<div id="pageloader-overlay" class="visible incoming">
		<div class="loader-wrapper-outer">
			<div class="loader-wrapper-inner">
				<div class="loader"></div>
			</div>
		</div>
	</div>
	<!-- end loader -->

	<!-- Start wrapper-->
	<div id="wrapper">

		<!--Start sidebar-wrapper-->
		<div id="sidebar-wrapper" data-simplebar=""
			data-simplebar-auto-hide="true">
			<div class="brand-logo">
				<a href="${pageContext.request.contextPath}/getActivityServlet"><img
					src="views/admin/assets/images/logo-icon.png" class="logo-icon"
					alt="logo icon">
					<h5 class="logo-text">VidQuest</h5>
				</a>
			</div>
			<ul class="sidebar-menu do-nicescrol">
				<li class="sidebar-header">MAIN NAVIGATION</li>
				<li><a
					href="${pageContext.request.contextPath}/getActivityServlet"> <i
						class="zmdi zmdi-view-dashboard"></i> <span>Dashboard</span>
				</a></li>

				<li><a href="views/admin/forms.jsp"> <i
						class="zmdi zmdi-format-list-bulleted"></i> <span>Add user</span>
				</a></li>

				<li><a href="${pageContext.request.contextPath}/UserServlet">
						<i class="zmdi zmdi-grid"></i> <span>User-Details</span>
				</a></li>
				<li><a
					href="${pageContext.request.contextPath}/getVideoServlet"> <i
						class="zmdi zmdi-grid"></i> <span>Video-Details</span>
				</a></li>

				<li><a href="${pageContext.request.contextPath}/profileServlet">
						<i class="zmdi zmdi-face"></i> <span>Profile</span>
				</a></li>

			</ul>
		</div>
		<!--End sidebar-wrapper-->

		<!--Start topbar header-->
		<header class="topbar-nav">
			<nav class="navbar navbar-expand fixed-top">
				<ul class="navbar-nav mr-auto align-items-center">
					<li class="nav-item"><a class="nav-link toggle-menu"
						href="javascript:void();"> <i class="icon-menu menu-icon"></i>
					</a></li>
					<li class="nav-item">
						<form class="search-bar">
							<input type="text" class="form-control"
								placeholder="Enter keywords"> <a
								href="javascript:void();"><i class="icon-magnifier"></i></a>
						</form>
					</li>
				</ul>

				<ul class="navbar-nav align-items-center right-nav-link">
					<li class="nav-item dropdown-lg"><a
						class="nav-link dropdown-toggle dropdown-toggle-nocaret waves-effect"
						data-toggle="dropdown" href="javascript:void();"> <i
							class="fa fa-envelope-open-o"></i></a></li>
					<li class="nav-item dropdown-lg"><a
						class="nav-link dropdown-toggle dropdown-toggle-nocaret waves-effect"
						data-toggle="dropdown" href="javascript:void();"> <i
							class="fa fa-bell-o"></i></a></li>
					<li class="nav-item language"><a
						class="nav-link dropdown-toggle dropdown-toggle-nocaret waves-effect"
						data-toggle="dropdown" href="javascript:void();"><i
							class="fa fa-flag"></i></a>
						<ul class="dropdown-menu dropdown-menu-right">
							<li class="dropdown-item"><i
								class="flag-icon flag-icon-gb mr-2"></i> English</li>
							<li class="dropdown-item"><i
								class="flag-icon flag-icon-fr mr-2"></i> French</li>
							<li class="dropdown-item"><i
								class="flag-icon flag-icon-cn mr-2"></i> Chinese</li>
							<li class="dropdown-item"><i
								class="flag-icon flag-icon-de mr-2"></i> German</li>
						</ul></li>
					<li class="nav-item"><a
						class="nav-link dropdown-toggle dropdown-toggle-nocaret"
						data-toggle="dropdown" href="#"> <span class="user-profile"><img
								src="https://via.placeholder.com/110x110" class="img-circle"
								alt="user avatar"></span>
					</a>
						<ul class="dropdown-menu dropdown-menu-right">
							<li class="dropdown-item user-details"><a
								href="javaScript:void();">
									<div class="media">
										<div class="avatar">
											<img class="align-self-start mr-3"
												src="https://via.placeholder.com/110x110" alt="user avatar">
										</div>
										<div class="media-body">
											<h6 class="mt-2 user-title">Sasindu Nadeeshan</h6>
											<p class="user-subtitle">Sasindun@2000@gmail.com</p>
										</div>
									</div>
							</a></li>
							<li class="dropdown-divider"></li>
							<li class="dropdown-item"><i class="icon-envelope mr-2"></i>
								Inbox</li>
							<li class="dropdown-divider"></li>
							<li class="dropdown-item"><i class="icon-wallet mr-2"></i>
								Account</li>
							<li class="dropdown-divider"></li>
							<li class="dropdown-item"><i class="icon-settings mr-2"></i>
								Setting</li>
							<li class="dropdown-divider"></li>
							<li class="dropdown-item"><i class="icon-power mr-2"></i>
								Logout</li>
						</ul></li>
				</ul>
			</nav>
		</header>
		<!--End topbar header-->

		<!--End topbar header-->

		<div class="clearfix"></div>

		<div class="content-wrapper">
			<div class="container-fluid">
				<div class="col-lg-13">
					<div class="card">
						<div class="card-body">
							<h5 class="card-title">User Table</h5>
							<div class="table-responsive">
								<table class="table table-hover">
									<thead>
										<tr>
											<th scope="col">User-ID</th>
											<th scope="col">First Name</th>
											<th scope="col">Last Name</th>
											<th scope="col">Date</th>
											<th scope="col">Time</th>
											<th scope="col">Email</th>
											<th scope="col">Mobile</th>
											<th scope="col">User Name</th>
											<th scope="col">Action</th>
										</tr>
									</thead>


									<tbody>
										<c:forEach var="usr" items="${userDetails}">

											<c:set var="id" value="${usr.id}" />
											<c:set var="firstName" value="${usr.firstName}" />
											<c:set var="lastName" value="${usr.lastName}" />
											<c:set var="username" value="${usr.username}" />
											<c:set var="username" value="${usr.date}" />
											<c:set var="username" value="${usr.time}" />
											<c:set var="email" value="${usr.email}" />
											<c:set var="mobile" value="${usr.mobile}" />
											<c:set var="password" value="${usr.password}" />

											<tr id="user_${usr.id}">

												<th scope="row">${usr.id}</th>
												<td>${usr.firstName}</td>
												<td>${usr.lastName}</td>
												<td>${usr.date}</td>
												<td>${usr.time}</td>
												<td>${usr.email}</td>
												<td>${usr.mobile}</td>
												<td>${usr.username}</td>
												<td>
													<button type="button" class="btn btn-danger"
														onclick="removeUser(${usr.id})">Remove</button>
												</td>

											</tr>
										</c:forEach>
									</tbody>

								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--End Row-->


		<!--start overlay-->
		<div class="overlay toggle-menu"></div>
		<!--end overlay-->

	</div>
	<!-- End container-fluid-->

	</div>
	<!--End content-wrapper-->
	<!--Start Back To Top Button-->
	<a href="javaScript:void();" class="back-to-top"><i
		class="fa fa-angle-double-up"></i> </a>
	<!--End Back To Top Button-->

	<!--Start footer-->

	<!--End footer-->

	<!--start color switcher-->
	<div class="right-sidebar">
		<div class="switcher-icon">
			<i class="zmdi zmdi-settings zmdi-hc-spin"></i>
		</div>
		<div class="right-sidebar-content">

			<p class="mb-0">Gaussion Texture</p>
			<hr>

			<ul class="switcher">
				<li id="theme1"></li>
				<li id="theme2"></li>
				<li id="theme3"></li>
				<li id="theme4"></li>
				<li id="theme5"></li>
				<li id="theme6"></li>
			</ul>

			<p class="mb-0">Gradient Background</p>
			<hr>

			<ul class="switcher">
				<li id="theme7"></li>
				<li id="theme8"></li>
				<li id="theme9"></li>
				<li id="theme10"></li>
				<li id="theme11"></li>
				<li id="theme12"></li>
				<li id="theme13"></li>
				<li id="theme14"></li>
				<li id="theme15"></li>
			</ul>

		</div>
	</div>
	<!--end color switcher-->

	</div>
	<!--End wrapper-->
	<script>
	
	function removeUser(userId) {
	    if (confirm("Are you sure you want to remove this user?")) {
	        // Send an AJAX request to the server to remove the user.
	        $.ajax({
	            type: "POST",
	            url: "${pageContext.request.contextPath}/DeleteServlet",
	            data: { id: userId }, // Pass userId as a parameter
	            success: function(response) {
	                if (response === "User removed successfully") {
	                    // Reload the page after a successful user removal
	                    location.reload();
	                }
	            }
	        });
	    }
	}
	</script>



	<!-- Bootstrap core JavaScript-->
	<script src="views/admin/assets/js/jquery.min.js"></script>
	<script src="views/admin/assets/js/popper.min.js"></script>
	<script src="views/admin/assets/js/bootstrap.min.js"></script>

	<!-- simplebar js -->
	<script src="views/admin/assets/plugins/simplebar/js/simplebar.js"></script>
	<!-- sidebar-menu js -->
	<script src="views/admin/assets/js/sidebar-menu.js"></script>

	<!-- Custom scripts -->
	<script src="views/admin/assets/js/app-script.js"></script>

</body>
</html>