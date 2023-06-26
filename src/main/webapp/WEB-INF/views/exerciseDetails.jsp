<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista ćwiczeń</title>
</head>
<body>
<h1>Lista ćwiczeń</h1>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Nazwa</th>
        <th>Opis</th>
        <th>Instrukcja</th>
        <th>Części ciała</th>
        <th>Link</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>${exercise.id}</td>
        <td>${exercise.name}</td>
        <td>${exercise.description}</td>
        <td>${exercise.instruction}</td>
        <td>${exercise.bodyParts}</td>
        <td>${exercise.link}</td>
    </tr>
    </tbody>
</table>
</body>
</html>