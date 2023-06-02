<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Formularz treningowy</title>
  <script>
    function redirectToTrainingPlan() {

      var trainingLevel = document.getElementById("trainingLevel").value;
      var redirec = "";
      if (trainingLevel === "Trudny") {
        redirec = "treningGornychPartiiTrudny";
      } else if (trainingLevel === "Łatwy") {
        redirec = "treningOgolnyLatwy";
      }
      if (redirec) {
        window.location.href = redirec;
      }
    }
  </script>
</head>