<%-- 
    Document   : listarClientes
    Created on : 30 jul 2025, 23:23:03
    Author     : Arlon
--%>


<%@page import="java.util.List"%>
<%@page import="logica.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Clientes</title>
        <link rel="stylesheet" type="text/css" href="estilos.css"/>
    </head>
    <body>
        <h1>Listado de Clientes</h1>
        <% 
            List<Cliente> listaClientes = (List) request.getSession().getAttribute("listaClientes");
            
            int cont = 1;
            for(Cliente cliente : listaClientes){
        
        %>
        <table>
            <tr>
                <th>Cliente N°</th>
                <th>Cedula</th>
                <th>Nombre</th>
                <th>Ciudad</th>
                <th>Direccion</th>
                <th>Telefono</th>
            </tr>
            <tbody>
        <td><b><%=cont%> </b></td>
        <td><b><%=cliente.getIdCliente()%> </b></td>
        <td><b> <%=cliente.getNombre()%> </b></td>
        <td><b> <%=cliente.getCiudad()%> </b></td>
        <td><b> <%=cliente.getDireccion()%> </b></td>
        <td><b> <%=cliente.getTelefono()%> </b></td>
        </tbody>
        </table>
        <% cont = cont + 1;%>
        <%}%>
        
    </body>
</html>
