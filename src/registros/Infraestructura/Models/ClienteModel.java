
package registros.Infraestructura.Models;

import java.util.Date;

public class ClienteModel {
    public int idcliente;
    public int idpersona;
    public Date fechaingreso;
    public String calificacion;
    public String estado;


    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }
    
    public int getIdPersona() {
        return idpersona;
    }

    public void setIdPersona(int IdPersona) {
        this.idpersona = IdPersona;
    }


    public Date getFecha_ingreso() {
        return fechaingreso;
    }

    public void setFecha_ingreso(Date Fecha_ingreso) {
        this.fechaingreso = Fecha_ingreso;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String Calificacion) {
        this.calificacion = Calificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String Estado) {
        this.estado = Estado;
    }

    
}