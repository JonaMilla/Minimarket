package modelo;

import conexionSql.ConexionSql;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClienteDAO implements Crud <Cliente> {

    Connection conn;
    ConexionSql con = new ConexionSql();
    PreparedStatement ps;
    ResultSet rs;

    
    @Override
    public List listar() {
        List <Cliente> datos = new ArrayList<>();
        String sql = "SELECT * FROM cliente";
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
                datos.add(c);              
            }
        } catch(Exception e) { 
            System.out.println(e.getMessage());
        }finally{
            con.cerrarConexion();
        }
        return datos;
    }

    @Override
    public int add(Cliente cli) {
        int r = 0;
        String sql = "INSERT INTO cliente (NombreCliente,Rut,ApellidoPaterno"
                            + ",ApellidoMaterno,Direccion,Estado)  "
                            + "VALUES (?,?,?,?,?,?)";
        try {
            conn = con.conectar();
            ps = conn.prepareStatement(sql);
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getRut() );
            ps.setString(3, cli.getApellidoP());
            ps.setString(4, cli.getApellidoM());
            ps.setString(5, cli.getDireccion());
            ps.setString(6, cli.getEstado());
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            con.cerrarConexion();
        }
        return r;
    }

    @Override
    public int actualizar(Cliente cli) {
        int r = 0;
        String sql = "UPDATE cliente SET NombreCliente=?, Rut=?, "
                  + "ApellidoPaterno=?, ApellidoMaterno=?, Direccion=?, Estado=? "
                  + "WHERE IdCliente =?";
        try {
            conn = con.conectar();
            ps = conn.prepareStatement(sql);
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getRut());
            ps.setString(3, cli.getApellidoP());
            ps.setString(4, cli.getApellidoM());
            ps.setString(5, cli.getDireccion());
            ps.setString(6, cli.getEstado());
            ps.setInt(7, cli.getId());
            r = ps.executeUpdate();
        } catch (Exception e) {
        }finally{
            con.cerrarConexion();
        }
        return r;
                            
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM cliente WHERE IdCliente = ?";
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
