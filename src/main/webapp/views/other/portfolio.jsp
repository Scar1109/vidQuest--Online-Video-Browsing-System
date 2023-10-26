<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.studio.model.video"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html lang="zxx">

<head>
<meta charset="UTF-8">
<meta name="description" content="Videograph Template">
<meta name="keywords" content="Videograph, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Videograph | Template</title>

<!-- Google Font -->
<link
	href="https://fonts.googleapis.com/css2?family=Play:wght@400;700&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css2?family=Josefin+Sans:wght@300;400;500;600;700&display=swap"
	rel="stylesheet">

<!-- Css Styles -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/views/other/css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/views/other/css/font-awesome.min.css" type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/views/other/css/elegant-icons.css" type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/views/other/css/owl.carousel.min.css" type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/views/other/css/magnific-popup.css" type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/views/other/css/slicknav.min.css" type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/views/other/css/style.css" type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/views/other/css/major.css" type="text/css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
	integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU"
	crossorigin="anonymous">
</head>

<body>
	<!-- Page Preloder -->
	<div id="preloder">
		<div class="loader"></div>
	</div>


	<!-- Header -->
	<nav class="navbar navbar-expand-lg navbar-light fixed-top"
		id="mainNav">
		<div class="container px-4 px-lg-5">
			<a class="navbar-brand" href="index.jsp">VidQuest</a>
			<button class="navbar-toggler navbar-toggler-right" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarResponsive"
				aria-controls="navbarResponsive" aria-expanded="false"
				aria-label="Toggle navigation">
				Menu <i class="fas fa-bars"></i>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ms-auto">
					<li class="nav-item"><a class="nav-link" href="#about">About</a></li>
					<li class="nav-item"><a class="nav-link" href="#projects">Videos</a></li>
					<li class="nav-item"><a class="nav-link" href="#signup">Contact</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<!-- Breadcrumb Begin -->
	<div class="breadcrumb-option spad set-bg"
		data-setbg="${pageContext.request.contextPath}/views/other/img/mountain-sunset-3840x1080.jpg">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 text-center">
					<div class="breadcrumb__text">
						<div class="container h-100">
							<div class="breadcrumb__text">
								<h2>Amazing Royalty Free Stock</h2>
							</div>
							<div class="d-flex justify-content-center h-100">
								<div class="searchbar">
									<input class="search_input" type="text" name=""
										placeholder="Search..."> <a href="#"
										class="search_icon"><i class="fas fa-search"></i></a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Breadcrumb End -->

	<!-- Portfolio Section Begin -->
	<section class="portfolio spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<ul class="portfolio__filter">
						<li class="active" data-filter="*">All</li>
						<li data-filter=".Nature">Nature</li>
						<li data-filter=".Food">Food</li>
						<li data-filter=".Technology">Technology</li>
						<li data-filter=".People">Peoples</li>
						<li data-filter=".Animals">Animals</li>
					</ul>
				</div>
			</div>
			
			
			<div class="row portfolio__gallery">
			<% 
			List<video> videos = (List<video>) request.getAttribute("videos");
					if (videos != null && !videos.isEmpty()) {
			
						for (int i = 0; i < videos.size(); i++) {
						    video vid = videos.get(i);				    	
						    	
						%>
			
			
				<div class="col-lg-4 col-md-6 col-sm-6 mix <%=vid.getCategory()%>">
					<div class="portfolio__item">
						<div class="portfolio__item__video set-bg"
							data-setbg="uploads/thumbnails/<%=vid.getThumbnail()%>">
							
						</div>
						<div class="portfolio__item__text">
							<a href="<%=request.getContextPath()%>/viewCommentServlet?vid=<%=vid.getVideoID()%>"><h4><%=vid.getTitle()%></h4></a>
							<ul>
								<li><%=vid.getCategory()%></li>
							</ul>
						</div>
					</div>
				</div>
				
				<%
				}
								}
					else{ %>
						<h4>No Videos Found</h4>
					<%}
				%>
				
				
				<%-- <div class="col-lg-4 col-md-6 col-sm-6 mix digital-marketing">
					<div class="portfolio__item">
						<div class="portfolio__item__video set-bg"
							data-setbg="${pageContext.request.contextPath}/viwes/other/img/portfolio/portfolio-2.jpg">
							<a href="https://www.youtube.com/watch?v=LXb3EKWsInQ"
								class="play-btn video-popup"><i class="fa fa-play"></i></a>
						</div>
						<div class="portfolio__item__text">
							<h4>Title</h4>
							<span>category</span>
						</div>
					</div>
				</div> --%>
				
		</div>
	</section>
	<!-- Portfolio Section End -->

	<!-- Footer Section Begin -->
	<footer class="footer">
		<div class="container">
			<div class="footer__top">
				<div class="row">
					<div class="col-lg-6 col-md-6">
						<div class="footer__top__logo">
							<a href="#"><img src="img/logo.png" alt=""></a>
						</div>
					</div>
					<div class="col-lg-6 col-md-6">
						<div class="footer__top__social">
							<a href="#"><ion-icon name="logo-facebook"></ion-icon></a> <a
								href="#"><ion-icon name="logo-twitter"></ion-icon></a> <a
								href="#"><ion-icon name="logo-linkedin"></ion-icon></a> <a
								href="#"><ion-icon name="logo-instagram"></ion-icon></a> <a
								href="#"><ion-icon name="logo-youtube"></ion-icon></a>
						</div>
					</div>
				</div>
			</div>
			<div class="footer__option">
				<div class="row">
					<div class="col-lg-4 col-md-6 col-sm-6">
						<div class="footer__option__item">
							<h5>About us</h5>
							<p>Welcome to vidQuest, your premier destination for
								high-quality stock footage and video content. We understand the
								power of visuals and the impact they can have on your creative
								projects, whether you're a filmmaker, content creator, marketer,
								or just someone looking to enhance your digital storytelling.</p>
							<a href="#" class="read__more">Read more <span
								class="arrow_right"></span></a>
						</div>
					</div>
					<div class="col-lg-2 col-md-3 col-sm-3">
						<div class="footer__option__item">
							<h5>Who we are</h5>
							<ul>
								<li><a href="#">Team</a></li>
								<li><a href="#">Carrers</a></li>
								<li><a href="#">Contact us</a></li>
								<li><a href="#">Locations</a></li>
							</ul>
						</div>
					</div>
					<div class="col-lg-2 col-md-3 col-sm-3">
						<div class="footer__option__item">
							<h5>Our work</h5>
							<ul>
								<li><a href="#">Feature</a></li>
								<li><a href="#">Latest</a></li>
								<li><a href="#">Browse Archive</a></li>
								<li><a href="#">Video for web</a></li>
							</ul>
						</div>
					</div>
					<div class="col-lg-4 col-md-12">
						<div class="footer__option__item">
							<h5>Newsletter</h5>
							<p>Subscribe to receive updates!</p>
							<form action="#">
								<input type="text" placeholder="Email">
								<button type="submit">
									<ion-icon name="mail-outline"></ion-icon>
								</button>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="footer__copyright">
				<div class="row">
					<div class="col-lg-12 text-center">
						<p class="footer__copyright__text">
							Copyright &copy;
							<script>
								document.write(new Date().getFullYear());
							</script>
							All rights reserved <i class="fa fa-heart-o" aria-hidden="true"></i>
							by <a href="#">vidQuest</a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</footer>
	<!-- Footer Section End -->

	<!-- Js Plugins -->
	<script src="${pageContext.request.contextPath}/views/other/js/jquery-3.3.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/views/other/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/views/other/js/jquery.magnific-popup.min.js"></script>
	<script src="${pageContext.request.contextPath}/views/other/js/mixitup.min.js"></script>
	<script src="${pageContext.request.contextPath}/views/other/js/masonry.pkgd.min.js"></script>
	<script src="${pageContext.request.contextPath}/views/other/js/jquery.slicknav.js"></script>
	<script src="${pageContext.request.contextPath}/views/other/js/owl.carousel.min.js"></script>
	<script src="${pageContext.request.contextPath}/views/other/js/main.js"></script>
	<script src="${pageContext.request.contextPath}/views/other/js/major.js"></script>
	<script type="module"
		src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
	<script nomodule
		src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>

</body>

</html>