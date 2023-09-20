
package registros.Infraestructura.DbManagment;

import java.sql.SQLException;
import registros.Infraestructura.Conection.Conexiones;
import registros.Infraestructura.Models.MovimientosModel;

public class Movimientos {
     
    private Conexiones conexion;

    public Movimientos (String userBD, String passDB, String hostDB, String portDB, String dataBase){
        conexion = new Conexiones(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarMovimiento(MovimientosModel movimiento){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("INSERT INTO movimientos(" +
                    "fechamovimiento, " +
                    "tipomovimiento, " +
                    "saldoanterior, " +
                    "saldoactual, " +
                    "montomovimiento, " +
                    "cuentaorigen, " +
                    "cuentadestino, " +
                    "canal) " +
                    "values('" +
                    movimiento.FechaMovimiento + "', '" +
                    movimiento.TipoMovimiento + "', '" +
                    movimiento.SaldoAnterior + "', '" +
                    movimiento.SaldoActual + "', '" +
                    movimiento.MontoMovimiento + "', '" +
                    movimiento.CuentaOrigen + "', '" +
                    movimiento.CuentaDestino + "', '" +
                    movimiento.Canal + "')");
            conexion.conexionDB().close();
            return "El movimineto de la cuenta " + movimiento.IdCuenta + " fue registrado correctamente.";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String modificarMovimiento(MovimientosModel movimiento){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE movimientos SET " +
          
                    "fechamovimiento = '" + movimiento.FechaMovimiento + "'," +
                    "tipomovimiento = '" + movimiento.TipoMovimiento + "'," +
                    "saldoanterior = '" + movimiento.SaldoAnterior + "'," +
                    "saldoactual = '" + movimiento.SaldoActual + "'," +
                    "montomovimiento = '" + movimiento.MontoMovimiento + "'," +
                    "cuentaorigen = '" + movimiento.CuentaOrigen + "'," +
                    "cuentadestino = '" + movimiento.CuentaDestino + "'," +
                    "canal = '" + movimiento.Canal + "'," +       
                            "' Where idmovimiento = " + movimiento.idmovimiento);
            conexion.conexionDB().close();
            return "Los datos de movimientode la cuenta  " + movimiento.idmovimiento + " fueron modificados correctamente.";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public MovimientosModel consultarMovimiento(int id){
        MovimientosModel movimiento = new MovimientosModel();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from movimientos where idmovimiento = " +  id));
            if(conexion.getResultadoQuery().next()){
            
                movimiento.setIdmovimiento(conexion.getResultadoQuery().getInt("idmovimiento"));
                movimiento.setFechaMovimiento(conexion.getResultadoQuery().getDate("FechaMovimiento"));
                movimiento.setTipoMovimiento(conexion.getResultadoQuery().getString("TipoMovimiento"));
                movimiento.setSaldoAnterior(conexion.getResultadoQuery().getFloat("SaldoAnterior"));
                movimiento.setSaldoActual(conexion.getResultadoQuery().getFloat("SaldoActual"));
                movimiento.setMontoMovimiento(conexion.getResultadoQuery().getFloat("MontoMovimiento"));
                movimiento.setCuentaOrigen(conexion.getResultadoQuery().getFloat("CuentaOrigen"));
                movimiento.setCuentaDestino(conexion.getResultadoQuery().getFloat("CuentaDestino"));
                movimiento.setCanal(conexion.getResultadoQuery().getFloat("Canal"));
                
                return movimiento;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    
}
