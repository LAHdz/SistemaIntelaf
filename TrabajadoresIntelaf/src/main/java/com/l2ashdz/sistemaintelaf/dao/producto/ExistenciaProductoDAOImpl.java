package com.l2ashdz.sistemaintelaf.dao.producto;

import com.l2ashdz.sistemaintelaf.model.Conexion;
import com.l2ashdz.sistemaintelaf.model.ExistenciaProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asael
 */
public class ExistenciaProductoDAOImpl implements ExistenciaProductoDAO {

    private static ExistenciaProductoDAOImpl existenciaDAO = null;
    private Connection conexion = Conexion.getConexion();

    private ExistenciaProductoDAOImpl() {
    }

    public static ExistenciaProductoDAOImpl getExistenciaDAO() {
        if (existenciaDAO == null) {
            existenciaDAO = new ExistenciaProductoDAOImpl();
        }
        return existenciaDAO;
    }

    @Override
    public List<ExistenciaProducto> getListado() {
        String sql = "SELECT * FROM existencia_producto";
        List<ExistenciaProducto> existencias = null;

        try (Statement declaracion = conexion.createStatement();
                ResultSet rs = declaracion.executeQuery(sql)) {
            existencias = new ArrayList();

            while (rs.next()) {
                ExistenciaProducto existencia = new ExistenciaProducto();
                existencia.setCodigoTienda(rs.getString("codigo_tienda"));
                existencia.setCodigoProducto(rs.getString("codigo_producto"));
                existencia.setExistencias(rs.getInt("existencias"));
                existencias.add(existencia);
            }
            System.out.println("Listado de existncias obtenido");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }
        return existencias;
    }

    @Override
    public void create(ExistenciaProducto e) {
        String sql = "INSERT INTO existencia_producto VALUES (?,?,?)";
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, e.getCodigoTienda());
            ps.setString(2, e.getCodigoProducto());
            ps.setInt(3, e.getExistencias());
            ps.executeUpdate();
            System.out.println("Existencia ingresado correctamente");
        } catch (SQLException ex) {
            System.out.println("No se inserto la existencia");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public ExistenciaProducto getObject(String t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ExistenciaProducto ep) {
        String sql = "UPDATE existencia_producto SET existencias = ? WHERE codigo_tienda = ? AND  codigo_producto = ?";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setInt(1, ep.getExistencias());
            ps.setString(2, ep.getCodigoTienda());
            ps.setString(3, ep.getCodigoProducto());
            ps.executeUpdate();
            System.out.println("Existencia actualizada");
        } catch (SQLException ex) {
            System.out.println("No se actualizo la existencia");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void delete(String t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExistenciaProducto getProductoInTienda(String codT, String codP) {
        String sql = "SELECT * FROM existencia_producto WHERE codigo_tienda = ? AND "
                + "codigo_producto = ?";
        ExistenciaProducto ep = null;
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, (String) codT);
            ps.setString(2, (String) codP);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    ep = new ExistenciaProducto();
                    ep.setCodigoTienda(rs.getString("codigo_tienda"));
                    ep.setCodigoProducto(rs.getString("codigo_producto"));
                    ep.setExistencias(rs.getInt("existencias"));
                }
            }
            System.out.println("Existencias obtenidas de la BD");
        } catch (SQLException ex) {
            System.out.println("No se pudo leer las existencias");
            ex.printStackTrace(System.out);
        }
        return ep;
    }

    @Override
    public int getExistencias(String codT, String codP) {
        String sql = "SELECT existencias FROM existencia_producto WHERE codigo_tienda = ? AND "
                + "codigo_producto = ?";
        int existencias = -1;
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, (String) codT);
            ps.setString(2, (String) codP);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    existencias = rs.getInt("existencias");
                }
            }
            System.out.println("Existencias obtenidas de la BD");
        } catch (SQLException ex) {
            System.out.println("No se pudo leer las existencias");
            ex.printStackTrace(System.out);
        }
        return existencias;
    }

    @Override
    public void restarExistencias(String codT, String codP, int existencias) {
        String sql = "UPDATE existencia_producto SET existencias = existencias - ? "
                + "WHERE codigo_tienda = ? AND  codigo_producto = ?";
        
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setInt(1, existencias);
            ps.setString(2, codT);
            ps.setString(3, codP);
            ps.executeUpdate();
            System.out.println("Se restaron las unidades vendidas");
        } catch (SQLException ex) {
            System.out.println("No se restaron las existencias");
            ex.printStackTrace(System.out);
        }
    }

}
