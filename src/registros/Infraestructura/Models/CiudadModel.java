
package registros.Infraestructura.Models;


public class CiudadModel {

    public int Id;
    public String ciudad;
    public String Departamento;
    public int Postal_Code;
    

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

    public int getPostal_Code() {
        return Postal_Code;
    }

    public void setPostal_Code(int Postal_Code) {
        this.Postal_Code = Postal_Code;
    }
    
}
