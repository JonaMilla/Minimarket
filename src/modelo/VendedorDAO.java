package modelo;

import conexionSql.ConexionSql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VendedorDAO {
    PreparedStatement ps;
    ResultSet rs;
    
    Vendedor ve = new Vendedor();
    ConexionSql con = new ConexionSql();
    Connection conn;
    
    public Vendedor ValidarInicioSesion(String rut, String user){
        String sql = "SELECT * FROM vendedor WHERE rut = ? and user_2 = ? ";
        try {
            conn = con.conectar();
            ps = conn.prepareStatement(sql);
            ps.setString(1, rut);
            ps.setString(2, user);
            rs = ps.executeQuery();
            while(rs.next()){
                ve.setId(rs.getInt(1));
                ve.setRut(rs.getString(2));
                ve.setNombre(rs.getString(3));
                ve.setApellidoP(rs.getString(4));
                ve.setApellidoM(rs.getString(5));
                ve.setTelefono(rs.getString(6));
                ve.setEstado(rs.getString(7));
                ve.setUser(rs.getString(8));
                
            }
        } catch (Exception e) {
        }
        return ve;
    }
}
