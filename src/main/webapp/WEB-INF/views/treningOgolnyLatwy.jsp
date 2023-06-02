<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Workout Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }

        h1 {
            margin-bottom: 10px;
        }

        .field {
            margin-bottom: 20px;
        }

        .field label {
            font-weight: bold;
        }

        .field-value {
            margin-top: 5px;
        }

        .exercises {
            margin-top: 20px;
        }

        .exercise-item {
            margin-bottom: 10px;
        }

        .exercise-name {
            font-weight: bold;
        }
    </style>
</head>
<body>
<h1>Szczegóły ćwiczeń</h1>

<div class="field">
    <label>Nazwa:</label>
    <div class="field-value">Trening ogólnorozwojowy</div>
</div>

<div class="field">
    <label>Opis:</label>
    <div class="field-value">Trening który w sposób zbalansowany rozwinię twoje mięśnie , po każdym z ćwiczeń rób przerwę od 30 - 60 sekund</div>
</div>

<div class="field">
    <label>Poziom trudności:</label>
    <div class="field-value">Łatwy</div>
</div>

<div class="field">
    <label>Ćwiczenia:</label>
    <div class="exercises">
        <div class="exercise-item">
            <a href="/exercises/name/Nożyce nogami">Nożyce nogami</a> - 10 powtórzeń
        </div>
        <div class="exercise-item">
            <a href="/exercises/name/pompki%20klasyczne">Pompki klasyczne</a> - 8 powtórzeń
        </div>
        <div class="exercise-item">
            <a href="/exercises/name/Floor%20press">Floor press</a> - 8 powtórzeń
        </div>
        <div class="exercise-item">
            <a href="/exercises/name/Scyzoryk">Scyzoryk</a> - 12 powtórzeń
        </div>
        <div class="exercise-item">
            <a href="/exercises/name/Uginanie%20ramion%20z%20hantlami%20nachwytem">Uginanie ramion z hantlami nachwytem</a> - 10 powtórzeń
        </div>
        <div class="exercise-item">
            <a href="/exercises/name/Zginanie%20przedramion%20w%20chwycie%20młotkowym%20siedząc%20na%20ławce">Zginanie przedramion w chwycie młotkowym siedząc na ławce</a> - 8 powtórzeń
        </div>
        <div class="exercise-item">
            <a href="/exercises/name/Nożyce nogami">Nożyce nogami</a> - 10 powtórzeń
        </div>
        <div class="exercise-item">
            <a href="/exercises/name/Z-press">Z-press</a> - 10 powtórzeń
        </div>
        <div class="exercise-item">
            <a href="/exercises/name/Wspięcia%20na%20palcach%20siedząc%20z%20użyciem%20sztangielki">Wspięcia na palcach siedząc z użyciem sztangielki</a> - 10 powtórzeń
        </div>
        <div class="exercise-item">
            <a href="/exercises/name/Wspięcia%20na%20palcach%20stojąc%20z%20hantlą">Wspięcia na palcach stojąc z hantlą</a> - 8 powtórzeń
        </div>
    </div>
</div>
</body>