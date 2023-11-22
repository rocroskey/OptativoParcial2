
package registros.Infraestructura.DbManagment;

import java.sql.SQLException;
import registros.Infraestructura.Conection.Conexiones;
import registros.Infraestructura.Models.CuentasModelo;


public class Cuentas {
    
    private Conexiones conexion;

    public Cuentas (String userBD, String passDB, String hostDB, String portDB, String dataBase){
        conexion = new Conexiones(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarCuenta(CuentasModelo cuenta){
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("INSERT INTO cuentas(" +
                    "idclientes, " +
                    "nrocuenta, " +
                    "fechaalta, " +
                    "tipocuenta, " +
                    "estado, " +
                    "saldo, " +
                    "nrocontrato, " +
                    "costomantenimiento, " +
                    "promedioacreditacion, " +
                    "moneda) " +
                    "values('" +
                    cuenta.getIdCliente() + "', '" +
                    cuenta.getNroCuenta() + "', '" +
                    cuenta.getFechaAlta() + "', '" +
                    cuenta.getTipoCuenta() + "', '" +
                    cuenta.getEstado() + "', '" +
                    cuenta.getSaldo() + "', '" +
                    cuenta.getNroContrato() + "', '" +
                    cuenta.getCostoMantenimiento() + "', '" +
                    cuenta.getPromedioAcreditacion() + "', '" +
                    cuenta.getMoneda() + 
                    "')");
            conexion.conexionDB().close();
            return "La cuenta " + cuenta.getNroCuenta() + " fue registrada correctamente.";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String modificarCuenta(CuentasModelo cuenta){
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE cuentas SET " +
          
                    "nrocuenta = '" + cuenta.getNroCuenta() + "'," +
                    "idclientes = '" + cuenta.getIdCliente() + "'," +
                    "fechaalta = '" + cuenta.getFechaAlta() + "'," +
                    "tipocuenta = '" + cuenta.getTipoCuenta() + "'," +
                    "estado = '" + cuenta.getEstado() + "'," +
                    "saldo = '" + cuenta.getSaldo() + "'," +
                    "nrocontrato = '" + cuenta.getNroContrato() + "'," +
                    "costomantenimiento = '" + cuenta.getCostoMantenimiento() + "'," +
                    "promedioacreditacion = '" + cuenta.getPromedioAcreditacion() + "'," +
                    "moneda = '" + cuenta.getMoneda() + "'" +       
                    "WHERE idcuenta = " + cuenta.getIdcuenta());
            conexion.conexionDB().close();
            return "Los datos de la cuenta Numero: " + cuenta.getNroCuenta() + " fueron modificados correctamente.";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public CuentasModelo consultarCuenta(int id){
        CuentasModelo cuenta = new CuentasModelo();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from cuentas where idcuenta = " +  id));
            if(conexion.getResultadoQuery().next()){
                cuenta.setIdcuenta(conexion.getResultadoQuery().getInt("idcuenta"));
                cuenta.setIdCliente(conexion.getResultadoQuery().getInt("idclientes"));
                cuenta.setNroCuenta(conexion.getResultadoQuery().getString("NroCuenta"));
                cuenta.setFechaAlta(conexion.getResultadoQuery().getDate("FechaAlta"));
                cuenta.setTipoCuenta(conexion.getResultadoQuery().getString("TipoCuenta"));
                cuenta.setEstado(conexion.getResultadoQuery().getString("Estado"));
                cuenta.setSaldo(conexion.getResultadoQuery().getFloat("Saldo"));
                cuenta.setNroContrato(conexion.getResultadoQuery().getString("NroContrato"));
                cuenta.setCostoMantenimiento(conexion.getResultadoQuery().getFloat("CostoMantenimiento"));
                cuenta.setPromedioAcreditacion(conexion.getResultadoQuery().getString("PromedioAcreditacion"));
                cuenta.setMoneda(conexion.getResultadoQuery().getString("Moneda"));
                return cuenta;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    
    
    public void eliminarCuenta(int id) {
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("DELETE FROM cuentas WHERE idcuenta = " + id);
            conexion.conexionDB().close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
