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
import javax.swing.border.Border;

/**
 *
 * @author venot
 */
public class AgregarDisco extends javax.swing.JInternalFrame {
    private ControladorCantante controladorCantante ;
    private Cantante cantanteTempo;
    private ResourceBundle mensajes;
    /**
     * Creates new form AgregarDisco
     */
    public AgregarDisco(ControladorCantante controladorCantante) {
        initComponents();
        this.controladorCantante = controladorCantante;
    }
    
    public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jblCodigoAgregarDisco.setText(mensajes.getString("ventana.codigo"));
        jblIdAgregarDisco.setText(mensajes.getString("ventana.id"));
        jblNombreCAgregarDisco.setText(mensajes.getString("ventana.nombre"));
        jblNombreArAgregarDisco.setText(mensajes.getString("ventanaCantante.nombreartistico"));
        jblEdadCAgregarDisco.setText(mensajes.getString("ventana.edad"));
        jblApellidoAAgregarDisco.setText(mensajes.getString("ventana.apellido"));
        jblNombreDiscoAgregarDisco.setText(mensajes.getString("ventana.nombre"));
        jblAnioLanzamientoAgregarDisco.setText(mensajes.getString("ventanaDisco.aniolanzamiento"));
        bntBuscar.setText(mensajes.getString("boton.buscar"));
        bntAgregar.setText(mensajes.getString("boton.agregar"));
        bntCancelar.setText(mensajes.getString("boton.cancelar"));
        Border borde = BorderFactory.createTitledBorder(mensajes.getString("panel.agregardisco"));
        jpanelA.setBorder(borde);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelA = new javax.swing.JPanel();
        jblIdAgregarDisco = new javax.swing.JLabel();
        txtIdCantante = new javax.swing.JTextField();
        bntBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jblNombreCAgregarDisco = new javax.swing.JLabel();
        jblApellidoAAgregarDisco = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jblEdadCAgregarDisco = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jblNombreArAgregarDisco = new javax.swing.JLabel();
        txtNombreArtistico = new javax.swing.JTextField();
        jblCodigoAgregarDisco = new javax.swing.JLabel();
        jblNombreDiscoAgregarDisco = new javax.swing.JLabel();
        jblAnioLanzamientoAgregarDisco = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombreDisco = new javax.swing.JTextField();
        txtAnioLanzamiento = new javax.swing.JTextField();
        bntAgregar = new javax.swing.JButton();
        bntCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jpanelA.setBorder(javax.swing.BorderFactory.createTitledBorder("AGREGAR DISCO"));

        jblIdAgregarDisco.setText("Buscar cantante a agregar disco : ");

        bntBuscar.setText("Buscar");
        bntBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese el nombre del disco");

        txtNombre.setEditable(false);
        txtNombre.setEnabled(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jblNombreCAgregarDisco.setText("Nombre : ");

        jblApellidoAAgregarDisco.setText("Apellido :");

        txtApellido.setEditable(false);
        txtApellido.setEnabled(false);

        jblEdadCAgregarDisco.setText("Edad :");

        txtEdad.setEditable(false);
        txtEdad.setEnabled(false);

        jblNombreArAgregarDisco.setText("Nombre artistico :");

        txtNombreArtistico.setEditable(false);
        txtNombreArtistico.setEnabled(false);

        jblCodigoAgregarDisco.setText("Codigo :");

        jblNombreDiscoAgregarDisco.setText("Nombre :");

        jblAnioLanzamientoAgregarDisco.setText("Año de lanzamiento :");

        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtNombreDisco.setEnabled(false);

        txtAnioLanzamiento.setEnabled(false);
        txtAnioLanzamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnioLanzamientoActionPerformed(evt);
            }
        });

        bntAgregar.setText("Agregar");
        bntAgregar.setEnabled(false);
        bntAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAgregarActionPerformed(evt);
            }
        });

        bntCancelar.setText("Cancelar");
        bntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelALayout = new javax.swing.GroupLayout(jpanelA);
        jpanelA.setLayout(jpanelALayout);
        jpanelALayout.setHorizontalGroup(
            jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelALayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelALayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpanelALayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblNombreCAgregarDisco)
                            .addComponent(jblEdadCAgregarDisco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblNombreArAgregarDisco)
                            .addComponent(jblApellidoAAgregarDisco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApellido)
                            .addComponent(txtNombreArtistico, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpanelALayout.createSequentialGroup()
                        .addComponent(jblIdAgregarDisco)
                        .addGap(44, 44, 44)
                        .addComponent(txtIdCantante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(bntBuscar)
                        .addGap(39, 39, 39))))
            .addGroup(jpanelALayout.createSequentialGroup()
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelALayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblCodigoAgregarDisco)
                            .addComponent(jblNombreDiscoAgregarDisco)
                            .addComponent(jblAnioLanzamientoAgregarDisco)))
                    .addGroup(jpanelALayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(bntAgregar)))
                .addGap(45, 45, 45)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntCancelar)
                    .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtCodigo)
                        .addComponent(txtNombreDisco)
                        .addComponent(txtAnioLanzamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpanelALayout.setVerticalGroup(
            jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelALayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblIdAgregarDisco)
                    .addComponent(txtIdCantante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblNombreCAgregarDisco)
                    .addComponent(jblApellidoAAgregarDisco)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblEdadCAgregarDisco)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblNombreArAgregarDisco)
                    .addComponent(txtNombreArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblCodigoAgregarDisco)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblNombreDiscoAgregarDisco)
                    .addComponent(txtNombreDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblAnioLanzamientoAgregarDisco)
                    .addComponent(txtAnioLanzamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntAgregar)
                    .addComponent(bntCancelar))
                .addGap(16, 16, 16))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Disco.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpanelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpanelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnioLanzamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnioLanzamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioLanzamientoActionPerformed

    private void bntBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarActionPerformed
        // TODO add your handling code here:
        if (txtIdCantante.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, mensajes.getString("joption.noestalleno"));
        }else{
            cantanteTempo = controladorCantante.buscarCantante(Integer.parseInt(txtIdCantante.getText()));
            if (cantanteTempo!=null) {
                txtIdCantante.setEnabled(false);
                this.mostrarDatos(cantanteTempo);
                bntBuscar.setEnabled(false);
                bntAgregar.setEnabled(true);
                txtNombreDisco.setEnabled(true);
                txtCodigo.setEnabled(true);
                txtAnioLanzamiento.setEnabled(true);
                
            }else{
                JOptionPane.showMessageDialog(this, mensajes.getString("joption.noexiste"));
            }
        }
    }//GEN-LAST:event_bntBuscarActionPerformed

    private void bntAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAgregarActionPerformed
        if (txtAnioLanzamiento.getText().isEmpty()||txtNombreDisco.getText().isEmpty()||txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, mensajes.getString("joption.nosehanllenado")); 
        }else{
            int codigo = Integer.parseInt( txtCodigo.getText());
            if (cantanteTempo.buscarDisco(codigo)==null) {
                String nombre =txtNombreDisco.getText();
                int anio = Integer.parseInt( txtAnioLanzamiento.getText());
                Disco disco = new Disco(codigo, nombre, anio);
                cantanteTempo.agregarDisco(disco);
                JOptionPane.showMessageDialog(this, mensajes.getString("joption.seacreado")); 
                txtNombreDisco.setText("");
                txtCodigo.setText("");
                txtAnioLanzamiento.setText("");
                System.out.println(cantanteTempo);
        }else{
            JOptionPane.showMessageDialog(this, mensajes.getString("joption.elid")); 
        }
        }
    }//GEN-LAST:event_bntAgregarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarActionPerformed
        // TODO add your handling code here:
        this.limpiarCampos();
        this.setVisible(false);
        bntAgregar.setEnabled(false);
        bntBuscar.setEnabled(true);
        txtIdCantante.setEnabled(true);
        txtNombreDisco.setEnabled(false);
        txtAnioLanzamiento.setEnabled(false);
        txtCodigo.setEnabled(false);
    }//GEN-LAST:event_bntCancelarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed
    public void limpiarCampos(){
        txtIdCantante.setText("");
        txtNombreDisco.setText("");
        txtApellido.setText("");
        txtCodigo.setText("");
        txtEdad.setText("");
        txtNombreArtistico.setText("");
        txtNombreDisco.setText("");
        txtAnioLanzamiento.setText("");
        txtNombre.setText("");
    }
    public void mostrarDatos(Cantante cantante){
        txtIdCantante.setEnabled(false);
        bntBuscar.setEnabled(false);
        txtNombre.setText(cantante.getNombre());
        txtEdad.setText( String.valueOf(cantante.getEdad()));
        txtNombreArtistico.setText(cantante.getNombreArtistico());
        txtApellido.setText(cantante.getApellido());
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAgregar;
    private javax.swing.JButton bntBuscar;
    private javax.swing.JButton bntCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jblAnioLanzamientoAgregarDisco;
    private javax.swing.JLabel jblApellidoAAgregarDisco;
    private javax.swing.JLabel jblCodigoAgregarDisco;
    private javax.swing.JLabel jblEdadCAgregarDisco;
    private javax.swing.JLabel jblIdAgregarDisco;
    private javax.swing.JLabel jblNombreArAgregarDisco;
    private javax.swing.JLabel jblNombreCAgregarDisco;
    private javax.swing.JLabel jblNombreDiscoAgregarDisco;
    private javax.swing.JPanel jpanelA;
    private javax.swing.JTextField txtAnioLanzamiento;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtIdCantante;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreArtistico;
    private javax.swing.JTextField txtNombreDisco;
    // End of variables declaration//GEN-END:variables
}
