<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewpt"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>VidQuest My Admin</title>
<!-- loader-->
<link href="Aassets/css/pace.min.css" rel="stylesheet" />
<script src="assets/js/pace.min.js"></script>
<!--favicon-->
<link rel="icon" href="assets/images/favicon.ico" type="image/x-icon">
<!-- simplebar CSS-->
<link href="assets/plugins/simplebar/css/simplebar.css" rel="stylesheet" />
<!-- Bootstrap core CSS-->
<link href="assets/css/bootstrap.min.css" rel="stylesheet" />
<!-- animate CSS-->
<link href="assets/css/animate.css" rel="stylesheet" type="text/css" />
<!-- Icons CSS-->
<link href="assets/css/icons.css" rel="stylesheet" type="text/css" />
<!-- Sidebar CSS-->
<link href="assets/css/sidebar-menu.css" rel="stylesheet" />
<!-- Custom Style-->
<link href="assets/css/app-style.css" rel="stylesheet" />




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
				<a href="index.html"> <img src="assets/images/logo-icon.png"
					class="logo-icon" alt="logo icon">
					<h5 class="logo-text">VidQuest</h5>
				</a>
			</div>
			<ul class="sidebar-menu do-nicescrol">

				<li class="sidebar-header">MAIN NAVIGATION</li>
				<li><a
					href="${pageContext.request.contextPath}/getActivityServlet"> <i
						class="zmdi zmdi-view-dashboard"></i> <span>Dashboard</span>
				</a></li>
				<li><a href="forms.jsp"> <i
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

		<div class="clearfix"></div>

		<div class="content-wrapper">
			<div class="container-fluid">

				<div class="row mt-3">

					<div class="col-lg-12">
						<div class="card">
							<div class="card-body">
								<div class="card-title">Round Vertical Form</div>
								<hr>
								<form name="register"
									action="${pageContext.request.contextPath}/addUserServelet"
									method="post" onsubmit="return validateForm()">
									<div class="form-group">
										<label for="input-6">First Name</label> <input type="text"
											class="form-control form-control-rounded" id="input-6"
											name="firstname" placeholder="Enter Your Name"> <span
											class="error-message" id="firstname-error-message"></span>
									</div>
									<div class="form-group">
										<label for="input-6">Last Name</label> <input type="text"
											class="form-control form-control-rounded" id="input-6"
											name="lastname" placeholder="Enter Your Name"> <span
											class="error-message" id="lastname-error-message"></span>
									</div>
									<div class="form-group">
										<label for="input-6">Username</label> <input type="text"
											class="form-control form-control-rounded" id="input-6"
											name="username" placeholder="Enter Your Username"> <span
											class="error-message" id="username-error-message"></span>
									</div>
									<div class="form-group">
										<label for="input-7">Email</label> <input type="email"
											class="form-control form-control-rounded" id="input-7"
											name="email" placeholder="Enter Your Email Address">
										<span class="error-message" id="email-error-message"></span>
									</div>
									<div class="form-group">
										<label for="input-8">Mobile</label> <input type="text"
											class="form-control form-control-rounded" id="input-8"
											name="number" placeholder="Enter Your Mobile Number">
										<span class="error-message" id="phone-error-message"></span>
									</div>
									<div class="form-group">
										<label for="input-9">Password</label> <input type="password"
											class="form-control form-control-rounded" id="input-9"
											name="password" placeholder="Enter Password"> <span
											class="error-message" id="password-error-message"></span>
									</div>
									<div class="form-group">
										<label for="input-10">Add Role Type</label> <input type="text"
											class="form-control form-control-rounded" id="input-10"
											name="type" placeholder="Enter Type"> <span
											class="error-message" id="type-error-message"></span>
									</div>
									<div class="form-group py-2">
										<div class="icheck-material-white">
											<input type="checkbox" id="user-checkbox2" checked="checked"
												required> <label for="user-checkbox2">I
												Agree to Terms & Conditions</label>
										</div>
									</div>
									<div class="form-group">
										<button type="submit" class="btn btn-light btn-round px-5"
											id="register-button">
											<i class="icon-lock"></i> Register
										</button>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
				<!--End Row-->
			<script>
    function validateForm() {
        let firstName = document.forms["register"]["firstname"].value;
        let lastName = document.forms["register"]["lastname"].value;
        let username = document.forms["register"]["username"].value;
        let email = document.forms["register"]["email"].value;
        let number = document.forms["register"]["number"].value;
        let password = document.forms["register"]["password"].value;
        let type = document.forms["register"]["type"].value;

        // Check if First Name is empty
        if (firstName === "") {
            document.getElementById("firstname-error-message").innerHTML = "First Name must be filled out";
            return false;
        }

        // Check if Last Name is empty
        if (lastName === "") {
            document.getElementById("lastname-error-message").innerHTML = "Last Name must be filled out";
            return false;
        }

        // Check if Username is empty
        if (username === "") {
            document.getElementById("username-error-message").innerHTML = "Username must be filled out";
            return false;
        }

        // Check if Email is empty or not a valid email address
        if (email === "") {
            document.getElementById("email-error-message").innerHTML = "Email must be filled out";
            return false;
        } else if (!validateEmail(email)) {
            document.getElementById("email-error-message").innerHTML = "Invalid email format";
            return false;
        }

        // Check if Mobile is empty
        if (number === "") {
            document.getElementById("phone-error-message").innerHTML = "Mobile Number must be filled out";
            return false;
        }

        // Check if Password is empty
        if (password === "") {
            document.getElementById("password-error-message").innerHTML = "Password must be filled out";
            return false;
        }

        // Check if Role Type is empty
        if (type === "") {
            document.getElementById("type-error-message").innerHTML = "Role Type must be filled out";
            return false;
        }

        return true;
    }

    // Email validation function
    function validateEmail(email) {
        let emailPattern = /\S+@\S+\.\S+/;
        return emailPattern.test(email);
    }
</script>
			


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
		document
				.addEventListener(
						"DOMContentLoaded",
						function() {
							// Select the email input field and error message element
							var emailInput = document
									.getElementById("email-input");
							var emailErrorMessage = document
									.getElementById("email-error-message");

							// Function to validate the email format
							function validateEmail() {
								var email = emailInput.value;
								var emailRegex = /^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}$/;

								if (!emailRegex.test(email)) {
									emailErrorMessage.textContent = "Please enter a valid email address.";
									emailErrorMessage.style.color = "red";
									return false;
								} else {
									emailErrorMessage.textContent = "";
									return true;
								}
							}

							// Add an event listener to check email validation on form submission
							var form = document.querySelector("form");
							form
									.addEventListener(
											"submit",
											function(event) {
												if (!validateEmail()) {
													emailErrorMessage.textContent = "Please enter a valid email address.";
													emailErrorMessage.style.color = "red";
													event.preventDefault(); // Prevent form submission if email is invalid
												}
											});
						});
	</script>


	<script>
		const checkbox = document.getElementById("user-checkbox2");

		checkbox.addEventListener("change", function(event) {
			if (!checkbox.checked) {
				// Checkbox is not checked, prevent navigation
				event.preventDefault();
				alert("Please agree to the Terms & Conditions to proceed.");
			}
		});
	</script>
	<!-- Bootstrap core JavaScript-->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/popper.min.js"></script>
	<script src="assets/js/bootstrap.min.js"></script>

	<!-- simplebar js -->
	<script src="assets/plugins/simplebar/js/simplebar.js"></script>
	<!-- sidebar-menu js -->
	<script src="assets/js/sidebar-menu.js"></script>

	<!-- Custom scripts -->
	<script src="assets/js/app-script.js"></script>

</body>
</html>
