<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Form</title>
</head>
<body>
<h2>Registration Form</h2>

<form action="" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required><br>

    <label for="gender">Gender:</label>
    <select id="gender" name="gender" required>
        <option value="Male">Male</option>
        <option value="Female">Female</option>
    </select><br>

    <label for="age">Age:</label>
    <input type="text" id="age" name="age" pattern="[0-9]*" title="Wpisz poprawny wiek (może zawierać tylko cyfry)" required><br>

    <label for="weight">Weight:</label>
    <input type="number" id="weight" name="weight" required><br>

    <input type="submit" value="Register">
</form>
</body>
</html>