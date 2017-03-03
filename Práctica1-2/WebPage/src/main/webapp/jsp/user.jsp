<%-- 
    Document   : sesion
    Created on : 25/02/2017, 06:57:18 PM
    Author     : Rafael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sesión</title>
    </head>
    <body>
        <h1>${info}</h1>
        <h1>${user.correo}</h1>
        <h1>${user.id_user}</h1>
        <h1>${persona.nombre}</h1>
        <h1>${persona.fechanac}</h1>
        <h1>${persona.carrera}</h1>
    </body>
</html>
