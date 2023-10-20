<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="asserts/creator.css">
<title>vidQuest</title>
<link rel="stylesheet" href="asserts/upload.css">

</head>

<body>
	<nav>
		<div class="profileImg">
			<img src="asserts/MyLogo.png" alt="">
		</div>

		<div class="profName">
			<span class="profileName">Kaveen Dinethma</span>
		</div>

		<div class="menu-items">
			<ul class="navLinks">
				<li class="navList"><a href="#"> <ion-icon
							name="apps-outline"></ion-icon> <span class="links">Dashboard</span>
				</a></li>
				<li class="navList active"><a href="#"> <ion-icon
							name="cloud-upload-outline"></ion-icon> <span class="links">Create
							New</span>
				</a></li>
				<li class="navList"><a href="#"> <ion-icon
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
			<div class="overview">
			
				<div class="title">
					<ion-icon name="videocam"></ion-icon>
					<span class="text">Upload New</span>
				</div>
				<div class="uploadBox">
					<div class="wrapper">
					
					
					
						<form action="#" method="post" class="upload-form">
							<div class="title-section">
								<input type="text" name="title" placeholder="Title" required>
							</div>
							<div class="middel-section">
								<div class="category-section">
									<select name="category">
										<option selected value="category1">Category 1</option>
										<option value="category2">Category 2</option>
										<option value="category3">Category 3</option>
									</select>
								</div>
								<div class="thumbnail-section">
									<p>Upload Thumbnail</p>
									<input class="thumbnail-input" type="file" name="thumbnail" accept=".jpeg,.jpg,.png,.gif" required>

								</div>
							</div>
							<div class="description-section">
								<textarea name="description" placeholder="Description" required></textarea>
							</div>
							<div class="title-section">
								<input type="text" name="sub-title" placeholder="Sub-title(optional)" >
							</div>
							<div class="box video-section">
								<input class="file-input" type="file" name="videoUpload" accept=".mp4,.webm,.ogg,.mkv,.mov,.avi" required hidden>
								<ion-icon name="cloud-upload-outline" style="color:#6990F2;"></ion-icon>
								<p>Browse Video to Upload</p>
							</div>

							<section class="progress-area"></section>
							<section class="uploaded-area"></section>


							<div class="visibility-section">
								<select name="category">
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


	<script type="module"
		src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
	<script nomodule
		src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
	<script src="asserts/creator.js"></script>
	<script src="asserts/upload.js"></script>

</body>

</html>