<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 16/12/2020
  Time: 09:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<div class="container">
    <table class="striped">
        <tbody>
            <thead>
                <tr>
                    <th>Matricule</th>
                    <th>Etat</th>
                    <th>Couleur</th>
                    <th>Marque</th>
                    <th>Nombre de porte</th>
                    <th>Nombre de chevaux</th>
                </tr>
            </thead>
                <core:forEach items="${cars}" var="car">
                    <tr>
                        <td>${car.matricule}</td>
                        <td>${car.state}</td>
                        <td>${car.color}</td>
                        <td>${car.brand}</td>
                        <td>${car.doorNumber}</td>
                        <td>${car.numberOfHorses}</td>
                    </tr>
                </core:forEach>
        </tbody>
    </table>
</div>
