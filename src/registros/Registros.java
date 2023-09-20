
package registros;

import registros.Infraestructura.DbManagment.Ciudad;
import registros.Infraestructura.DbManagment.Cliente;
import registros.Infraestructura.DbManagment.Cuentas;
import registros.Infraestructura.DbManagment.Movimientos;
import registros.Infraestructura.DbManagment.Personas;
import registros.Infraestructura.Models.CiudadModel;
import registros.Infraestructura.Models.ClienteModel;
import java.util.Date;
import registros.Infraestructura.Models.CuentasModel;
import registros.Infraestructura.Models.MovimientosModel;
import registros.Infraestructura.Models.PersonaModel;


public class Registros {

    public static void main(String[] args) {
        Ciudad ciudadConnection = new Ciudad("postgres","091100","localhost","5432","Registros");
        Cliente clienteConnection = new Cliente("postgres","091100","localhost","5432","Registros");
        Cuentas cuentaConnection = new Cuentas("postgres","091100","localhost","5432","Registros");
        Movimientos movimientoConnection = new Movimientos("postgres","091100","localhost","5432","Registros");
        Personas personaConnection = new Personas("postgres","091100","localhost","5432","Registros");  
        
   
        
        
        
        
    //AGREGAR PERSONA
    /*    PersonaModel newPersona = new PersonaModel();
        
        newPersona.nombre= "Julio";
        newPersona.apellido ="silva";
        newPersona.tipodocumento ="CI";
        newPersona.numerodocumento = "2154876";
        newPersona.celular ="0985415263";
        newPersona.email="";
        
        personaConnection.registrarPersona(newPersona);**/
        
   
    //CONSULTAR PERSONA
       /* int id=5;
        PersonaModel Query =personaConnection.consultarPersona(id);
        
        System.out.println("Nombre: " + Query.getNombre());
        System.out.println("Apellido: " + Query.getApellido());
        System.out.println("Tipo Documento: "+Query.getTipoDocumento());
        System.out.println("Numero Documento: "+Query.getNumeroDocumento());
        System.out.println("Celular: "+Query.getCelular());
        
        personaConnection.consultarPersona(id);*/
        
        
    //AGREGAR CIUDAD
      /*  CiudadModel newCiudad = new CiudadModel();
        
        newCiudad.ciudad= "Villa Hayes";
        newCiudad.Departamento ="Presidente Hayes";
        newCiudad.Postal_Code = 2551;

        
        ciudadConnection.registrarCiudad(newCiudad);*/
    

    //CONSULTAR CIUDAD
       /* int idciu=4;
        CiudadModel Consulta =ciudadConnection.consultarCiudad(idciu);
        
        System.out.println("Ciudad: " + Consulta.getCiudad());
        System.out.println("Departamento: " + Consulta.getDepartamento());
        System.out.println("Postal: "+ (int) Consulta.getPostal_Code());
    */
    
      
    //AGREGAR CLIENTE
     /*ClienteModel newCliente = new ClienteModel();
        

        newCliente.fechaingreso=java.sql.Date.valueOf("2017-09-20");
        newCliente.calificacion ="Potencial";
        newCliente.estado ="Activo";
 

        
      clienteConnection.registrarCliente(newCliente);*/
    

    //CONSULTAR CLIENTE
        /*int idcl=1;
        ClienteModel Consulcl =clienteConnection.consultarCliente(idcl);
        
        System.out.println("ID: " + Consulcl.getIdcliente());
        System.out.println("Fecha de Ingreso: "+  Consulcl.getFecha_ingreso());
        System.out.println("Calificacion: " + Consulcl.getCalificacion());
        System.out.println("Estado: "+  Consulcl.getEstado());
    
    
            clienteConnection.consultarCliente(id);*/
    
    
    //AGREGAR CUENTA
       /* CuentasModel newCuenta = new CuentasModel();
        
        
        newCuenta.nrocuenta= "0025684";
        newCuenta.fechaalta=java.sql.Date.valueOf("2020-07-21");
        newCuenta.tipocuenta ="Ahorro";
        newCuenta.estado ="Activa";
        newCuenta.saldo = (float)2000;
        newCuenta.moneda ="USD"; 
        
        cuentaConnection.registrarCuenta(newCuenta);*/
        
    /*CONSULTAR CUENTA
        int idc=1;
        CuentasModel Consultac =cuentaConnection.consultarCuenta(idc);
        System.out.println("Cuenta Nro:  " + Consultac.getNroCuenta());
        System.out.println("Tipo de Cuenta:  " + Consultac.getTipoCuenta());
        System.out.println("Estado: " + Consultac.getEstado());
        System.out.println("Saldo: "+ (float) Consultac.getSaldo());
        System.out.println("Moneda: "+ Consultac.getMoneda());
    
    
        System.out.println("Finalizado");*/
    
    
    /*AGREGAR MOVIMIENTO
       MovimientosModel newMovimiento = new MovimientosModel();
        
        
        newMovimiento.IdCuenta= 1;
        newMovimiento.MontoMovimiento=100000;
        newMovimiento.FechaMovimiento =java.sql.Date.valueOf("2023-09-19");
        newMovimiento.CuentaDestino =(float)0;
        newMovimiento.CuentaOrigen = (float)2000;
        newMovimiento.TipoMovimiento ="Transaccional"; 
        newMovimiento.Canal =(float)0.5;
    
        
        movimientoConnection.registrarMovimiento(newMovimiento);*/

    /*CONSULTAR MOVIMIENTOS
    
            int idm=1;
        MovimientosModel Consultam =movimientoConnection.consultarMovimiento(idm);

        System.out.println("Tipo de movimiento:  " + Consultam.getTipoMovimiento());
        System.out.println("Monto: " + Consultam.getMontoMovimiento());
        System.out.println("Fecha: "+ Consultam.getFechaMovimiento());
        System.out.println("Destino: "+ Consultam.getCuentaDestino());
        System.out.println("Canal:  " + Consultam.getCanal());
        
        
        movimientoConnection.consultarMovimiento(idm);*/
            
    }
    
   
}
