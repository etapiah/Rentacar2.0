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
public class MedioPagoModel {
    int idMedioPago;
    String nombreMedioPago;
    String detalle;

    public int getIdMedioPago() {
        return idMedioPago;
    }

    public void setIdMedioPago(int idMedioPago) {
        this.idMedioPago = idMedioPago;
    }

    public String getNombreMedioPago() {
        return nombreMedioPago;
    }

    public void setNombreMedioPago(String nombreMedioPago) {
        this.nombreMedioPago = nombreMedioPago;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public MedioPagoModel() {
    }

    public MedioPagoModel(String nombreMedioPago, String detalle) {
        this.nombreMedioPago = nombreMedioPago;
        this.detalle = detalle;
    }

    private MedioPagoModel(int idMedioPago, String nombreMedioPago, String detalle) {
        this.idMedioPago = idMedioPago;
        this.nombreMedioPago = nombreMedioPago;
        this.detalle = detalle;
    }
    
    public static ArrayList<MedioPagoModel> listamediopago=new ArrayList<>() ;
    
    public boolean nuevaMedioPago(MedioPagoModel nuevaMedioPago){
    
        int id=0;
        
        if (!listamediopago.isEmpty()){
        
            for (MedioPagoModel marca : listamediopago) {
                
                if (marca.getIdMedioPago()> id){
                
                    id = marca.getIdMedioPago();
                }
                
            }
        }
        id++;
        listamediopago.add(new MedioPagoModel(id,nuevaMedioPago.getNombreMedioPago(),nuevaMedioPago.getDetalle()));
        return true;
    }
    
     public MedioPagoModel buscaMedioPago(int idMedioPagoBuscada){
      MedioPagoModel MedioPagoencontrada = null;
        if (!listamediopago.isEmpty()){
            for (MedioPagoModel marca : listamediopago){
            if (marca.getIdMedioPago() == idMedioPagoBuscada){
                MedioPagoencontrada = marca;
            }
            }
        }
    return MedioPagoencontrada;
    }
  
  public MedioPagoModel editarMedioPago(int idMedioPago, MedioPagoModel mediopagoEditar){
      MedioPagoModel mediopagoEditada = null;
        if (!listamediopago.isEmpty()){
            for (MedioPagoModel mediopago : listamediopago){
            if (mediopago.getIdMedioPago() == idMedioPago){
                mediopago.setNombreMedioPago(mediopagoEditar.getNombreMedioPago());
                mediopago.setDetalle(mediopagoEditar.getDetalle());
                mediopagoEditada = mediopago;
            }
            }
        }
    return mediopagoEditada;
  }
  
  public boolean eliminarMedioPago(int id){
      MedioPagoModel mediopagoEliminada = null;
      
      if (!listamediopago.isEmpty()){
            for (MedioPagoModel mediopago : listamediopago){
            if (mediopago.getIdMedioPago() == idMedioPago){
                 mediopagoEliminada =mediopago;
            }
            }
        }
      
      listamediopago.remove(mediopagoEliminada);
      
    return true;
  } 
    
}
