
package registros.Infraestructura.Models;

import java.util.Date;

/**
 * Representacion de un cliente con sus atributos
 */

public class ClienteModelo {
    private int idcliente;
    private int idpersona;
    private Date fechaingreso;
    private String calificacion;
    private String estado;

    
public ClienteModelo(int idcliente, int idpersona, Date fechaingreso, String calificacion, String estado) {
    this.idpersona = idpersona;
    this.idcliente = idcliente;
    this.fechaingreso = fechaingreso;
    this.calificacion = calificacion;
    this.estado = estado;    
    }     

    public ClienteModelo() {
        
    }
        
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