<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Exercises List</title>
</head>
<body>
<h2>User Exercises List</h2>

<table>
    <tr>
        <th>ID</th>
        <th>Rep</th>
        <th>Time</th>
        <th>Training Days</th>
        <th>User</th>
        <th>Exercise</th>
        <th>Workout</th>
    </tr>
    <c:forEach items="${userExercises}" var="userExercise">
        <tr>
            <td>${userExercise.id}</td>
            <td>${userExercise.rep}</td>
            <td>${userExercise.time}</td>
            <td>${userExercise.trainingDays}</td>
            <td>${userExercise.user.name}</td>
            <td>${userExercise.exercise.name}</td>
            <td>${userExercise.workout.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>