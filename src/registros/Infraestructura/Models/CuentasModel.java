
package registros.Infraestructura.Models;

import java.util.Date;

public class CuentasModel {

    public int idcuenta;
    public int idclientes;
    public String nrocuenta;
    public Date fechaalta;
    public String tipocuenta;
    public String estado;
    public float saldo;
    public String nrocontrato;
    public float costomantenimiento;
    public String promedioacreditacion;
    public String moneda;

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
