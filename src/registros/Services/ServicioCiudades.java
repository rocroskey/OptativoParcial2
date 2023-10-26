/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registros.Services;

import registros.Infraestructura.DbManagment.Ciudad;
import registros.Infraestructura.Models.CiudadModel;


/**
 *
 * @author sosos
 */
public class ServicioCiudades {

    Ciudad ciudadbd;
    public ServicioCiudades(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        ciudadbd = new Ciudad(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarCiudad(CiudadModel ciudad){
        if(validarDatos(ciudad)){
           return ciudadbd.registrarCiudad(ciudad);
        }
        return "Ocurrió algún error";
        
    }

    public String modificarCiudad(CiudadModel ciudad,int id){
        if(validarDatos(ciudad)){
            return ciudadbd.modificarCiudad(ciudad, id);
        }
        return "Se produjo error";
    }

        public String eliminarCiudad(int idPersona) {
        ciudadbd.eliminarCiudad(idPersona);
        return "Ciudad eliminada correctamente.";

}

    public CiudadModel consultarCiudad(int id){
        return  ciudadbd.consultarCiudad(id);
    }
    

 private boolean validarDatos(CiudadModel Ciudad) {
    try {
        if (Ciudad.ciudad.trim().isEmpty()) {
            throw new Exception("El campo no debe de estar vacío");
        }
        if (Ciudad.Departamento.trim().isEmpty()) {
            throw new Exception("El campo Departamento es requerido");
        }
        if (Ciudad.ciudad.trim().length() < 2) {
            throw new Exception("No tiene la longitud necesaria");
        }
    } catch (Exception e) {
        throw new RuntimeException("Error al validar datos: " + e.getMessage());
    }
    return true;
}

}





