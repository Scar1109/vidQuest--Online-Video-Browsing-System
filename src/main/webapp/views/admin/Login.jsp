<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/LoginServlet" method="post">
		user name <input type="text" name="uid"> <br>
		password <input type="password" name="pwd"> <br>
		
		<input type="submit"  name="submit" value="Login">
	</form>
</body>
</html>