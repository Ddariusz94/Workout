<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Lista treningów</title>
</head>
<body>
<h1>Lista treningów</h1>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Nazwa</th>
        <th>Opis</th>
        <th>Poziom</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${workouts}" var="workout">
        <tr>
            <td>${workout.id}</td>
            <td>${workout.name}</td>
            <td>${workout.description}</td>
            <td>${workout.level}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
