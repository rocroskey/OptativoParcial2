
package registros.Infraestructura.DbManagment;

import java.sql.SQLException;
import registros.Infraestructura.Conection.Conexiones;
import registros.Infraestructura.Models.CiudadModel;



public class Ciudad {
    private Conexiones conexion;

    public Ciudad(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        conexion = new Conexiones(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarCiudad(CiudadModel ciudad){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("INSERT INTO ciudad (ciudad,departamento,postal)" +
                    "values('" +
                    ciudad.ciudad+ "', '" +
                    ciudad.Departamento + "', '" +
                    ciudad.Postal_Code + "')");
            conexion.conexionDB().close();
            return "La ciudad " + ciudad.ciudad + " fue registrada correctamente.";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String modificarCiudad(CiudadModel ciudad,int id){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE ciudad SET " +
                
                    "ciudad = '" + ciudad.ciudad + "'," +
                    "departamento = '" + ciudad.Departamento + "'," +
                    "postal = '" + ciudad.Postal_Code + "'" +
                            " Where id = " + id);
            conexion.conexionDB().close();
            return "Los datos de la ciudad " + ciudad.ciudad + " fueron modificados correctamente.";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public CiudadModel consultarCiudad(int id){
        CiudadModel ciudad = new CiudadModel();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from ciudad where id = " + id));
            if(conexion.getResultadoQuery().next()){
                
                ciudad.setCiudad(conexion.getResultadoQuery().getString("ciudad"));
                ciudad.setDepartamento(conexion.getResultadoQuery().getString("departamento"));
                ciudad.setPostal_Code(conexion.getResultadoQuery().getInt("postal"));

                return ciudad;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    
}
