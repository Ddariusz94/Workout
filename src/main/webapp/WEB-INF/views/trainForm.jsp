<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form</title>
    <style>
        .form-label {
            display: inline-block;
            width: 150px;
            text-align: right;
            margin-right: 10px;
        }
        .form-input {
            margin-bottom: 10px;
        }
        .error-message {
            color: red;
        }
    </style>
</head>
<body>
<h1>Formularz</h1>

<form action="http://localhost:8080/wyborTreningu" method="POST">
    <div class="form-input">
        <label class="form-label" for="age">Wiek:</label>
        <input type="text" id="age" name="age" required pattern="[0-9]+" />
        <span class="error-message"></span>
    </div>

    <div class="form-input">
        <label class="form-label" for="weight">Waga:</label>
        <input type="text" id="weight" name="weight" required pattern="[0-9]+" />
        <span class="error-message"></span>
    </div>

    <div class="form-input">
        <label class="form-label" for="height">Wzrost:</label>
        <input type="text" id="height" name="height" required pattern="[0-9]+" />
        <span class="error-message"></span>
    </div>

    <div class="form-input">
        <label class="form-label">Jakie partie ciała chcesz rozwijać:</label>
        <br>
        <input type="checkbox" id="chest" name="bodyPart" value="Klatka piersiowa">
        <label for="chest">Klatka piersiowa</label>
        <input type="checkbox" id="shoulders" name="bodyPart" value="Barki">
        <label for="shoulders">Barki</label>
        <input type="checkbox" id="back" name="bodyPart" value="Plecy">
        <label for="back">Plecy</label>
        <input type="checkbox" id="biceps" name="bodyPart" value="Biceps">
        <label for="biceps">Biceps</label>
        <br>
        <input type="checkbox" id="abs" name="bodyPart" value="Brzuch">
        <label for="abs">Brzuch</label>
        <input type="checkbox" id="lowerBody" name="bodyPart" value="Dolne partie">
        <label for="lowerBody">Dolne partie</label>
    </div>

    <div class="form-input">
        <label class="form-label" for="difficulty">Poziom trudności treningu:</label>
        <select id="difficulty" name="trainingLevel">
            <option value="easy">Łatwy</option>
            <option value="medium">Średni</option>
            <option value="hard">Trudny</option>
        </select>
    </div>

    <div class="form-input">
        <label class="form-label">W jakie dni chcesz ćwiczyć:</label>
        <br>
        <input type="checkbox" id="monday" name="days" value="Poniedziałek">
        <label for="monday">Poniedziałek</label>
        <input type="checkbox" id="tuesday" name="days" value="Wtorek">
        <label for="tuesday">Wtorek</label>
        <input type="checkbox" id="wednesday" name="days" value="Środa">
        <label for="wednesday">Środa</label>
        <input type="checkbox" id="thursday" name="days" value="Czwartek">
        <label for="thursday">Czwartek</label>
        <input type="checkbox" id="friday" name="days" value="Piątek">
        <label for="friday">Piątek</label>
        <input type="checkbox" id="saturday" name="days" value="Sobota">
        <label for="saturday">Sobota</label>
        <input type="checkbox" id="sunday" name="days" value="Niedziela">
        <label for="sunday">Niedziela</label>
    </div>

    <div class="form-input">
        <label class="form-label">Cel treningu:</label>
        <br>
        <input type="radio" id="muscleMass" name="goal" value="masa">
        <label for="muscleMass">Trening na masę mięśniową</label>
        <input type="radio" id="sculpting" name="goal" value="wyrzezbienie">
        <label for="sculpting">Trening na wyrzeźbienie mięśni</label>
        <input type="radio" id="mixed" name="goal" value="mieszany">
        <label for="mixed">Trening mieszany</label>
    </div>

    <div class="form-input">
        <input type="submit" value="Zapisz">
    </div>
</form>
</body>
</html>