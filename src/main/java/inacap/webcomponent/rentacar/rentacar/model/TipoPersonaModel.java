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
public class TipoPersonaModel {
    int idTipoPersona;
    String nombreTipoPersona;
    String detalle;

    public int getIdTipoPersona() {
        return idTipoPersona;
    }

    public void setIdTipoPersona(int idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }

    public String getNombreTipoPersona() {
        return nombreTipoPersona;
    }

    public void setNombreTipoPersona(String nombreTipoPersona) {
        this.nombreTipoPersona = nombreTipoPersona;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public TipoPersonaModel() {
    }

    public TipoPersonaModel(String nombreTipoPersona, String detalle) {
        this.nombreTipoPersona = nombreTipoPersona;
        this.detalle = detalle;
    }

    private TipoPersonaModel(int idTipoPersona, String nombreTipoPersona, String detalle) {
        this.idTipoPersona = idTipoPersona;
        this.nombreTipoPersona = nombreTipoPersona;
        this.detalle = detalle;
    }
    
    public static ArrayList<TipoPersonaModel> listatipopersona=new ArrayList<>() ;
    
    public boolean nuevatipopersona(TipoPersonaModel nuevaTipoPersona){
    
        int id=0;
        
        if (!listatipopersona.isEmpty()){
        
            for (TipoPersonaModel tipopersona : listatipopersona) {
                
                if (tipopersona.getIdTipoPersona()> id){
                
                    id = tipopersona.getIdTipoPersona();
                }
                
            }
        }
        id++;
        listatipopersona.add(new TipoPersonaModel(id,nuevaTipoPersona.getNombreTipoPersona(),nuevaTipoPersona.getDetalle()));
        return true;
    }
    
     public TipoPersonaModel buscaTipoPersona(int idTipoPersonaBuscada){
      TipoPersonaModel TipoPersonaencontrada = null;
        if (!listatipopersona.isEmpty()){
            for (TipoPersonaModel tipopersona : listatipopersona){
            if (tipopersona.getIdTipoPersona() == idTipoPersonaBuscada){
               TipoPersonaencontrada = tipopersona;
            }
            }
        }
    return TipoPersonaencontrada;
    }
  
  public TipoPersonaModel editarTipoPersona(int idTipoPersona, TipoPersonaModel tipopersonaEditar){
      TipoPersonaModel tipopersonaEditada = null;
        if (!listatipopersona.isEmpty()){
            for (TipoPersonaModel tipopersona : listatipopersona){
            if (tipopersona.getIdTipoPersona() == idTipoPersona){
                tipopersona.setNombreTipoPersona(tipopersonaEditar.getNombreTipoPersona());
                tipopersona.setDetalle(tipopersonaEditar.getDetalle());
               tipopersonaEditada = tipopersona;
            }
            }
        }
    return tipopersonaEditada;
  }
  
  public boolean eliminarTipoPersona(int id){
     TipoPersonaModel tipopersonaEliminada = null;
      
      if (!listatipopersona.isEmpty()){
            for (TipoPersonaModel tipopersona : listatipopersona){
            if (tipopersona.getIdTipoPersona() == idTipoPersona){
                 tipopersonaEliminada =tipopersona;
            }
            }
        }
      
      listatipopersona.remove(tipopersonaEliminada);
      
    return true;
  } 
    
    
    
}
