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
public class VehiculoModel {
    private int idVehiculo;
    private String patenteVehiculo;
    private int valorVehiculo;
    private int anoVehiculo;
    private String colorVehiculo;
    private TipoVehiculoModel tipoVehiculo;
    private VersionModel versionVehiculo;

    private VehiculoModel(int idVehiculo, String patenteVehiculo, int valorVehiculo) {
        this.idVehiculo = idVehiculo;
        this.patenteVehiculo = patenteVehiculo;
        this.valorVehiculo = valorVehiculo;
        this.anoVehiculo = anoVehiculo;
        this.colorVehiculo = colorVehiculo;
        this.tipoVehiculo = tipoVehiculo;
        this.versionVehiculo = versionVehiculo;
    }

    public VehiculoModel() {
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getPatenteVehiculo() {
        return patenteVehiculo;
    }

    public void setPatenteVehiculo(String patenteVehiculo) {
        this.patenteVehiculo = patenteVehiculo;
    }

    public int getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(int valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public int getAnoVehiculo() {
        return anoVehiculo;
    }

    public void setAnoVehiculo(int anoVehiculo) {
        this.anoVehiculo = anoVehiculo;
    }

    public String getColorVehiculo() {
        return colorVehiculo;
    }

    public void setColorVehiculo(String colorVehiculo) {
        this.colorVehiculo = colorVehiculo;
    }

    public TipoVehiculoModel getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculoModel tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public VersionModel getVersionVehiculo() {
        return versionVehiculo;
    }

    public void setVersionVehiculo(VersionModel versionVehiculo) {
        this.versionVehiculo = versionVehiculo;
    }
   
    public static ArrayList<VehiculoModel> listavehiculo=new ArrayList<>() ;
    
    public boolean nuevavehiculo(VehiculoModel nuevaVehiculo){
    
        int id=0;
        
        if (!listavehiculo.isEmpty()){
        
            for (VehiculoModel transmision : listavehiculo) {
                
                if (transmision.getIdVehiculo()> id){
                
                    id = transmision.getIdVehiculo();
                }
                
            }
        }
        id++;
        listavehiculo.add(new VehiculoModel(id,nuevaVehiculo.getPatenteVehiculo(),nuevaVehiculo.getValorVehiculo(),nuevaVehiculo.getAnoVehiculo(),nuevaVehiculo.getColorVehiculo(),nuevaVehiculo.getTipoVehiculo(), nuevaVehiculo.getVersionVehiculo()));
        return true;
    }
    
     public VehiculoModel buscaVehiculo(int idVehiculoBuscada){
      VehiculoModel Vehiculoencontrada = null;
        if (!listavehiculo.isEmpty()){
            for (VehiculoModel tipovehiculo : listavehiculo){
            if (tipovehiculo.getIdVehiculo() == idVehiculoBuscada){
               Vehiculoencontrada = tipovehiculo;
            }
            }
        }
    return Vehiculoencontrada;
    }

    public VehiculoModel(int idVehiculo, String patenteVehiculo, int valorVehiculo, int anoVehiculo, String colorVehiculo, TipoVehiculoModel tipoVehiculo, VersionModel versionVehiculo) {
        this.idVehiculo = idVehiculo;
        this.patenteVehiculo = patenteVehiculo;
        this.valorVehiculo = valorVehiculo;
        this.anoVehiculo = anoVehiculo;
        this.colorVehiculo = colorVehiculo;
        this.tipoVehiculo = tipoVehiculo;
        this.versionVehiculo = versionVehiculo;
    }
  
  public VehiculoModel editarVehiculo(int idVehiculo, VehiculoModel vehiculoEditar){
      VehiculoModel vehiculoEditada = null;
        if (!listavehiculo.isEmpty()){
            for (VehiculoModel vehiculo : listavehiculo){
            if (vehiculo.getIdVehiculo() == idVehiculo){
                vehiculo.setPatenteVehiculo(vehiculoEditar.getPatenteVehiculo());
                vehiculo.setValorVehiculo(vehiculoEditar.getValorVehiculo());
                vehiculo.setAnoVehiculo(vehiculoEditar.getAnoVehiculo());
                vehiculo.setColorVehiculo(vehiculoEditar.getColorVehiculo());
               vehiculoEditada = vehiculo;
            }
            }
        }
    return vehiculoEditada;
  }
  
  public boolean eliminarVehiculo(int id){
     VehiculoModel vehiculoEliminada = null;
      
      if (!listavehiculo.isEmpty()){
            for (VehiculoModel vehiculo : listavehiculo){
            if (vehiculo.getIdVehiculo() == idVehiculo){
                 vehiculoEliminada =vehiculo;
            }
            }
        }
      
      listavehiculo.remove(vehiculoEliminada);
      
    return true;
  }
    
}
