<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>

<form method="post" action="<core:url value="/carLocation"/>">
	<div class="input-field col s12">
		<select name="color" class="browser-default" >
			<option value="" disabled selected>Couleur</option>
			<option value="Rouge">Rouge</option>
			<option value="Bleu">Bleu</option>
			<option value="Vert">Vert</option>
		</select>
	</div>
	
	<div class="input-field col s12">
		<select name="brand" class="browser-default">
			<option value="" disabled selected>Marque</option>
			<option value="Peugeot">Peugeot</option>
			<option value="Ferrari">Ferrari</option>
			<option value="Renault">Renault</option>
		</select>
	</div>
	
	<button type="submit">Filtrer</button>
</form> 
</body>

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
            <core:forEach items="${Avalaiblecars}" var="car">
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
                    <th></th>
                </tr>
            </thead>
            <core:forEach items="${Locationcars}" var="car">
                 <tr>
                        <td>${car.matricule}</td>
                        <td>${car.state}</td>
                        <td>${car.color}</td>
                        <td>${car.brand}</td>
                        <td>${car.doorNumber}</td>
                        <td>${car.numberOfHorses}</td>
                        <td><form method="post" action="<core:url value="/carLocation"/>">
                        <input name="retour" type="hidden" value="${car.matricule }">
                        <button type="submit">Retour Location</button>
                        </form></td>
                 </tr>
                 
           </core:forEach>
                
        </tbody>
    </table>
</div>
