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
public class ModeloModel {
    
   private int idModelo;
   private String nombreModelo;
   private String detalle;
   private MarcaModel marca;

    public ModeloModel(int idModelo, String nombreModelo, String detalle, MarcaModel marca) {
        this.idModelo = idModelo;
        this.nombreModelo = nombreModelo;
        this.detalle = detalle;
        this.marca = marca;
    }

    public MarcaModel getMarca() {
        return marca;
    }

    public void setMarca(MarcaModel marca) {
        this.marca = marca;
    }

    private ModeloModel(int idModelo, String nombreModelo, String detalle) {
        this.idModelo = idModelo;
        this.nombreModelo = nombreModelo;
        this.detalle = detalle;
        this.marca = marca;
    }

    public ModeloModel(String nombreModelo, String detalle, MarcaModel marca) {
        this.nombreModelo = nombreModelo;
        this.detalle = detalle;
        this.marca = marca;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public ModeloModel() {
    }
    
    public static ArrayList<ModeloModel> listamodelo=new ArrayList<>() ;
    
    public boolean nuevamodelo(ModeloModel nuevaModelo){
    
        int id=0;
        
        if (!listamodelo.isEmpty()){
        
            for (ModeloModel marca : listamodelo) {
                
                if (marca.getIdModelo()> id){
                
                    id = marca.getIdModelo();
                }
                
            }
        }
        id++;
        listamodelo.add(new ModeloModel(id,nuevaModelo.getNombreModelo(),nuevaModelo.getDetalle(),nuevaModelo.getMarca()));
        return true;
    }
    
     public ModeloModel buscaModelo(int idModeloBuscada){
      ModeloModel Modeloencontrada = null;
        if (!listamodelo.isEmpty()){
            for (ModeloModel modelo : listamodelo){
            if (modelo.getIdModelo() == idModeloBuscada){
               Modeloencontrada = modelo;
            }
            }
        }
    return Modeloencontrada;
    }
  
  public ModeloModel editarModelo(int idModelo, ModeloModel modeloEditar){
      ModeloModel modeloEditada = null;
        if (!listamodelo.isEmpty()){
            for (ModeloModel modelo : listamodelo){
            if (modelo.getIdModelo() == idModelo){
                modelo.setNombreModelo(modeloEditar.getNombreModelo());
                modelo.setDetalle(modeloEditar.getDetalle());
                modelo.setMarca(modeloEditar.getMarca());
                modeloEditada = modelo;
            }
            }
        }
    return modeloEditada;
  }

  
  public boolean eliminarModelo(int id){
     ModeloModel modeloEliminada = null;
      
      if (!listamodelo.isEmpty()){
            for (ModeloModel modelo : listamodelo){
            if (modelo.getIdModelo() == idModelo){
                 modeloEliminada =modelo;
            }
            }
        }
      
      listamodelo.remove(modeloEliminada);
      
    return true;
  } 
    
}
