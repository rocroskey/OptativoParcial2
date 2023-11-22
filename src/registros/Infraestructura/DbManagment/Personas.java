
package registros.Infraestructura.DbManagment;

import registros.Infraestructura.Conection.Conexiones;
import registros.Infraestructura.Models.PersonaModelo;
import java.sql.SQLException;


public class Personas {
    private Conexiones conexion;

    public Personas (String userBD, String passDB, String hostDB, String portDB, String dataBase){
        conexion = new Conexiones(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarPersona(PersonaModelo persona){

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
                    persona.getNombre() + "', '" +
                    persona.getApellido() + "', '" +
                    persona.getTipoDocumento() + "', '" +
                    persona.getNumeroDocumento() + "', '" +
                    persona.getDireccion() + "', '" +
                    persona.getCelular() + "', '" +
                    persona.getEmail() + "', '" +
                    persona.getEstado() + "')");
            conexion.conexionDB().close();
            return "La persona " + persona.getNombre() + " fue registrada correctamente.";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String modificarPersona(PersonaModelo persona){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE personas SET " +
          
                    "IdCiudad = '" + persona.getIdCiudad() + "'," +
                    "nombre = '" + persona.getNombre() + "'," +
                    "apellido = '" + persona.getApellido() + "'," +
                    "tipodocumento = '" + persona.getTipoDocumento() + "'," +
                    "numerodocumento = '" + persona.getNumeroDocumento() + "'," +
                    "direccion = '" + persona.getDireccion() + "'," +
                    "celular = '" + persona.getCelular() + "'," +
                    "email = '" + persona.getEmail() + "'," +
                    "estado = '" + persona.getEstado() + "'" +        
                    "WHERE idpersona = " + persona.getIdpersona());
            conexion.conexionDB().close();
            return "Los datos de la persona con nombre: " + persona.getNombre() + " fueron modificados correctamente.";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public PersonaModelo consultarPersona(int id){
        PersonaModelo persona = new PersonaModelo();
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
    
    public String eliminarPersona(int id) {
    try {
        conexion.setQuerySQL(conexion.conexionDB().createStatement());
        boolean execute = conexion.getQuerySQL().execute("DELETE FROM personas WHERE idpersona = " + id);
        conexion.conexionDB().close();

        if (execute) {
            return "La persona con ID: " + id + " fue eliminada correctamente.";
        } else {
            return "No se pudo eliminar la persona con ID: " + id;
        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}

}
