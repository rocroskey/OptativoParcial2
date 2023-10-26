
package registros.Infraestructura.DbManagment;

import java.sql.SQLException;
import registros.Infraestructura.Conection.Conexiones;
import registros.Infraestructura.Models.CuentasModel;


public class Cuentas {
    
    private Conexiones conexion;

    public Cuentas (String userBD, String passDB, String hostDB, String portDB, String dataBase){
        conexion = new Conexiones(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarCuenta(CuentasModel cuenta){

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
                    cuenta.idclientes + "', '" +
                    cuenta.nrocuenta + "', '" +
                    cuenta.fechaalta + "', '" +
                    cuenta.tipocuenta + "', '" +
                    cuenta.estado + "', '" +
                    cuenta.saldo + "', '" +
                    cuenta.nrocontrato + "', '" +
                    cuenta.costomantenimiento + "', '" +
                    cuenta.promedioacreditacion + "', '" +
                    cuenta.moneda + 
                    "')");
            conexion.conexionDB().close();
            return "La cuenta " + cuenta.nrocuenta + " fue registrada correctamente.";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String modificarCuenta(CuentasModel cuenta){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE cuentas SET " +
          
                    "nrocuenta = '" + cuenta.nrocuenta + "'," +
                    "idclientes = '" + cuenta.idclientes + "'," +
                    "fechaalta = '" + cuenta.fechaalta + "'," +
                    "tipocuenta = '" + cuenta.tipocuenta + "'," +
                    "estado = '" + cuenta.estado + "'," +
                    "saldo = '" + cuenta.saldo + "'," +
                    "nrocontrato = '" + cuenta.nrocontrato + "'," +
                    "costomantenimiento = '" + cuenta.costomantenimiento + "'," +
                    "promedioacreditacion = '" + cuenta.promedioacreditacion + "'," +
                    "moneda = '" + cuenta.moneda + "'" +       
                            " Where idcuenta = " + cuenta.idcuenta);
            conexion.conexionDB().close();
            return "Los datos de la cuenta Numero: " + cuenta.nrocuenta + " fueron modificados correctamente.";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public CuentasModel consultarCuenta(int id){
        CuentasModel cuenta = new CuentasModel();
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
