<%-- 
    Document   : registro
    Created on : 25/02/2017, 08:41:36 PM
    Author     : Rafael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
    </head>
    <body>  
    <center>
        <form method=GET action="/WebPage/registro2">
            <h2>Regístrate</h2>
            <p><input id="nombre" name="nombre" type="text" placeholder="Nombre" required></p>
            <p><input id="carrera" name="carrera" type="text" placeholder="Carrera" required></p>
            <p>Fecha de Nacimiento<br><input id="fechanac" name="fechanac" type="date" required></p>
            <p><input id="correo" name="correo" type="text" placeholder="Correo" required></p>
            <p><input id="password" name="password" type="password" placeholder="Contraseña" required></p>
            <button>Aceptar</button>
        </form>
    </center>
        <br>
    </body>
</html>