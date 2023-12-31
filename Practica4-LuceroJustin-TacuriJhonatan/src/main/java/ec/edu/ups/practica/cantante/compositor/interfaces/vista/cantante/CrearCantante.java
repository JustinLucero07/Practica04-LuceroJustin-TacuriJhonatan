/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica.cantante.compositor.interfaces.vista.cantante;

import ec.edu.ups.practica.cantante.compositor.interfaces.controlador.ControladorCantante;
import ec.edu.ups.practica.cantante.compositor.interfaces.modelo.Cantante;
import ec.edu.ups.practica.cantante.compositor.interfaces.modelo.Disco;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author ESTUDIANTE
 */
public class CrearCantante extends javax.swing.JInternalFrame {
    private ControladorCantante controladorCantante;
    private ResourceBundle mensajes;
    /**
     * Creates new form VentanaCrearCantante
     */
    public CrearCantante(ControladorCantante controladorCantante) {
        initComponents();
        this.controladorCantante = controladorCantante;
    }

    public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jblIdCrearCantante.setText(mensajes.getString("ventana.id"));
        jblNombreCrearCantante.setText(mensajes.getString("ventana.nombre"));
        jblApellidoCrearCantante.setText(mensajes.getString("ventana.apellido"));
        jblEdadCrearCantante.setText(mensajes.getString("ventana.edad"));
        jblSalarioCrearCantante.setText(mensajes.getString("ventana.salario"));
        jblNacionalidadCrearCantante.setText(mensajes.getString("ventana.nacionalidad"));
        jblGeneroMusicalCrearCantante.setText(mensajes.getString("ventanaCantante.generomusical"));
        jblNumeroConciertosCrearCantante.setText(mensajes.getString("ventanaCantante.numeroconciertos"));
        jblNumeroGirasCrearCantante.setText(mensajes.getString("ventanaCantante.numerogiras"));
        jblNumeroSencillosCrearCantante.setText(mensajes.getString("ventanaCantante.numerosencillos"));
        jblNombreArCrearCantante.setText(mensajes.getString("ventanaCantante.nombreartistico"));
        btnCancelar.setText(mensajes.getString("boton.cancelar"));
        btnCrearCantante.setText(mensajes.getString("boton.aceptar"));
        Border borde = BorderFactory.createTitledBorder(mensajes.getString("panel.crearcantante"));
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
        jblIdCrearCantante = new javax.swing.JLabel();
        jblNombreCrearCantante = new javax.swing.JLabel();
        jblApellidoCrearCantante = new javax.swing.JLabel();
        jblEdadCrearCantante = new javax.swing.JLabel();
        jblNacionalidadCrearCantante = new javax.swing.JLabel();
        jblSalarioCrearCantante = new javax.swing.JLabel();
        jblNombreArCrearCantante = new javax.swing.JLabel();
        jblGeneroMusicalCrearCantante = new javax.swing.JLabel();
        jblNumeroSencillosCrearCantante = new javax.swing.JLabel();
        jblNumeroConciertosCrearCantante = new javax.swing.JLabel();
        jblNumeroGirasCrearCantante = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtNombreArtistico = new javax.swing.JTextField();
        txtNumeroSencillos = new javax.swing.JTextField();
        txtNumeroConciertos = new javax.swing.JTextField();
        txtNumeroGiras = new javax.swing.JTextField();
        btnCrearCantante = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbxGeneroMusical = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jpanelA.setBorder(javax.swing.BorderFactory.createTitledBorder("CREAR CANTANTE"));
        jpanelA.setLayout(null);

        jblIdCrearCantante.setText("ID:");
        jpanelA.add(jblIdCrearCantante);
        jblIdCrearCantante.setBounds(74, 57, 161, 16);

        jblNombreCrearCantante.setText("Nombre:");
        jpanelA.add(jblNombreCrearCantante);
        jblNombreCrearCantante.setBounds(71, 100, 110, 16);

        jblApellidoCrearCantante.setText("Apellido:");
        jpanelA.add(jblApellidoCrearCantante);
        jblApellidoCrearCantante.setBounds(71, 134, 110, 16);

        jblEdadCrearCantante.setText("Edad:");
        jpanelA.add(jblEdadCrearCantante);
        jblEdadCrearCantante.setBounds(71, 183, 58, 16);

        jblNacionalidadCrearCantante.setText("Nacionalidad:");
        jpanelA.add(jblNacionalidadCrearCantante);
        jblNacionalidadCrearCantante.setBounds(71, 220, 110, 16);

        jblSalarioCrearCantante.setText("Salario:");
        jpanelA.add(jblSalarioCrearCantante);
        jblSalarioCrearCantante.setBounds(71, 261, 86, 16);

        jblNombreArCrearCantante.setText("Nombre Artistico:");
        jpanelA.add(jblNombreArCrearCantante);
        jblNombreArCrearCantante.setBounds(71, 298, 118, 16);

        jblGeneroMusicalCrearCantante.setText("Genero Musical:");
        jpanelA.add(jblGeneroMusicalCrearCantante);
        jblGeneroMusicalCrearCantante.setBounds(71, 338, 140, 16);

        jblNumeroSencillosCrearCantante.setText("Numero de Sencillos:");
        jpanelA.add(jblNumeroSencillosCrearCantante);
        jblNumeroSencillosCrearCantante.setBounds(71, 375, 180, 16);

        jblNumeroConciertosCrearCantante.setText("Numero de Conciertos:");
        jpanelA.add(jblNumeroConciertosCrearCantante);
        jblNumeroConciertosCrearCantante.setBounds(71, 415, 170, 16);

        jblNumeroGirasCrearCantante.setText("Numero de Giras:");
        jpanelA.add(jblNumeroGirasCrearCantante);
        jblNumeroGirasCrearCantante.setBounds(71, 455, 160, 16);
        jpanelA.add(txtID);
        txtID.setBounds(270, 54, 198, 22);
        jpanelA.add(txtNombre);
        txtNombre.setBounds(270, 100, 198, 22);
        jpanelA.add(txtApellido);
        txtApellido.setBounds(270, 140, 198, 22);
        jpanelA.add(txtEdad);
        txtEdad.setBounds(270, 180, 198, 22);
        jpanelA.add(txtNacionalidad);
        txtNacionalidad.setBounds(270, 217, 198, 22);
        jpanelA.add(txtSalario);
        txtSalario.setBounds(270, 258, 198, 22);
        jpanelA.add(txtNombreArtistico);
        txtNombreArtistico.setBounds(270, 298, 198, 22);
        jpanelA.add(txtNumeroSencillos);
        txtNumeroSencillos.setBounds(270, 372, 198, 22);
        jpanelA.add(txtNumeroConciertos);
        txtNumeroConciertos.setBounds(270, 412, 198, 22);
        jpanelA.add(txtNumeroGiras);
        txtNumeroGiras.setBounds(270, 452, 198, 22);

        btnCrearCantante.setText("Aceptar");
        btnCrearCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCantanteActionPerformed(evt);
            }
        });
        jpanelA.add(btnCrearCantante);
        btnCrearCantante.setBounds(270, 536, 72, 23);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jpanelA.add(btnCancelar);
        btnCancelar.setBounds(369, 536, 76, 23);
        jpanelA.add(jLabel1);
        jLabel1.setBounds(123, 36, 0, 0);

        cbxGeneroMusical.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione el Género Musical-", "Reggaeton", "Trap", "Pop", "Rap", "Rock", "Bachata", "Cumbia", "Salsa", "Otro" }));
        jpanelA.add(cbxGeneroMusical);
        cbxGeneroMusical.setBounds(270, 338, 197, 22);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/455593 (1).png"))); // NOI18N
        jpanelA.add(jLabel3);
        jLabel3.setBounds(16, 24, 40, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ImgenCantante.jpg"))); // NOI18N
        jpanelA.add(jLabel2);
        jLabel2.setBounds(10, 20, 510, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelA, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelA, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCantanteActionPerformed
        
        if (this.validacionDeCampos()) {
            int id = Integer.parseInt(txtID.getText());
            if(controladorCantante.buscarCantante(id)==null) {
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                int edad = Integer.parseInt(txtEdad.getText());
                String nacionalidad = txtNacionalidad.getText();
                double salario = Double.parseDouble(txtSalario.getText());
                String nombreArtistico = txtNombreArtistico.getText();
                String genero = cbxGeneroMusical.getSelectedItem().toString(); 
                int numeroSencillos = Integer.parseInt(txtNumeroSencillos.getText());
                int numeroConciertos = Integer.parseInt(txtNumeroConciertos.getText());
                int numeroGiras = Integer.parseInt(txtNumeroGiras.getText());
                Cantante cantante = new Cantante(nombreArtistico, genero, numeroSencillos, numeroConciertos, numeroGiras, id, nombre, apellido, edad, nacionalidad, salario);
                //Disco disco = new Disco(12, "La noche", 2000);
                //cantante.agregarDisco(disco);
                controladorCantante.registrar(cantante); 
                this.limpiarCampos();
                JOptionPane.showMessageDialog(this, mensajes.getString("joption.secreocantante")); 
                System.out.println(controladorCantante.verCantantes());
            }else{
                JOptionPane.showMessageDialog(this, mensajes.getString("joption.elid")); 
            }
        }else{
            JOptionPane.showMessageDialog(this,mensajes.getString("joption.nosehanllenado")); 
        }
    }//GEN-LAST:event_btnCrearCantanteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.limpiarCampos();
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        this.limpiarCampos();
    }//GEN-LAST:event_formInternalFrameClosing
    private boolean validacionDeCampos(){
        if (txtID.getText().isEmpty()||txtNombre.getText().isEmpty()||txtApellido.getText().isEmpty()||txtEdad.getText().isEmpty()||txtNacionalidad.getText().isEmpty()
                || txtSalario.getText().isEmpty()||txtNombreArtistico.getText().isEmpty() ||txtNumeroSencillos.getText().isEmpty()
                ||txtNumeroConciertos.getText().isEmpty()||txtNumeroGiras.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    private void limpiarCampos(){
        txtID.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtNacionalidad.setText("");
        txtSalario.setText("");
        txtNombreArtistico.setText("");
        txtNumeroConciertos.setText("");
        txtNumeroSencillos.setText("");
        txtNumeroGiras.setText("");
        cbxGeneroMusical.setSelectedIndex(0); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrearCantante;
    private javax.swing.JComboBox<String> cbxGeneroMusical;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jblApellidoCrearCantante;
    private javax.swing.JLabel jblEdadCrearCantante;
    private javax.swing.JLabel jblGeneroMusicalCrearCantante;
    private javax.swing.JLabel jblIdCrearCantante;
    private javax.swing.JLabel jblNacionalidadCrearCantante;
    private javax.swing.JLabel jblNombreArCrearCantante;
    private javax.swing.JLabel jblNombreCrearCantante;
    private javax.swing.JLabel jblNumeroConciertosCrearCantante;
    private javax.swing.JLabel jblNumeroGirasCrearCantante;
    private javax.swing.JLabel jblNumeroSencillosCrearCantante;
    private javax.swing.JLabel jblSalarioCrearCantante;
    private javax.swing.JPanel jpanelA;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreArtistico;
    private javax.swing.JTextField txtNumeroConciertos;
    private javax.swing.JTextField txtNumeroGiras;
    private javax.swing.JTextField txtNumeroSencillos;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
