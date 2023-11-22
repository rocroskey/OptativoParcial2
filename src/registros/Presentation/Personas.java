
package registros.Presentation;

import javax.swing.JOptionPane;
import registros.Infraestructura.Models.PersonaModelo;
import registros.Services.ServicioPersonas;


public class Personas extends javax.swing.JFrame {
    
    private ServicioPersonas serviciopersona;
    
    public Personas() {
        initComponents();
        setLocationRelativeTo(null);

        serviciopersona = new ServicioPersonas("postgres", "091100","localhost","5432","Registros");
    }
    
    private void cargardatos(PersonaModelo modelo){
        etiqidciudad.setText(String.valueOf(modelo.getIdCiudad()));
        etiqnombre.setText(modelo.getNombre());
        etiqapellido.setText(modelo.getApellido());
        cbtipodocumento.setSelectedItem(modelo.getTipoDocumento());
        etiqnrodocumento.setText(modelo.getNumeroDocumento());
        etiqdireccion.setText(modelo.getDireccion());
        etiqemail.setText(modelo.getEmail());
        etiqcelular.setText(modelo.getCelular());
        cbestado.setSelectedItem(modelo.getEstado());
    }
    
    private void consultarPersonaPorId(String id) {
        cargardatos(serviciopersona.consultarPersonaPorId(Integer.parseInt(id))); 
    }
    
    private void guardarPersona() {
        PersonaModelo persona = new PersonaModelo();
        persona.setNombre(etiqnombre.getText());  
        persona.setApellido(etiqapellido.getText());  
        persona.setDireccion(etiqdireccion.getText());  
        persona.setEmail(etiqemail.getText());  
        persona.setEstado(cbestado.getSelectedItem().toString());  
        persona.setIdCiudad(Integer.parseInt(etiqidciudad.getText()));  
        persona.setIdpersona(Integer.parseInt(etiqidpersona.getText())); 
        persona.setNumeroDocumento(etiqnrodocumento.getText()); 
        persona.setTipoDocumento((String) cbtipodocumento.getSelectedItem()); 
        persona.setCelular(etiqcelular.getText()); 

        String resultado = serviciopersona.registrarPersona(persona);
        JOptionPane.showMessageDialog(this, resultado);
        
        

    LimpiarCampos();
    }
    
    private void actualizarPersona(){
        PersonaModelo persona = new PersonaModelo();
        persona.setNombre(etiqnombre.getText());  
        persona.setApellido(etiqapellido.getText());  
        persona.setDireccion(etiqdireccion.getText());  
        persona.setEmail(etiqemail.getText());  
        persona.setEstado(cbestado.getSelectedItem().toString()); 
        persona.setIdCiudad(Integer.parseInt(etiqidciudad.getText()));  
        persona.setIdpersona(Integer.parseInt(etiqidpersona.getText())); 
        persona.setNumeroDocumento(etiqnrodocumento.getText()); 
        persona.setTipoDocumento((String) cbtipodocumento.getSelectedItem()); 
        persona.setCelular(etiqcelular.getText()); 

        String resultado = serviciopersona.modificarPersona(persona);
        JOptionPane.showMessageDialog(this, resultado);

    LimpiarCampos();
    }
 
    private void LimpiarCampos() {
        etiqidpersona.setText("");
        etiqidciudad.setText("");
        etiqnombre.setText("");
        etiqapellido.setText("");
        cbtipodocumento.setSelectedIndex(0);
        etiqnrodocumento.setText("");
        etiqdireccion.setText("");
        etiqcelular.setText("");
        etiqemail.setText("");
        cbestado.setSelectedIndex(0);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtidpersona = new javax.swing.JLabel();
        txtidciudad = new javax.swing.JLabel();
        txtnombre = new javax.swing.JLabel();
        txtapellido = new javax.swing.JLabel();
        txttipodoc = new javax.swing.JLabel();
        txtnrodocumento = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JLabel();
        txtcelular = new javax.swing.JLabel();
        txtemail = new javax.swing.JLabel();
        txtestado = new javax.swing.JLabel();
        etiqidpersona = new javax.swing.JTextField();
        etiqidciudad = new javax.swing.JTextField();
        etiqnombre = new javax.swing.JTextField();
        etiqapellido = new javax.swing.JTextField();
        etiqnrodocumento = new javax.swing.JTextField();
        etiqcelular = new javax.swing.JTextField();
        etiqemail = new javax.swing.JTextField();
        btnconsultar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        cbtipodocumento = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        etiqdireccion = new javax.swing.JTextArea();
        btnmodificar = new javax.swing.JButton();
        cbestado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Personas");

        txtidpersona.setText("ID Persona");

        txtidciudad.setText("ID Ciudad");

        txtnombre.setText("Nombre");

        txtapellido.setText("Apellido");

        txttipodoc.setText("Tipo de Documento");

        txtnrodocumento.setText("Numero de Documento");

        txtdireccion.setText("Direccion");

        txtcelular.setText("Celular");

        txtemail.setText("Email");

        txtestado.setText("Estado");

        etiqidpersona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                etiqidpersonaKeyPressed(evt);
            }
        });

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

        cbtipodocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo de documento", "CI", "Pasaporte", "Licencia" }));

        etiqdireccion.setColumns(20);
        etiqdireccion.setRows(5);
        jScrollPane1.setViewportView(etiqdireccion);

        btnmodificar.setText("Actualizar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        cbestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "Activo", "Inactivo" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtemail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcelular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txttipodoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtnrodocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(txtapellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtidciudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtidpersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbtipodocumento, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiqcelular, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiqemail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiqnrodocumento)
                            .addComponent(etiqapellido)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etiqidpersona, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(etiqidciudad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiqnombre)
                            .addComponent(jScrollPane1)
                            .addComponent(cbestado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(btnguardar)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar)
                        .addGap(27, 27, 27)
                        .addComponent(btnmodificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsalir)))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtidciudad)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiqidpersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnconsultar)
                            .addComponent(txtidpersona))
                        .addGap(22, 22, 22)
                        .addComponent(etiqidciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiqnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtapellido))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttipodoc)
                    .addComponent(cbtipodocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnrodocumento)
                    .addComponent(etiqnrodocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdireccion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcelular))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemail))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtestado)
                    .addComponent(cbestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btneliminar)
                    .addComponent(btnsalir)
                    .addComponent(btnmodificar))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed

        if(JOptionPane.showConfirmDialog(null,"Deseas salir del formulario?")== JOptionPane.YES_OPTION){
            System.exit(0); 
        }
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        // TODO add your handling code here:
        consultarPersonaPorId(etiqidpersona.getText().trim());
    }//GEN-LAST:event_btnconsultarActionPerformed
    

    
    private void etiqidpersonaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etiqidpersonaKeyPressed

        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            consultarPersonaPorId(etiqidpersona.getText().trim());
    }//GEN-LAST:event_etiqidpersonaKeyPressed
    }
    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

    String idPersonaEliminar = etiqidpersona.getText().trim();

    if (!idPersonaEliminar.isEmpty()) {
        try {
            int idPersona = Integer.parseInt(idPersonaEliminar);
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar esta persona?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                String mensajeEliminar = serviciopersona.eliminarPersona(idPersona);
                JOptionPane.showMessageDialog(this, mensajeEliminar);
            }            
            LimpiarCampos();           
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ID de la persona debe ser un número válido.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID de persona para eliminar.");
    }
    
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        guardarPersona();
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        actualizarPersona();
    }//GEN-LAST:event_btnmodificarActionPerformed

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
            java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cbestado;
    private javax.swing.JComboBox<String> cbtipodocumento;
    private javax.swing.JTextField etiqapellido;
    private javax.swing.JTextField etiqcelular;
    private javax.swing.JTextArea etiqdireccion;
    private javax.swing.JTextField etiqemail;
    private javax.swing.JTextField etiqidciudad;
    private javax.swing.JTextField etiqidpersona;
    private javax.swing.JTextField etiqnombre;
    private javax.swing.JTextField etiqnrodocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtapellido;
    private javax.swing.JLabel txtcelular;
    private javax.swing.JLabel txtdireccion;
    private javax.swing.JLabel txtemail;
    private javax.swing.JLabel txtestado;
    private javax.swing.JLabel txtidciudad;
    private javax.swing.JLabel txtidpersona;
    private javax.swing.JLabel txtnombre;
    private javax.swing.JLabel txtnrodocumento;
    private javax.swing.JLabel txttipodoc;
    // End of variables declaration//GEN-END:variables

}


