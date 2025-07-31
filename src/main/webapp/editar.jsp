<%-- 
    Document   : editar
    Created on : 31 jul 2025, 18:18:28
    Author     : Arlon
--%>

<%@page import="logica.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuario</title>
    </head>
    <body>
        <% Cliente cliente = (Cliente) request.getSession().getAttribute("clienteEditar"); %>
        <h1>Editar cliente</h1>
        <form action="SvEditar" method="POST">
            <p><label>Cedula: </label> <input type="number" name="cc" value="<%=cliente.getIdCliente()%>"></p>
            <p><label>Nombre: </label> <input type="text" name="nombre" value="<%=cliente.getNombre()%>"></p>
            <p><label>Ciudad: </label> <input type="text" name="ciudad"value="<%=cliente.getCiudad()%>"></p>
            <p><label>Direccion: </label> <input type="text" name="direccion"value="<%=cliente.getDireccion()%>"></p>
            <p><label>Telefono: </label> <input type="text" name="telefono"value="<%=cliente.getTelefono()%>"></p>
            <button type="submit"> Guardar </button>
        </form>
    </body>
</html>
