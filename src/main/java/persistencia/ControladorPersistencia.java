package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Cliente;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Arlon
 */
public class ControladorPersistencia {
    ClienteJpaController clienteJPA = new ClienteJpaController();
    
    //ingresar un Nuevo Cliente (CREATE)
    public void crearCliente (Cliente Cliente) throws Exception{
        clienteJPA.create(Cliente);
    }
    
    //Leer datos (READ)
    public List<Cliente> listarClientes() {
        return clienteJPA.findClienteEntities();
    }

    public void eliminarUsuario(Long id_eliminar) {
        try {
            clienteJPA.destroy(id_eliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cliente traerCliente(Long id_editar) {
        return clienteJPA.findCliente(id_editar);
    }

    public void editarCliente(Cliente cliente) {
        try {
            clienteJPA.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
