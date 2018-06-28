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
public class CiudadModel {
   private int  idCiudad;

    private CiudadModel(int id, String nombreCiudad, String detalle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public RegionModel getRegion() {
        return region;
    }

    public void setRegion(RegionModel region) {
        this.region = region;
    }

    public static ArrayList<CiudadModel> getListacarroceria() {
        return listaciudad;
    }

    public static void setListacarroceria(ArrayList<CiudadModel> listacarroceria) {
        CiudadModel.listaciudad = listacarroceria;
    }

    public CiudadModel() {
    }

    public CiudadModel(String nombreCiudad, String detalle, RegionModel region) {
        this.nombreCiudad = nombreCiudad;
        this.detalle = detalle;
        this.region = region;
    }

    private CiudadModel(int idCiudad, String nombreCiudad, String detalle, RegionModel region) {
        this.idCiudad = idCiudad;
        this.nombreCiudad = nombreCiudad;
        this.detalle = detalle;
        this.region = region;
    }
   private String nombreCiudad;
   private String detalle;
   private RegionModel region;
   
   public static ArrayList<CiudadModel> listaciudad=new ArrayList<>() ;
    
   public boolean nuevaCiudad(CiudadModel nuevaCiudad){
    
        int id=0;
        
        if (!listaciudad.isEmpty()){
        
            for (CiudadModel ciudad : listaciudad) {
                
                if (ciudad.getIdCiudad()> id){
                
                    id = ciudad.getIdCiudad();
                }
                
            }
        }
        id++;
        listaciudad.add(new CiudadModel(id,nuevaCiudad.getNombreCiudad(),nuevaCiudad.getDetalle(),nuevaCiudad.getRegion()));
        return true;
    }
    
     public CiudadModel buscaCiudad(int idCiudadBuscada){
      CiudadModel Ciudadencontrada = null;
        if (!listaciudad.isEmpty()){
            for (CiudadModel ciudad : listaciudad){
            if (ciudad.getIdCiudad() == idCiudadBuscada){
                Ciudadencontrada = ciudad;
            }
            }
        }
    return Ciudadencontrada;
    }
  
  public CiudadModel editarCiudad(int idCiudad, CiudadModel ciudadEditar){
      CiudadModel ciudadEditada = null;
        if (!listaciudad.isEmpty()){
            for (CiudadModel ciudad : listaciudad){
            if (ciudad.getIdCiudad() == idCiudad){
                ciudad.setNombreCiudad(ciudadEditar.getNombreCiudad());
                ciudad.setDetalle(ciudadEditar.getDetalle());
                ciudad.setRegion(ciudadEditar.getRegion());
                ciudadEditada = ciudad;
            }
            }
        }
    return ciudadEditada;
  }
  
  public boolean eliminarCiudad(int id){
      CiudadModel ciudadEliminada = null;
      
      if (!listaciudad.isEmpty()){
            for (CiudadModel ciudad : listaciudad){
            if (ciudad.getIdCiudad() == idCiudad){
                 ciudadEliminada =ciudad;
            }
            }
        }
      
      listaciudad.remove(ciudadEliminada);
      
    return true;
  }    
    
}
