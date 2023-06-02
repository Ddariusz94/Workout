<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Exercise Details</title>
    <style>
        a {
            text-decoration: none;
            font-weight: normal;
            font-size: larger;
            color: black;
        }

        .smaller {
            font-size: smaller;
            color: brown;
        }

        .hidden {
            display: none;
        }
    </style>

    <script>
        function toggleOptions(elementId) {
            var optionsDiv = document.getElementById(elementId);

            if (optionsDiv.classList.contains("hidden")) {
                optionsDiv.classList.remove("hidden");
            } else {
                optionsDiv.classList.add("hidden");
            }
        }
    </script>
</head>
<body>
<h1>Wybierz partię ciała, którą chcesz trenować</h1>
<div>
    <a href="#" onclick="toggleOptions('ogolnoRozwojowyOptions')">Trening ogólnorozwojowy</a>
    <div id="ogolnoRozwojowyOptions" class="hidden">
        <div>
            <a href="/treningOgolnyLatwy" class="smaller">Trening łatwy</a>
        </div>
        <div>
            <a href="/trening" class="smaller">Trening trudny</a>
        </div>
    </div>
</div>
<div>
    <a href="#" onclick="toggleOptions('gornePartieOptions')">Trening górnych partii</a>
    <div id="gornePartieOptions" class="hidden">
        <div>
            <a href="/treningLatwy" class="smaller">Trening łatwy</a>
        </div>
        <div>
            <a href="/treningGornychPartiiTrudny" class="smaller">Trening trudny</a>
        </div>
    </div>
</div>
<div>
    <a href="#" onclick="toggleOptions('brzuchOptions')">Trening brzucha</a>
    <div id="brzuchOptions" class="hidden">
        <div>
            <a href="/treningLatwy" class="smaller">Trening łatwy</a>
        </div>
        <div>
            <a href="/treningTrudny" class="smaller">Trening trudny</a>
        </div>
    </div>
</div>
<div>
    <a href="#" onclick="toggleOptions('dolnePartieOptions')">Trening dolnych partii</a>
    <div id="dolnePartieOptions" class="hidden">
        <div>
            <a href="/treningLatwy" class="smaller">Trening łatwy</a>
        </div>
        <div>
            <a href="/treningTrudny" class="smaller">Trening trudny</a>
        </div>
    </div>
</div>

</body>
</html>