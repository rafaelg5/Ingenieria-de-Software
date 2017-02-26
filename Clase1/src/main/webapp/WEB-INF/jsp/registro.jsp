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
        <form method=GET action="/Clase1/registro2">
            <h2>Regístrate</h2>
            <p><input id="nombre" name="nombre" type="text" placeholder="Nombre"></p>
            <p><input id="carrera" name="carrera" type="text" placeholder="Carrera"></p>
            <p>Fecha de Nacimiento<br><input id="fechanac" name="fechanac" type="date"></p>
            <p><input id="correo" name="correo" type="text" placeholder="Correo"></p>
            <p><input id="password" name="password" type="text" placeholder="Contraseña"></p>
            <button>Aceptar</button>
        </form>
    </center>
        <br>
    </body>
</html>