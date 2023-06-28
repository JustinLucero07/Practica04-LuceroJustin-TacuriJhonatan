/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica.cantante.compositor.interfaces.controlador;

import ec.edu.ups.practica.cantante.compositor.interfaces.dao.CantanteDao;
import ec.edu.ups.practica.cantante.compositor.interfaces.idao.ICompositorDao;
import ec.edu.ups.practica.cantante.compositor.interfaces.modelo.Cancion;
import ec.edu.ups.practica.cantante.compositor.interfaces.modelo.Cantante;
import ec.edu.ups.practica.cantante.compositor.interfaces.modelo.Compositor;
import java.util.List;

/**
 *
 * @author venot
 */
public class ControladorCompositor {
    private ICompositorDao compositorDao;
    private Compositor compositor;
    private Cantante cantante;
    private CantanteDao cantantedao;

    public ControladorCompositor(ICompositorDao compositorDao) {
        this.compositorDao = compositorDao;
    }

    
    
    public void crearCompositor(Compositor compositor){
        compositorDao.create(compositor);
    }
    
    public List<Compositor> verCompositores(){
        return compositorDao.findAll();
    }
    
    public void actualizarCompositor(Compositor compositor){
            compositorDao.update(compositor);
    }
    public void elimininarCompo(Compositor compositor){
        compositorDao.delete(compositor);
        
    }
    
    public Compositor buscarCompositor(int codigo){
        return compositorDao.read(codigo);
    }
    
    public Compositor buscarPorCancion(String nombre){
        return compositorDao.buscarPorTituloDeCancion(nombre);
    }
    
    public void agregarClienteCan(Compositor compositor, Cantante cantante){
        compositor.agregarClientE(cantante);
    }
    
    public void actualizarCancion(Compositor compositor,Cancion cancion){
        compositor.actualizarCancion(cancion);
    }
    
    public void agregarCancion(Cancion cancion){
        compositor.agregarCancion(cancion);
    }
    
    public Cancion buscarCancion(Compositor compositor,int codigo){
        return compositor.buscarCancione(codigo);
    }
    
    public void eliminarCancion(Compositor compositor, int codigo){
        compositor.eliminarCancion(codigo);
    }
}
