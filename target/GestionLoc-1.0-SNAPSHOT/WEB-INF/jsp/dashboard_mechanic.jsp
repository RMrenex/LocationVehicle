<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 16/12/2020
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<html>
    <head>
        <title>Tableau de bord</title>
        <link rel="stylesheet" href="<core:url value="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"/>">
        <link rel="stylesheet" href="<core:url value="/css/mecanicien_navbar.css"/>">
    </head>
    <body>
        <core:import url="/WEB-INF/component/display_cars.jsp"/>
    </body>
</html>
