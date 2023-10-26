/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registros.Services;

import registros.Infraestructura.DbManagment.Personas;
import registros.Infraestructura.Models.PersonaModel;

/**
 *
 * @author sosos
 */
public class ServicioPersonas {
    Personas personasbd;
    public ServicioPersonas(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        personasbd = new Personas(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarPersona(PersonaModel persona){
        if(validarDatos(persona)){
           return personasbd.registrarPersona(persona);
        }
        return "Se produjo un error";
    }

    public String modificarPersona(PersonaModel persona){
        if(validarDatos(persona)){
            return personasbd.modificarPersona(persona);
        }
        return "Ocurrió algún error";
    }


    public PersonaModel consultarPersonaPorId(int id){
        return  personasbd.consultarPersona(id);
    }
    
    
    public String eliminarPersona(int idPersona) {
        personasbd.eliminarPersona(idPersona);
        return "Persona eliminada correctamente.";

} 
    

    private boolean validarDatos(PersonaModel persona) {
        try {
        if(persona.nombre.trim().isEmpty())
            throw new Exception("Se requiere de un nombre");
        else if (persona.nombre.trim().length() < 1) {
            throw new Exception("No cumple con la longitud requerida");
        }

    } catch (Exception e) {
        throw new RuntimeException(e);
    }
        return true;
    }
}
