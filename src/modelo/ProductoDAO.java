package modelo;

import conexionSql.ConexionSql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO implements Crud <Producto>{
    Connection conn;
    ConexionSql con;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT * FROM producto";
        try{
            conn = con.conectar();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Producto pro = new Producto();
                pro.setId(rs.getInt(1));
                pro.setNombre(rs.getString(2));
                pro.setPrecio(rs.getInt(3));
                pro.setStock(rs.getInt(4));
                pro.setEstado(rs.getString(5));
                lista.add(pro);
            }          
        }
        catch(Exception e){         
        }finally{
            con.cerrarConexion();
        }
        return listar();
    }

    @Override
    public int add(Producto pro) {
        int p = 0;
        String sql = "INSERT INTO producto (Nombre, Precio, Stock, Estado)"
                  + "VALUES (?,?,?,?) ";
        try{
            conn = con.conectar();
            ps = conn.prepareStatement(sql);
            ps.setString(1, pro.getNombre());
            ps.setInt(2, pro.getPrecio());
            ps.setInt(3, pro.getStock());
            ps.setString(4, pro.getEstado());
            p = ps.executeUpdate();
        }
        catch(Exception e){           
        }finally{
            con.cerrarConexion();
        }
          return p;        
    }

    @Override
    public int actualizar(Producto pro) {
        int p = 0;
        String sql = "UPDATE producto SET Nombre=?, Precio=?, Stock=?, Estado=?"
                  + "WHERE IdProducto=?";
        try{
            conn = con.conectar();
            ps = conn.prepareStatement(sql);
            ps.setString(1, pro.getNombre());
            ps.setInt(2, pro.getPrecio());
            ps.setInt(3, pro.getStock());
            ps.setString(4, pro.getEstado());
            ps.setInt(5, pro.getId());
            p = ps.executeUpdate();
        }
        catch(Exception e){
            
        }finally{
            con.cerrarConexion();
        }
        return p;
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM producto WHERE IdProducto";
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
