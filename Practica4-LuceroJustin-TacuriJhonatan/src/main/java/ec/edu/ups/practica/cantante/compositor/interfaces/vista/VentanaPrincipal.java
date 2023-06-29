/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package ec.edu.ups.practica.cantante.compositor.interfaces.vista;

import ec.edu.ups.practica.cantante.compositor.interfaces.controlador.ControladorCantante;
import ec.edu.ups.practica.cantante.compositor.interfaces.controlador.ControladorCompositor;
import ec.edu.ups.practica.cantante.compositor.interfaces.dao.CantanteDao;
import ec.edu.ups.practica.cantante.compositor.interfaces.dao.CompositorDao;
import ec.edu.ups.practica.cantante.compositor.interfaces.idao.ICantanteDao;
import ec.edu.ups.practica.cantante.compositor.interfaces.idao.ICompositorDao;
import ec.edu.ups.practica.cantante.compositor.interfaces.vista.Disco.AgregarDisco;
import ec.edu.ups.practica.cantante.compositor.interfaces.vista.cancion.ActualizarCancion;
import ec.edu.ups.practica.cantante.compositor.interfaces.vista.cancion.AgregarCancion;
import ec.edu.ups.practica.cantante.compositor.interfaces.vista.cancion.BuscarCancion;
import ec.edu.ups.practica.cantante.compositor.interfaces.vista.cancion.EliminarCancion;
import ec.edu.ups.practica.cantante.compositor.interfaces.vista.cantante.ActualizarCantante;
import ec.edu.ups.practica.cantante.compositor.interfaces.vista.cantante.BuscarCantante;
import ec.edu.ups.practica.cantante.compositor.interfaces.vista.cantante.EliminarCantante;
import ec.edu.ups.practica.cantante.compositor.interfaces.vista.cantante.CrearCantante;
import ec.edu.ups.practica.cantante.compositor.interfaces.vista.cantante.ListarCantante;
import ec.edu.ups.practica.cantante.compositor.interfaces.vista.compositor.ActualizarCompositor;
import ec.edu.ups.practica.cantante.compositor.interfaces.vista.compositor.BuscarCompositor;
import ec.edu.ups.practica.cantante.compositor.interfaces.vista.compositor.CrearCompositor;
import ec.edu.ups.practica.cantante.compositor.interfaces.vista.compositor.EliminarCompositor;
import ec.edu.ups.practica.cantante.compositor.interfaces.vista.compositor.ListarCompositor;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author ESTUDIANTE
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private ControladorCantante controladorCantante;
    private ICantanteDao cantanteDao;
    private ControladorCompositor controladorCompositor;
    private ICompositorDao compositorDao;
    
    private EliminarCantante eliminarCantante;
    private CrearCantante ventanaCrearCantante;
    private BuscarCantante ventanaBuscarCantante;
    private ActualizarCantante actualizarCantante;
    private ListarCantante listarCantante;
    private CrearCompositor crearCompositor;
    private BuscarCompositor buscarCompositor;
    private ActualizarCompositor actualizarCompositor;
    private EliminarCompositor eliminarCompositor;
    private ListarCompositor listarCompositor;
    private AgregarCancion agregarCancion;
    private AgregarDisco agregarDisco;
    private BuscarCancion buscarCacion;
    private ActualizarCancion actualizarCancion;
    private EliminarCancion eliminarCancion;
    
    //Internacionalizacion 
    private Locale localizacion;
    private ResourceBundle mensaje;
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        cantanteDao = new CantanteDao();
        controladorCantante = new ControladorCantante(cantanteDao) ;
        compositorDao = new CompositorDao();
        controladorCompositor = new ControladorCompositor(compositorDao);
        
        
        
        //Internacionalizacion
       // localizacion = Locale.getDefault();
       // System.out.println("Locali : "+ localizacion);
        //mensaje = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        //cambiarIdioma();
    }    
    //private void cambiarIdioma(){
      // mensaje = ResourceBundle.getBundle("mensaje ", localizacion);
     //   menuCantante.setText(mensaje.getString("menu.cantante"));
    //}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuCantante = new javax.swing.JMenu();
        itemCrearCantante = new javax.swing.JMenuItem();
        itemActualizarCantante = new javax.swing.JMenuItem();
        itemBuscarCantante = new javax.swing.JMenuItem();
        itemEliminarCantante = new javax.swing.JMenuItem();
        itemListarCantante = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        itemCrearDisco = new javax.swing.JMenuItem();
        itemActualizarDisco = new javax.swing.JMenuItem();
        itemBuscarDisco = new javax.swing.JMenuItem();
        itemEliminarDisco = new javax.swing.JMenuItem();
        itemListarDisco = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        itemCrearCompositor = new javax.swing.JMenuItem();
        itemActualizarCompositor = new javax.swing.JMenuItem();
        itemBuscarCompositor = new javax.swing.JMenuItem();
        itemEliminarCompositor = new javax.swing.JMenuItem();
        itemListarCompositor = new javax.swing.JMenuItem();
        opcCancion = new javax.swing.JMenu();
        itemCrearCancion = new javax.swing.JMenuItem();
        itemActualizarCancion = new javax.swing.JMenuItem();
        itemBuscarCancion = new javax.swing.JMenuItem();
        itemEliminarCancion = new javax.swing.JMenuItem();
        itemListarCancion = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        itemSalirMenu = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuItemIngles = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuCantante.setMnemonic('f');
        menuCantante.setText("Cantante");

        itemCrearCantante.setMnemonic('o');
        itemCrearCantante.setText("Crear");
        itemCrearCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCrearCantanteActionPerformed(evt);
            }
        });
        menuCantante.add(itemCrearCantante);

        itemActualizarCantante.setMnemonic('s');
        itemActualizarCantante.setText("Actualizar");
        itemActualizarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarCantanteActionPerformed(evt);
            }
        });
        menuCantante.add(itemActualizarCantante);

        itemBuscarCantante.setMnemonic('a');
        itemBuscarCantante.setText("Buscar");
        itemBuscarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarCantanteActionPerformed(evt);
            }
        });
        menuCantante.add(itemBuscarCantante);

        itemEliminarCantante.setMnemonic('x');
        itemEliminarCantante.setText("Eliminar");
        itemEliminarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarCantanteActionPerformed(evt);
            }
        });
        menuCantante.add(itemEliminarCantante);

        itemListarCantante.setText("Listar");
        itemListarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListarCantanteActionPerformed(evt);
            }
        });
        menuCantante.add(itemListarCantante);

        jMenu1.setText("Disco");

        itemCrearDisco.setText("Agregar");
        itemCrearDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCrearDiscoActionPerformed(evt);
            }
        });
        jMenu1.add(itemCrearDisco);

        itemActualizarDisco.setText("Actualizar");
        itemActualizarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarDiscoActionPerformed(evt);
            }
        });
        jMenu1.add(itemActualizarDisco);

        itemBuscarDisco.setText("Buscar");
        jMenu1.add(itemBuscarDisco);

        itemEliminarDisco.setText("Eliminar");
        jMenu1.add(itemEliminarDisco);

        itemListarDisco.setText("Listar");
        jMenu1.add(itemListarDisco);

        menuCantante.add(jMenu1);

        menuBar.add(menuCantante);

        editMenu.setMnemonic('e');
        editMenu.setText("Compositor");

        itemCrearCompositor.setMnemonic('t');
        itemCrearCompositor.setText("Crear");
        itemCrearCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCrearCompositorActionPerformed(evt);
            }
        });
        editMenu.add(itemCrearCompositor);

        itemActualizarCompositor.setMnemonic('y');
        itemActualizarCompositor.setText("Actualizar");
        itemActualizarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarCompositorActionPerformed(evt);
            }
        });
        editMenu.add(itemActualizarCompositor);

        itemBuscarCompositor.setMnemonic('p');
        itemBuscarCompositor.setText("Buscar");
        itemBuscarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarCompositorActionPerformed(evt);
            }
        });
        editMenu.add(itemBuscarCompositor);

        itemEliminarCompositor.setMnemonic('d');
        itemEliminarCompositor.setText("Eliminar");
        itemEliminarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarCompositorActionPerformed(evt);
            }
        });
        editMenu.add(itemEliminarCompositor);

        itemListarCompositor.setText("Listar");
        itemListarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListarCompositorActionPerformed(evt);
            }
        });
        editMenu.add(itemListarCompositor);

        opcCancion.setText("Cancion");

        itemCrearCancion.setText("Crear");
        itemCrearCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCrearCancionActionPerformed(evt);
            }
        });
        opcCancion.add(itemCrearCancion);

        itemActualizarCancion.setText("Actualizar");
        itemActualizarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarCancionActionPerformed(evt);
            }
        });
        opcCancion.add(itemActualizarCancion);

        itemBuscarCancion.setText("Buscar");
        itemBuscarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarCancionActionPerformed(evt);
            }
        });
        opcCancion.add(itemBuscarCancion);

        itemEliminarCancion.setText("Eliminar");
        itemEliminarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarCancionActionPerformed(evt);
            }
        });
        opcCancion.add(itemEliminarCancion);

        itemListarCancion.setText("Listar");
        opcCancion.add(itemListarCancion);

        editMenu.add(opcCancion);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Opciones");

        itemSalirMenu.setMnemonic('c');
        itemSalirMenu.setText("Salir");
        helpMenu.add(itemSalirMenu);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        jMenu3.setText("Idiomas");

        menuItemIngles.setText("Inglés");
        menuItemIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemInglesActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemIngles);

        jMenuItem3.setText("Frances");
        jMenu3.add(jMenuItem3);

        jMenuItem1.setText("Español");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        menuBar.add(jMenu3);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemEliminarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarCantanteActionPerformed
        if(eliminarCantante == null){
            eliminarCantante = new EliminarCantante(controladorCantante);
            desktopPane.add(eliminarCantante);
        }
        eliminarCantante.setVisible(true); 
    }//GEN-LAST:event_itemEliminarCantanteActionPerformed

    private void itemCrearCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCrearCompositorActionPerformed
        if(crearCompositor == null){
            crearCompositor = new CrearCompositor(controladorCompositor);
            desktopPane.add(crearCompositor);
        }
        crearCompositor.setVisible(true); 
    }//GEN-LAST:event_itemCrearCompositorActionPerformed

    private void itemBuscarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarCompositorActionPerformed
        if(buscarCompositor == null){
            buscarCompositor = new BuscarCompositor(controladorCompositor);
            desktopPane.add(buscarCompositor);
        }
        buscarCompositor.setVisible(true); 
    }//GEN-LAST:event_itemBuscarCompositorActionPerformed

    private void itemCrearCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCrearCantanteActionPerformed
        if(ventanaCrearCantante == null){
            ventanaCrearCantante = new CrearCantante(controladorCantante);
            desktopPane.add(ventanaCrearCantante);
        }
        ventanaCrearCantante.setVisible(true); 
    }//GEN-LAST:event_itemCrearCantanteActionPerformed

    private void itemBuscarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarCantanteActionPerformed
        // TODO add your handling code here:
        if(ventanaBuscarCantante == null){
            ventanaBuscarCantante = new BuscarCantante(controladorCantante);
            desktopPane.add(ventanaBuscarCantante);
        }
        ventanaBuscarCantante.setVisible(true); 
    }//GEN-LAST:event_itemBuscarCantanteActionPerformed

    private void itemCrearCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCrearCancionActionPerformed
        if(agregarCancion == null){
            agregarCancion = new AgregarCancion(controladorCompositor);
            desktopPane.add(agregarCancion);
        }
        agregarCancion.setVisible(true); 
    }//GEN-LAST:event_itemCrearCancionActionPerformed

    private void itemActualizarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarCantanteActionPerformed
        // TODO add your handling code here:
        if(actualizarCantante == null){
            actualizarCantante = new ActualizarCantante(controladorCantante);
            desktopPane.add(actualizarCantante);
        }
        actualizarCantante.setVisible(true); 
        
    }//GEN-LAST:event_itemActualizarCantanteActionPerformed

    private void itemListarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListarCantanteActionPerformed
        // TODO add your handling code here:
        if(listarCantante == null){
            listarCantante = new ListarCantante(controladorCantante);
            desktopPane.add(listarCantante);
        }
        listarCantante.setVisible(true); 
    }//GEN-LAST:event_itemListarCantanteActionPerformed

    private void itemActualizarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarCompositorActionPerformed
        if(actualizarCompositor == null){
            actualizarCompositor = new ActualizarCompositor(controladorCompositor);
            desktopPane.add(actualizarCompositor);
        }
        actualizarCompositor.setVisible(true); 
    }//GEN-LAST:event_itemActualizarCompositorActionPerformed

    private void itemEliminarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarCompositorActionPerformed
        if(eliminarCompositor == null){
            eliminarCompositor = new EliminarCompositor(controladorCompositor);
            desktopPane.add(eliminarCompositor);
        }
        eliminarCompositor.setVisible(true); 
    }//GEN-LAST:event_itemEliminarCompositorActionPerformed

    private void itemListarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListarCompositorActionPerformed
        if(listarCompositor == null){
            listarCompositor = new ListarCompositor(controladorCompositor);
            desktopPane.add(listarCompositor);
        }
        listarCompositor.setVisible(true); 
    }//GEN-LAST:event_itemListarCompositorActionPerformed

    private void itemCrearDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCrearDiscoActionPerformed
        // TODO add your handling code here:
        if(agregarDisco == null){
            agregarDisco = new AgregarDisco(controladorCantante);
            desktopPane.add(agregarDisco);
        }
        agregarDisco.setVisible(true); 
    }//GEN-LAST:event_itemCrearDiscoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuItemInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemInglesActionPerformed
        // TODO add your handling code here:
        localizacion = new Locale("en", "US");
    }//GEN-LAST:event_menuItemInglesActionPerformed

    private void itemActualizarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarDiscoActionPerformed
        // TODO add your handling code here:
        if(agregarDisco == null){
            agregarDisco = new AgregarDisco(controladorCantante);
            desktopPane.add(agregarDisco);
        }
        agregarDisco.setVisible(true); 
    }//GEN-LAST:event_itemActualizarDiscoActionPerformed

    private void itemBuscarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarCancionActionPerformed
        if(buscarCacion == null){
            buscarCacion = new BuscarCancion(controladorCompositor);
            desktopPane.add(buscarCacion);
        }
        buscarCacion.setVisible(true);
    }//GEN-LAST:event_itemBuscarCancionActionPerformed

    private void itemActualizarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarCancionActionPerformed
        if(actualizarCancion == null){
            actualizarCancion = new ActualizarCancion(controladorCompositor);
            desktopPane.add(actualizarCancion);
        }
        actualizarCancion.setVisible(true);
    }//GEN-LAST:event_itemActualizarCancionActionPerformed

    private void itemEliminarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarCancionActionPerformed
        if(eliminarCancion == null){
            eliminarCancion = new EliminarCancion(controladorCompositor);
            desktopPane.add(eliminarCancion);
        }
        eliminarCancion.setVisible(true);
    }//GEN-LAST:event_itemEliminarCancionActionPerformed

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
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem itemActualizarCancion;
    private javax.swing.JMenuItem itemActualizarCantante;
    private javax.swing.JMenuItem itemActualizarCompositor;
    private javax.swing.JMenuItem itemActualizarDisco;
    private javax.swing.JMenuItem itemBuscarCancion;
    private javax.swing.JMenuItem itemBuscarCantante;
    private javax.swing.JMenuItem itemBuscarCompositor;
    private javax.swing.JMenuItem itemBuscarDisco;
    private javax.swing.JMenuItem itemCrearCancion;
    private javax.swing.JMenuItem itemCrearCantante;
    private javax.swing.JMenuItem itemCrearCompositor;
    private javax.swing.JMenuItem itemCrearDisco;
    private javax.swing.JMenuItem itemEliminarCancion;
    private javax.swing.JMenuItem itemEliminarCantante;
    private javax.swing.JMenuItem itemEliminarCompositor;
    private javax.swing.JMenuItem itemEliminarDisco;
    private javax.swing.JMenuItem itemListarCancion;
    private javax.swing.JMenuItem itemListarCantante;
    private javax.swing.JMenuItem itemListarCompositor;
    private javax.swing.JMenuItem itemListarDisco;
    private javax.swing.JMenuItem itemSalirMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCantante;
    private javax.swing.JMenuItem menuItemIngles;
    private javax.swing.JMenu opcCancion;
    // End of variables declaration//GEN-END:variables

}
