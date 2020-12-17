<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
    <head>
        <META HTTP-EQUIV="PRAGMA" CONTENT="NO-CACHE" />
        <META HTTP-EQUIV="EXPIRES" CONTENT="-1" />
        <title>JSP - Hello World</title>
        <link rel="stylesheet" href="<core:url value="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"/>">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col s12 m12 l12 xl12">
                    <div class="card-panel center">
                        <h4>Mécanicien</h4>
                        <a href="<core:url value="/carRepair"/>">Cliquer ici pour vous connecter</a><br>
                        <h4>Responsable</h4>
                        <a href="<core:url value="/PannelControl"/>">Cliquer ici pour vous connecter</a><br>
                        <h4>Gestionnaire</h4>
                        <a href="<core:url value="/carLocation"/>">Cliquer ici pour vous connecter</a>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>