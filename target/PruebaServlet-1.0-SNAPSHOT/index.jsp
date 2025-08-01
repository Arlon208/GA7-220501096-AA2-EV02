<%-- 
    Document   : index
    Created on : 30 jul 2025, 18:41:47
    Author     : Arlon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modulo Cliente</title>
         <link rel="stylesheet" type="text/css" href="estilos.css"/>
    </head>
    <body>
        <h1>Modulo clientes</h1><hr>
        <h2>Ingreso datos del cliente</h2>
        <form action="SvInsetarCliente" method="POST">
            <p><label>Cedula: </label> <input type="number" name="cc"></p>
            <p><label>Nombre: </label> <input type="text" name="nombre"></p>
            <p><label>Ciudad: </label> <input type="text" name="ciudad"></p>
            <p><label>Direccion: </label> <input type="text" name="direccion"></p>
            <p><label>Telefono: </label> <input type="text" name="telefono"></p>
            <button type="submit"> Enviar </button>
        </form>
        
        <h2> Consultar Listado de Clientes </h2><hr>
        <p>Hagacliente en el siguiente boton si desea ver los clientes almacenados</p>
        <form action="SvInsetarCliente" method="GET">
            <button type="submit"> Ver Clientes</button>
        </form>
        
        <h2> Eliminar Cliente </h2><hr>
        <p>ingrese la cedula del usuario que desea eliminiar</p>
        <form action="SvEliminar" method="POST">
            <p><label>Cedula: </label> <input type="number" name="id_cliente">
            <button type="submit"> Eliminar Cliente</button>
        </form>
        
        <h2> Editar Cliente </h2><hr>
        <p>ingrese la cedula del usuario que desea modificar</p>
        <form action="SvEditar" method="GET">
            <p><label>Cedula: </label> <input type="number" name="id_clienteEdit">
            <button type="submit"> Modificar Cliente</button>
        </form>
        
    </body>
</html>
