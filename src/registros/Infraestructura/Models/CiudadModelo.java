
package registros.Infraestructura.Models;

/**
 * Representacion de una ciudad con sus atributos
 */

public class CiudadModelo {
    private int Id;
    private String ciudad;
    private String Departamento;
    private int PostalCode;

    
public CiudadModelo(int Id, String ciudad, String Departamento, int PostalCode) {
    this.Id = Id;
    this.ciudad = ciudad;
    this.Departamento = Departamento;
    this.PostalCode = PostalCode;        
    }

    public CiudadModelo() {
        
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public int getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(int PostalCode) {
        this.PostalCode = PostalCode;
    }
    
}
