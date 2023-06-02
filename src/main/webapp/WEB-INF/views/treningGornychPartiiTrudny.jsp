<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Trening</title>
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
<h1>Szczegóły treningu</h1>

<div class="field">
    <label>Name:</label>
    <div class="field-value">Trening górnych partii ciała</div>
</div>

<div class="field">
    <label>Description:</label>
    <div class="field-value">Trening który rozwinie twoje górne partie ciała , po każdym ćwiczeniu rób od 60 do 120 sekund przerwy</div>
</div>

<div class="field">
    <label>Level:</label>
    <div class="field-value">Trudny</div>
</div>

<div class="field">
    <label>Exercises:</label>
    <div class="exercises">
        <div class="exercise-item">
            <a href="/exercises/name/pompki%20klasyczne">Pompki klasyczne</a> - 16 powtórzeń
        </div>
        <div class="exercise-item">
            <a href="/exercises/name/Rozpiętki%20z%20hantlami%20w%20leżeniu%20na%20podłodze">Rozpiętki z hantlami w leżeniu na podłodze</a> - 14 powtórzeń
        </div>
        <div class="exercise-item">
            <a href="/exercises/name/Floor%20press">Floor Press</a> - 16 powtórzeń
        </div>
        <div class="exercise-item">
            <a href="/exercises/name/pompki%20klasyczne">Pompki klasyczne</a> - 14 powtórzeń
        </div>
        <div class="exercise-item">
            <a href="/exercises/name/Rozpiętki%20z%20hantlami%20w%20leżeniu%20na%20podłodze">Rozpiętki z hantlami w leżeniu na podłodze</a> - 14 powtórzeń
        </div>
        <div class="exercise-item">
            <a href="/exercises/name/Srzugsy%20z%20hantlami">Szrugsy z hantlami</a> - 18 powtórzeń
        </div>
        <div class="exercise-item">
            <a href="/exercises/name/Back%20widow">Back widow</a> - 16 powtórzeń
        </div>
        <div class="exercise-item">
            <a href="/exercises/name/T%20raise%20z%20hantlami%20w%20opadzie%20tułowia">T raise z hantlami w opadzie tułowia</a> - 14 powtórzeń
        </div>
        <div class="exercise-item">
            <a href="/exercises/name/Z-press">Z-Press</a> - 16 powtórzeń
        </div>
        <div class="exercise-item">
            <a href="/exercises/name/Uginanie%20ramion%20z%20hantlami%20nachwytem">Uginanie ramion z hantlami nachwytem</a> - 16 powtórzeń
        </div>
        <div class="exercise-item">
            <a href="/exercises/name/Uginanie%20ramion%20z%20hantlami%20z%20rotacją">Uginanie ramion z hantlami z rotacją</a> - 18 powtórzeń
        </div>
    </div>
</div>
</body>