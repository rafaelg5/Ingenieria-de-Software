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
        <form method="GET" action="/WebPage/user">
            <h2>Buscar usuario</h2>
            <p><input id="correo" name="correo" type="text" placeholder="Correo" required></p>            
            <p><input id="password" name="password" type="password" placeholder="Contraseña" required></p>            
            <p><button>Aceptar</button></p>
        </form>
        <form method="POST" action="/WebPage/registro">
            <input type="submit" value="Regístrate">
        </form>
        <br>
        <form method="POST" action="/WebPage/maps">
            <input type="submit" value="Ver Mapa">
        </form>
    </center>
        <br>
    </body>
</html>