<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 17/12/2020
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<div class="container">
    <table class="centered">
        <thead>
            <tr>
                <th>Matricule</th>
                <th>Nom</th>
                <th>Prénom</th>
                <th>Date début de location</th>
                <th>Date fin de location</th>
            </tr>
        </thead>
        <tbody>
        <core:forEach items="${carsHistoryLocation}" var="carsHistoryLocation">
            <core:forEach items="${carsHistoryLocation.locations}" var="carLocation">
                <tr>
                    <td>${carsHistoryLocation.matricule}</td>
                    <td>${carLocation.lastname}</td>
                    <td>${carLocation.firstname}</td>
                    <td>${carLocation.beginDateLocation}</td>
                    <td>${carLocation.endDateLocation}</td>
                </tr>
            </core:forEach>
        </core:forEach>
        </tbody>
    </table>
</div>