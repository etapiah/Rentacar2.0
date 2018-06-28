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
public class MarcaModel {
    
    int idMarca;
    String nombreMarca;
    String detalle;

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public MarcaModel() {
    }

    public MarcaModel(String nombreMarca, String detalle) {
        this.nombreMarca = nombreMarca;
        this.detalle = detalle;
    }

    private MarcaModel(int idMarca, String nombreMarca, String detalle) {
        this.idMarca = idMarca;
        this.nombreMarca = nombreMarca;
        this.detalle = detalle;
    }
    
    public static ArrayList<MarcaModel> listamarca=new ArrayList<>() ;
    
    public boolean nuevaMarca(MarcaModel nuevaMarca){
    
        int id=0;
        
        if (!listamarca.isEmpty()){
        
            for (MarcaModel marca : listamarca) {
                
                if (marca.getIdMarca()> id){
                
                    id = marca.getIdMarca();
                }
                
            }
        }
        id++;
        listamarca.add(new MarcaModel(id,nuevaMarca.getNombreMarca(),nuevaMarca.getDetalle()));
        return true;
    }
    
     public MarcaModel buscaMarca(int idMarcaBuscada){
      MarcaModel Marcaencontrada = null;
        if (!listamarca.isEmpty()){
            for (MarcaModel marca : listamarca){
            if (marca.getIdMarca() == idMarcaBuscada){
                Marcaencontrada = marca;
            }
            }
        }
    return Marcaencontrada;
    }
  
  public MarcaModel editarMarca(int idMarca, MarcaModel marcaEditar){
      MarcaModel marcaEditada = null;
        if (!listamarca.isEmpty()){
            for (MarcaModel marca : listamarca){
            if (marca.getIdMarca() == idMarca){
                marca.setNombreMarca(marcaEditar.getNombreMarca());
                marca.setDetalle(marcaEditar.getDetalle());
                marcaEditada = marca;
            }
            }
        }
    return marcaEditada;
  }
  
  public boolean eliminarMarca(int id){
      MarcaModel marcaEliminada = null;
      
      if (!listamarca.isEmpty()){
            for (MarcaModel combustible : listamarca){
            if (combustible.getIdMarca() == idMarca){
                 marcaEliminada =combustible;
            }
            }
        }
      
      listamarca.remove(marcaEliminada);
      
    return true;
  }
    
}
