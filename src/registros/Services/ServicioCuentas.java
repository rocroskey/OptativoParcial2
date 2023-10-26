
package registros.Services;

import registros.Infraestructura.Models.CuentasModel;
import registros.Infraestructura.DbManagment.Cuentas;



public class ServicioCuentas {
  
    Cuentas cuentabd;
    public ServicioCuentas(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        cuentabd = new Cuentas(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarCuenta(CuentasModel ciudad){
        if(validarDatos(ciudad)){
           return cuentabd.registrarCuenta(ciudad);
        }
        return "Se produjo un error";
    }

    public String modificarCuenta(CuentasModel cuenta){
        if(validarDatos(cuenta)){
            return cuentabd.modificarCuenta(cuenta);
        }
        return "Se produjo un error";
    }


    public CuentasModel consultarCuentaPorId(int id){
        return  cuentabd.consultarCuenta(id);
    }
    
    public String eliminarCCuenta(int idPersona) {
        cuentabd.eliminarCuenta(idPersona);
        return "Cuenta eliminada correctamente.";

} 
    

    private boolean validarDatos(CuentasModel Cuenta) {
        try {
        if(Cuenta.nrocuenta.trim().isEmpty())
            throw new Exception("Se requiere del numero de cuenta");


        

    } catch (Exception e) {
        throw new RuntimeException(e);
    }
        return true;
    }
    
}
