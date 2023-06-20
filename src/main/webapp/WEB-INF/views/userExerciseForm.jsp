<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Exercise Form</title>
</head>
<body>
<h2>User Exercise Form</h2>

<form:form action="/userExercisesForm/form" method="post" modelAttribute="userExercise">
    <label for="exercise">Exercise ID:</label>
    <form:input path="exercise" required="true" /><br>
    <label for="user">User ID:</label>
    <form:input path="user" required="true" /><br>
    <label for="workout">Workout ID:</label>
    <form:input path="workout" required="true" /><br>
    <label for="rep">Rep:</label>
    <form:input path="rep" required="true" /><br>
    <label for="time">Time:</label>
    <form:input path="time" required="true" /><br>
    <label for="trainingDays">Training Days:</label>
    <form:input path="trainingDays" required="true" /><br>

    <input type="submit" value="Submit">
</form:form>
</body>
</html>