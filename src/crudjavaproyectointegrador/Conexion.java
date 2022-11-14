package crudjavaproyectointegrador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexion {
    Connection conexion;
    String driver ="com.mysql.cj.jdbc.Driver";
    String user = "root";
    String password = "";
    String url = "jdbc:mysql://localhost:3306/usuarios";
 
    public Conexion(){
        conexion = null;
        try{
           Class.forName(driver);
           conexion = DriverManager.getConnection(url,user,password);
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println(ex);
        }
    }
    
    public Connection getConexion(){
        return conexion;
    }
    
}
