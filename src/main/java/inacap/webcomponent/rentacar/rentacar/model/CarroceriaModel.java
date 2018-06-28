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
public class CarroceriaModel {
   private int idCarroceria;
   private String nombreCarroceria;
   private String detalle;
   public static ArrayList<CarroceriaModel> listacarroceria=new ArrayList<>() ;

    public int getIdCarroceria() {
        return idCarroceria;
    }

    public void setIdCarroceria(int idCaroceria) {
        this.idCarroceria = idCaroceria;
    }

    public String getNombreCarroceria() {
        return nombreCarroceria;
    }

    public void setNombreCarroceria(String nombreCarroceria) {
        this.nombreCarroceria = nombreCarroceria;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public CarroceriaModel() {
    }

    public CarroceriaModel(String nombreCarroceria, String detalle) {
        this.nombreCarroceria = nombreCarroceria;
        this.detalle = detalle;
    }

    private CarroceriaModel(int idCaroceria, String nombreCarroceria, String detalle) {
        this.idCarroceria = idCaroceria;
        this.nombreCarroceria = nombreCarroceria;
        this.detalle = detalle;
    }
    public boolean nuevaCarroceria(CarroceriaModel nuevaCarroceria){
    
        int id=0;
        
        if (!listacarroceria.isEmpty()){
        
            for (CarroceriaModel carroceria : listacarroceria) {
                
                if (carroceria.getIdCarroceria()> id){
                
                    id = carroceria.getIdCarroceria();
                }
                
            }
        }
        id++;
        listacarroceria.add(new CarroceriaModel(id,nuevaCarroceria.getNombreCarroceria(),nuevaCarroceria.getDetalle()));
        return true;
    }
    
     public CarroceriaModel buscaCarroceria(int idCarroceriaBuscada){
      CarroceriaModel Carroceriaencontrada = null;
        if (!listacarroceria.isEmpty()){
            for (CarroceriaModel carroceria : listacarroceria){
            if (carroceria.getIdCarroceria() == idCarroceriaBuscada){
                Carroceriaencontrada = carroceria;
            }
            }
        }
    return Carroceriaencontrada;
    }
  
  public CarroceriaModel editarCarroceria(int idCarroceria, CarroceriaModel carroceriaEditar){
      CarroceriaModel carroceriaEditada = null;
        if (!listacarroceria.isEmpty()){
            for (CarroceriaModel carroceria : listacarroceria){
            if (carroceria.getIdCarroceria() == idCarroceria){
                carroceria.setNombreCarroceria(carroceriaEditar.getNombreCarroceria());
                carroceria.setDetalle(carroceriaEditar.getDetalle());
                carroceriaEditada = carroceria;
            }
            }
        }
    return carroceriaEditada;
  }
  
  public boolean eliminarCarroceria(int id){
      CarroceriaModel carroceriaEliminada = null;
      
      if (!listacarroceria.isEmpty()){
            for (CarroceriaModel carroceria : listacarroceria){
            if (carroceria.getIdCarroceria() == idCarroceria){
                 carroceriaEliminada =carroceria;
            }
            }
        }
      
      listacarroceria.remove(carroceriaEliminada);
      
    return true;
  }
    
}
