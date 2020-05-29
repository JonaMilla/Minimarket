package modelo;

import conexionSql.ConexionSql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VendedorDAO implements Crud{
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

    @Override
    public List listar() {
        List<Vendedor> lista = new ArrayList<>();
        String sql = "SELECT * FROM Vendedor";
        try{
        conn = con.conectar();
        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        while(rs.next()){
            Vendedor v = new Vendedor();
            v.setId(rs.getInt(1));           
            v.setRut(rs.getString(2));
            v.setNombre(rs.getString(3));
            v.setApellidoP(rs.getString(4));
            v.setApellidoM(rs.getString(5));
            v.setTelefono(rs.getString(6));
            v.setEstado(rs.getString(7));
            v.setUser(rs.getString(8));
            lista.add(v);
        }
        }
        catch(Exception e){
            
        }finally{
            con.cerrarConexion();
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int c = 0;
        String sql = "INSERT INTO Vendedor (Rut, Nombre, ApellidoPaterno, ApellidoMaterno"
                  + ",Telefono, Estado, User_2)"
                  + "VALUES (?,?,?,?,?,?,?)";
        try{
            conn = con.conectar();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            c = ps.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            con.cerrarConexion();
        }
        return c;
    }

    @Override
    public int actualizar(Object[] o) {
        int p = 0;
        String sql = "UPDATE Vendedor SET Rut=?, Nombre=?,  "
                  + "ApellidoPaterno=?, ApellidoMaterno=?, Telefono=?, Estado=?, User_2=? "
                  + "WHERE IdVendedor =?";
        try {
            conn = con.conectar();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            p = ps.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            con.cerrarConexion();
        }
        return p;
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM Vendedor WHERE IdVendedor = ?";
        try {
            conn = con.conectar();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }finally{
            con.cerrarConexion();
        }
    }  
}
