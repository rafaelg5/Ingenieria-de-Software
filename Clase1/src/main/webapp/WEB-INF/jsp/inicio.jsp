<%-- 
    Document   : inicio
    Created on : 25/02/2017, 04:53:57 PM
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
        <form method="POST" action="/Clase1/sesion">
            <h2>Inicia sesión</h2>
            <p><input id="correo" name="correo" type="text" placeholder="Correo"></p>
            <p><input id="password" name="password" type="password" placeholder="Contraseña"></p>
            <p><button>Aceptar</button></p>
        </form>
        <form method="POST" action="/Clase1/registro">
            <input type="submit" value="Regístrate">
        </form>
    </center>
        <br>
    </body>
</html>