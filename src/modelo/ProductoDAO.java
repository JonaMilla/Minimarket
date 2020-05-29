package modelo;

import conexionSql.ConexionSql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO implements Crud{
    Connection conn;
    ConexionSql con;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT * FROM Producto";
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
    public int add(Object[] o) {
        int p = 0;
        String sql = "INSERT INTO Producto (Nombre, Precio, Stock, Estado)"
                  + "VALUES (?,?,?,?) ";
        try{
            conn = con.conectar();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            p = ps.executeUpdate();
        }
        catch(Exception e){           
        }finally{
            con.cerrarConexion();
        }
          return p;        
    }

    @Override
    public int actualizar(Object[] o) {
        int p = 0;
        String sql = "UPDATE Producto SET Nombre=?, Precio=?, Stock=?, Estado=?"
                  + "WHERE IdProducto=?";
        try{
            conn = con.conectar();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
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
        String sql = "DELETE FROM Producto WHERE IdProducto";
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
