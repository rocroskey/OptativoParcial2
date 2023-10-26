/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package registros.Presentation;


import java.util.Date;
import registros.Infraestructura.Models.CuentasModel;
import registros.Services.ServicioCuentas;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import registros.Infraestructura.Models.PersonaModel;


/**
 *
 * @author sosos
 */
public class Cuentas extends javax.swing.JFrame {

    
        private ServicioCuentas serviciocuenta;
        private CuentasModel cuentamodel;
        
        
    /**
     * Creates new form Cuentas
     */
    public Cuentas() {
        initComponents();
        setLocationRelativeTo(null);
        
        
serviciocuenta = new ServicioCuentas("postgres", "091100","localhost","5432","Registros");    }

    private void ConsultarCuenta(String id) {
       cargardatos(serviciocuenta.consultarCuentaPorId(Integer.parseInt(id)));
       
    }
    
    
    public void cargardatos(CuentasModel modelo){

        etiqidcuenta.setText(String.valueOf(modelo.idcuenta));
        etiqidcliente.setText(String.valueOf(modelo.idclientes));
        etiqnrocuenta.setText(String.valueOf(modelo.nrocuenta));
        etiqtipocuenta.setText(modelo.tipocuenta);
        etiqsaldo.setText(String.valueOf(modelo.saldo));
        etiqmoneda.setText(modelo.moneda);
        etiqpromedio.setText(modelo.promedioacreditacion);
        cbestado.setSelectedItem(modelo.estado);
        Datefechaalta.setDate(modelo.fechaalta);
        etiqcostom.setText(String.valueOf(modelo.costomantenimiento));
        etiqnrocontrato.setText(modelo.nrocontrato);
        
        
    
    }
    
        private void guardarCuenta() {
        Date fechaSeleccionada = Datefechaalta.getDate(); 
        CuentasModel cuenta = new CuentasModel();
        cuenta.setFechaAlta(fechaSeleccionada);
        cuenta.setIdCliente(Integer.parseInt(etiqidcliente.getText()));
        cuenta.setIdcuenta(Integer.parseInt(etiqidcuenta.getText()));
        cuenta.setSaldo(Float.parseFloat(etiqsaldo.getText()));
        cuenta.setCostoMantenimiento(Float.parseFloat(etiqcostom.getText()));

    cuenta.setEstado(cbestado.getSelectedItem().toString()); 
    cuenta.setMoneda(etiqmoneda.getText());
    cuenta.setNroCuenta(etiqnrocuenta.getText());
    cuenta.setNroContrato(etiqnrocontrato.getText());
    cuenta.setPromedioAcreditacion(etiqpromedio.getText());
    cuenta.setTipoCuenta(etiqtipocuenta.getText());

    String resultado = serviciocuenta.registrarCuenta(cuenta);
    JOptionPane.showMessageDialog(this, resultado);

    LimpiarCampos();                                             
}
        
        
        private void actualizarCuenta(){
        Date fechaSeleccionada = Datefechaalta.getDate(); 
        CuentasModel cuenta = new CuentasModel();
        cuenta.setFechaAlta(fechaSeleccionada);

    try {
        cuenta.setIdCliente(Integer.parseInt(etiqidcliente.getText()));
        cuenta.setIdcuenta(Integer.parseInt(etiqidcuenta.getText()));
        cuenta.setSaldo(Float.valueOf(etiqsaldo.getText()));
        cuenta.setCostoMantenimiento(Integer.parseInt(etiqcostom.getText()));
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos para ID de Cliente, ID de Cuenta y Saldo.", "Error", JOptionPane.ERROR_MESSAGE);
        return;  
    }

    cuenta.setEstado(cbestado.getSelectedItem().toString());  
    cuenta.setMoneda(etiqmoneda.getText());
    cuenta.setNroCuenta(etiqnrocuenta.getText());
    cuenta.setNroContrato(etiqnrocontrato.getText());
    cuenta.setPromedioAcreditacion(etiqpromedio.getText());
    cuenta.setTipoCuenta(etiqtipocuenta.getText());
    

    String resultado = serviciocuenta.modificarCuenta(cuenta);
    JOptionPane.showMessageDialog(this, resultado);

    LimpiarCampos();                                             
}
            

    
    private void LimpiarCampos() {
    etiqidcuenta.setText("");
    etiqnrocuenta.setText("");
    cbestado.setSelectedIndex(0);
    etiqnrocontrato.setText("");
    etiqcostom.setText("");
    etiqmoneda.setText("");
    etiqpromedio.setText("");
    etiqsaldo.setText("");
    etiqtipocuenta.setText("");
    etiqidcliente.setText("");
    Datefechaalta.setDate(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        txtidcuenta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtidcliente = new javax.swing.JLabel();
        txtnrocuenta = new javax.swing.JLabel();
        txtfechaalta = new javax.swing.JLabel();
        txttipocuenta = new javax.swing.JLabel();
        txtestado = new javax.swing.JLabel();
        txtsaldo = new javax.swing.JLabel();
        txtnrocontrato = new javax.swing.JLabel();
        txtcostomantenimiento = new javax.swing.JLabel();
        etiqidcuenta = new javax.swing.JTextField();
        etiqidcliente = new javax.swing.JTextField();
        etiqnrocuenta = new javax.swing.JTextField();
        etiqtipocuenta = new javax.swing.JTextField();
        etiqsaldo = new javax.swing.JTextField();
        etiqnrocontrato = new javax.swing.JTextField();
        etiqcostom = new javax.swing.JTextField();
        txtpromedio = new javax.swing.JLabel();
        txtmoneda = new javax.swing.JLabel();
        etiqpromedio = new javax.swing.JTextField();
        etiqmoneda = new javax.swing.JTextField();
        btnconsultar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        Datefechaalta = new com.toedter.calendar.JDateChooser();
        btnactualizar = new javax.swing.JButton();
        cbestado = new javax.swing.JComboBox<>();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtidcuenta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cuentas");

        jLabel2.setText("ID Cuenta");

        txtidcliente.setText("ID Cliente");

        txtnrocuenta.setText("Nro. Cuenta");

        txtfechaalta.setText("Fecha Alta");

        txttipocuenta.setText("Tipo de Cuenta");

        txtestado.setText("Estado");

        txtsaldo.setText("Saldo");

        txtnrocontrato.setText("Nro. Contrato");

        txtcostomantenimiento.setText("Costo Mantenimiento");

        txtpromedio.setText("Promedio Acreditacion");

        txtmoneda.setText("Moneda");

        btnconsultar.setText("Consultar");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        Datefechaalta.setDateFormatString("dd 'de' MMMM 'del' yyyy");

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        cbestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "Activo", "Inactivo" }));

        javax.swing.GroupLayout txtidcuentaLayout = new javax.swing.GroupLayout(txtidcuenta);
        txtidcuenta.setLayout(txtidcuentaLayout);
        txtidcuentaLayout.setHorizontalGroup(
            txtidcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtidcuentaLayout.createSequentialGroup()
                .addGroup(txtidcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(txtidcuentaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, txtidcuentaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(txtidcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtidcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtcostomantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addComponent(txtidcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtnrocuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtfechaalta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txttipocuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtsaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtnrocontrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(txtidcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtpromedio, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addComponent(txtmoneda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(35, 35, 35)
                        .addGroup(txtidcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqnrocontrato, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiqcostom, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiqpromedio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiqmoneda, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiqsaldo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiqtipocuenta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Datefechaalta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                            .addComponent(etiqnrocuenta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiqidcliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtidcuentaLayout.createSequentialGroup()
                                .addComponent(etiqidcuenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbestado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, txtidcuentaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btneliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnactualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsalir)))
                .addContainerGap())
        );
        txtidcuentaLayout.setVerticalGroup(
            txtidcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtidcuentaLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(txtidcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(etiqidcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnconsultar))
                .addGap(18, 18, 18)
                .addGroup(txtidcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidcliente)
                    .addComponent(etiqidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txtidcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnrocuenta)
                    .addComponent(etiqnrocuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txtidcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfechaalta)
                    .addComponent(Datefechaalta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txtidcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtidcuentaLayout.createSequentialGroup()
                        .addGroup(txtidcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttipocuenta)
                            .addComponent(etiqtipocuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(txtidcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtestado)
                            .addComponent(cbestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(txtidcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsaldo)
                            .addComponent(etiqsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(txtidcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnrocontrato)
                            .addComponent(etiqnrocontrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtcostomantenimiento))
                    .addComponent(etiqcostom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txtidcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpromedio)
                    .addComponent(etiqpromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txtidcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmoneda)
                    .addComponent(etiqmoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(txtidcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsalir)
                    .addComponent(btneliminar)
                    .addComponent(btnguardar)
                    .addComponent(btnactualizar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtidcuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtidcuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null,"Deseas salir del formulario?")== JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
    String idCuentaEliminar = etiqidcuenta.getText().trim();

    if (!idCuentaEliminar.isEmpty()) {
        try {
            int idCuenta = Integer.parseInt(idCuentaEliminar);

            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar esta cuenta?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {

                String mensajeEliminar = serviciocuenta.eliminarCCuenta(idCuenta);

                JOptionPane.showMessageDialog(this, mensajeEliminar);
            }
            
            LimpiarCampos();
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ID de la cuenta debe ser un número válido.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID de cuenta para eliminar.");
    
}
        
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        guardarCuenta();
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        actualizarCuenta();
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        // TODO add your handling code here:
        ConsultarCuenta(etiqidcuenta.getText().trim());
    }//GEN-LAST:event_btnconsultarActionPerformed
    
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
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuentas().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Datefechaalta;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cbestado;
    private javax.swing.JTextField etiqcostom;
    private javax.swing.JTextField etiqidcliente;
    private javax.swing.JTextField etiqidcuenta;
    private javax.swing.JTextField etiqmoneda;
    private javax.swing.JTextField etiqnrocontrato;
    private javax.swing.JTextField etiqnrocuenta;
    private javax.swing.JTextField etiqpromedio;
    private javax.swing.JTextField etiqsaldo;
    private javax.swing.JTextField etiqtipocuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtcostomantenimiento;
    private javax.swing.JLabel txtestado;
    private javax.swing.JLabel txtfechaalta;
    private javax.swing.JLabel txtidcliente;
    private javax.swing.JPanel txtidcuenta;
    private javax.swing.JLabel txtmoneda;
    private javax.swing.JLabel txtnrocontrato;
    private javax.swing.JLabel txtnrocuenta;
    private javax.swing.JLabel txtpromedio;
    private javax.swing.JLabel txtsaldo;
    private javax.swing.JLabel txttipocuenta;
    // End of variables declaration//GEN-END:variables
}
