<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 16/12/2020
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<html>
    <head>
        <title>Connexion</title>
        <link rel="stylesheet" href="<core:url value="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"/>">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    </head>
    <body>

    <div class="container">
        <div class="row">
            <div class="col s12 m12 l12 xl12">
                <div class="card-panel">
                    <u><h4 class="center">Connexion</h4></u>
                    <br>
                    <form method="POST" action="">
                        <div class="row">
                            <div class="input-field col s12 m12 l6 xl4 offset-xl4">
                                <input id="email" type="email" class="validate">
                                <label for="email">Email</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12 m12 l6 xl4 offset-xl4">
                                <input id="password" type="password" class="validate">
                                <label for="password">Password</label>
                            </div>
                        </div>

                        <div class="btnValidation center">
                            <button class="btn waves-effect waves-light center" type="submit" name="action">Submit
                                <i class="material-icons right">send</i>
                            </button>
                        </div>

                    </form>

                </div>
            </div>
        </div>
    </div>
    <!--JavaScript at end of body for optimized loading-->
    <script src="<core:url value="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"/>"></script>
    <!-- Compiled and minified JavaScript -->
    <script src="<core:url value="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"/>"></script>
    </body>
</html>
