package com.l2ashdz.sistemaintelaf.clasesAuxiliares;

import com.l2ashdz.sistemaintelaf.dao.CRUD;
import com.l2ashdz.sistemaintelaf.dao.producto.ProductoDAOImpl;
import com.l2ashdz.sistemaintelaf.model.Cliente;
import com.l2ashdz.sistemaintelaf.model.Empleado;
import com.l2ashdz.sistemaintelaf.model.ExistenciaProducto;
import com.l2ashdz.sistemaintelaf.model.Pedido;
import com.l2ashdz.sistemaintelaf.model.Producto;
import com.l2ashdz.sistemaintelaf.model.ProductoPedido;
import com.l2ashdz.sistemaintelaf.model.ProductoVenta;
import com.l2ashdz.sistemaintelaf.model.TiempoTraslado;
import com.l2ashdz.sistemaintelaf.model.Tienda;
import com.l2ashdz.sistemaintelaf.model.Venta;
import java.time.LocalDate;

/**
 *
 * @author asael
 */
public class EntidadFabrica {

    public static Tienda nuevaTienda(String[] parametros) {
        Tienda tienda = new Tienda();
        tienda.setCodigo(parametros[3]);
        tienda.setNombre(parametros[1]);
        tienda.setDireccion(parametros[2]);
        tienda.setTelefono1(parametros[4]);
        return tienda;
    }

    public static Tienda nuevaTienda(String codigo, String nombre, String tel1, String dir,
            String tel2, String correo, String horario) {
        Tienda tienda = new Tienda();
        tienda.setCodigo(codigo);
        tienda.setNombre(nombre);
        tienda.setDireccion(dir);
        tienda.setTelefono1(tel1);
        tienda.setTelefono2(tel2.isEmpty() ? null : tel2);
        tienda.setCorreo(correo.isEmpty() ? null : correo);
        tienda.setHorario(horario.isEmpty() ? null : horario);
        return tienda;
    }

    public static TiempoTraslado nuevoTiempo(String[] parametros) {
        TiempoTraslado tiempoT = new TiempoTraslado();
        tiempoT.setCodigoT1(parametros[1]);
        tiempoT.setCodigoT2(parametros[2]);
        tiempoT.setTiempo(Integer.parseInt(parametros[3]));
        return tiempoT;
    }

    public static TiempoTraslado nuevoTiempo(String codT1, String codT2, int t) {
        TiempoTraslado tiempoT = new TiempoTraslado();
        tiempoT.setCodigoT1(codT1);
        tiempoT.setCodigoT2(codT2);
        tiempoT.setTiempo(t);
        return tiempoT;
    }

    public static Producto nuevoProducto(String[] parametros) {
        Producto producto = new Producto();
        producto.setCodigo(parametros[3]);
        producto.setNombre(parametros[1]);
        producto.setFabricante(parametros[2]);
        producto.setPrecio(Float.parseFloat(parametros[5]));
        return producto;
    }

    public static Producto nuevoProducto(String codigo, String nombre, String fabricante,
            String precio, String existencias, String descricpion, String garantia, String codT) {
        Producto producto = new Producto();
        producto.setCodigo(codigo);
        producto.setNombre(nombre);
        producto.setDescripcion(descricpion.isEmpty() ? null : descricpion);
        producto.setFabricante(fabricante);
        producto.setCodTienda(codT);
        producto.setPrecio(Float.parseFloat(precio));
        producto.setExistencias(Integer.parseInt(existencias));
        producto.setGarantiaMeses(garantia.isEmpty() ? 0 : Integer.parseInt(garantia));
        return producto;
    }

    public static ExistenciaProducto nuevaExistenciaProducto(String[] parametros) {
        ExistenciaProducto existenciaP = new ExistenciaProducto();
        existenciaP.setCodigoProducto(parametros[3]);
        existenciaP.setCodigoTienda(parametros[6]);
        existenciaP.setExistencias(Integer.parseInt(parametros[4]));
        return existenciaP;
    }

    public static ExistenciaProducto nuevaExistenciaProducto(String codT, String codP, String existencias) {
        ExistenciaProducto existencia = new ExistenciaProducto();
        existencia.setCodigoProducto(codP);
        existencia.setCodigoTienda(codT);
        existencia.setExistencias(Integer.parseInt(existencias));
        return existencia;
    }

    public static Cliente nuevoCliente(String[] parametros) {
        Cliente cliente = new Cliente();
        cliente.setNombre(parametros[1]);
        cliente.setNit(parametros[2]);
        cliente.setTelefono(parametros[3]);
        cliente.setCreditoCompra(Float.parseFloat(parametros[4]));
        return cliente;
    }

    public static Cliente nuevoCliente(String nit, String nombre, String cui, String direccion,
            String telefono, String correo) {
        Cliente cliente = new Cliente();
        cliente.setNit(nit);
        cliente.setNombre(nombre);
        cliente.setTelefono(telefono);
        cliente.setCui(cui.isEmpty() ? null : cui);
        cliente.setDireccion(direccion.isEmpty() ? null : direccion);
        cliente.setCorreo(correo.isEmpty() ? null : correo);
        return cliente;
    }

    public static Empleado nuevoEmpleado(String[] parametros) {
        Empleado empleado = new Empleado();
        empleado.setNombre(parametros[1]);
        empleado.setCodigo(parametros[2]);
        empleado.setTelefono(parametros[3]);
        empleado.setCui(parametros[4]);
        return empleado;
    }

    public static Empleado nuevoEmpleado(String codigo, String nombre, String cui,
            String nit, String correo, String direccion, String telefono) {
        Empleado empleado = new Empleado();
        empleado.setCodigo(codigo);
        empleado.setNombre(nombre);
        empleado.setCui(cui);
        empleado.setNit(nit.isEmpty() ? null : nit);
        empleado.setCorreo(correo);
        empleado.setTelefono(telefono);
        empleado.setDireccion(direccion);
        return empleado;
    }

    public static Pedido nuevoPedido(String[] parametros) {
        Float total = Float.parseFloat(parametros[8]);
        Float anticipo = Float.parseFloat(parametros[9]);

        Pedido pedido = new Pedido();
        pedido.setCodigo(Integer.parseInt(parametros[1]));
        pedido.setNitCliente(parametros[5]);
        pedido.setTiendaOrigen(parametros[2]);
        pedido.setTiendaDestino(parametros[3]);
        pedido.setFecha(LocalDate.parse(parametros[4]));
        pedido.setPorcentajePagado(anticipo);
        pedido.setPorcentajeEfectivo(1);
        pedido.setPorcentajeCredito(0);
        return pedido;
    }

    public static ProductoPedido nuevoProductoPedido(String[] parametros) {
        CRUD<Producto> productoDAO = ProductoDAOImpl.getProductoDAO();
        ProductoPedido productoP = new ProductoPedido();
        productoP.setCodigoPedido(Integer.parseInt(parametros[1]));
        productoP.setCodigo(parametros[6]);
        productoP.setCantidad(Integer.parseInt(parametros[7]));
        productoP.setPrecio(productoDAO.getObject(parametros[6]).getPrecio());
        return productoP;
    }

    public static Venta nuevaVenta(String nitCliente, String fecha, String pcredito,
            String pefectivo, String codTienda) {
        Venta venta = new Venta();
        venta.setCodTienda(codTienda);
        venta.setNitCliente(nitCliente);
        venta.setFecha(LocalDate.parse(fecha));
        venta.setPorcentCredito(Float.parseFloat(pcredito));
        venta.setPorcentEfectivo(Float.parseFloat(pefectivo));
        return venta;
    }

    public static ProductoVenta nuevoProductoVenta(String idVenta, String codP,
            String precio, String cantidad) {
        ProductoVenta pVenta = new ProductoVenta();
        pVenta.setIdVenta(Integer.parseInt(idVenta));
        pVenta.setCodigo(codP);
        pVenta.setPrecio(Float.parseFloat(precio));
        pVenta.setCantidad(Integer.parseInt(cantidad));
        return pVenta;
    }

    /**
     *
     * Cambiar la entidad fabrica por constructores en las clases
     *
     *
     */
}
