
package registros.Infraestructura.Models;

import java.util.Date;

/**
 * Representacion de una cuenta con sus elementos
 */

public class CuentasModelo{
    private int idcuenta;
    private int idclientes;
    private String nrocuenta;
    private Date fechaalta;
    private String tipocuenta;
    private String estado;
    private float saldo;
    private String nrocontrato;
    private float costomantenimiento;
    private String promedioacreditacion;
    private String moneda;

    
public CuentasModelo(int idcuenta, int idclientes, String nrocuenta, Date fechaalta, String tipocuenta, String estado, Float saldo, String nrocontrato, Float costomantenimiento, String promedioacreditacion, String moneda) {
    this.idcuenta = idcuenta;
    this.idclientes = idclientes;
    this.nrocuenta = nrocuenta;
    this.fechaalta = fechaalta;
    this.tipocuenta = tipocuenta;
    this.estado = estado;
    this.nrocontrato = nrocontrato;
    this.costomantenimiento = costomantenimiento;
    this.promedioacreditacion = promedioacreditacion;
    this.moneda = moneda;       
    }        

    public CuentasModelo() {
        
    }
        
    public int getIdcuenta() {
        return idcuenta;
    }

    public void setIdcuenta(int idcuenta) {
        this.idcuenta = idcuenta;
    }
    

    public int getIdCliente() {
        return idclientes;
    }

    public void setIdCliente(int IdCliente) {
        this.idclientes = IdCliente;
    }

    public String getNroCuenta() {
        return nrocuenta;
    }

    public void setNroCuenta(String NroCuenta) {
        this.nrocuenta = NroCuenta;
    }

    public Date getFechaAlta() {
        return fechaalta;
    }

    public void setFechaAlta(Date FechaAlta) {
        this.fechaalta = FechaAlta;
    }

    public String getTipoCuenta() {
        return tipocuenta;
    }

    public void setTipoCuenta(String TipoCuenta) {
        this.tipocuenta = TipoCuenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String Estado) {
        this.estado = Estado;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float Saldo) {
        this.saldo = Saldo;
    }

    public String getNroContrato() {
        return nrocontrato;
    }

    public void setNroContrato(String NroContrato) {
        this.nrocontrato = NroContrato;
    }

    public float getCostoMantenimiento() {
        return costomantenimiento;
    }

    public void setCostoMantenimiento(float CostoMantenimiento) {
        this.costomantenimiento = CostoMantenimiento;
    }

    public String getPromedioAcreditacion() {
        return promedioacreditacion;
    }

    public void setPromedioAcreditacion(String PromedioAcreditacion) {
        this.promedioacreditacion = PromedioAcreditacion;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String Moneda) {
        this.moneda = Moneda;
    }
 
}
