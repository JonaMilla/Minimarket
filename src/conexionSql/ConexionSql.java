package conexionSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSql {
    
    private static String URL = "jdbc:mysql://168.138.149.15:3306/minimarket";
    private static String Usuario = "proyecto_minimarket";
    private static String Contrasenia = "ProyectoMinimarket__//1";
//?useTimeZone=true&serverTimezone=UTC
    private static Connection conexion = null;
    
    public static Connection conectar() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, Usuario, Contrasenia);
            System.out.println("Conexión existosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e);
        }
        return conexion;
    }
    
   public void cerrarConexion(){
       try {
            conexion.close();
       } catch (SQLException ex) {
       }
   }
}
