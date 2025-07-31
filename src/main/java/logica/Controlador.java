package logica;

import java.util.List;
import persistencia.ControladorPersistencia;

/**
 *
 * @author Arlon
 */
public class Controlador {

    ControladorPersistencia controlPersistencia = new ControladorPersistencia();

    public void crearCliente(Cliente cliente) throws Exception {
        controlPersistencia.crearCliente(cliente);
    }

    public List<Cliente> listarCliente() {
        return controlPersistencia.listarClientes();
    }

    public void eliminarCliente(Long id_eliminar) {
        controlPersistencia.eliminarUsuario(id_eliminar);
    }

    public Cliente traerCliente(Long id_editar) {
        return controlPersistencia.traerCliente(id_editar);
    }

    public void editarCliente(Cliente cliente) {
        controlPersistencia.editarCliente(cliente);
    }
}
