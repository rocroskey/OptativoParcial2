
package registros.Infraestructura.DbManagment;

import java.sql.SQLException;
import registros.Infraestructura.Conection.Conexiones;
import registros.Infraestructura.Models.CiudadModelo;


public class Ciudad {
    
    private Conexiones conexion;

    public Ciudad(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        conexion = new Conexiones(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarCiudad(CiudadModelo ciudad){
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("INSERT INTO ciudad (ciudad,departamento,postal)" +
                    "values('" +
                    ciudad.getCiudad()+ "', '" +
                    ciudad.getDepartamento() + "', '" +
                    ciudad.getPostalCode() + "')");
            conexion.conexionDB().close();
            return "La ciudad " + ciudad.getCiudad() + " fue registrada correctamente.";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String modificarCiudad(CiudadModelo ciudad,int id){
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE ciudad SET " +
                    "ciudad = '" + ciudad.getCiudad() + "'," +
                    "departamento = '" + ciudad.getDepartamento() + "'," +
                    "postal = '" + ciudad.getPostalCode() + "'" +
                    "WHERE id = " + id);
            conexion.conexionDB().close();
            return "Los datos de la ciudad " + ciudad.getCiudad() + " fueron modificados correctamente.";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public CiudadModelo consultarCiudad(int id){
        CiudadModelo ciudad = new CiudadModelo();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from ciudad where id = " + id));  
            if(conexion.getResultadoQuery().next()){
                ciudad.setCiudad(conexion.getResultadoQuery().getString("ciudad"));
                ciudad.setDepartamento(conexion.getResultadoQuery().getString("departamento"));
                ciudad.setPostalCode(conexion.getResultadoQuery().getInt("postal"));
                return ciudad;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    
    
    public String eliminarCiudad(int id) {
    try {
        conexion.setQuerySQL(conexion.conexionDB().createStatement());
        int rowCount = conexion.getQuerySQL().executeUpdate("DELETE FROM ciudad WHERE id = " + id);
        conexion.conexionDB().close();

        if (rowCount > 0) {
            return "Ciudad eliminada correctamente.";
        } else {
            return "No se encontró la ciudad con ID: " + id;
        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}

}
