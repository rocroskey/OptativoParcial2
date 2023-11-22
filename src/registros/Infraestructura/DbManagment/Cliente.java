
package registros.Infraestructura.DbManagment;

import java.sql.SQLException;
import registros.Infraestructura.Conection.Conexiones;
import registros.Infraestructura.Models.ClienteModelo;


public class Cliente {
    
    private Conexiones conexion;

    public Cliente (String userBD, String passDB, String hostDB, String portDB, String dataBase){
        conexion = new Conexiones(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarCliente(ClienteModelo cliente){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("INSERT INTO clientes (idcliente,idpersona,fechaingreso,calificacion,estado)" +
                    "values('" +
                    cliente.getIdcliente() + "', '" +
                    cliente.getFecha_ingreso() + "', '" +
                    cliente.getCalificacion() + "', '" +
                    cliente.getEstado() + "')");
            conexion.conexionDB().close();
            return "El Cliente " + cliente.getIdcliente() + " fue registrado correctamente.";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String modificarCliente(ClienteModelo cliente){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE clientes SET " +
                    "calificacion = '" + cliente.getCalificacion() + "'," +
                    "estado = '" + cliente.getEstado() + "'," +
                    "idpersona = '" + cliente.getIdPersona() + "'" +
                    "WHERE idcliente = " + cliente.getIdcliente());
            conexion.conexionDB().close();
            return "Los datos del Cliente " + cliente.getIdcliente() + " fueron modificados correctamente.";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ClienteModelo consultarCliente(int id){
        ClienteModelo cliente = new ClienteModelo();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from clientes where idcliente = " + id));
            if(conexion.getResultadoQuery().next()){    
                cliente.setIdcliente(conexion.getResultadoQuery().getInt("idcliente"));
                cliente.setIdPersona(conexion.getResultadoQuery().getInt("idpersona"));
                cliente.setFecha_ingreso (conexion.getResultadoQuery().getDate("fechaingreso"));
                cliente.setCalificacion(conexion.getResultadoQuery().getString("calificacion"));
                cliente.setEstado(conexion.getResultadoQuery().getString("estado"));
                return cliente;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    
    public String eliminarCliente(int idCliente) {
    try {
        conexion.setQuerySQL(conexion.conexionDB().createStatement());
        boolean execute = conexion.getQuerySQL().execute("DELETE FROM clientes WHERE idcliente = " + idCliente);
        conexion.conexionDB().close();

        if (execute) {
            return "Cliente eliminado correctamente.";
        } else {
            return "No se pudo eliminar el cliente. Verifica que el ID sea válido.";
        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}
    
}
