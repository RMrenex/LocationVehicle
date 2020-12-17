<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<html>
    <head>
        <META HTTP-EQUIV="PRAGMA" CONTENT="NO-CACHE" />
        <META HTTP-EQUIV="EXPIRES" CONTENT="-1" />
        <title>Tableau de bord</title>
        <link rel="stylesheet" href="<core:url value="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"/>">
        <link rel="stylesheet" href="<core:url value="/css/mechanic_navbar.css"/>">
    </head>
    <body>
    <header><core:import url="/WEB-INF/component/nav/gestionnaire_navbar.jsp"/></header><br>
        <core:import url="/WEB-INF/component/display_cars_gestionnaire.jsp"/>
    </body>
</html>