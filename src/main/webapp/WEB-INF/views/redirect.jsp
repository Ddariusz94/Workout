<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
  String option = request.getParameter("option");
  String redirectUrl;

  if ("createUser".equals(option)) {
    redirectUrl = "http://localhost:8080/form/register";
  } else if ("chooseWorkout".equals(option)) {
    redirectUrl = "http://localhost/workouts";
  } else {
    // Jeśli nie wybrano żadnej opcji, przekieruj na stronę główną
    redirectUrl = "http://localhost:8080/";
  }

  response.sendRedirect(redirectUrl);
%>