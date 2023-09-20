
package registros.Infraestructura.DbManagment;

import java.sql.SQLException;
import registros.Infraestructura.Conection.Conexiones;
import registros.Infraestructura.Models.PersonaModel;



public class Personas {
    private Conexiones conexion;

    public Personas (String userBD, String passDB, String hostDB, String portDB, String dataBase){
        conexion = new Conexiones(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarPersona(PersonaModel persona){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("INSERT INTO personas(" +
                    "nombre, " +
                    "apellido, " +
                    "tipodocumento, " +
                    "numerodocumento, " +
                    "direccion, " +
                    "celular, " +
                    "email, " +
                    "estado) " +
                    "values('" +
                    persona.nombre + "', '" +
                    persona.apellido + "', '" +
                    persona.tipodocumento + "', '" +
                    persona.numerodocumento + "', '" +
                    persona.direccion + "', '" +
                    persona.celular + "', '" +
                    persona.email + "', '" +
                    persona.estado + "')");
            conexion.conexionDB().close();
            return "La persona " + persona.nombre + " fue registrada correctamente.";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String modificarPersona(PersonaModel persona){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE personas SET " +
          
                    "IdCiudad = '" + persona.idciudad + "'," +
                    "nombre = '" + persona.nombre + "'," +
                    "apellido = '" + persona.apellido + "'," +
                    "tipodocumento = '" + persona.tipodocumento + "'," +
                    "numerodocumento = '" + persona.numerodocumento + "'," +
                    "direccion = '" + persona.direccion + "'," +
                    "celular = '" + persona.celular + "'," +
                    "email = '" + persona.email + "'," +
                    "estado = '" + persona.estado + "'," +        
                            "' Where idpersona = " + persona.idpersona);
            conexion.conexionDB().close();
            return "Los datos de la persona con nombre: " + persona.nombre + " fueron modificados correctamente.";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public PersonaModel consultarPersona(int id){
        PersonaModel persona = new PersonaModel();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from personas where idpersona = " + id));
            if(conexion.getResultadoQuery().next()){
            
                persona.setIdCiudad(conexion.getResultadoQuery().getInt("idciudad"));
                persona.setNombre(conexion.getResultadoQuery().getString("nombre"));
                persona.setApellido(conexion.getResultadoQuery().getString("apellido"));
                persona.setTipoDocumento(conexion.getResultadoQuery().getString("tipodocumento"));
                persona.setNumeroDocumento(conexion.getResultadoQuery().getString("numerodocumento"));
                persona.setDireccion(conexion.getResultadoQuery().getString("direccion"));
                persona.setCelular(conexion.getResultadoQuery().getString("celular"));
                persona.setEmail(conexion.getResultadoQuery().getString("email"));
                persona.setEstado(conexion.getResultadoQuery().getString("estado"));

                return persona;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    
}
