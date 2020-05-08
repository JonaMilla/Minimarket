package conexionSql;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Metodos {

    private static Connection conexion;
    private static PreparedStatement ps;
    private static ResultSet rs;

    public void guardar_registro_usuario(String Rut, String Nombre, String ApellidoPaterno,
              String ApellidoMaterno, String Direccion, String Telefono, String Contrasena, String Correo, String TipoUsuario) {
              try {
                  conexion = ConexionSql.conectar();
                  String registro = "INSERT INTO administrador(Rut, Nombre, ApellidoPaterno, ApellidoMaterno, Direccion"
                            + ", Telefono, Contrasena, Correo, TipoUsuario)" + "VALUES (?,?,?,?,?,?,?,?,?)";
                  ps = conexion.prepareStatement(registro);
                  ps.setString(1, Rut);
                  ps.setString(2, Nombre);
                  ps.setString(3, ApellidoPaterno);
                  ps.setString(4, ApellidoMaterno);
                  ps.setString(5, Direccion);
                  ps.setString(6, Telefono);
                  ps.setString(7, Contrasena);
                  ps.setString(8, Correo);
                  ps.setString(9, TipoUsuario);
                  int i = ps.executeUpdate();
                  if (i > 0) {
                       JOptionPane.showMessageDialog(null, "Usuario guardado correctamente");
                  }else{
                      JOptionPane.showMessageDialog(null, "Error al guardar datos");
                  }
                  conexion.close();
                  
        } catch (HeadlessException | SQLException e) {
                  System.out.println("Error: " +e);
        } finally{
                  try {
                      conexion.close();
                  } catch (SQLException ex) {
                      System.out.println("Error: " +ex); 
                  }
 
              }
    }
}
