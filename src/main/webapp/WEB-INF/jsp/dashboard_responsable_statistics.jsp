<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 17/12/2020
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<html>
    <head>
        <META HTTP-EQUIV="PRAGMA" CONTENT="NO-CACHE" />
        <META HTTP-EQUIV="EXPIRES" CONTENT="-1" />
        <title>Statistiques</title>
        <link rel="stylesheet" href="<core:url value="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"/>">
        <link href="<core:url value="https://fonts.googleapis.com/icon?family=Material+Icons"/>" rel="stylesheet">
        <link rel="stylesheet" href="<core:url value="/css/responsable_navbar.css"/>">
    </head>

    <body>
        <header><core:import url="/WEB-INF/component/nav/responsable_navbar.jsp"/></header><br>
        <core:import url="/WEB-INF/component/display_statistics.jsp"/>

    </body>
</html>
