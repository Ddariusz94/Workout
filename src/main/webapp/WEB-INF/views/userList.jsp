<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>User List</title>
</head>
<body>
<h1>User List</h1>
<table>
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Gender</th>
    <th>Age</th>
    <th>Weight</th>
  </tr>
  <c:forEach var="user" items="${users}">
    <tr>
      <td>${user.id}</td>
      <td>${user.name}</td>
      <td>${user.gender}</td>
      <td>${user.age}</td>
      <td>${user.weight}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>