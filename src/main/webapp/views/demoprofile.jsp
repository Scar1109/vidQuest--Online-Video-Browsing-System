<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <link rel="stylesheet" type="text/css" href="admin/assets/css/profile.css">
  <title>User Profile</title>
</head>
<body>
  <h1>Hello</h1>
  <!-- Assuming userDetails contains a single user -->
  <c:forEach var="usr" items="${userDetails}">
    <c:set var="id" value="${usr.id}" />
    <c:set var="name" value="${usr.name}" />
    <c:set var="email" value="${usr.email}" />
    <c:set var="mobile" value="${usr.mobile}" />
    <c:set var="password" value="${usr.password}" />

    <h1>Name: ${name}</h1>
    <p>Email: ${email}</p>
    <p>Mobile: ${mobile}</p>
    <p>Password: ${password}</p>
  </c:forEach>

  <c:url value="/views/admin/updateuserdemo.jsp" var="userupdate">
    <c:param name="id" value="${id}" />
    <c:param name="name" value="${name}" />
    <c:param name="email" value="${email}" />
    <c:param name="mobile" value="${mobile}" />
    <c:param name="password" value="${password}" />
  </c:url>

  <a href="${userupdate}">
    <input type="button" name="update" value="Update">
  </a>
  <br>
  <br>

  <c:url value="/views/admin/deleteuserdemo.jsp" var="userdelete">
    <c:param name="id" value="${id}" />
    <c:param name="name" value="${name}" />
    <c:param name="email" value="${email}" />
    <c:param name="mobile" value="${mobile}" />
    <c:param name="password" value="${password}" />
  </c:url>
  <a href="${userdelete}">
    <input type="button" name="delete" value="Delete">
  </a>
</body>
</html>
