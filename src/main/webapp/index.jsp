<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Hello World</title>
        <link rel="stylesheet" href="<core:url value="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"/>">
        <link rel="stylesheet" href="<core:url value="css/mecanicien_navbar.css"/>">
    </head>
    <body>
        <header><core:import url="WEB-INF/component/mecanicien_navbar.jsp"/></header>
        <h1><%= "Hello World!" %></h1>
        <!--JavaScript at end of body for optimized loading-->
        <script src="<core:url value="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"/>"></script>
        <!-- Compiled and minified JavaScript -->
        <script src="<core:url value="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"/>"></script>
    </body>
</html>