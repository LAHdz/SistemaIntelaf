package com.l2ashdz.sistemaintelaf.dao.empleado;

import com.l2ashdz.sistemaintelaf.model.Conexion;
import com.l2ashdz.sistemaintelaf.model.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author asael
 */
public class EmpleadoDAOImpl implements EmpleadoDAO {

    private static EmpleadoDAOImpl empleadoDAO = null;
    private final Connection conexion = Conexion.getConexion();

    private EmpleadoDAOImpl() {
    }

    public static EmpleadoDAOImpl getEmpleadoDAO() {
        if (empleadoDAO == null) {
            empleadoDAO = new EmpleadoDAOImpl();
        }
        return empleadoDAO;
    }

    //Decuelve un listado de Empleados
    @Override
    public List<Empleado> getListado() {
        String sql = "SELECT * FROM empleado ORDER BY codigo";
        Statement declaracion = null;
        ResultSet rs = null;
        List<Empleado> empleados = null;

        try {
            declaracion = conexion.createStatement();
            rs = declaracion.executeQuery(sql);
            empleados = new ArrayList();

            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setCodigo(rs.getString("codigo"));
                empleado.setCUI(rs.getString("cui"));
                empleado.setNit(rs.getString("nit"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setCorreo(rs.getString("correo"));
                empleado.setDireccion(rs.getString("direccion"));
                empleado.setTelefono(rs.getString("telefono"));
                empleado.setEstado(rs.getInt("estado"));
                empleados.add(empleado);
            }
            System.out.println("Listado de Empleados Obtenido");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        } finally {
            try {
                rs.close();
                declaracion.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return empleados;
    }

    @Override
    public void create(Empleado e) {
        String sql = "INSERT INTO empleado (codigo, cui, nit, nombre, "
                + "correo, direccion, telefono) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, e.getCodigo());
            ps.setString(2, e.getCUI());
            ps.setString(3, e.getNit());
            ps.setString(4, e.getNombre());
            ps.setString(5, e.getCorreo());
            ps.setString(6, e.getDireccion());
            ps.setString(7, e.getTelefono());
            ps.executeUpdate();
            System.out.println("Empleado Ingresado Correctamente");
        } catch (SQLException ex) {
            System.out.println("No se inserto el empleado");
            ex.printStackTrace(System.out);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }

    @Override
    public Empleado getObject(String codigo) {
        String sql = "SELECT * FROM empleado WHERE codigo = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Empleado e = null;
        
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            while (rs.next()) {
                e = new Empleado();
                e.setCodigo(rs.getString("codigo"));
                e.setCUI(rs.getString("cui"));
                e.setNit(rs.getString("nit"));
                e.setNombre(rs.getString("nombre"));
                e.setCorreo(rs.getString("correo"));
                e.setDireccion(rs.getString("direccion"));
                e.setTelefono(rs.getString("telefono"));
                e.setEstado(rs.getInt("estado"));
            }
            System.out.println("Empleado obtenido de la BD");
        } catch (SQLException ex) {
            System.out.println("No se pudo leer el empleado");
            ex.printStackTrace();
        } finally {
            try {
                rs.close();
                ps.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return e;
    }

    @Override
    public void update(Empleado e) {
        String sql = "UPDATE empleado SET nombre = ?, cui = ?, nit = ?, direccion = ?,"
                + "telefono = ?, correo = ? WHERE codigo = ?";
        PreparedStatement ps = null;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getCUI());
            ps.setString(3, e.getNit());
            ps.setString(4, e.getDireccion());
            ps.setString(5, e.getTelefono());
            ps.setString(6, e.getCorreo());
            ps.setString(7, e.getCodigo());
            ps.executeUpdate();
            System.out.println("Empleado actualizado");
        } catch (SQLException ex) {
            System.out.println("No se actualizo el empleado");
            ex.printStackTrace(System.out);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void disableUser(String codigo) {
        try {
            String sql = "UPDATE empleado SET estado = ? WHERE codigo = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setString(2, codigo);
            ps.executeUpdate();
            System.out.println("Empleado deshabilitado");
            JOptionPane.showMessageDialog(null, "Empleado con Codigo: " + codigo
                    + " fue deshabilitado", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            ps.close();
            ps = null;
        } catch (SQLException ex) {
            System.out.println("No se deshabilito el empleado");
            ex.printStackTrace();
        }
    }

    @Override
    public List<Empleado> getFilteredList(String codigo, String nombre, int opcion) {
        String sql1 = "SELECT * FROM empleado WHERE codigo LIKE ? ORDER BY codigo";
        String sql2 = "SELECT * FROM empleado WHERE nombre LIKE ? ORDER BY codigo";
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Empleado> empleados = null;

        try {
            switch (opcion) {
                case 1:
                    ps = conexion.prepareStatement(sql1);
                    ps.setString(1, "%" + codigo + "%");
                    break;
                case 2:
                    ps = conexion.prepareStatement(sql2);
                    ps.setString(1, "%" + nombre + "%");
                    break;
            }
            rs = ps.executeQuery();
            empleados = new ArrayList();
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setCodigo(rs.getString("codigo"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setDireccion(rs.getString("direccion"));
                empleado.setCorreo(rs.getString("correo"));
                empleado.setCUI(rs.getString("cui"));
                empleado.setNit(rs.getString("nit"));
                empleado.setTelefono(rs.getString("telefono"));
                empleados.add(empleado);
            }
            System.out.println("Listado de empleados obtenido");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        } finally {
            try {
                rs.close();
                ps.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return empleados;
    }
}
