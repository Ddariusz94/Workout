<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>STRONA GŁÓWNA</title>
    <style>
        body {
            background-image: url('/images/images.jpeg');
            background-repeat: no-repeat;
            background-size: contain;
            background-position: center;
            color: darkblue;
            font-family: Arial, sans-serif;
            text-align: center;
            margin: 0;
            padding: 50px;
        }

        h1 {
            font-size: 36px;
            margin-bottom: 30px;
        }

        .link {
            cursor: pointer;
            color: red;
        }

        .link:hover {
            color: darkblue;
        }
    </style>
    <script>
        function redirectTo(url) {
            window.location.href = url;
        }
    </script>
</head>
<body>
<h1>Strona główna</h1>
<p><span class="link" onclick="redirectTo('http://localhost:8080/form/register')">Utwórz użytkownika</span></p>
<p><span class="link" onclick="redirectTo('http://localhost:8080/cwiczenia')">Ćwiczenia</span></p>
<p><span class="link" onclick="redirectTo('http://localhost:8080/treningi')">Treningi</span></p>
<p><span class="link" onclick="redirectTo('http://localhost:8080/trainForm')">Własny plan treningowy</span></p>
</body>
</html>