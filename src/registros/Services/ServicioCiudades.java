
package registros.Services;

import registros.Infraestructura.DbManagment.Ciudad;
import registros.Infraestructura.Models.CiudadModelo;


public class ServicioCiudades {

    private Ciudad ciudadbd;
    public ServicioCiudades(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        ciudadbd = new Ciudad(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarCiudad(CiudadModelo ciudad){
        if(validarDatos(ciudad)){
           return ciudadbd.registrarCiudad(ciudad);
        }
        return "Ocurrió algún error";
    }

    public String modificarCiudad(CiudadModelo ciudad,int id){
        if(validarDatos(ciudad)){
            return ciudadbd.modificarCiudad(ciudad, id);
        }
        return "Se produjo error";
    }

    public String eliminarCiudad(int idPersona) {
        ciudadbd.eliminarCiudad(idPersona);
        return "Ciudad eliminada correctamente.";
    }

    public CiudadModelo consultarCiudad(int id){
        return  ciudadbd.consultarCiudad(id);
    }  

    
    private boolean validarDatos(CiudadModelo Ciudad) {
        try {
            if (Ciudad.getCiudad().trim().isEmpty()) {
                throw new Exception("El campo no debe de estar vacío");
            }
            if (Ciudad.getDepartamento().trim().isEmpty()) {
                throw new Exception("El campo Departamento es requerido");
            }
            if (Ciudad.getCiudad().trim().length() < 2) {
            throw new Exception("No tiene la longitud necesaria");
            }
    } catch (Exception e) {
        throw new RuntimeException("Error al validar datos: " + e.getMessage());
    }
    return true;
    }
}






