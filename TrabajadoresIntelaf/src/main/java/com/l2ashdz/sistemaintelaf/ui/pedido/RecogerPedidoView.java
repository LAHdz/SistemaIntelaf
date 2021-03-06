/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.l2ashdz.sistemaintelaf.ui.pedido;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author asael
 */
public class RecogerPedidoView extends javax.swing.JDialog {

    /**
     * Creates new form RecojerPedidoView
     */
    public RecogerPedidoView() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPorcentajeC = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPorcentajeE = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCredito = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEfectivo = new javax.swing.JFormattedTextField();
        btnFinalizar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblAnticipo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblPagoPendiente = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        lblCreditoCompra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);

        jPanel1.setBackground(new java.awt.Color(39, 44, 52));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Credito:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Efectivo:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("%");

        txtPorcentajeC.setText("0");
        txtPorcentajeC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPorcentajeCFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("%");

        txtPorcentajeE.setText("0");
        txtPorcentajeE.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPorcentajeEFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Q.");

        txtCredito.setText("0");
        txtCredito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCreditoFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Q.");

        txtEfectivo.setText("0");
        txtEfectivo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEfectivoFocusLost(evt);
            }
        });

        btnFinalizar.setText("Finalizar");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total del pedido:   Q.");

        lblTotal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Anticipo pagado: Q.");

        lblAnticipo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblAnticipo.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Pago pendiente:   Q.");

        lblPagoPendiente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblPagoPendiente.setForeground(new java.awt.Color(255, 255, 255));
        lblPagoPendiente.setText("0");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Credito compra:   Q.");

        lblCreditoCompra.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCreditoCompra.setForeground(new java.awt.Color(255, 255, 255));
        lblCreditoCompra.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAnticipo)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPagoPendiente)
                            .addComponent(lblCreditoCompra))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPorcentajeC, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPorcentajeE, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblTotal)
                    .addComponent(jLabel12)
                    .addComponent(lblCreditoCompra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblAnticipo)
                    .addComponent(jLabel11)
                    .addComponent(lblPagoPendiente))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFinalizar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(txtPorcentajeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(txtPorcentajeE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPorcentajeCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPorcentajeCFocusLost
        if (Float.parseFloat(lblPagoPendiente.getText()) > 0 && !txtPorcentajeC.getText().isEmpty()) {
            float pagoPendiente = Float.parseFloat(lblPagoPendiente.getText());
            float creditoCompra = Float.parseFloat(lblCreditoCompra.getText());
            float porcentajeC = Float.parseFloat(txtPorcentajeC.getText());
            float credito = porcentajeC * pagoPendiente;
            float porcentajeE = 1 - porcentajeC;
            float efectivo = porcentajeE * pagoPendiente;
            if (credito > creditoCompra) {
                JOptionPane.showMessageDialog(null, "Credito insuficiente", "Advertencia", JOptionPane.ERROR_MESSAGE);
                txtPorcentajeC.setText("");
                txtPorcentajeC.requestFocus();
            } else if (efectivo > pagoPendiente || credito > pagoPendiente) {
                JOptionPane.showMessageDialog(null, "Se sobrepasa el pago pendiente", "Advertencia", JOptionPane.ERROR_MESSAGE);
                txtPorcentajeC.setText("");
                txtPorcentajeC.requestFocus();
            } else {
                txtCredito.setText(String.valueOf(credito));
                txtPorcentajeE.setText(String.valueOf(porcentajeE));
                txtEfectivo.setText(String.valueOf(efectivo));
            }
        }
    }//GEN-LAST:event_txtPorcentajeCFocusLost

    private void txtCreditoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCreditoFocusLost
        if (Float.parseFloat(lblPagoPendiente.getText()) > 0 && !txtCredito.getText().isEmpty()) {
            float pagoPendiente = Float.parseFloat(lblPagoPendiente.getText());
            float creditoCompra = Float.parseFloat(lblCreditoCompra.getText());
            float credito = Float.parseFloat(txtCredito.getText());
            float porcentajeC = credito / pagoPendiente;
            float porcentajeE = 1 - porcentajeC;
            float efectivo = porcentajeE * pagoPendiente;
            if (credito > creditoCompra) {
                JOptionPane.showMessageDialog(null, "Credito insuficiente", "Advertencia", JOptionPane.ERROR_MESSAGE);
                txtCredito.setText("");
                txtCredito.requestFocus();
            } else if (efectivo > pagoPendiente || credito > pagoPendiente) {
                JOptionPane.showMessageDialog(null, "Se sobrepasa el pago pendiente", "Advertencia", JOptionPane.ERROR_MESSAGE);
                txtCredito.setText("");
                txtCredito.requestFocus();
            } else {
                txtPorcentajeC.setText(String.valueOf(porcentajeC));
                txtPorcentajeE.setText(String.valueOf(porcentajeE));
                txtEfectivo.setText(String.valueOf(efectivo));
            }
        }
    }//GEN-LAST:event_txtCreditoFocusLost

    private void txtPorcentajeEFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPorcentajeEFocusLost
        if (Float.parseFloat(lblPagoPendiente.getText()) > 0 && !txtPorcentajeE.getText().isEmpty()) {
            float anticipo = Float.parseFloat(lblPagoPendiente.getText());
            float creditoCompra = Float.parseFloat(lblCreditoCompra.getText());
            float porcentajeE = Float.parseFloat(txtPorcentajeE.getText());
            float efectivo = porcentajeE * anticipo;
            float porcentajeC = 1 - porcentajeE;
            float credito = porcentajeC * anticipo;
            if (credito > creditoCompra) {
                JOptionPane.showMessageDialog(null, "Credito insuficiente", "Advertencia", JOptionPane.ERROR_MESSAGE);
                txtPorcentajeE.setText("");
                txtPorcentajeE.requestFocus();
            } else if (efectivo > anticipo || credito > anticipo) {
                JOptionPane.showMessageDialog(null, "Se sobrepasa el pago pendiente", "Advertencia", JOptionPane.ERROR_MESSAGE);
                txtPorcentajeE.setText("");
                txtPorcentajeE.requestFocus();
            } else {
                txtPorcentajeC.setText(String.valueOf(porcentajeC));
                txtEfectivo.setText(String.valueOf(efectivo));
                txtCredito.setText(String.valueOf(credito));
            }
        }
    }//GEN-LAST:event_txtPorcentajeEFocusLost

    private void txtEfectivoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEfectivoFocusLost
        if (Float.parseFloat(lblPagoPendiente.getText()) > 0 && !txtEfectivo.getText().isEmpty()) {
            float anticipo = Float.parseFloat(lblPagoPendiente.getText());
            float creditoCompra = Float.parseFloat(lblCreditoCompra.getText());
            float efectivo = Float.parseFloat(txtEfectivo.getText());
            float porcentajeE = efectivo / anticipo;
            float porcentajeC = 1 - porcentajeE;
            float credito = porcentajeC * anticipo;
            if (credito > creditoCompra) {
                JOptionPane.showMessageDialog(null, "Credito insuficiente", "Advertencia", JOptionPane.ERROR_MESSAGE);
                txtEfectivo.setText("");
                txtEfectivo.requestFocus();
            } else if (efectivo > anticipo || credito > anticipo) {
                JOptionPane.showMessageDialog(null, "Se sobrepasa el pago pendiente", "Advertencia", JOptionPane.ERROR_MESSAGE);
                txtEfectivo.setText("");
                txtEfectivo.requestFocus();
            } else {
                txtPorcentajeC.setText(String.valueOf(porcentajeC));
                txtPorcentajeE.setText(String.valueOf(porcentajeE));
                txtCredito.setText(String.valueOf(credito));
            }
        }
    }//GEN-LAST:event_txtEfectivoFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAnticipo;
    private javax.swing.JLabel lblCreditoCompra;
    private javax.swing.JLabel lblPagoPendiente;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JFormattedTextField txtCredito;
    private javax.swing.JFormattedTextField txtEfectivo;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JFormattedTextField txtPorcentajeC;
    private javax.swing.JFormattedTextField txtPorcentajeE;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnFinalizar() {
        return btnFinalizar;
    }

    public JLabel getLblAnticipo() {
        return lblAnticipo;
    }

    public JLabel getLblPagoPendiente() {
        return lblPagoPendiente;
    }

    public JLabel getLblTotal() {
        return lblTotal;
    }

    public JFormattedTextField getTxtEfectivo() {
        return txtEfectivo;
    }

    public JDateChooser getTxtFechaRetiro() {
        return txtFecha;
    }

    public JFormattedTextField getTxtPorcentajeC() {
        return txtPorcentajeC;
    }

    public JFormattedTextField getTxtPorcentajeE() {
        return txtPorcentajeE;
    }

    public JFormattedTextField getTztCredito() {
        return txtCredito;
    }

    public JLabel getLblCreditoCompra() {
        return lblCreditoCompra;
    }

    public JFormattedTextField getTxtCredito() {
        return txtCredito;
    }

    public JDateChooser getTxtFecha() {
        return txtFecha;
    }

}
