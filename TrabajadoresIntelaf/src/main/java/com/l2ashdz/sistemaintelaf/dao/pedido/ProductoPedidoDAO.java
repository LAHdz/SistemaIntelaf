package com.l2ashdz.sistemaintelaf.dao.pedido;

import com.l2ashdz.sistemaintelaf.dao.CRUD;
import com.l2ashdz.sistemaintelaf.model.ProductoPedido;
import java.util.List;

/**
 *
 * @author asael
 */
public interface ProductoPedidoDAO extends CRUD<ProductoPedido>{
    ProductoPedido getProductoInPedido(int codPedido, String codProducto);
    void deleteProductosDePedido(String codigoPedido);
    List<ProductoPedido> getProductosInPedido(int codP);
}
