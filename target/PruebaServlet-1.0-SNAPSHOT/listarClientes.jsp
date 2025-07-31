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
    </head>
    <body>
        <h1>Listado de Clientes</h1>
        <% 
            List<Cliente> listaClientes = (List) request.getSession().getAttribute("listaClientes");
            
            int cont = 1;
            for(Cliente cliente : listaClientes){
        
        %>
        
        <p><b> Cliente N° <%=cont%> </b></p>
        <p><b> Cedula N° <%=cliente.getIdCliente()%> </b></p>
        <p><b> Nombre  <%=cliente.getNombre()%> </b></p>
        <p><b> Ciudad  <%=cliente.getCiudad()%> </b></p>
        <p>-----------------------</p>
        <% cont = cont + 1;%>
        <%}%>
    </body>
</html>
