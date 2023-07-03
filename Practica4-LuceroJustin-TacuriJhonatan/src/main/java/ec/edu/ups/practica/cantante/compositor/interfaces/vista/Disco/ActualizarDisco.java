/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica.cantante.compositor.interfaces.vista.Disco;

import ec.edu.ups.practica.cantante.compositor.interfaces.controlador.ControladorCantante;
import ec.edu.ups.practica.cantante.compositor.interfaces.modelo.Cantante;
import ec.edu.ups.practica.cantante.compositor.interfaces.modelo.Disco;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;

/**
 *
 * @author venot
 */
public class ActualizarDisco extends javax.swing.JInternalFrame {
    private ControladorCantante controladorCantante;
    private Cantante cantanteTempo;
    private Disco disco ;
    private ResourceBundle mensajes;
    /**
     * Creates new form ActualizarDisco
     */
    public ActualizarDisco(ControladorCantante controladorCantante) {
        initComponents();
        this.controladorCantante = controladorCantante;
    }
    
    public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jblCodigoActualizarDisco.setText(mensajes.getString("ventana.codigo"));
        jblIdActualizarDisco.setText(mensajes.getString("ventana.id"));
        jblNombreActualizarDisco.setText(mensajes.getString("ventana.nombre"));
        jblNombreArtisticoActualizarDisco.setText(mensajes.getString("ventanaCantante.nombreartistico"));
        jblEdadActualizarDisco.setText(mensajes.getString("ventana.edad"));
        jblApellidoActualizarDisco.setText(mensajes.getString("ventana.apellido"));
        jblNombreDiscoActualizarDisco.setText(mensajes.getString("ventana.nombre"));
        jblAnioLanzaminietoActualizarDisco.setText(mensajes.getString("ventanaDisco.aniolanzamiento"));
        bntActualizar.setText(mensajes.getString("boton.actualizar"));
        bntBuscar4.setText(mensajes.getString("boton.buscar"));
        bntBuscarDisco.setText(mensajes.getString("boton.buscar"));
        bntCancelar4.setText(mensajes.getString("boton.cancelar"));
        Border borde = BorderFactory.createTitledBorder(mensajes.getString("panel.actualizardisco"));
        panelA.setBorder(borde); 
        
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
        panelA = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jblIdActualizarDisco = new javax.swing.JLabel();
        txtIdCantante4 = new javax.swing.JTextField();
        bntBuscar4 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        txtNombre4 = new javax.swing.JTextField();
        jblNombreActualizarDisco = new javax.swing.JLabel();
        jblApellidoActualizarDisco = new javax.swing.JLabel();
        txtApellido4 = new javax.swing.JTextField();
        jblEdadActualizarDisco = new javax.swing.JLabel();
        txtEdad4 = new javax.swing.JTextField();
        jblNombreArtisticoActualizarDisco = new javax.swing.JLabel();
        txtNombreArtistico4 = new javax.swing.JTextField();
        jblCodigoActualizarDisco = new javax.swing.JLabel();
        jblNombreDiscoActualizarDisco = new javax.swing.JLabel();
        jblAnioLanzaminietoActualizarDisco = new javax.swing.JLabel();
        txtCodigo4 = new javax.swing.JTextField();
        txtNombreDisco4 = new javax.swing.JTextField();
        txtAnioLanzamiento4 = new javax.swing.JTextField();
        bntActualizar = new javax.swing.JButton();
        bntCancelar4 = new javax.swing.JButton();
        bntBuscarDisco = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        panelA.setBackground(new java.awt.Color(255, 204, 153));
        panelA.setBorder(javax.swing.BorderFactory.createTitledBorder("ACTUALIZAR DISCO"));

        jPanel7.setBackground(new java.awt.Color(255, 204, 153));

        jblIdActualizarDisco.setText("Buscar cantante para encontar disco : ");

        bntBuscar4.setText("Buscar");
        bntBuscar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscar4ActionPerformed(evt);
            }
        });

        jLabel38.setText("Ingrese el nombre del disco");

        txtNombre4.setEditable(false);
        txtNombre4.setEnabled(false);
        txtNombre4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre4ActionPerformed(evt);
            }
        });

        jblNombreActualizarDisco.setText("Nombre : ");

        jblApellidoActualizarDisco.setText("Apellido :");

        txtApellido4.setEditable(false);
        txtApellido4.setEnabled(false);

        jblEdadActualizarDisco.setText("Edad :");

        txtEdad4.setEditable(false);
        txtEdad4.setEnabled(false);

        jblNombreArtisticoActualizarDisco.setText("Nombre artistico :");

        txtNombreArtistico4.setEditable(false);
        txtNombreArtistico4.setEnabled(false);

        jblCodigoActualizarDisco.setText("Codigo :");

        jblNombreDiscoActualizarDisco.setText("Nombre :");

        jblAnioLanzaminietoActualizarDisco.setText("Año de lanzamiento :");

        txtCodigo4.setEnabled(false);
        txtCodigo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigo4ActionPerformed(evt);
            }
        });

        txtNombreDisco4.setEnabled(false);

        txtAnioLanzamiento4.setEnabled(false);
        txtAnioLanzamiento4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnioLanzamiento4ActionPerformed(evt);
            }
        });

        bntActualizar.setText("Actualizar");
        bntActualizar.setEnabled(false);
        bntActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntActualizarActionPerformed(evt);
            }
        });

        bntCancelar4.setText("Cancelar");
        bntCancelar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelar4ActionPerformed(evt);
            }
        });

        bntBuscarDisco.setText("Buscar");
        bntBuscarDisco.setEnabled(false);
        bntBuscarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarDiscoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblNombreActualizarDisco)
                            .addComponent(jblEdadActualizarDisco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre4)
                            .addComponent(txtEdad4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblNombreArtisticoActualizarDisco)
                            .addComponent(jblApellidoActualizarDisco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApellido4)
                            .addComponent(txtNombreArtistico4, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblCodigoActualizarDisco)
                            .addComponent(jblNombreDiscoActualizarDisco)
                            .addComponent(jblAnioLanzaminietoActualizarDisco)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(bntActualizar)))
                .addGap(45, 45, 45)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntCancelar4)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigo4)
                            .addComponent(txtNombreDisco4)
                            .addComponent(txtAnioLanzamiento4, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntBuscarDisco)))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jblIdActualizarDisco)
                .addGap(61, 61, 61)
                .addComponent(txtIdCantante4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntBuscar4)
                .addGap(39, 39, 39))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblIdActualizarDisco)
                    .addComponent(txtIdCantante4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntBuscar4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblNombreActualizarDisco)
                    .addComponent(jblApellidoActualizarDisco)
                    .addComponent(txtApellido4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblEdadActualizarDisco)
                    .addComponent(txtEdad4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblNombreArtisticoActualizarDisco)
                    .addComponent(txtNombreArtistico4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel38)
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblCodigoActualizarDisco)
                    .addComponent(txtCodigo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntBuscarDisco))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblNombreDiscoActualizarDisco)
                    .addComponent(txtNombreDisco4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblAnioLanzaminietoActualizarDisco)
                    .addComponent(txtAnioLanzamiento4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntActualizar)
                    .addComponent(bntCancelar4))
                .addGap(16, 16, 16))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Disco.jpg"))); // NOI18N

        javax.swing.GroupLayout panelALayout = new javax.swing.GroupLayout(panelA);
        panelA.setLayout(panelALayout);
        panelALayout.setHorizontalGroup(
            panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelALayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelALayout.setVerticalGroup(
            panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelALayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void bntBuscar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscar4ActionPerformed
        // TODO add your handling code here:
        if (txtIdCantante4.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, mensajes.getString("joption.noestalleno"));    
        }else{
            cantanteTempo = controladorCantante.buscarCantante(Integer.parseInt(txtIdCantante4.getText()));
            if (cantanteTempo!=null) {
                txtIdCantante4.setEnabled(false);
                this.mostrarDatos(cantanteTempo);
                bntBuscar4.setEnabled(false);
                bntBuscarDisco.setEnabled(true);
                //txtNombreDisco4.setEnabled(true);
                //txtCodigo4.setEnabled(true);
                //txtAnioLanzamiento4.setEnabled(true);
                txtCodigo4.setEnabled(true);

            }else{
                JOptionPane.showMessageDialog(this, mensajes.getString("joption.noexiste")); 
            }
        }
    }//GEN-LAST:event_bntBuscar4ActionPerformed

    private void txtNombre4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre4ActionPerformed

    private void txtCodigo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo4ActionPerformed

    private void txtAnioLanzamiento4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnioLanzamiento4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioLanzamiento4ActionPerformed

    private void bntActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntActualizarActionPerformed
        
        if (txtAnioLanzamiento4.getText().isEmpty()||txtNombreDisco4.getText().isEmpty()||txtCodigo4.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, mensajes.getString("joption.nosehanllenado")); 
        }else{
            Disco disquito = new Disco(Integer.parseInt(txtCodigo4.getText()), txtNombreDisco4.getText(), Integer.parseInt(txtAnioLanzamiento4.getText()));
            cantanteTempo.actualizarDisco(disquito);
            JOptionPane.showMessageDialog(this, mensajes.getString("joption.seactualizo")); 
            txtNombreDisco4.setText("");
            txtAnioLanzamiento4.setText("");
            txtCodigo4.setText("");
            txtNombreDisco4.setEnabled(false);
            txtAnioLanzamiento4.setEnabled(false);
            txtCodigo4.setEnabled(true);
            bntActualizar.setEnabled(false);
            System.out.println(cantanteTempo);
        }
    }//GEN-LAST:event_bntActualizarActionPerformed
    
    public void limpiarCampos(){
        txtIdCantante4.setText("");
        
        txtApellido4.setText("");
        txtCodigo4.setText("");
        txtEdad4.setText("");
        txtNombreArtistico4.setText("");
        txtNombreDisco4.setText("");
        txtAnioLanzamiento4.setText("");
        txtNombre4.setText("");
    }
    public void mostrarDatos(Cantante cantante){
        txtIdCantante4.setEnabled(false);
        bntBuscar4.setEnabled(false);
        txtNombre4.setText(cantante.getNombre());
        txtEdad4.setText( String.valueOf(cantante.getEdad()));
        txtNombreArtistico4.setText(cantante.getNombreArtistico());
        txtApellido4.setText(cantante.getApellido());
        
    }
    
    private void bntCancelar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelar4ActionPerformed
        // TODO add your handling code here:
        this.limpiarCampos();
        this.setVisible(false);
        txtNombreDisco4.setEnabled(false);
        txtAnioLanzamiento4.setEnabled(false);
        bntActualizar.setEnabled(false);
        bntBuscar4.setEnabled(true);
        txtIdCantante4.setEnabled(true);
        bntBuscarDisco.setEnabled(false);
        txtCodigo4.setEnabled(false);
    }//GEN-LAST:event_bntCancelar4ActionPerformed

    private void bntBuscarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarDiscoActionPerformed
       // TODO add your handling code here:
        if (txtCodigo4.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, mensajes.getString("joption.noestallenocodigo")); 
        }else {
            disco = cantanteTempo.buscarDisco(Integer.parseInt(txtCodigo4.getText()));
            if (disco!=null) {
                txtCodigo4.setEnabled(false);
                txtAnioLanzamiento4.setText(String.valueOf(disco.getAnioDeLanzamiento()));
                bntActualizar.setEnabled(true);
                txtAnioLanzamiento4.setEnabled(true);
                txtNombreDisco4.setEnabled(true);
                txtNombreDisco4.setText(disco.getNombre());
                bntBuscarDisco.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(this, mensajes.getString("joption.noseencontroeldisco")); 
            }
        }
    }//GEN-LAST:event_bntBuscarDiscoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntActualizar;
    private javax.swing.JButton bntBuscar4;
    private javax.swing.JButton bntBuscarDisco;
    private javax.swing.JButton bntCancelar4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel jblAnioLanzaminietoActualizarDisco;
    private javax.swing.JLabel jblApellidoActualizarDisco;
    private javax.swing.JLabel jblCodigoActualizarDisco;
    private javax.swing.JLabel jblEdadActualizarDisco;
    private javax.swing.JLabel jblIdActualizarDisco;
    private javax.swing.JLabel jblNombreActualizarDisco;
    private javax.swing.JLabel jblNombreArtisticoActualizarDisco;
    private javax.swing.JLabel jblNombreDiscoActualizarDisco;
    private javax.swing.JPanel panelA;
    private javax.swing.JTextField txtAnioLanzamiento4;
    private javax.swing.JTextField txtApellido4;
    private javax.swing.JTextField txtCodigo4;
    private javax.swing.JTextField txtEdad4;
    private javax.swing.JTextField txtIdCantante4;
    private javax.swing.JTextField txtNombre4;
    private javax.swing.JTextField txtNombreArtistico4;
    private javax.swing.JTextField txtNombreDisco4;
    // End of variables declaration//GEN-END:variables
}
