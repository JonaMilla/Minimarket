package modelo;

import conexionSql.ConexionSql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VendedorDAO implements Crud <Vendedor>{
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
            System.out.println(e.getMessage());
        }
        return ve;
    }

    @Override
    public List listar() {
        List<Vendedor> lista = new ArrayList<>();
        String sql = "SELECT * FROM vendedor";
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
    public int add(Vendedor ven) {
        int c = 0;
        String sql = "INSERT INTO vendedor (Rut, Nombre, ApellidoPaterno, ApellidoMaterno"
                  + ",Telefono, Estado, User_2)"
                  + "VALUES (?,?,?,?,?,?,?)";
        try{
            conn = con.conectar();
            ps = conn.prepareStatement(sql);
            ps.setString(1, ven.getRut());
            ps.setString(2, ven.getNombre());
            ps.setString(3, ven.getApellidoP());
            ps.setString(4, ven.getApellidoM());
            ps.setString(5, ven.getTelefono());
            ps.setString(6, ven.getEstado());
            ps.setString(7, ven.getUser());
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
    public int actualizar(Vendedor ven) {
        int p = 0;
        String sql = "UPDATE vendedor SET Rut=?, Nombre=?,  "
                  + "ApellidoPaterno=?, ApellidoMaterno=?, Telefono=?, Estado=?, User_2=? "
                  + "WHERE IdVendedor =?";
        try {
            conn = con.conectar();
            ps = conn.prepareStatement(sql);
            ps.setString(1, ven.getRut());
            ps.setString(2, ven.getNombre());
            ps.setString(3, ven.getApellidoP());
            ps.setString(4, ven.getApellidoM());
            ps.setString(5, ven.getTelefono());
            ps.setString(6, ven.getEstado());
            ps.setString(7, ven.getUser());
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
