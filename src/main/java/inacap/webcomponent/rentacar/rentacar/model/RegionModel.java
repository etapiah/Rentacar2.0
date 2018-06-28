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
public class RegionModel {
    int idRegion;
    String nombreRegion;
    String detalle;

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public RegionModel(String nombreRegion, String detalle) {
        this.nombreRegion = nombreRegion;
        this.detalle = detalle;
    }

    private RegionModel(int idRegion, String nombreRegion, String detalle) {
        this.idRegion = idRegion;
        this.nombreRegion = nombreRegion;
        this.detalle = detalle;
    }
    
    public static ArrayList<RegionModel> listaregion=new ArrayList<>() ;
    
    public boolean nuevaregion(RegionModel nuevaRegion){
    
        int id=0;
        
        if (!listaregion.isEmpty()){
        
            for (RegionModel region : listaregion) {
                
                if (region.getIdRegion()> id){
                
                    id = region.getIdRegion();
                }
                
            }
        }
        id++;
        listaregion.add(new RegionModel(id,nuevaRegion.getNombreRegion(),nuevaRegion.getDetalle()));
        return true;
    }
    
     public RegionModel buscaRegion(int idRegionBuscada){
      RegionModel Regionencontrada = null;
        if (!listaregion.isEmpty()){
            for (RegionModel persona : listaregion){
            if (persona.getIdRegion() == idRegionBuscada){
               Regionencontrada = persona;
            }
            }
        }
    return Regionencontrada;
    }
  
  public RegionModel editarRegion(int idRegion, RegionModel regionEditar){
      RegionModel regionEditada = null;
        if (!listaregion.isEmpty()){
            for (RegionModel region : listaregion){
            if (region.getIdRegion() == idRegion){
                region.setNombreRegion(regionEditar.getNombreRegion());
                region.setDetalle(regionEditar.getDetalle());
               regionEditada = region;
            }
            }
        }
    return regionEditada;
  }
  
  public boolean eliminarRegion(int id){
     RegionModel regionEliminada = null;
      
      if (!listaregion.isEmpty()){
            for (RegionModel region : listaregion){
            if (region.getIdRegion() == idRegion){
                 regionEliminada =region;
            }
            }
        }
      
      listaregion.remove(regionEliminada);
      
    return true;
  } 
    
    
    
}
