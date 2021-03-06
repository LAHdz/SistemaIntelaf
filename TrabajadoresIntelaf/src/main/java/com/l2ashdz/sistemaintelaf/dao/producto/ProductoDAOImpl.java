package com.l2ashdz.sistemaintelaf.dao.producto;

import com.l2ashdz.sistemaintelaf.model.Conexion;
import com.l2ashdz.sistemaintelaf.model.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asael
 */
public class ProductoDAOImpl implements ProductoDAO {

    private static ProductoDAOImpl productoDAO = null;
    private Connection conexion = Conexion.getConexion();

    private ProductoDAOImpl() {
    }

    public static ProductoDAOImpl getProductoDAO() {
        if (productoDAO == null) {
            productoDAO = new ProductoDAOImpl();
        }
        return productoDAO;
    }

    @Override
    public List<Producto> getListado() {
        String sql = "SELECT p.*, e.codigo_tienda, e.existencias FROM producto p "
                + "INNER JOIN existencia_producto e ON p.codigo=e.codigo_producto";
        List<Producto> productos = null;

        try (Statement declaracion = conexion.createStatement();
                ResultSet rs = declaracion.executeQuery(sql)) {
            productos = new ArrayList();

            while (rs.next()) {
                Producto producto = new Producto();
                producto.setCodigo(rs.getString("codigo"));
                producto.setNombre(rs.getString("nombre"));
                producto.setFabricante(rs.getString("fabricante"));
                producto.setPrecio(rs.getFloat("precio"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setGarantiaMeses(rs.getInt("garantia_meses"));
                producto.setCodTienda(rs.getString("codigo_tienda"));
                producto.setExistencias(rs.getInt("existencias"));
                productos.add(producto);
            }
            System.out.println("Listado de productos obtenido");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }
        return productos;
    }

    @Override
    public void create(Producto p) {
        String sql = "INSERT INTO producto VALUES (?,?,?,?,?,?)";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, p.getCodigo());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getFabricante());
            ps.setFloat(4, p.getPrecio());
            ps.setString(5, p.getDescripcion());
            ps.setInt(6, p.getGarantiaMeses());
            ps.executeUpdate();
            System.out.println("Producto ingresado correctamente");
        } catch (SQLException ex) {
            System.out.println("No se inserto el producto");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public Producto getObject(String codigo) {
        String sql = "SELECT * FROM producto WHERE codigo = ?";
        Producto p = null;

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, codigo);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    p = new Producto();
                    p.setCodigo(rs.getString("codigo"));
                    p.setNombre(rs.getString("nombre"));
                    p.setFabricante(rs.getString("fabricante"));
                    p.setPrecio(rs.getFloat("precio"));
                    p.setDescripcion(rs.getString("descripcion"));
                    p.setGarantiaMeses(rs.getInt("garantia_meses"));
                }
            }
            System.out.println("Producto obtenido de la BD");
        } catch (SQLException ex) {
            System.out.println("No se pudo leer el producto");
            ex.printStackTrace(System.out);
        }
        return p;
    }

    @Override
    public void update(Producto p) {
        String sql = "UPDATE producto SET nombre = ?, fabricante = ?, descripcion = ?,"
                + " precio = ?, garantia_meses = ? WHERE codigo = ?";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getFabricante());
            ps.setString(3, p.getDescripcion());
            ps.setFloat(4, p.getPrecio());
            ps.setInt(5, p.getGarantiaMeses());
            ps.setString(6, p.getCodigo());
            ps.executeUpdate();
            System.out.println("Producto actualizado");
        } catch (SQLException ex) {
            System.out.println("No se actualizo el producto");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void delete(String t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> getFilteredList(String filtro, int opcion) {
        String sql = "SELECT p.*, e.codigo_tienda, e.existencias FROM producto p "
                + "INNER JOIN existencia_producto e ON p.codigo=e.codigo_producto "
                + "WHERE ";
        String order = "ORDER BY p.codigo";
        PreparedStatement ps = null;
        List<Producto> productos = null;

        try {
            switch (opcion) {
                case 1:
                    ps = conexion.prepareStatement(sql + "p.codigo LIKE ? " + order);
                    ps.setString(1, "%" + filtro + "%");
                    break;
                case 2:
                    ps = conexion.prepareStatement(sql + "p.nombre LIKE ? " + order);
                    ps.setString(1, "%" + filtro + "%");
                    break;
                case 3:
                    ps = conexion.prepareStatement(sql + "e.codigo_tienda LIKE ? " + order);
                    ps.setString(1, "%" + filtro + "%");
                    break;
                case 4:
                    ps = conexion.prepareStatement(sql + "e.codigo_tienda = ? " + order);
                    ps.setString(1, filtro);
                    break;
                case 5:
                    ps = conexion.prepareStatement(sql + "e.codigo_tienda = ? AND e.existencias > 0 " + order);
                    ps.setString(1, filtro);

            }
            try (ResultSet rs = ps.executeQuery()) {
                productos = new ArrayList();
                while (rs.next()) {
                    Producto producto = new Producto();
                    producto.setCodigo(rs.getString("codigo"));
                    producto.setNombre(rs.getString("nombre"));
                    producto.setFabricante(rs.getString("fabricante"));
                    producto.setPrecio(rs.getFloat("precio"));
                    producto.setExistencias(rs.getInt("existencias"));
                    producto.setDescripcion(rs.getString("descripcion"));
                    producto.setGarantiaMeses(rs.getInt("garantia_meses"));
                    producto.setCodTienda(rs.getString("codigo_tienda"));
                    productos.add(producto);
                }
            }
            System.out.println("Listado de productos obtenido");
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return productos;
    }

    @Override
    public Producto getProducto(String codT, String codP) {
        String sql = "SELECT p.*, e.codigo_tienda, e.existencias FROM producto p "
                + "INNER JOIN existencia_producto e ON p.codigo=e.codigo_producto "
                + "WHERE e.codigo_tienda = ? AND p.codigo = ?";
        Producto p = null;

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, codT);
            ps.setString(2, codP);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    p = new Producto();
                    p.setCodigo(rs.getString("codigo"));
                    p.setNombre(rs.getString("nombre"));
                    p.setFabricante(rs.getString("fabricante"));
                    p.setPrecio(rs.getFloat("precio"));
                    p.setDescripcion(rs.getString("descripcion"));
                    p.setGarantiaMeses(rs.getInt("garantia_meses"));
                    p.setExistencias(rs.getInt("existencias"));
                    p.setCodTienda(rs.getString("codigo_tienda"));
                }
            }
            System.out.println("Producto obtenido de la BD");
        } catch (SQLException ex) {
            System.out.println("No se pudo leer el producto");
            ex.printStackTrace(System.out);
        }
        return p;
    }

    @Override
    public List<Producto> getMostSelledProducts(LocalDate fechaInicial, LocalDate fechaFinal, int opcion) {
        String sql = "SELECT p.*, COUNT(pv.codigo_producto) cantVentas FROM venta v INNER JOIN "
                + "producto_venta pv ON v.id=pv.id_venta INNER JOIN producto p ON "
                + "pv.codigo_producto=p.codigo ";
        String where = "WHERE v.fecha BETWEEN ? AND ? ";
        String order = "GROUP BY pv.codigo_producto ORDER BY cantVentas DESC LIMIT 10";
        PreparedStatement ps = null;
        List<Producto> productos = null;

        try {
            switch (opcion) {
                case 1:
                    ps = conexion.prepareStatement(sql + where + order);
                    ps.setString(1, fechaInicial.toString());
                    ps.setString(2, fechaFinal.toString());
                    break;
                case 2:
                    ps = conexion.prepareStatement(sql + order);
                    break;
            }

            try (ResultSet rs = ps.executeQuery()) {
                productos = new ArrayList();

                while (rs.next()) {
                    Producto producto = new Producto();
                    producto.setCodigo(rs.getString("codigo"));
                    producto.setNombre(rs.getString("nombre"));
                    producto.setFabricante(rs.getString("fabricante"));
                    producto.setPrecio(rs.getFloat("precio"));
                    producto.setDescripcion(rs.getString("descripcion"));
                    producto.setGarantiaMeses(rs.getInt("garantia_meses"));
                    producto.setCantVentas(rs.getInt("cantVentas"));
                    productos.add(producto);
                }
            }
            System.out.println("Listado de productos obtenido");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }
        return productos;
    }

    @Override
    public List<Producto> getMostSelledProdPorTienda(String codT, LocalDate fechaInicial, LocalDate fechaFinal, int opcion) {
        String sql = "SELECT p.*, COUNT(pv.codigo_producto) cantVentas FROM venta v INNER JOIN "
                + "producto_venta pv ON v.id=pv.id_venta INNER JOIN producto p ON "
                + "pv.codigo_producto=p.codigo WHERE v.codigo_tienda = ?";
        String intervalo = "AND v.fecha BETWEEN ? AND ? ";
        String order = " GROUP BY pv.codigo_producto ORDER BY cantVentas DESC";
        PreparedStatement ps = null;
        List<Producto> productos = null;

        try {
            switch (opcion) {
                case 1:
                    ps = conexion.prepareStatement(sql + intervalo + order);
                    ps.setString(1, codT);
                    ps.setString(2, fechaInicial.toString());
                    ps.setString(3, fechaFinal.toString());
                    break;
                case 2:
                    ps = conexion.prepareStatement(sql + order);
                    ps.setString(1, codT);
                    break;
            }

            try (ResultSet rs = ps.executeQuery()) {
                productos = new ArrayList();

                while (rs.next()) {
                    Producto producto = new Producto();
                    producto.setCodigo(rs.getString("codigo"));
                    producto.setNombre(rs.getString("nombre"));
                    producto.setFabricante(rs.getString("fabricante"));
                    producto.setPrecio(rs.getFloat("precio"));
                    producto.setDescripcion(rs.getString("descripcion"));
                    producto.setGarantiaMeses(rs.getInt("garantia_meses"));
                    producto.setCantVentas(rs.getInt("cantVentas"));
                    productos.add(producto);
                }
            }
            System.out.println("Listado de productos obtenido");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }
        return productos;
    }

    @Override
    public List<Producto> getProductosSinVentas(String codTienda) {
        String sql = "SELECT p.*, e.existencias, e.codigo_tienda FROM producto p "
                + "LEFT JOIN producto_venta pv ON p.codigo=pv.codigo_producto INNER JOIN "
                + "existencia_producto e ON p.codigo=e.codigo_producto WHERE e.codigo_tienda = ? "
                + "AND pv.id_venta IS NULL";
        List<Producto> productos = null;

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, codTienda);
            try (ResultSet rs = ps.executeQuery()) {
                productos = new ArrayList();
                while (rs.next()) {
                    Producto producto = new Producto();
                    producto.setCodigo(rs.getString("codigo"));
                    producto.setNombre(rs.getString("nombre"));
                    producto.setFabricante(rs.getString("fabricante"));
                    producto.setPrecio(rs.getFloat("precio"));
                    producto.setDescripcion(rs.getString("descripcion"));
                    producto.setGarantiaMeses(rs.getInt("garantia_meses"));
                    productos.add(producto);
                }
            }
            System.out.println("Listado de productos obtenido");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }
        return productos;
    }

    @Override
    public List<Producto> getFilteredList(String codigo, String nombre, String fabricante, int opcion) {
        String sql = "SELECT p.*, e.codigo_tienda, e.existencias FROM producto p "
                + "INNER JOIN existencia_producto e ON p.codigo=e.codigo_producto ";
        String order = "ORDER BY p.codigo";
        String filtro;
        PreparedStatement ps = null;
        List<Producto> productos = null;

        try {
            switch (opcion) {
                case 1:
                    filtro = "WHERE p.codigo LIKE ? AND p.nombre LIKE ? AND p.fabricante LIKE ? ";
                    ps = conexion.prepareStatement(sql + filtro + order);
                    ps.setString(1, "%" + codigo + "%");
                    ps.setString(2, "%" + nombre + "%");
                    ps.setString(3, "%" + fabricante + "%");
                    break;
                case 2:
                    filtro = "WHERE p.codigo LIKE ? AND p.fabricante LIKE ? ";
                    ps = conexion.prepareStatement(sql + filtro + order);
                    ps.setString(1, "%" + codigo + "%");
                    ps.setString(2, "%" + fabricante + "%");
                    break;
                case 3:
                    filtro = "WHERE p.fabricante LIKE ? AND p.nombre LIKE ? ";
                    ps = conexion.prepareStatement(sql + filtro + order);
                    ps.setString(1, "%" + fabricante + "%");
                    ps.setString(2, "%" + nombre + "%");
                    break;
                case 4:
                    filtro = "WHERE p.codigo LIKE ? AND p.nombre LIKE ? ";
                    ps = conexion.prepareStatement(sql + filtro + order);
                    ps.setString(1, "%" + codigo + "%");
                    ps.setString(2, "%" + nombre + "%");
                    break;
                case 5:
                    filtro = "WHERE p.codigo LIKE ? ";
                    ps = conexion.prepareStatement(sql + filtro + order);
                    ps.setString(1, "%" + codigo + "%");
                    break;
                case 6:
                    filtro = "WHERE p.fabricante LIKE ? ";
                    ps = conexion.prepareStatement(sql + filtro + order);
                    ps.setString(1, "%" + fabricante + "%");
                    break;
                case 7:
                    filtro = "WHERE p.nombre LIKE ? ";
                    ps = conexion.prepareStatement(sql + filtro + order);
                    ps.setString(1, "%" + nombre + "%");
                    break;
                case 8:
                    ps = conexion.prepareStatement(sql + order);

            }
            try (ResultSet rs = ps.executeQuery()) {
                productos = new ArrayList();
                while (rs.next()) {
                    Producto producto = new Producto();
                    producto.setCodigo(rs.getString("codigo"));
                    producto.setNombre(rs.getString("nombre"));
                    producto.setFabricante(rs.getString("fabricante"));
                    producto.setPrecio(rs.getFloat("precio"));
                    producto.setExistencias(rs.getInt("existencias"));
                    producto.setDescripcion(rs.getString("descripcion"));
                    producto.setGarantiaMeses(rs.getInt("garantia_meses"));
                    producto.setCodTienda(rs.getString("codigo_tienda"));
                    productos.add(producto);
                }
            }
            System.out.println("Listado de productos obtenido");
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return productos;
    }

}
