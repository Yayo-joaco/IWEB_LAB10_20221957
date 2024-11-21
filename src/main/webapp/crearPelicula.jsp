<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.pruebalaboratorio1.beans.*" %>
<%@ page import="com.example.pruebalaboratorio1.daos.*" %>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Crear Película</title>
</head>
<body>

<h1>Crear Película</h1>
<form action="crearPelicula" method="POST">
    <label for="nombre">Nombre:</label>
    <input type="text" id="nombre" name="nombre" required><br><br>

    <label for="apellido">Apellido:</label>
    <input type="text" id="apellido" name="apellido" required><br><br>

    <label for="anoNacimiento">Año Nacimiento:</label>
    <input type="number" id="anoNacimiento" name="anoNacimiento" required><br><br>

    <label for="premioOscar">¿Ha ganado un premio Oscar?</label>
    <input type="checkbox" id="premioOscar" name="premioOscar"><br><br>

    <button type="submit">Guardar</button>
</form>

</body>
</html>
