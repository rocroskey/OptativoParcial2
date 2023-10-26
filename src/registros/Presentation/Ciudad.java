/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package registros.Presentation;

import javax.swing.JOptionPane;
import registros.Infraestructura.Models.CiudadModel;
import registros.Services.ServicioCiudades;

/**
 *
 * @author sosos
 */
public class Ciudad extends javax.swing.JFrame {
    
    
    private ServicioCiudades serviciociudad;
    private CiudadModel ciudadmodel;

    /**
     * Creates new form Ciudad
     */
    public Ciudad() {
        initComponents();
        setLocationRelativeTo(null);
        
        serviciociudad = new ServicioCiudades("postgres", "091100","localhost","5432","Registros");
    }
    
    private void ConsultarCiudad(String id) {
       cargardatos(serviciociudad.consultarCiudad(Integer.parseInt(id)));
    }

    
    public void cargardatos (CiudadModel modelo){
        etiqnomciudad.setText(modelo.ciudad);
        cbdepartamento.setSelectedItem(modelo.Departamento);
        etiqpostal.setText(String.valueOf(modelo.PostalCode));  
    }
    
    
    private void limpiarCampos() {
    etiqidciudad.setText("");
    etiqnomciudad.setText("");
    etiqpostal.setText("");
    cbdepartamento.setSelectedIndex(0);
    }
    
    private void guardarCiudad() {
    CiudadModel ciudad = new CiudadModel();
    ciudad.setCiudad(etiqnomciudad.getText());
    ciudad.setDepartamento(cbdepartamento.getSelectedItem().toString());
    ciudad.setPostalCode(Integer.parseInt(etiqpostal.getText()));
    

    String resultado = serviciociudad.registrarCiudad(ciudad);
    JOptionPane.showMessageDialog(this, resultado);

    limpiarCampos();
}
    
    private void actualizarCiudad() {
  
    int idCiudad = Integer.parseInt(etiqidciudad.getText().trim());
    CiudadModel ciudad = new CiudadModel();
    ciudad.setCiudad(etiqnomciudad.getText());
    ciudad.setDepartamento(cbdepartamento.getSelectedItem().toString());
    ciudad.setPostalCode(Integer.parseInt(etiqpostal.getText()));


    String resultado = serviciociudad.modificarCiudad(ciudad, idCiudad);
    JOptionPane.showMessageDialog(this, resultado);


    limpiarCampos();
}

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtidciudad = new javax.swing.JLabel();
        txtciudad = new javax.swing.JLabel();
        combodepartamento = new javax.swing.JLabel();
        txtcodigopostal = new javax.swing.JLabel();
        etiqidciudad = new javax.swing.JTextField();
        etiqnomciudad = new javax.swing.JTextField();
        etiqpostal = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        cbdepartamento = new javax.swing.JComboBox<>();
        btnactualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ciudad");

        txtidciudad.setText("ID Ciudad");

        txtciudad.setText("Nombre");

        combodepartamento.setText("Departamento");

        txtcodigopostal.setText("Codigo Postal");

        etiqidciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                etiqidciudadKeyPressed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        cbdepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el Departamento", "Alto Paraguay", "Alto Parana", "Amambay", "Boqueron", "Caaguazu", "Caazapa", "Canindeyu", "Central", "Concepcion", "Guaira", "Itapua", "Cordillera", "Misiones", "Ñeembucu", "Paraguari", "Presidente Hayes", "San Pedro" }));
        cbdepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdepartamentoActionPerformed(evt);
            }
        });

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtciudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtidciudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combodepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodigopostal, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btneliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnactualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etiqidciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiqpostal, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbdepartamento, javax.swing.GroupLayout.Alignment.LEADING, 0, 495, Short.MAX_VALUE)
                                .addComponent(etiqnomciudad, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiqpostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidciudad)
                            .addComponent(etiqidciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtciudad)
                            .addComponent(etiqnomciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combodepartamento)
                        .addGap(18, 18, 18)
                        .addComponent(txtcodigopostal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        if(JOptionPane.showConfirmDialog(null,"Deseas salir del formulario?")== JOptionPane.YES_OPTION){
            System.exit(0); 
}
    }//GEN-LAST:event_btnSalirActionPerformed

    private void etiqidciudadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etiqidciudadKeyPressed

        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            ConsultarCiudad(etiqidciudad.getText().trim());
    }//GEN-LAST:event_etiqidciudadKeyPressed
}
    private void cbdepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbdepartamentoActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

        int idCiudad = Integer.parseInt(etiqidciudad.getText().trim());

    int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que quieres eliminar esta ciudad?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

    if (confirmacion == JOptionPane.YES_OPTION) {

        String resultado = serviciociudad.eliminarCiudad(idCiudad);
        JOptionPane.showMessageDialog(this, resultado);
        
        limpiarCampos();
}


    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        guardarCiudad();


    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        actualizarCiudad();
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        ConsultarCiudad(etiqidciudad.getText().trim());
        
    }//GEN-LAST:event_btnConsultarActionPerformed


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
            java.util.logging.Logger.getLogger(Ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ciudad().setVisible(true);
}
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox<String> cbdepartamento;
    private javax.swing.JLabel combodepartamento;
    private javax.swing.JTextField etiqidciudad;
    private javax.swing.JTextField etiqnomciudad;
    private javax.swing.JTextField etiqpostal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtciudad;
    private javax.swing.JLabel txtcodigopostal;
    private javax.swing.JLabel txtidciudad;
    // End of variables declaration//GEN-END:variables
}

