package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet(name = "SvInsetarCliente", urlPatterns = {"/SvInsetarCliente"})
public class SvInsetarCliente extends HttpServlet {

    Controlador control = new Controlador();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Cliente> listaClientes = new ArrayList<>();
        listaClientes = control.listarCliente();

        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaClientes", listaClientes);

        response.sendRedirect("listarClientes.jsp");
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

        Cliente cliente = new Cliente();
        cliente.setIdCliente(cedula);
        cliente.setNombre(nombre);
        cliente.setCiudad(ciudad);
        cliente.setDireccion(direccion);
        cliente.setTelefono(telefono);
        
        control.crearCliente(cliente);
        
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
    }

}
