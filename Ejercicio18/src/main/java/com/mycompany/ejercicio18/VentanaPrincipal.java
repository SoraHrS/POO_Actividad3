/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ejercicio18;

/**
 *
 * @author SORANY
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIngresoNombre = new javax.swing.JTextField();
        txtIngresoCodigo = new javax.swing.JTextField();
        txtIngresoCHoras = new javax.swing.JTextField();
        txtIngresoVHora = new javax.swing.JTextField();
        txtIngresoRetencion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMostrarNombre = new javax.swing.JTextField();
        txtMostrarCodigo = new javax.swing.JTextField();
        txtSalarioBruto = new javax.swing.JTextField();
        txtSalarioNeto = new javax.swing.JTextField();
        btnNombre = new javax.swing.JButton();
        btnCodigo = new javax.swing.JButton();
        btnSalarioBruto = new javax.swing.JButton();
        btnSalarioNeto = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre del empleado");

        jLabel2.setText("Código del empleado");

        jLabel3.setText("Número de horas trabajadas");

        jLabel4.setText("Valor de la hora");

        jLabel5.setText("Porcentaje de retención en la fuente");

        txtIngresoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresoCodigoActionPerformed(evt);
            }
        });

        jLabel6.setText("INGRESO DE LA INFORMACIÓN");

        jLabel7.setText("NOMINA");

        jLabel8.setText("Nombre");

        jLabel9.setText("Código");

        jLabel10.setText("Salario bruto");

        jLabel11.setText("Salario neto");

        txtMostrarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMostrarCodigoActionPerformed(evt);
            }
        });

        btnNombre.setText("Mostrar nombre");
        btnNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNombreActionPerformed(evt);
            }
        });

        btnCodigo.setText("Mostrar código");
        btnCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodigoActionPerformed(evt);
            }
        });

        btnSalarioBruto.setText("Calcular salario bruto");
        btnSalarioBruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalarioBrutoActionPerformed(evt);
            }
        });

        btnSalarioNeto.setText("Calcular salario neto");
        btnSalarioNeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalarioNetoActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(btnCodigo)
                        .addGap(32, 32, 32)
                        .addComponent(btnSalarioBruto)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIngresoNombre)
                                    .addComponent(txtIngresoCodigo)
                                    .addComponent(txtIngresoCHoras)
                                    .addComponent(txtIngresoVHora)
                                    .addComponent(txtIngresoRetencion, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(163, 163, 163)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSalarioNeto, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                                    .addComponent(txtSalarioBruto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMostrarCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMostrarNombre, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(btnSalarioNeto)
                                .addGap(43, 43, 43)
                                .addComponent(btnLimpiar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIngresoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIngresoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIngresoCHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIngresoVHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIngresoRetencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMostrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtMostrarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtSalarioBruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtSalarioNeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNombre)
                    .addComponent(btnSalarioBruto)
                    .addComponent(btnCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnSalarioNeto))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtIngresoCHoras.setText("");
        txtIngresoCodigo.setText("");
        txtIngresoNombre.setText("");
        txtIngresoRetencion.setText("");
        txtIngresoVHora.setText("");
        txtMostrarCodigo.setText("");
        txtMostrarNombre.setText("");
        txtSalarioBruto.setText("");
        txtSalarioNeto.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtIngresoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngresoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngresoCodigoActionPerformed

    private void txtMostrarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMostrarCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMostrarCodigoActionPerformed

    private void btnNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNombreActionPerformed
        String nombre = txtIngresoNombre.getText();
        txtMostrarNombre.setText(nombre);
    }//GEN-LAST:event_btnNombreActionPerformed

    private void btnCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodigoActionPerformed
        String codigo = txtIngresoCodigo.getText();
        txtMostrarCodigo.setText(codigo);
    }//GEN-LAST:event_btnCodigoActionPerformed

    private void btnSalarioBrutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalarioBrutoActionPerformed
        String nombre, codigo;
        double horasTrabajadas, valorHora, porcentajeRetencion, salarioBruto;
        
        nombre = txtIngresoNombre.getText();
        codigo = txtIngresoCodigo.getText();
        horasTrabajadas = Double.parseDouble(txtIngresoCHoras.getText());
        valorHora = Double.parseDouble(txtIngresoVHora.getText());
        porcentajeRetencion = Double.parseDouble(txtIngresoRetencion.getText());
        
        Empleado empleado = new Empleado(nombre, codigo, horasTrabajadas, valorHora, porcentajeRetencion);
        
        salarioBruto = empleado.calcularSBruto();
        
        txtSalarioBruto.setText(String.valueOf(salarioBruto));
    }//GEN-LAST:event_btnSalarioBrutoActionPerformed

    private void btnSalarioNetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalarioNetoActionPerformed
        String nombre, codigo;
        double horasTrabajadas, valorHora, porcentajeRetencion, salarioBruto, retencion, salarioNeto;
        
        nombre = txtIngresoNombre.getText();
        codigo = txtIngresoCodigo.getText();
        horasTrabajadas = Double.parseDouble(txtIngresoCHoras.getText());
        valorHora = Double.parseDouble(txtIngresoVHora.getText());
        porcentajeRetencion = Double.parseDouble(txtIngresoRetencion.getText());
        
        Empleado empleado = new Empleado(nombre, codigo, horasTrabajadas, valorHora, porcentajeRetencion);
        
        salarioNeto = empleado.calcularSNeto();
        
        txtSalarioNeto.setText(String.valueOf(salarioNeto));
    }//GEN-LAST:event_btnSalarioNetoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCodigo;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNombre;
    private javax.swing.JButton btnSalarioBruto;
    private javax.swing.JButton btnSalarioNeto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtIngresoCHoras;
    private javax.swing.JTextField txtIngresoCodigo;
    private javax.swing.JTextField txtIngresoNombre;
    private javax.swing.JTextField txtIngresoRetencion;
    private javax.swing.JTextField txtIngresoVHora;
    private javax.swing.JTextField txtMostrarCodigo;
    private javax.swing.JTextField txtMostrarNombre;
    private javax.swing.JTextField txtSalarioBruto;
    private javax.swing.JTextField txtSalarioNeto;
    // End of variables declaration//GEN-END:variables
}
