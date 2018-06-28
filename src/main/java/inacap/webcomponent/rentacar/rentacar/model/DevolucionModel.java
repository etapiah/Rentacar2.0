/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inacap.webcomponent.rentacar.rentacar.model;

import java.sql.Time;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class DevolucionModel {

    public int getIdDevolucion() {
        return idDevolucion;
    }

    public void setIdDevolucion(int idDevolucion) {
        this.idDevolucion = idDevolucion;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Time getHoraDevolucion() {
        return horaDevolucion;
    }

    public void setHoraDevolucion(Time horaDevolucion) {
        this.horaDevolucion = horaDevolucion;
    }

    public ArriendoModel getArriendo() {
        return arriendo;
    }

    public void setArriendo(ArriendoModel arriendo) {
        this.arriendo = arriendo;
    }

    public DevolucionModel() {
    }

    public DevolucionModel(int idDevolucion, Date fechaDevolucion, Time horaDevolucion, ArriendoModel arriendo) {
        this.idDevolucion = idDevolucion;
        this.fechaDevolucion = fechaDevolucion;
        this.horaDevolucion = horaDevolucion;
        this.arriendo = arriendo;
    }
    
   private int idDevolucion;
   private Date fechaDevolucion;
   private Time horaDevolucion;
   private ArriendoModel arriendo;
    
    public static ArrayList<DevolucionModel> listadevolucion=new ArrayList<>() ;
    
    public boolean nuevaDevolucion(DevolucionModel nuevaDevolucion){
    
        int id=0;
        
        if (!listadevolucion.isEmpty()){
        
            for (DevolucionModel devolucion : listadevolucion) {
                
                if (devolucion.getIdDevolucion()> id){
                
                    id = devolucion.getIdDevolucion();
                }
                
            }
        }
        id++;
        listadevolucion.add(new DevolucionModel(id,nuevaDevolucion.getFechaDevolucion(),nuevaDevolucion.getHoraDevolucion(),nuevaDevolucion.getArriendo()));
        return true;
    }
    
     public DevolucionModel buscaDevolucion(int iddevolucionBuscada){
      DevolucionModel Devolucionencontrada = null;
        if (!listadevolucion.isEmpty()){
            for (DevolucionModel devolucion : listadevolucion){
            if (devolucion.getIdDevolucion() == iddevolucionBuscada){
                Devolucionencontrada = devolucion;
            }
            }
        }
    return Devolucionencontrada;
    }
  
  public DevolucionModel editarDevolucion(int idDevolucion, DevolucionModel devolucionEditar){
      DevolucionModel devolucionEditada = null;
        if (!listadevolucion.isEmpty()){
            for (DevolucionModel devolucion : listadevolucion){
            if (devolucion.getIdDevolucion() == idDevolucion){
                devolucion.setFechaDevolucion(devolucionEditar.getFechaDevolucion());
                devolucion.setHoraDevolucion(devolucionEditar.getHoraDevolucion());
                devolucion.setArriendo(devolucionEditar.getArriendo());
                devolucionEditada = devolucion;
            }
            }
        }
    return devolucionEditada;
  }
  
  public boolean eliminarDevolucion(int id){
      DevolucionModel devolucionEliminada = null;
      
      if (!listadevolucion.isEmpty()){
            for (DevolucionModel devolucion : listadevolucion){
            if (devolucion.getIdDevolucion() == idDevolucion){
                 devolucionEliminada =devolucion;
            }
            }
        }
      
      listadevolucion.remove(devolucionEliminada);
      
    return true;
  } 

    private void setArriendo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
