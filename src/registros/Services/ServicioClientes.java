
package registros.Services;

import registros.Infraestructura.DbManagment.Cliente;
import registros.Infraestructura.Models.ClienteModel;

public class ServicioClientes {
 Cliente clientebd;
    public ServicioClientes(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        clientebd = new Cliente(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarCliente(ClienteModel cliente){
        if(validarDatos(cliente)){
           return clientebd.registrarCliente(cliente);
        }
        return "Se produjo un error";
    }

    public String modificarCliente(ClienteModel cliente){
        if(validarDatos(cliente)){
            return clientebd.modificarCliente(cliente);
        }
        return "Se produjo un error";
    }


    public ClienteModel consultarClientePorId(int id){
        return  clientebd.consultarCliente(id);
    }
    
        public String eliminarCliente(int id) {
        clientebd.eliminarCliente(id);
        return "Cliente eliminado correctamente.";
        }
        
        
    private boolean validarDatos(ClienteModel Cliente) {
        try {
            if(Cliente.estado.isEmpty()){
                throw new Exception("Se necesita el estado del cliente");
            }
            if(Cliente.idcliente <= 0){
                throw new Exception("Es necesario el ID del cliente ");
            }
       
    }catch (Exception e) {
        throw new RuntimeException(e);
    }
        return true;
    }
}
