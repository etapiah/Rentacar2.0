/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inacap.webcomponent.rentacar.rentacar.model;
import java.util.ArrayList;
/**
 *
 * @author USUARIO
 */
public class TraccionModel {
    int idTipoTraccion;
    String nombreTipoTraccion;
    String detalle;

    public int getIdTipoTraccion() {
        return idTipoTraccion;
    }

    public void setIdTipoTraccion(int idTipoTraccion) {
        this.idTipoTraccion = idTipoTraccion;
    }

    public String getNombreTipoTraccion() {
        return nombreTipoTraccion;
    }

    public void setNombreTipoTraccion(String nombreTipoTraccion) {
        this.nombreTipoTraccion = nombreTipoTraccion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public TraccionModel() {
    }

    public TraccionModel(String nombreTipoTraccion, String detalle) {
        this.nombreTipoTraccion = nombreTipoTraccion;
        this.detalle = detalle;
    }

    private TraccionModel(int idTipoTraccion, String nombreTipoTraccion, String detalle) {
        this.idTipoTraccion = idTipoTraccion;
        this.nombreTipoTraccion = nombreTipoTraccion;
        this.detalle = detalle;
    }
    
    public static ArrayList<TraccionModel> listatraccion=new ArrayList<>() ;
    
    public boolean nuevatraccion(TraccionModel nuevaTraccion){
    
        int id=0;
        
        if (!listatraccion.isEmpty()){
        
            for (TraccionModel traccion : listatraccion) {
                
                if (traccion.getIdTipoTraccion()> id){
                
                    id = traccion.getIdTipoTraccion();
                }
                
            }
        }
        id++;
        listatraccion.add(new TraccionModel(id,nuevaTraccion.getNombreTipoTraccion(),nuevaTraccion.getDetalle()));
        return true;
    }
    
     public TraccionModel buscaTraccion(int idTipoTraccionBuscada){
      TraccionModel Tipotraccionencontrada = null;
        if (!listatraccion.isEmpty()){
            for (TraccionModel tipotraccion : listatraccion){
            if (tipotraccion.getIdTipoTraccion() == idTipoTraccionBuscada){
               Tipotraccionencontrada = tipotraccion;
            }
            }
        }
    return Tipotraccionencontrada;
    }
  
  public TraccionModel editarTraccion(int idTipoTraccion, TraccionModel tipotraccionEditar){
      TraccionModel tipotraccionEditada = null;
        if (!listatraccion.isEmpty()){
            for (TraccionModel tipotraccion : listatraccion){
            if (tipotraccion.getIdTipoTraccion() == idTipoTraccion){
                tipotraccion.setNombreTipoTraccion(tipotraccionEditar.getNombreTipoTraccion());
                tipotraccion.setDetalle(tipotraccionEditar.getDetalle());
               tipotraccionEditada = tipotraccion;
            }
            }
        }
    return tipotraccionEditada;
  }
  
  public boolean eliminarTipoTraccion(int id){
     TraccionModel tipotraccionEliminada = null;
      
      if (!listatraccion.isEmpty()){
            for (TraccionModel tipotraccion : listatraccion){
            if (tipotraccion.getIdTipoTraccion() == idTipoTraccion){
                 tipotraccionEliminada =tipotraccion;
            }
            }
        }
      
      listatraccion.remove(tipotraccionEliminada);
      
    return true;
  }



}
