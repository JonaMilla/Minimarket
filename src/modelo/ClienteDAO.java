package modelo;

import conexionSql.ConexionSql;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClienteDAO implements Crud {

    Connection conn;
    ConexionSql con = new ConexionSql();
    PreparedStatement ps;
    ResultSet rs;

    
    @Override
    public List listar() {
        List <Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM Cliente";
        try {
            conn = con.conectar();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setRut(rs.getString(3));
                c.setApellidoP(rs.getString(4));
                c.setApellidoM(rs.getString(5));
                c.setDireccion(rs.getString(6));
                c.setEstado(rs.getString(7));
                lista.add(c);              
            }
        } catch(Exception e) { 
            System.out.println(e.getMessage());
        }finally{
            con.cerrarConexion();
        }
        return lista;
    }

    @Override
    public int add(Object [] o) {
        int r = 0;
        String sql = "INSERT INTO Cliente (NombreCliente,Rut,ApellidoPaterno"
                            + ",ApellidoMaterno,Direccion,Estado)  "
                            + "VALUES (?,?,?,?,?,?)";
        try {
            conn = con.conectar();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            con.cerrarConexion();
        }
        return r;
    }

    @Override
    public int actualizar(Object [] o) {
        int r = 0;
        String sql = "UPDATE Cliente SET NombreCliente=?, Rut=?, "
                  + "ApellidoPaterno=?, ApellidoMaterno=?, Direccion=?, Estado=? "
                  + "WHERE IdCliente =?";
        try {
            conn = con.conectar();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }finally{
            con.cerrarConexion();
        }
        return r;
                            
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM Cliente WHERE IdCliente = ?";
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
