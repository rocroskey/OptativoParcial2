
package registros.Infraestructura.Conection;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexiones {
    
    private String userDB;
    private String passDB;
    private String portDB;
    private String hostDB;
    private String database;
    private String url;
    
    private Statement querySQL;
    private ResultSet resultQuery;
    
    public Conexiones (String userBD, String passDB, String hostDB, String portDB, String dataBase){
        this.userDB = userBD;
        this.passDB = passDB;
        this.portDB = portDB;
        this.database = dataBase;
        this.hostDB = hostDB;
        this.url = "jdbc:postgresql://" + this.hostDB + ":"+ this.portDB+"/"+database;
        
    }

    public Conexiones() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
     public Connection conexionDB() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexiones.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            return DriverManager.getConnection(this.url, this.userDB, this.passDB);
        } catch (SQLException ex) {
            Logger.getLogger(Conexiones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
     }
     
     
    public Statement getQuerySQL(){
        return this.querySQL;
    }

    public void setQuerySQL(Statement sentencia){
        this.querySQL = sentencia;
    }

    public ResultSet getResultadoQuery(){
        return this.resultQuery;
    }
    public void setResultadoQuery(ResultSet resultado){
        this.resultQuery = resultado;
    }
     
}