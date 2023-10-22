<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.moderator.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Dashtreme Admin - Free Dashboard for Bootstrap 4 by
	Codervent</title>
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
<body class="bg-theme bg-theme1">
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
		<div id="sidebar-wrapper" data-simplebar=""
			data-simplebar-auto-hide="true">
			<div class="brand-logo">
				<a href="index.html"> <img
					src="views/admin/assets/images/logo-icon.png" class="logo-icon"
					alt="logo icon">
					<h5 class="logo-text">VidQuest</h5>
				</a>
			</div>
			<ul class="sidebar-menu do-nicescrol">
				<li class="sidebar-header">MAIN NAVIGATION</li>
				<li><a href="index.html"> <i
						class="zmdi zmdi-view-dashboard"></i> <span>Dashboard</span>
				</a></li>
				<li><a href="forms.html"> <i
						class="zmdi zmdi-format-list-bulleted"></i> <span>Add user</span>
				</a></li>
				<li><a href="tables.html"> <i class="zmdi zmdi-grid"></i> <span>User-Details</span>
				</a></li>
				<li><a href="profile.html"> <i class="zmdi zmdi-face"></i>
						<span>Profile</span>
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
							class="fa fa-envelope-open-o"></i>
					</a></li>
					<li class="nav-item dropdown-lg"><a class "nav-link
						dropdown-toggle dropdown-toggle-nocaret
						waves-effect" data-toggle="dropdown" href="javascript:void();">
							<i class="fa fa-bell-o"></i>
					</a></li>
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

		<div class="clearfix"></div>

		<div class="content-wrapper">
			<div class="container-fluid">
				<div class="col-lg-12">
					<div class="card">
						<div class="card-body">
							<ul class="nav nav-tabs nav-tabs-primary top-icon nav-justified">
								<li class="nav-item"><a href="javascript:void();"
									data-target="#edit" data-toggle="pill" class="nav-link"> <i
										class="icon-user"></i> <span class="hidden-xs">MY
											Profile</span>
								</a></li>
							</ul>

							<div class="tab-content p-3">
								<div class="tab-pane active" id="edit">
									<c:forEach var="usr" items="${userDetails}">
									
											<c:set var="id" value="${usr.id}" />
											<c:set var="firstName" value="${usr.firstName}" />
											<c:set var="lastName" value="${usr.lastName}" />
											<c:set var="username" value="${usr.username}" />
											<c:set var="email" value="${usr.email}" />
											<c:set var="mobile" value="${usr.mobile}" />
											<c:set var="password" value="${usr.password}" />

											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label">User
													ID </label>
												<div class="col-lg-9">
													<input class="form-control" type="text" value="${usr.id}"
														readonly>
												</div>
											</div>
											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label">FIRST
													NAME</label>
												<div class="col-lg-9">
													<input class="form-control" type="text"
														value="${usr.firstName}" readonly>
												</div>
											</div>
											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label">Last
													Name</label>
												<div class="col-lg-9">
													<input class="form-control" type="text"
														value="${usr.lastName}" readonly>
												</div>
											</div>
											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label">User
													Name</label>
												<div class="col-lg-9">
													<input class="form-control" type="text"
														value="${usr.username}" readonly>
												</div>
											</div>
											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label">Email</label>
												<div class="col-lg-9">
													<input class="form-control" type="email"
														value="${usr.email}" readonly>
												</div>
											</div>
											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label">Mobile</label>
												<div class="col-lg-9">
													<input class="form-control" type="text"
														value="${usr.mobile}" readonly>
												</div>
											</div>
											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label">Password</label>
												<div class="col-lg-9">
													<input class="form-control" type="password"
														value="${usr.password}" readonly>
												</div>
											</div>
										</c:forEach>

										<c:url value="/views/admin/UpdateProfile.jsp" var="userupdate">
											<c:param name="id" value="${id}" />
											<c:param name="FirstName" value="${firstName}" />
											<c:param name="LastName" value="${lastName}" />
											<c:param name="username" value="${username}" />
											<c:param name="email" value="${email}" />
											<c:param name="mobile" value="${mobile}" />
											<c:param name="password" value="${password}" />
										</c:url>
										<div class="form-group row">
											<label class="col-lg-3 col-form-label form-control-label"></label>
											<div class="col-lg-9">
												<a href="${userupdate}"> <input type="button"
													class="btn btn-primary" name="update" value="Update">
												</a>
												<a href="${userdelete}">
												 <input type="reset" class="btn btn-secondary" name="delete"
													value="Delete">
													</a>
											</div>
										</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- ... (Your script and closing body and HTML tags) ... -->
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
