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
    <form:label path="exercise">Exercise:</form:label>
    <form:select path="exercise.id" required="true" itemValue="id" itemLabel="name" items="${exercises}" /><br>
    <form:label path="user">User:</form:label>
    <form:select path="user.id" required="true" itemValue="id" itemLabel="name" items="${users}" /><br>
    <form:label path="workout">Workout:</form:label>
    <form:select path="workout.id" required="true" itemValue="id" itemLabel="name" items="${workouts}" /><br>
    <form:label path="rep">Rep:</form:label>
    <form:input path="rep" required="true" /><br>
    <form:label path="time">Time:</form:label>
    <form:input path="time" required="true" /><br>
    <form:label path="trainingDays">Training Days:</form:label>
    <form:input path="trainingDays" required="true" /><br>

    <input type="submit" value="Submit">
</form:form>
</body>
</html>