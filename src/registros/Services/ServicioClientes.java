
package registros.Services;

import registros.Infraestructura.DbManagment.Cliente;
import registros.Infraestructura.Models.ClienteModelo;


public class ServicioClientes {
    
    private Cliente clientebd;
    public ServicioClientes(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        clientebd = new Cliente(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarCliente(ClienteModelo cliente){
        if(validarDatos(cliente)){
           return clientebd.registrarCliente(cliente);
        }
        return "Se produjo un error";
    }

    public String modificarCliente(ClienteModelo cliente){
        if(validarDatos(cliente)){
            return clientebd.modificarCliente(cliente);
        }
        return "Se produjo un error";
    }
    
    public String eliminarCliente(int id) {
        clientebd.eliminarCliente(id);
        return "Cliente eliminado correctamente.";
    }

    public ClienteModelo consultarClientePorId(int id){
        return  clientebd.consultarCliente(id);
    }      
    
    
    private boolean validarDatos(ClienteModelo Cliente) {
        try {
            if(Cliente.getEstado().isEmpty()){
                throw new Exception("Se necesita el estado del cliente");
            }
            if(Cliente.getIdcliente() <= 0){
                throw new Exception("Es necesario el ID del cliente ");
            } 
    }catch (Exception e) {
        throw new RuntimeException(e);
    }
        return true;
    }
}
