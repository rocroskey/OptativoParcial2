
package registros.Infraestructura.Models;


public class PersonaModel {

    public int idpersona;
    public int idciudad;
    public String nombre;
    public String apellido;
    public String tipodocumento;
    public String numerodocumento;
    public String direccion;
    public String celular;
    public String email;
    public String estado;

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
