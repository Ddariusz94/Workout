<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
</head>
<body>
<h2>Nazwa:</h2>
${exercise.name}
<h2>Pracujące mięśnie:</h2>
${exercise.description}
<h2>Instrukcja:</h2>
${exercise.instruction}
<h2>Link:</h2>
<a href="${exercise.link}">${exercise.link}</a>
</body>
</html>