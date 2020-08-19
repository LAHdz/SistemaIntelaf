/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.l2ashdz.sistemaintelaf.ui.venta;

import com.l2ashdz.sistemaintelaf.model.Producto;
import com.l2ashdz.sistemaintelaf.model.ProductoVenta;
import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.observablecollections.ObservableList;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author asael
 */
public class AddVentaView extends javax.swing.JPanel {

    private List<ProductoVenta> prodVentaList;
    private ObservableList<ProductoVenta> prodVentaObservableList;
    private List<Producto> productosList;
    private ObservableList<Producto> productosObservableList;

    /**
     * Creates new form AddVentaView
     */
    public AddVentaView() {
        prodVentaList = new ArrayList();
        prodVentaObservableList = ObservableCollections.observableList(prodVentaList);
        productosList = new ArrayList();
        productosObservableList = ObservableCollections.observableList(productosList);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAddProducto = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductosVenta = new javax.swing.JTable();
        btnFinalizar = new javax.swing.JButton();
        txtPorcentEfectivo = new javax.swing.JFormattedTextField();
        cbBusquedaProducto = new javax.swing.JComboBox<>();
        txtTelefono = new javax.swing.JFormattedTextField();
        txtCUI = new javax.swing.JFormattedTextField();
        lblCreditoCompra = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtPorcentCredito = new javax.swing.JFormattedTextField();
        txtCredito = new javax.swing.JFormattedTextField();
        txtEfectivo = new javax.swing.JFormattedTextField();
        btnEliminarP = new javax.swing.JButton();
        btnCambiarCant = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(39, 44, 52));
        setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("*Nit");

        txtNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNitKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("*Nombre");

        txtNombre.setEditable(false);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("*Telefono");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Direccion");

        txtDireccion.setEditable(false);
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CUI");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo");

        txtCorreo.setEditable(false);
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha");

        txtFecha.setDateFormatString("yyyy-MM-dd");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("*Efectivo:");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("*Credito:");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("El cliente cuenta con un credito de compra disponible de: Q.");

        btnAddProducto.setText("Agregar producto");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("%");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Q");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("%");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Q");

        tblProductosVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblProductosVenta.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${prodVentaObservableList}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, tblProductosVenta);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fabricante}"));
        columnBinding.setColumnName("Fabricante");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${precio}"));
        columnBinding.setColumnName("Precio");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cantidad}"));
        columnBinding.setColumnName("Cantidad");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${subtotal}"));
        columnBinding.setColumnName("Subtotal");
        columnBinding.setColumnClass(Float.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(tblProductosVenta);

        btnFinalizar.setText("Finalizar venta");

        txtPorcentEfectivo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPorcentEfectivo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPorcentEfectivo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPorcentEfectivoFocusLost(evt);
            }
        });

        AutoCompleteDecorator.decorate(cbBusquedaProducto);
        cbBusquedaProducto.setEditable(true);

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${productosObservableList}");
        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, cbBusquedaProducto);
        bindingGroup.addBinding(jComboBoxBinding);

        txtTelefono.setEditable(false);
        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtCUI.setEditable(false);
        try {
            txtCUI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCUI.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblCreditoCompra.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCreditoCompra.setForeground(new java.awt.Color(255, 255, 255));
        lblCreditoCompra.setText("####");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Total de la venta Q.");

        lblTotal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("####");

        txtPorcentCredito.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPorcentCredito.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPorcentCredito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPorcentCreditoFocusLost(evt);
            }
        });

        txtCredito.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtCredito.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCredito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCreditoFocusLost(evt);
            }
        });

        txtEfectivo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtEfectivo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtEfectivo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEfectivoFocusLost(evt);
            }
        });

        btnEliminarP.setText("Eliminar producto");
        btnEliminarP.setEnabled(false);

        btnCambiarCant.setText("Cambiar cantidad");
        btnCambiarCant.setEnabled(false);

        btnLimpiar.setText("Limpiar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCreditoCompra)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPorcentEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPorcentCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNit)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtCUI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                    .addComponent(txtDireccion)
                                    .addComponent(txtCorreo)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(37, 37, 37)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTotal)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnEliminarP, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(btnCambiarCant, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(cbBusquedaProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddProducto)))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblCreditoCompra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBusquedaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddProducto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCambiarCant)
                    .addComponent(btnEliminarP)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(lblTotal))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnFinalizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(txtPorcentCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(txtPorcentEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitKeyTyped
        limitarCaracteres(txtNit, evt, 10);
    }//GEN-LAST:event_txtNitKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        limitarCaracteres(txtNombre, evt, 45);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        limitarCaracteres(txtDireccion, evt, 50);
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        limitarCaracteres(txtCorreo, evt, 45);
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtPorcentCreditoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPorcentCreditoFocusLost
        if (tblProductosVenta.getRowCount() > 0 && !txtPorcentCredito.getText().isEmpty()) {
            float total = Float.parseFloat(lblTotal.getText());
            float creditoCompra = Float.parseFloat(lblCreditoCompra.getText());
            float porcentajeC = Float.parseFloat(txtPorcentCredito.getText());
            float credito = porcentajeC * total;
            float porcentajeE = 1 - porcentajeC;
            float efectivo = porcentajeE * total;
            if (credito > creditoCompra) {
                JOptionPane.showMessageDialog(null, "Credito insuficiente", "Advertencia", JOptionPane.ERROR_MESSAGE);
                txtPorcentCredito.setText("");
                txtPorcentCredito.requestFocus();
            } else if (efectivo > total || credito > total) {
                JOptionPane.showMessageDialog(null, "Se sobrepasa el total", "Advertencia", JOptionPane.ERROR_MESSAGE);
                txtPorcentCredito.setText("");
                txtPorcentCredito.requestFocus();
            } else {
                txtCredito.setText(String.valueOf(credito));
                txtPorcentEfectivo.setText(String.valueOf(porcentajeE));
                txtEfectivo.setText(String.valueOf(efectivo));
            }
        }
    }//GEN-LAST:event_txtPorcentCreditoFocusLost

    private void txtCreditoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCreditoFocusLost
        if (tblProductosVenta.getRowCount() > 0 && !txtCredito.getText().isEmpty()) {
            float total = Float.parseFloat(lblTotal.getText());
            float creditoCompra = Float.parseFloat(lblCreditoCompra.getText());
            float credito = Float.parseFloat(txtCredito.getText());
            float porcentajeC = credito / total;
            float porcentajeE = 1 - porcentajeC;
            float efectivo = porcentajeE * total;
            if (credito > creditoCompra) {
                JOptionPane.showMessageDialog(null, "Credito insuficiente", "Advertencia", JOptionPane.ERROR_MESSAGE);
                txtCredito.setText("");
                txtCredito.requestFocus();
            } else if (efectivo > total || credito > total) {
                JOptionPane.showMessageDialog(null, "Se sobrepasa el total", "Advertencia", JOptionPane.ERROR_MESSAGE);
                txtCredito.setText("");
                txtCredito.requestFocus();
            } else {
                txtPorcentCredito.setText(String.valueOf(porcentajeC));
                txtPorcentEfectivo.setText(String.valueOf(porcentajeE));
                txtEfectivo.setText(String.valueOf(efectivo));
            }
        }
    }//GEN-LAST:event_txtCreditoFocusLost

    private void txtPorcentEfectivoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPorcentEfectivoFocusLost
        if (tblProductosVenta.getRowCount() > 0 && !txtPorcentEfectivo.getText().isEmpty()) {
            float total = Float.parseFloat(lblTotal.getText());
            float creditoCompra = Float.parseFloat(lblCreditoCompra.getText());
            float porcentajeE = Float.parseFloat(txtPorcentEfectivo.getText());
            float efectivo = porcentajeE * total;
            float porcentajeC = 1 - porcentajeE;
            float credito = porcentajeC * total;
            if (credito > creditoCompra) {
                JOptionPane.showMessageDialog(null, "Credito insuficiente", "Advertencia", JOptionPane.ERROR_MESSAGE);
                txtPorcentEfectivo.setText("");
                txtPorcentEfectivo.requestFocus();
            } else if (efectivo > total || credito > total) {
                JOptionPane.showMessageDialog(null, "Se sobrepasa el total", "Advertencia", JOptionPane.ERROR_MESSAGE);
                txtPorcentEfectivo.setText("");
                txtPorcentEfectivo.requestFocus();
            } else {
                txtPorcentCredito.setText(String.valueOf(porcentajeC));
                txtEfectivo.setText(String.valueOf(efectivo));
                txtCredito.setText(String.valueOf(credito));
            }
        }
    }//GEN-LAST:event_txtPorcentEfectivoFocusLost

    private void txtEfectivoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEfectivoFocusLost
        if (tblProductosVenta.getRowCount() > 0 && !txtEfectivo.getText().isEmpty()) {
            float total = Float.parseFloat(lblTotal.getText());
            float creditoCompra = Float.parseFloat(lblCreditoCompra.getText());
            float efectivo = Float.parseFloat(txtEfectivo.getText());
            float porcentajeE = efectivo / total;
            float porcentajeC = 1 - porcentajeE;
            float credito = porcentajeC * total;
            if (credito > creditoCompra) {
                JOptionPane.showMessageDialog(null, "Credito insuficiente", "Advertencia", JOptionPane.ERROR_MESSAGE);
                txtEfectivo.setText("");
                txtEfectivo.requestFocus();
            } else if (efectivo > total || credito > total) {
                JOptionPane.showMessageDialog(null, "Se sobrepasa el total", "Advertencia", JOptionPane.ERROR_MESSAGE);
                txtEfectivo.setText("");
                txtEfectivo.requestFocus();
            } else {
                txtPorcentCredito.setText(String.valueOf(porcentajeC));
                txtPorcentEfectivo.setText(String.valueOf(porcentajeE));
                txtCredito.setText(String.valueOf(credito));
            }
        }
    }//GEN-LAST:event_txtEfectivoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProducto;
    private javax.swing.JButton btnCambiarCant;
    private javax.swing.JButton btnEliminarP;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbBusquedaProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCreditoCompra;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblProductosVenta;
    private javax.swing.JFormattedTextField txtCUI;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JFormattedTextField txtCredito;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JFormattedTextField txtEfectivo;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtPorcentCredito;
    private javax.swing.JFormattedTextField txtPorcentEfectivo;
    private javax.swing.JFormattedTextField txtTelefono;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void limitarCaracteres(JTextField jText, KeyEvent e, int limite) {
        if (jText.getText().length() == limite) {
            e.consume();
        }
    }

    public JButton getBtnAddProducto() {
        return btnAddProducto;
    }

    public JButton getBtnFinalizar() {
        return btnFinalizar;
    }

    public JButton getBtnCambiarCant() {
        return btnCambiarCant;
    }

    public JButton getBtnEliminarP() {
        return btnEliminarP;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public JComboBox<String> getCbBusquedaProducto() {
        return cbBusquedaProducto;
    }

    public JLabel getLblCreditoCompra() {
        return lblCreditoCompra;
    }

    public JLabel getLblTotal() {
        return lblTotal;
    }

    public JTable getTblProductosVenta() {
        return tblProductosVenta;
    }

    public JFormattedTextField getTxtCUI() {
        return txtCUI;
    }

    public JTextField getTxtCorreo() {
        return txtCorreo;
    }

    public JFormattedTextField getTxtCredito() {
        return txtCredito;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public JFormattedTextField getTxtEfectivo() {
        return txtEfectivo;
    }

    public JDateChooser getTxtFecha() {
        return txtFecha;
    }

    public JTextField getTxtNit() {
        return txtNit;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JFormattedTextField getTxtPorcentCredito() {
        return txtPorcentCredito;
    }

    public JFormattedTextField getTxtPorcentEfectivo() {
        return txtPorcentEfectivo;
    }

    public JFormattedTextField getTxtTelefono() {
        return txtTelefono;
    }

    public ObservableList<ProductoVenta> getProdVentaObservableList() {
        return prodVentaObservableList;
    }

    public void setProdVentaObservableList(ObservableList<ProductoVenta> prodVentaObservableList) {
        this.prodVentaObservableList = prodVentaObservableList;
    }

    public ObservableList<Producto> getProductosObservableList() {
        return productosObservableList;
    }

    public void setProductosObservableList(ObservableList<Producto> productosObservableList) {
        this.productosObservableList = productosObservableList;
    }
}
