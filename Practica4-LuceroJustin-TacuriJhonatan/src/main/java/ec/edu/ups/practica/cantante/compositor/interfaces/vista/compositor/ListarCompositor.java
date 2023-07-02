/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica.cantante.compositor.interfaces.vista.compositor;

import ec.edu.ups.practica.cantante.compositor.interfaces.controlador.ControladorCompositor;
import ec.edu.ups.practica.cantante.compositor.interfaces.modelo.Compositor;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Usuario
 */
public class ListarCompositor extends javax.swing.JInternalFrame {
    private ControladorCompositor controladorCompositor;
    private ResourceBundle mensajes;
    /**
     * Creates new form ListarCompositor
     */
    public ListarCompositor(ControladorCompositor controladorCompositor) {
        initComponents();
        this.controladorCompositor = controladorCompositor;
    }

    public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        btnSalir.setText(mensajes.getString("boton.salir"));
        Border borde = BorderFactory.createTitledBorder(mensajes.getString("panel.listarcompositor"));
        jpanelA.setBorder(borde);
        TableColumnModel columnModel = tblCompositor.getColumnModel();
        TableColumn columnaId = columnModel.getColumn(0);
        columnaId.setHeaderValue(mensajes.getString("ventana.id"));
        TableColumn columnaNombre = columnModel.getColumn(1);
        columnaNombre.setHeaderValue(mensajes.getString("ventana.nombre"));
        TableColumn columnaApellido = columnModel.getColumn(2);
        columnaApellido.setHeaderValue(mensajes.getString("ventana.apellido"));
        TableColumn columnaEdad = columnModel.getColumn(3);
        columnaEdad.setHeaderValue(mensajes.getString("ventana.edad"));
        TableColumn columnaNacionalidad = columnModel.getColumn(4);
        columnaNacionalidad.setHeaderValue(mensajes.getString("ventana.nacionalidad"));
        TableColumn columnaSalario = columnModel.getColumn(5);
        columnaSalario.setHeaderValue(mensajes.getString("ventana.salario"));
        TableColumn columnaNumeroComposiciones = columnModel.getColumn(6);
        columnaNumeroComposiciones.setHeaderValue(mensajes.getString("ventanaCompositor.numerocomposiciones"));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();
        jpanelA = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCompositor = new javax.swing.JTable();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
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

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jpanelA.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTAR COMPOSITOR"));

        tblCompositor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Edad", "Nacionalidad", "Salario", "# Composiciones"
            }
        ));
        jScrollPane1.setViewportView(tblCompositor);

        javax.swing.GroupLayout jpanelALayout = new javax.swing.GroupLayout(jpanelA);
        jpanelA.setLayout(jpanelALayout);
        jpanelALayout.setHorizontalGroup(
            jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jpanelALayout.setVerticalGroup(
            jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelALayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jpanelA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpanelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(409, 409, 409))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        this.actualizarTabla();
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void actualizarTabla(){
        DefaultTableModel modelo = (DefaultTableModel)this.tblCompositor.getModel();
        modelo.setNumRows(0);
        List <Compositor> listaCompositores = controladorCompositor.verCompositores();
        //if (listaPersonas!=null) {
            for (Compositor listaCompositore : listaCompositores) {
                int id = listaCompositore.getCodigo();
                String nombre = listaCompositore.getNombre();
                String apellido = listaCompositore.getApellido();
                int edad = listaCompositore.getEdad();
                String nacionalidad = listaCompositore.getNacionalidad();
                double salario = listaCompositore.calcularSalario();
                int numeroComposiciones = listaCompositore.getNumeroDeComposiciones();
                Object[] rowDate = {id,nombre,apellido,edad,nacionalidad,salario,numeroComposiciones};
                modelo.addRow(rowDate);
            }
            this.tblCompositor.setModel(modelo);
        //}else{
          //  JOptionPane.showMessageDialog(this, "No se ha ingresado ningun cantante aun");
        //}
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanelA;
    private javax.swing.JTable tblCompositor;
    // End of variables declaration//GEN-END:variables
}
