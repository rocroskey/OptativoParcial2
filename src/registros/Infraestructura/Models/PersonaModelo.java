
package registros.Infraestructura.Models;

/**
 * Representacion de una persona con sus atributos
 */

public class PersonaModelo {

    private int idpersona;
    private int idciudad;
    private String nombre;
    private String apellido;
    private String tipodocumento;
    private String numerodocumento;
    private String direccion;
    private String celular;
    private String email;
    private String estado;  
    
    
 public PersonaModelo(int idpersona, String nombre, String apellido, String tipodocumento, String numerodocumento, String direccion, String celular, String email, String estado) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipodocumento = tipodocumento;
        this.numerodocumento = numerodocumento;
        this.direccion = direccion;
        this.celular = celular;
        this.email = email;
        this.estado = estado;
 }

 
    public PersonaModelo(){
        
    }
 
    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public int getIdCiudad() {
        return idciudad;
    }

    public void setIdCiudad(int IdCiudad) {
        this.idciudad = IdCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }

    public String getTipoDocumento() {
        return tipodocumento;
    }

    public void setTipoDocumento(String TipoDocumento) {
        this.tipodocumento = TipoDocumento;
    }

    public String getNumeroDocumento() {
        return numerodocumento;
    }

    public void setNumeroDocumento(String NumeroDocumento) {
        this.numerodocumento = NumeroDocumento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String Direccion) {
        this.direccion = Direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String Celular) {
        this.celular = Celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String Estado) {
        this.estado = Estado;
    }
    
    
}
