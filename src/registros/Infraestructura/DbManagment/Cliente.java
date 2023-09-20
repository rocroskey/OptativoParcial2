
package registros.Infraestructura.DbManagment;

import java.sql.SQLException;
import registros.Infraestructura.Conection.Conexiones;
import registros.Infraestructura.Models.ClienteModel;




public class Cliente {
    private Conexiones conexion;

    public Cliente (String userBD, String passDB, String hostDB, String portDB, String dataBase){
        conexion = new Conexiones(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarCliente(ClienteModel cliente){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("INSERT INTO clientes(" +
                    "idcliente, " +
                    "idpersona, " +
                    "fechaingreso, " +
                    "calificacion, " +
                    "estado) " +
                    "values('" +
                    cliente.idcliente + "', '" +
                    cliente.idpersona + "', '" +
                    cliente.fechaingreso + "', '" +
                    cliente.calificacion + "', '" +
                    cliente.estado +"')");
            conexion.conexionDB().close();
            return "El Cliente " + cliente.idcliente + " fue registrado correctamente.";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String modificarCliente(ClienteModel cliente){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE clientes SET " +
                
                    "calificacion = '" + cliente.calificacion + "'," +
                    "estado = '" + cliente.estado + "'," +
      
                            "' Where idcliente = " + cliente.idcliente);
            conexion.conexionDB().close();
            return "Los datos del Cliente " + cliente.idcliente + " fueron modificados correctamente.";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ClienteModel consultarCliente(int id){
        ClienteModel cliente = new ClienteModel();
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
    
}
