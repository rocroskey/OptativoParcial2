
package registros.Infraestructura.Models;

import java.util.Date;

public class MovimientosModel {
    public int idmovimiento;
    public int IdCuenta;
    public Date FechaMovimiento;
    public String TipoMovimiento;
    public float SaldoAnterior;
    public float SaldoActual;
    public float MontoMovimiento;
    public float CuentaOrigen;
    public float CuentaDestino;
    public float Canal;

    public int getIdmovimiento() {
        return idmovimiento;
    }

    public void setIdmovimiento(int idmovimiento) {
        this.idmovimiento = idmovimiento;
    }

    public int getIdCuenta() {
        return IdCuenta;
    }

    public void setIdCuenta(int IdCuenta) {
        this.IdCuenta = IdCuenta;
    }

    public Date getFechaMovimiento() {
        return FechaMovimiento;
    }

    public void setFechaMovimiento(Date FechaMovimiento) {
        this.FechaMovimiento = FechaMovimiento;
    }

    public String getTipoMovimiento() {
        return TipoMovimiento;
    }

    public void setTipoMovimiento(String TipoMovimiento) {
        this.TipoMovimiento = TipoMovimiento;
    }

    public float getSaldoAnterior() {
        return SaldoAnterior;
    }

    public void setSaldoAnterior(float SaldoAnterior) {
        this.SaldoAnterior = SaldoAnterior;
    }

    public float getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(float SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    public float getMontoMovimiento() {
        return MontoMovimiento;
    }

    public void setMontoMovimiento(float MontoMovimiento) {
        this.MontoMovimiento = MontoMovimiento;
    }

    public float getCuentaOrigen() {
        return CuentaOrigen;
    }

    public void setCuentaOrigen(float CuentaOrigen) {
        this.CuentaOrigen = CuentaOrigen;
    }

    public float getCuentaDestino() {
        return CuentaDestino;
    }

    public void setCuentaDestino(float CuentaDestino) {
        this.CuentaDestino = CuentaDestino;
    }

    public float getCanal() {
        return Canal;
    }

    public void setCanal(float Canal) {
        this.Canal = Canal;
    }
    
    
    
}
