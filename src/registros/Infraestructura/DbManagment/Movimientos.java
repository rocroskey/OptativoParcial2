
package registros.Infraestructura.DbManagment;

import java.sql.SQLException;
import registros.Infraestructura.Conection.Conexiones;
import registros.Infraestructura.Models.MovimientosModelo;


public class Movimientos {
     
    private Conexiones conexion;

    public Movimientos (String userBD, String passDB, String hostDB, String portDB, String dataBase){
        conexion = new Conexiones(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarMovimiento(MovimientosModelo movimiento){

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
                    movimiento.getFechaMovimiento() + "', '" +
                    movimiento.getTipoMovimiento() + "', '" +
                    movimiento.getSaldoAnterior() + "', '" +
                    movimiento.getSaldoActual() + "', '" +
                    movimiento.getMontoMovimiento() + "', '" +
                    movimiento.getCuentaOrigen() + "', '" +
                    movimiento.getCuentaDestino() + "', '" +
                    movimiento.getCanal() + "')");
            conexion.conexionDB().close();
            return "El movimineto de la cuenta " + movimiento.getIdCuenta() + " fue registrado correctamente.";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String modificarMovimiento(MovimientosModelo movimiento){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE movimientos SET " +
          
                    "fechamovimiento = '" + movimiento.getFechaMovimiento() + "'," +
                    "tipomovimiento = '" + movimiento.getTipoMovimiento() + "'," +
                    "saldoanterior = '" + movimiento.getSaldoAnterior() + "'," +
                    "saldoactual = '" + movimiento.getSaldoActual() + "'," +
                    "montomovimiento = '" + movimiento.getMontoMovimiento() + "'," +
                    "cuentaorigen = '" + movimiento.getCuentaOrigen() + "'," +
                    "cuentadestino = '" + movimiento.getCuentaDestino()+ "'," +
                    "canal = '" + movimiento.getCanal() + "'," +       
                            "' Where idmovimiento = " + movimiento.getIdmovimiento());
            conexion.conexionDB().close();
            return "Los datos de movimientode la cuenta  " + movimiento.getIdmovimiento() + " fueron modificados correctamente.";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public MovimientosModelo consultarMovimiento(int id){
        MovimientosModelo movimiento = new MovimientosModelo();
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
