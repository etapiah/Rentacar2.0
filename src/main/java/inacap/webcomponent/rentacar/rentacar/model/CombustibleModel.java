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
public class CombustibleModel {
    int idCombustible;
    String tipoCombustible;
    String detalle;

    public int getIdCombustible() {
        return idCombustible;
    }

    public void setIdCombustible(int idCombustible) {
        this.idCombustible = idCombustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public CombustibleModel() {
    }

    public CombustibleModel(String tipoCombustible, String detalle) {
        this.tipoCombustible = tipoCombustible;
        this.detalle = detalle;
    }

    private CombustibleModel(int idCombustible, String tipoCombustible, String detalle) {
        this.idCombustible = idCombustible;
        this.tipoCombustible = tipoCombustible;
        this.detalle = detalle;
    }
    
    public static ArrayList<CombustibleModel> listacombustible=new ArrayList<>() ;
    
    public boolean nuevaCombustible(CombustibleModel nuevaCombustible){
    
        int id=0;
        
        if (!listacombustible.isEmpty()){
        
            for (CombustibleModel combustible : listacombustible) {
                
                if (combustible.getIdCombustible()> id){
                
                    id = combustible.getIdCombustible();
                }
                
            }
        }
        id++;
        listacombustible.add(new CombustibleModel(id,nuevaCombustible.getTipoCombustible(),nuevaCombustible.getDetalle()));
        return true;
    }
    
     public CombustibleModel buscaCombustible(int idCombustibleBuscada){
      CombustibleModel Combustibleencontrada = null;
        if (!listacombustible.isEmpty()){
            for (CombustibleModel combustible : listacombustible){
            if (combustible.getIdCombustible() == idCombustibleBuscada){
                Combustibleencontrada = combustible;
            }
            }
        }
    return Combustibleencontrada;
    }
  
  public CombustibleModel editarCombustible(int idCombustible, CombustibleModel combustibleEditar){
      CombustibleModel combustibleEditada = null;
        if (!listacombustible.isEmpty()){
            for (CombustibleModel combustible : listacombustible){
            if (combustible.getIdCombustible() == idCombustible){
                combustible.setTipoCombustible(combustibleEditar.getTipoCombustible());
                combustible.setDetalle(combustibleEditar.getDetalle());
                combustibleEditada = combustible;
            }
            }
        }
    return combustibleEditada;
  }
  
  public boolean eliminarCombustible(int id){
      CombustibleModel combustibleEliminada = null;
      
      if (!listacombustible.isEmpty()){
            for (CombustibleModel combustible : listacombustible){
            if (combustible.getIdCombustible() == idCombustible){
                 combustibleEliminada =combustible;
            }
            }
        }
      
      listacombustible.remove(combustibleEliminada);
      
    return true;
  } 
    
    
}
