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
public class TipoVehiculoModel {
    int idTipoVehiculo;
    String nombreTipoVehiculo;
    String detalle;

    public int getIdTipoVehiculo() {
        return idTipoVehiculo;
    }

    public void setIdTipoVehiculo(int idTipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
    }

    public String getNombreTipoVehiculo() {
        return nombreTipoVehiculo;
    }

    public void setNombreTipoVehiculo(String nombreTipoVehiculo) {
        this.nombreTipoVehiculo = nombreTipoVehiculo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public TipoVehiculoModel() {
    }

    public TipoVehiculoModel(String nombreTipoVehiculo, String detalle) {
        this.nombreTipoVehiculo = nombreTipoVehiculo;
        this.detalle = detalle;
    }

    private TipoVehiculoModel(int idTipoVehiculo, String nombreTipoVehiculo, String detalle) {
        this.idTipoVehiculo = idTipoVehiculo;
        this.nombreTipoVehiculo = nombreTipoVehiculo;
        this.detalle = detalle;
    }
    
    
    public static ArrayList<TipoVehiculoModel> listatipovehiculo=new ArrayList<>() ;
    
    public boolean nuevatipovehiculo(TipoVehiculoModel nuevaTipoVehiculo){
    
        int id=0;
        
        if (!listatipovehiculo.isEmpty()){
        
            for (TipoVehiculoModel tipovehiculo : listatipovehiculo) {
                
                if (tipovehiculo.getIdTipoVehiculo()> id){
                
                    id = tipovehiculo.getIdTipoVehiculo();
                }
                
            }
        }
        id++;
        listatipovehiculo.add(new TipoVehiculoModel(id,nuevaTipoVehiculo.getNombreTipoVehiculo(),nuevaTipoVehiculo.getDetalle()));
        return true;
    }
    
     public TipoVehiculoModel buscaTipoVehiculo(int idTipoVehiculoBuscada){
      TipoVehiculoModel TipoVehiculoencontrada = null;
        if (!listatipovehiculo.isEmpty()){
            for (TipoVehiculoModel tipovehiculo : listatipovehiculo){
            if (tipovehiculo.getIdTipoVehiculo() == idTipoVehiculoBuscada){
               TipoVehiculoencontrada = tipovehiculo;
            }
            }
        }
    return TipoVehiculoencontrada;
    }
  
  public TipoVehiculoModel editarTipoVehiculo(int idTipoVehiculo, TipoVehiculoModel tipovehiculoEditar){
      TipoVehiculoModel tipovehiculoEditada = null;
        if (!listatipovehiculo.isEmpty()){
            for (TipoVehiculoModel tipovehiculo : listatipovehiculo){
            if (tipovehiculo.getIdTipoVehiculo() == idTipoVehiculo){
                tipovehiculo.setNombreTipoVehiculo(tipovehiculoEditar.getNombreTipoVehiculo());
                tipovehiculo.setDetalle(tipovehiculoEditar.getDetalle());
               tipovehiculoEditada = tipovehiculo;
            }
            }
        }
    return tipovehiculoEditada;
  }
  
  public boolean eliminarTipoVehiculo(int id){
     TipoVehiculoModel tipovehiculoEliminada = null;
      
      if (!listatipovehiculo.isEmpty()){
            for (TipoVehiculoModel tipovehiculo : listatipovehiculo){
            if (tipovehiculo.getIdTipoVehiculo() == idTipoVehiculo){
                 tipovehiculoEliminada =tipovehiculo;
            }
            }
        }
      
      listatipovehiculo.remove(tipovehiculoEliminada);
      
    return true;
  } 
    
}
