<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 17/12/2020
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<div class="container">
        <table>
            <thead>
                <tr>
                    <th>Nombre de locations du mois</th>
                    <th>Nombre de location de l'année</th>
                </tr>
            </thead>

            <tbody>
                <tr>
                    <td><core:out value="${numberLocationCurrentMonth}"></core:out></td>
                    <td><core:out value="${numberLocationCurrentYear}"></core:out></td>
                </tr>
            </tbody>
        </table>
</div>
