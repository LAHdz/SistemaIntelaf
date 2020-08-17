package com.l2ashdz.sistemaintelaf.clasesAuxiliares;

import static com.l2ashdz.sistemaintelaf.clasesAuxiliares.Verificaciones.isInt;
import static com.l2ashdz.sistemaintelaf.clasesAuxiliares.Verificaciones.isFloat;
import static com.l2ashdz.sistemaintelaf.clasesAuxiliares.Verificaciones.isMayorACero;
import com.l2ashdz.sistemaintelaf.dao.CRUD;
import com.l2ashdz.sistemaintelaf.dao.cliente.ClienteDAOImpl;
import com.l2ashdz.sistemaintelaf.dao.empleado.EmpleadoDAOImpl;
import com.l2ashdz.sistemaintelaf.dao.producto.ExistenciaProductoDAO;
import com.l2ashdz.sistemaintelaf.dao.producto.ExistenciaProductoDAOImpl;
import com.l2ashdz.sistemaintelaf.dao.tienda.TiendaDAOImpl;
import com.l2ashdz.sistemaintelaf.excepciones.UserInputException;
import com.l2ashdz.sistemaintelaf.model.Cliente;
import com.l2ashdz.sistemaintelaf.model.Empleado;
import com.l2ashdz.sistemaintelaf.model.Tienda;

/**
 *
 * @author asael
 */
public class ValidacionesInterfaz {

    private static CRUD<Tienda> tiendaDAO = TiendaDAOImpl.getTiendaDAO();
    private static ExistenciaProductoDAO existenciaDAO = ExistenciaProductoDAOImpl.getExistenciaDAO();
    private static CRUD<Cliente> clienteDAO = ClienteDAOImpl.getClienteDAO();
    private static CRUD<Empleado> empleadoDAO = EmpleadoDAOImpl.getEmpleadoDAO();

    public static boolean validarAddTienda(String codigo, String nombre, String direccion,
            String tel1) throws UserInputException {

        boolean flag = true;
        if (nombre.isEmpty() || codigo.isEmpty() || tel1.isEmpty() || direccion.isEmpty()) {
            flag = false;
            throw new UserInputException("Los datos con * son obligatorios");
        } else if (tiendaDAO.getObject(codigo) != null) {
            flag = false;
            throw new UserInputException("La tienda ya existe en el sistema");
        }
        return flag;
    }

    public static boolean validarUpdateTienda(String nombre, String direccion, String tel1) throws UserInputException {

        boolean flag = true;
        if (nombre.isEmpty() || tel1.isEmpty() || direccion.isEmpty()) {
            flag = false;
            throw new UserInputException("Los datos con * son obligatorios");
        }
        return flag;
    }

    public static boolean validarUpdateTiempo(String tiempo) throws UserInputException {

        boolean flag = true;
        if (tiempo.isEmpty()) {
            flag = false;
            throw new UserInputException("Debe ingresar un tiempo");
        } else if (!isInt(tiempo)) {
            flag = false;
            throw new UserInputException("El tiempo debe ser un valor numerico");
        }
        return flag;
    }

    public static boolean validarAddProducto(String cod, String name, String fabricante,
            String existencias, String precio, String garantia, String codTienda)
            throws UserInputException {

        boolean flag = true;
        if (cod.isEmpty() || name.isEmpty() || fabricante.isEmpty() || precio.isEmpty()
                || existencias.isEmpty()) {
            flag = false;
            throw new UserInputException("Los datos con * son obligatorios");
        } else if (!isInt(existencias)) {
            flag = false;
            throw new UserInputException("Las existencias deben ser un numero entero");
        } else if (Integer.parseInt(existencias) < 0) {
            flag = false;
            throw new UserInputException("Las existecias no pueden ser menores a cero");
        } else if (!isFloat(precio)) {
            flag = false;
            throw new UserInputException("El precio debe ser un dato numerico");
        } else if (!isMayorACero(precio)) {
            flag = false;
            throw new UserInputException("El precio no puede ser menor o igual a cero");
        } else if (!garantia.isEmpty() && !isInt(garantia)) {
            flag = false;
            throw new UserInputException("La garantia debe ser un dato numerico");
        } else if (existenciaDAO.getProductoInTienda(codTienda, cod) != null) {
            flag = false;
            throw new UserInputException("El producto ya existe en la tienda actual");
        }
        return flag;
    }

    public static boolean validarUpdateProducto(String name, String fabricante,
            String existencias, String precio, String garantia)
            throws UserInputException {

        boolean flag = true;
        if (name.isEmpty() || fabricante.isEmpty() || precio.isEmpty()
                || existencias.isEmpty()) {
            flag = false;
            throw new UserInputException("Los datos con * son obligatorios");
        } else if (!isInt(existencias)) {
            flag = false;
            throw new UserInputException("Las existencias deben ser un numero entero");
        } else if (Integer.parseInt(existencias) < 0) {
            flag = false;
            throw new UserInputException("Las existecias no pueden ser menores a cero");
        } else if (!isFloat(precio)) {
            flag = false;
            throw new UserInputException("El precio debe ser un dato numerico");
        } else if (!isMayorACero(precio)) {
            flag = false;
            throw new UserInputException("El precio no puede ser menor o igual a cero");
        } else if (!garantia.isEmpty() && !isInt(garantia)) {
            flag = false;
            throw new UserInputException("La garantia debe ser un dato numerico");
        }
        return flag;
    }

    public static boolean validarAddEmpleado(String codigo, String nombre, String cui,
            String direccion, String telefono, String correo) throws UserInputException {
        boolean flag = true;
        if (codigo.isEmpty() || nombre.isEmpty() || cui.isEmpty() || correo.isEmpty()
                || direccion.isEmpty() || telefono.isEmpty()) {
            flag = false;
            throw new UserInputException("Los datos con * son obligatorios");
        } else if (empleadoDAO.getObject(codigo) != null) {
            flag = false;
            throw new UserInputException("El empleado ya existe en el sistema");
        }
        return flag;
    }

    public static boolean validarUpdateEmpleado(String nombre, String cui, String direccion,
            String telefono, String correo) throws UserInputException {
        boolean flag = true;
        if (nombre.isEmpty() || cui.isEmpty() || direccion.isEmpty()
                || telefono.isEmpty() || correo.isEmpty()) {
            flag = false;
            throw new UserInputException("Los datos con * son obligatorios");
        }
        return flag;
    }

    public static void validarAddCliente(String nombre, String nit, String telefono) throws UserInputException {
        if (nombre.isEmpty() || nit.isEmpty() || telefono.isEmpty()) {
            throw new UserInputException("Los campos con * son obligatorios");
        } else if (clienteDAO.getObject(nit) != null) {
            throw new UserInputException("El cliente ya existe en el sistema");
        }
    }
    
    public static void validarUpdateCliente(String nombre, String telefono) throws UserInputException{
        if (nombre.isEmpty() || telefono.isEmpty()) {
            throw new UserInputException("Los campos con * son obligatorios");
        }
    }
}
