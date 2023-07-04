/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica.cantante.compositor.interfaces.vista.cantante;

import ec.edu.ups.practica.cantante.compositor.interfaces.controlador.ControladorCantante;
import ec.edu.ups.practica.cantante.compositor.interfaces.modelo.Cantante;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author venot
 */
public class ListarCantante extends javax.swing.JInternalFrame {
    private ControladorCantante controladorCantante;
    private ResourceBundle mensajes;
    /**
     * Creates new form ListarCantante
     */
    public ListarCantante(ControladorCantante controladorCantante) {
        initComponents();
        this.controladorCantante = controladorCantante;
    }

    public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        bntSalir.setText(mensajes.getString("boton.salir"));
        Border borde = BorderFactory.createTitledBorder(mensajes.getString("panel.listarcantante"));
        jpanelA.setBorder(borde);
        TableColumnModel columnModel = tblCanatntes.getColumnModel();
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
        TableColumn columnaNombreArtistico = columnModel.getColumn(6);
        columnaNombreArtistico.setHeaderValue(mensajes.getString("ventanaCantante.nombreartistico"));
        TableColumn columnaGeneroMusical = columnModel.getColumn(7);
        columnaGeneroMusical.setHeaderValue(mensajes.getString("ventanaCantante.generomusical"));
        TableColumn columnaNumeroSencillos = columnModel.getColumn(8);
        columnaNumeroSencillos.setHeaderValue(mensajes.getString("ventanaCantante.numerosencillos"));
        TableColumn columnaNumeroConciertos = columnModel.getColumn(9);
        columnaNumeroConciertos.setHeaderValue(mensajes.getString("ventanaCantante.numeroconciertos"));
        TableColumn columnaNumeroGiras = columnModel.getColumn(10);
        columnaNumeroGiras.setHeaderValue(mensajes.getString("ventanaCantante.numerogiras"));
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCanatntes = new javax.swing.JTable();
        bntSalir = new javax.swing.JToggleButton();

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

        jpanelA.setBackground(new java.awt.Color(102, 0, 204));
        jpanelA.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTAR CANTANTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tblCanatntes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Edad", "Nacionalida", "Salario", "Artistico", "Genero", "Número de Sencillos", "Numero de Conciertos", "Numero de Giras"
            }
        ));
        jScrollPane1.setViewportView(tblCanatntes);

        bntSalir.setText("Salir");
        bntSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelALayout = new javax.swing.GroupLayout(jpanelA);
        jpanelA.setLayout(jpanelALayout);
        jpanelALayout.setHorizontalGroup(
            jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelALayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(bntSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpanelALayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelALayout.setVerticalGroup(
            jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bntSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        this.actualizarTabla();
    }//GEN-LAST:event_formInternalFrameActivated

    private void bntSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
    }//GEN-LAST:event_bntSalirActionPerformed
    private void actualizarTabla(){
        DefaultTableModel modelo = (DefaultTableModel)this.tblCanatntes.getModel();
        modelo.setNumRows(0);
        List <Cantante> listaPersonas = controladorCantante.verCantantes();
        //if (listaPersonas!=null) {
            for (Cantante listaPersona : listaPersonas) {
                int id = listaPersona.getCodigo();
                String nombre = listaPersona.getNombre();
                String apellido = listaPersona.getApellido();
                int edad = listaPersona.getEdad();
                String nacionalidad = listaPersona.getNacionalidad();
                double salario = Math.round(listaPersona.calcularSalario()*100.0)/100.0;
                String nombreArtistico = listaPersona.getNombreArtistico();
                String genero = listaPersona.getGeneroMusical();
                int numeroSencillos = listaPersona.getNumeroDeSencillos();
                int numeroConciertos =listaPersona.getNumeroDeConciertos();
                int numeroGiras = listaPersona.getNumeroDeGiras();
                Object[] rowDate = {id,nombre,apellido,edad,nacionalidad,salario,nombreArtistico,genero,numeroSencillos,numeroConciertos,numeroGiras};
                modelo.addRow(rowDate);
            }
            this.tblCanatntes.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bntSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanelA;
    private javax.swing.JTable tblCanatntes;
    // End of variables declaration//GEN-END:variables
}
