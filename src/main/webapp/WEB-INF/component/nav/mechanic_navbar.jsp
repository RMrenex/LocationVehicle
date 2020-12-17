<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 16/12/2020
  Time: 09:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<nav>
    <div class="nav-wrapper">
        <a href="#" class="brand-logo center"><img src="<core:url value="https://img.icons8.com/dusk/64/000000/car.png"/>"/></a>
        <a href="<core:url value="/disconnectServlet"/>" class="brand-logo right logout"><img src="https://img.icons8.com/fluent/48/000000/close-window.png"/></a>
        <ul id="nav-mobile" class="left hide-on-med-and-down">
            <li><a href="<core:url value="/carRepair"/>">Dashboard</a></li>
        </ul>
    </div>
</nav>