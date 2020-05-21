package conexionSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSql {
    
    private static String URL = "jdbc:mysql://localhost:3307/minimarket?useTimeZone=true&serverTimezone=UTC";
    private static String Usuario = "root";
    private static String Contrasenia = "";

    public static Connection conectar() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, Usuario, Contrasenia);
            System.out.println("Conexión existosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e);
        }
        return conexion;
    }
}
