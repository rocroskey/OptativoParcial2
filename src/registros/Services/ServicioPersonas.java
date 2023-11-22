/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registros.Services;

import registros.Infraestructura.DbManagment.Personas;
import registros.Infraestructura.Models.PersonaModelo;


public class ServicioPersonas {
    
    private Personas personasbd;
    public ServicioPersonas(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        personasbd = new Personas(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarPersona(PersonaModelo persona){
        if(validarDatos(persona)){
           return personasbd.registrarPersona(persona);
        }
        return "Se produjo un error";
    }

    public String modificarPersona(PersonaModelo persona){
        if(validarDatos(persona)){
            return personasbd.modificarPersona(persona);
        }
        return "Ocurrió algún error";
    }
    
        public String eliminarPersona(int idPersona) {
        personasbd.eliminarPersona(idPersona);
        return "Persona eliminada correctamente.";
    }

    public PersonaModelo consultarPersonaPorId(int id){
        return  personasbd.consultarPersona(id);
    }
    

    private boolean validarDatos(PersonaModelo persona) {
        try {
        if(persona.getNombre().trim().isEmpty())
            throw new Exception("Se requiere de un nombre");
        else if (persona.getNombre().trim().length() < 1) {
            throw new Exception("No cumple con la longitud requerida");
        }
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
        return true;
    }
}
