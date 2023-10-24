<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update Customer</title>
</head>
<body>
<%
    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String mobile = request.getParameter("mobile");
    String password = request.getParameter("password");
%>

<h1>Update Customer</h1>
<form action="${pageContext.request.contextPath}/updateUser" method="post">
    <label for="customerId">Customer ID:</label>
    <input type="text" id="customerId" name="id" value="<%= id %>" readonly>
    <br>
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" value="<%= name %>" >
    <br>
    <label for="email">Email:</label>
    <input type="text" id="email" name="email" value="<%= email %>" >
    <br>
    <label for="mobile">Mobile:</label>
    <input type="text" id="mobile" name="mobile" value="<%= mobile %>">
    <br>
    <button type="submit">update</button>
</form>
</body>
</html>
