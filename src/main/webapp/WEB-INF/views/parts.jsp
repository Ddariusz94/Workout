<%--
  Created by IntelliJ IDEA.
  User: ddariuz94
  Date: 25.05.2023
  Time: 13:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Wybierz ćwiczenie</title>
</head>
<body>
<h2>Wybierz ćwiczenie</h2>

<form action="/process-parts" method="post">
    <label for="upperBody">Górne partie:</label>
    <input type="text" id="upperBody" name="upperBody"><br>

    <label for="abs">Brzuch:</label>
    <input type="text" id="abs" name="abs"><br>

    <label for="lowerBody">Dolne partie:</label>
    <input type="text" id="lowerBody" name="lowerBody"><br>

    <input type="submit" value="Zapisz">
</form>
</body>
</html>
