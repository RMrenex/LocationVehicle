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
    <ul class="collapsible">
        <core:forEach items="${cars}" var="car">
        <li>
            <div class="collapsible-header">
                <table class="centered">
                    <thead>
                        <tr>
                            <th>Matricule</th>
                            <th>Etat</th>
                            <th>Couleur</th>
                            <th>Marque</th>
                            <th>Nombre de porte</th>
                            <th>Nombre de chevaux</th>
                            <core:if test="${not empty car.currentlybreakdown}">
                                <th>Type de panne</th>
                                <th>Valider réparation</th>
                            </core:if>
                        </tr>
                    </thead>
                    <tbody>
                        <form method="POST" action="<core:url value="/carRepair"/>">
                            <tr>
                                <td>${car.matricule}</td>
                                <input type="hidden" name="matricule" value="${car.matricule}">
                                <td>${car.state}</td>
                                <td>${car.color}</td>
                                <td>${car.brand}</td>
                                <td>${car.doorNumber}</td>
                                <td>${car.numberOfHorses}</td>
                                <core:if test="${not empty car.currentlybreakdown}">
                                    <td>${car.currentlybreakdown}</td>
                                    <td><button class="btn waves-effect waves-light btn-small" type="submit" name="action">Valider</button></td>
                                </core:if>
                            </tr>
                        </form>
                    </tbody>
                </table>
            </div>
            <div class="collapsible-body">
                <table class="striped">
                    <thead>
                        <tr>
                            <th>Date d'arrivée</th>
                            <th>Panne</th>
                            <th>Date de départ</th>
                        </tr>
                    </thead>
                    <tbody>
                        <core:forEach items="${car.histories}" var="carRepairHistory">
                            <tr>
                                <td>${carRepairHistory.arrival_date}</td>
                                <td>${carRepairHistory.breakdown}</td>
                                <td>${carRepairHistory.depart_date}</td>
                            </tr>
                        </core:forEach>
                    </tbody>
                </table>
            </div>
        </li>
        </core:forEach>
    </ul>
</div>