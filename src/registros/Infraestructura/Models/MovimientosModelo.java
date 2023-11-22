
package registros.Infraestructura.Models;

import java.util.Date;

/**
 * Representacion de los moviemientos realizados en las cuentas
 */

public class MovimientosModelo {
    private int idmovimiento;
    private int IdCuenta;
    private Date FechaMovimiento;
    private String TipoMovimiento;
    private float SaldoAnterior;
    private float SaldoActual;
    private float MontoMovimiento;
    private float CuentaOrigen;
    private float CuentaDestino;
    private float Canal;

    
public MovimientosModelo(int idmovimiento, int IdCuenta, Date FechaMovimiento, String TipoMovimiento, float SaldoAnterior, float SaldoActual, float MontoMovimiento, float CuentaOrigen, float CuentaDestino, float Canal ) {
    this.idmovimiento = idmovimiento;
    this.IdCuenta = IdCuenta;
    this.FechaMovimiento = FechaMovimiento;
    this.TipoMovimiento = TipoMovimiento;
    this.SaldoAnterior = SaldoAnterior;
    this.MontoMovimiento = MontoMovimiento;
    this.CuentaOrigen = CuentaOrigen;
    this.CuentaDestino = CuentaDestino;
    this.Canal = Canal;
    }       

    public MovimientosModelo() {
        
    }
        
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
