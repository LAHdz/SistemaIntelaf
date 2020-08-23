package com.l2ashdz.sistemaintelaf.controller.reportes;

import com.l2ashdz.sistemaintelaf.dao.pedido.PedidoDAO;
import com.l2ashdz.sistemaintelaf.dao.pedido.PedidoDAOImpl;
import com.l2ashdz.sistemaintelaf.model.Pedido;
import com.l2ashdz.sistemaintelaf.ui.PrincipalView;
import com.l2ashdz.sistemaintelaf.ui.reportes.ReportesPedido;
import com.l2ashdz.sistemaintelaf.ui.reportes.ReportesView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author asael
 */
public class ReportesController implements ActionListener, ItemListener {

    private ReportesView reportesV;

    private ReportesPedido reporte1 = new ReportesPedido();
    
    private List<Pedido> pedidos;
    private PedidoDAO pedidoDAO;

    private String tiendaActual;
    
    public ReportesController(ReportesView reportesV) {
        pedidoDAO = PedidoDAOImpl.getPedidoDAO();
        this.reportesV = reportesV;
        this.reportesV.getCbReportes().addItemListener(this);
    }

    public void iniciar(JPanel parent) {
        if (!reportesV.isEnabled()) {
            parent.removeAll();
            parent.repaint();
            reportesV.setSize(parent.getSize());
            reportesV.setEnabled(true);
            reportesV.setVisible(true);
            parent.add(reportesV);
            parent.validate();
            limpiarCampos();
        } else {
            System.out.println("ya esta visible");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void itemStateChanged(ItemEvent evt) {
        int state = evt.getStateChange();
        tiendaActual= PrincipalView.lblCodigo.getText();
        if (selccion(evt, 0, state)) {
            mostrarTabla(reportesV.getPnlTabla(), reporte1);
            pedidos = pedidoDAO.getPedidosEnRuta(tiendaActual);
            reporte1.getPedidoObservableList().clear();
            reporte1.getPedidoObservableList().addAll(pedidos);
            setEnableFiltros(false, false, false);
            
        } else if (selccion(evt, 1, state)) {
            mostrarTabla(reportesV.getPnlTabla(), reporte1);
            pedidos = pedidoDAO.getPedidosSinVerificar(tiendaActual);
            reporte1.getPedidoObservableList().clear();
            reporte1.getPedidoObservableList().addAll(pedidos);
            setEnableFiltros(false, false, false);
        
        } else if (selccion(evt, 2, state)) {
            mostrarTabla(reportesV.getPnlTabla(), reporte1);
            pedidos = pedidoDAO.getPedidosAtrasados(tiendaActual);
            reporte1.getPedidoObservableList().clear();
            reporte1.getPedidoObservableList().addAll(pedidos);
            setEnableFiltros(false, false, false);
        
        } else if (selccion(evt, 3, state)) {
            mostrarTabla(reportesV.getPnlTabla(), reporte1);
            pedidos = pedidoDAO.getPedidosOutOfHere(tiendaActual);
            reporte1.getPedidoObservableList().clear();
            reporte1.getPedidoObservableList().addAll(pedidos);
            setEnableFiltros(false, false, false);
        
        } else if (selccion(evt, 4, state)) {
            System.out.println("Reporte 5");
            setEnableFiltros(true, false, false);
            reportesV.getTxtNit().requestFocus();
        
        } else if (selccion(evt, 5, state)) {
            System.out.println("Reporte 6");
            setEnableFiltros(true, false, false);
            reportesV.getTxtNit().requestFocus();
        
        } else if (selccion(evt, 6, state)) {
            System.out.println("Reporte 7");
            setEnableFiltros(false, true, false);
        
        } else if (selccion(evt, 7, state)) {
            System.out.println("Reporte 8");
            setEnableFiltros(false, true, true);
        
        } else if (selccion(evt, 8, state)) {
            System.out.println("Reporte 9");
            setEnableFiltros(false, false, true);
            reportesV.getTxtCodTienda().requestFocus();
        }
        reportesV.getBtnExportar().setEnabled(true);
    }
    
    private void limpiarCampos() {
        reportesV.getTxtNit().setText("");
        reportesV.getTxtCodTienda().setText("");
        reportesV.getTxtFechaInicio().setDate(null);
        reportesV.getTxtFechaFinal().setDate(null);
        reportesV.getCbReportes().setSelectedIndex(-1);
        reportesV.getBtnCargarReporte().setEnabled(false);
        reportesV.getBtnExportar().setEnabled(false);
        reportesV.getPnlTabla().removeAll();
        reportesV.getPnlTabla().repaint();
    }

    private void setEnableFiltros(boolean nit, boolean fecha, boolean tienda) {
        reportesV.getTxtNit().setEditable(nit);
        reportesV.getTxtFechaInicio().setEnabled(fecha);
        reportesV.getTxtFechaFinal().setEnabled(fecha);
        reportesV.getTxtCodTienda().setEditable(tienda);
    }

    private boolean selccion(ItemEvent e, int index, int state) {
        return reportesV.getCbReportes().getItemAt(index) == e.getItem() && state == ItemEvent.SELECTED;
    }

    private void mostrarTabla(JPanel parent, JPanel reporte) {
        parent.removeAll();
        parent.repaint();
        reporte.setSize(parent.getSize());
        reporte.setEnabled(true);
        reporte.setVisible(true);
        parent.add(reporte);
        parent.validate();
    }
}