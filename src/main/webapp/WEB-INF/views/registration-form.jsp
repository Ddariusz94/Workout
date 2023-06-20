<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Form</title>
    <style>
        .error-message {
            color: red;
            font-size: smaller;
            margin-top: 5px;
        }
    </style>
</head>
<body>
<h2>Registration Form</h2>

<form:form action="/form/register" method="post" modelAttribute="user">
<label for="name">Name:</label>
    <form:input path="name" required="true" /><br>
    <form:errors path="name" cssClass="error-message" />

<label for="gender">Gender:</label>
<form:select path="gender" required="true">
<form:option value="Male">Male</form:option>
<form:option value="Female">Female</form:option>
</form:select><br>

<label for="age">Age:</label>
    <form:input path="age" required="true" /><br>
    <form:errors path="age" cssClass="error-message" />

<label for="weight" style="display: block;">Weight:</label>
    <form:input path="weight" required="true" /><br>
    <form:errors path="weight" cssClass="error-message" />

<input type="submit" value="Register">
</form:form>
