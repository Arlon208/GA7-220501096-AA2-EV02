package Servlets;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Cliente;
import logica.Controlador;

/**
 *
 * @author Arlon
 */
@WebServlet(name = "SvEditar", urlPatterns = {"/SvEditar"})
public class SvEditar extends HttpServlet {
Controlador control = new Controlador();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
      
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Long id_editar = Long.parseLong(request.getParameter("id_clienteEdit"));
        Cliente cliente = control.traerCliente(id_editar);
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("clienteEditar", cliente);
        
        response.sendRedirect("editar.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cedulaSTR = request.getParameter("cc");
        String nombre = request.getParameter("nombre");
        String ciudad = request.getParameter("ciudad");
        String direccion = request.getParameter("direccion");
        String telefono = request.getParameter("telefono");
    try {
     Long cedula = Long.parseLong(cedulaSTR);

        Cliente cliente = (Cliente) request.getSession().getAttribute("clienteEditar");
        cliente.setIdCliente(cedula);
        cliente.setNombre(nombre);
        cliente.setCiudad(ciudad);
        cliente.setDireccion(direccion);
        cliente.setTelefono(telefono);
        
        control.editarCliente(cliente);
        
        response.sendRedirect("index.jsp");
        
    } catch (NumberFormatException ex) {
        
        Logger.getLogger(SvInsetarCliente.class.getName()).log(Level.SEVERE, "La cédula no es un número válido", ex);
  
    }         
        catch (Exception ex) {
            Logger.getLogger(SvInsetarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
