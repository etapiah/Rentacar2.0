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
public class TransmisionModel {
    int idTipoTransmision;
    String nombreTipoTransmision;
    String detalle;

    public int getIdTipoTransmision() {
        return idTipoTransmision;
    }

    public void setIdTipoTransmision(int idTipoTransmision) {
        this.idTipoTransmision = idTipoTransmision;
    }

    public String getNombreTipoTransmision() {
        return nombreTipoTransmision;
    }

    public void setNombreTipoTransmision(String nombreTipoTransmision) {
        this.nombreTipoTransmision = nombreTipoTransmision;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public TransmisionModel() {
    }

    public TransmisionModel(String nombreTipoTransmision, String detalle) {
        this.nombreTipoTransmision = nombreTipoTransmision;
        this.detalle = detalle;
    }

    private TransmisionModel(int idTipoTransmision, String nombreTipoTransmision, String detalle) {
        this.idTipoTransmision = idTipoTransmision;
        this.nombreTipoTransmision = nombreTipoTransmision;
        this.detalle = detalle;
    }
    public static ArrayList<TransmisionModel> listatransmision=new ArrayList<>() ;
    
    public boolean nuevatransmision(TransmisionModel nuevaTransmision){
    
        int id=0;
        
        if (!listatransmision.isEmpty()){
        
            for (TransmisionModel transmision : listatransmision) {
                
                if (transmision.getIdTipoTransmision()> id){
                
                    id = transmision.getIdTipoTransmision();
                }
                
            }
        }
        id++;
        listatransmision.add(new TransmisionModel(id,nuevaTransmision.getNombreTipoTransmision(),nuevaTransmision.getDetalle()));
        return true;
    }
    
     public TransmisionModel buscaTransmision(int idTipoTransmisionBuscada){
      TransmisionModel Tipotransmisionencontrada = null;
        if (!listatransmision.isEmpty()){
            for (TransmisionModel tipotransmision : listatransmision){
            if (tipotransmision.getIdTipoTransmision() == idTipoTransmisionBuscada){
               Tipotransmisionencontrada = tipotransmision;
            }
            }
        }
    return Tipotransmisionencontrada;
    }
  
  public TransmisionModel editarTransmision(int idTipoTransmision, TransmisionModel tipotransmisionEditar){
      TransmisionModel tipotransmisionEditada = null;
        if (!listatransmision.isEmpty()){
            for (TransmisionModel tipotransmision : listatransmision){
            if (tipotransmision.getIdTipoTransmision() == idTipoTransmision){
                tipotransmision.setNombreTipoTransmision(tipotransmisionEditar.getNombreTipoTransmision());
                tipotransmision.setDetalle(tipotransmisionEditar.getDetalle());
               tipotransmisionEditada = tipotransmision;
            }
            }
        }
    return tipotransmisionEditada;
  }
  
  public boolean eliminarTipoTransmision(int id){
     TransmisionModel tipotransmisionEliminada = null;
      
      if (!listatransmision.isEmpty()){
            for (TransmisionModel tipotransmision : listatransmision){
            if (tipotransmision.getIdTipoTransmision() == idTipoTransmision){
                 tipotransmisionEliminada =tipotransmision;
            }
            }
        }
      
      listatransmision.remove(tipotransmisionEliminada);
      
    return true;
  }
    
    
    
}
