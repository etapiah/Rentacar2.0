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
public class VersionModel {
    
    private int IdVersion;
    private String nombreVersion;
    private String detalleVersion;
    private int puertasVersion;
    private int pasajerosVersion;
    private float capacidadMaleteroVersion;
    private int airbagsVersion;
    private boolean aireAcondicionadoVersion;
    private boolean cierreCentralizadoVersion;
    private boolean alzaVidriosElectricosVersion;
    private boolean camaraRetrocesoVersion;
    private CombustibleModel  combustible;
    private CarroceriaModel  carroceria;
    private TransmisionModel  transmision;
    private TraccionModel  traccion;
    private ModeloModel  modelo;

    public VersionModel(int IdVersion, String nombreVersion, String detalleVersion, int puertasVersion, int pasajerosVersion, float capacidadMaleteroVersion, int airbagsVersion, boolean aireAcondicionadoVersion, boolean cierreCentralizadoVersion, boolean alzaVidriosElectricosVersion, boolean camaraRetrocesoVersion, CombustibleModel combustible, CarroceriaModel carroceria, TransmisionModel transmision, TraccionModel traccion, ModeloModel modelo) {
        this.IdVersion = IdVersion;
        this.nombreVersion = nombreVersion;
        this.detalleVersion = detalleVersion;
        this.puertasVersion = puertasVersion;
        this.pasajerosVersion = pasajerosVersion;
        this.capacidadMaleteroVersion = capacidadMaleteroVersion;
        this.airbagsVersion = airbagsVersion;
        this.aireAcondicionadoVersion = aireAcondicionadoVersion;
        this.cierreCentralizadoVersion = cierreCentralizadoVersion;
        this.alzaVidriosElectricosVersion = alzaVidriosElectricosVersion;
        this.camaraRetrocesoVersion = camaraRetrocesoVersion;
        this.combustible = combustible;
        this.carroceria = carroceria;
        this.transmision = transmision;
        this.traccion = traccion;
        this.modelo = modelo;
    }

    public CombustibleModel getCombustible() {
        return combustible;
    }

    public void setCombustible(CombustibleModel combustible) {
        this.combustible = combustible;
    }

    public CarroceriaModel getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(CarroceriaModel carroceria) {
        this.carroceria = carroceria;
    }

    public TransmisionModel getTransmision() {
        return transmision;
    }

    public void setTransmision(TransmisionModel transmision) {
        this.transmision = transmision;
    }

    public TraccionModel getTraccion() {
        return traccion;
    }

    public void setTraccion(TraccionModel traccion) {
        this.traccion = traccion;
    }

    public ModeloModel getModelo() {
        return modelo;
    }

    public void setModelo(ModeloModel modelo) {
        this.modelo = modelo;
    }

    public int getIdVersion() {
        return IdVersion;
    }

    public void setIdVersion(int IdVersion) {
        this.IdVersion = IdVersion;
    }

    public String getNombreVersion() {
        return nombreVersion;
    }

    public void setNombreVersion(String nombreVersion) {
        this.nombreVersion = nombreVersion;
    }

    public String getDetalleVersion() {
        return detalleVersion;
    }

    public void setDetalleVersion(String detalleVersion) {
        this.detalleVersion = detalleVersion;
    }

    public int getPuertasVersion() {
        return puertasVersion;
    }

    public void setPuertasVersion(int puertasVersion) {
        this.puertasVersion = puertasVersion;
    }

    public int getPasajerosVersion() {
        return pasajerosVersion;
    }

    public void setPasajerosVersion(int pasajerosVersion) {
        this.pasajerosVersion = pasajerosVersion;
    }

    public float getCapacidadMaleteroVersion() {
        return capacidadMaleteroVersion;
    }

    public void setCapacidadMaleteroVersion(float capacidadMaleteroVersion) {
        this.capacidadMaleteroVersion = capacidadMaleteroVersion;
    }

    public int getAirbagsVersion() {
        return airbagsVersion;
    }

    public void setAirbagsVersion(int airbagsVersion) {
        this.airbagsVersion = airbagsVersion;
    }

    public boolean getAireAcondicionadoVersion() {
        return aireAcondicionadoVersion;
    }

    public void setAireAcondicionadoVersion(boolean aireAcondicionadoVersion) {
        this.aireAcondicionadoVersion = aireAcondicionadoVersion;
    }

    public boolean getCierreCentralizadoVersion() {
        return cierreCentralizadoVersion;
    }

    public void setCierreCentralizadoVersion(boolean cierreCentralizadoVersion) {
        this.cierreCentralizadoVersion = cierreCentralizadoVersion;
    }

    public boolean getAlzaVidriosElectricosVersion() {
        return alzaVidriosElectricosVersion;
    }

    public void setAlzaVidriosElectricosVersion(boolean alzaVidriosElectricosVersion) {
        this.alzaVidriosElectricosVersion = alzaVidriosElectricosVersion;
    }

    public boolean getCamaraRetrocesoVersion() {
        return camaraRetrocesoVersion;
    }

    public void setCamaraRetrocesoVersion(boolean camaraRetrocesoVersion) {
        this.camaraRetrocesoVersion = camaraRetrocesoVersion;
    }

    public VersionModel() {
    }
    
    public static ArrayList<VersionModel> listaversion=new ArrayList<>() ;
    
    public boolean nuevaversion(VersionModel nuevaVersion){
    
        int id=0;
        
        if (!listaversion.isEmpty()){
        
            for (VersionModel version : listaversion) {
                
                if (version.getIdVersion()> id){
                
                    id = version.getIdVersion();
                }
                
            }
        }
        id++;
        listaversion.add(new VersionModel(id,nuevaVersion.getNombreVersion(),nuevaVersion.getDetalleVersion(),nuevaVersion.getPuertasVersion(),nuevaVersion.getPasajerosVersion(),
                nuevaVersion.getCapacidadMaleteroVersion(),nuevaVersion.getAirbagsVersion(),nuevaVersion.getAireAcondicionadoVersion(),nuevaVersion.getCierreCentralizadoVersion(),
                nuevaVersion.getAlzaVidriosElectricosVersion(),nuevaVersion.getCamaraRetrocesoVersion(),nuevaVersion.getCombustible(),nuevaVersion.getCarroceria(),
                nuevaVersion.getTransmision(),nuevaVersion.getTraccion(),nuevaVersion.getModelo()));
        return true;
    }
    
     public VersionModel buscaVersion(int idVersionBuscada){
      VersionModel Versionencontrada = null;
        if (!listaversion.isEmpty()){
            for (VersionModel version : listaversion){
            if (version.getIdVersion() == idVersionBuscada){
               Versionencontrada = version;
            }
            }
        }
    return Versionencontrada;
    }
  
  public VersionModel editarVersion(int idVersion, VersionModel versionEditar){
      VersionModel versionEditada = null;
        if (!listaversion.isEmpty()){
            for (VersionModel version : listaversion){
            if (version.getIdVersion() == idVersion){
                version.setNombreVersion(versionEditar.getNombreVersion());
                version.setDetalleVersion(versionEditar.getDetalleVersion());
                version.setPuertasVersion(versionEditar.getPuertasVersion());
                version.setPasajerosVersion(versionEditar.getPasajerosVersion());
                version.setCapacidadMaleteroVersion(versionEditar.getCapacidadMaleteroVersion());
                version.setAirbagsVersion(versionEditar.getAirbagsVersion());
                version.setAireAcondicionadoVersion(versionEditar.getAireAcondicionadoVersion());
                version.setCierreCentralizadoVersion(versionEditar.getCierreCentralizadoVersion());
                version.setAlzaVidriosElectricosVersion(versionEditar.getAlzaVidriosElectricosVersion());
                version.setCamaraRetrocesoVersion(versionEditar.getCamaraRetrocesoVersion());
                version.setCombustible(versionEditar.getCombustible());
                version.setCarroceria(versionEditar.getCarroceria());
                version.setTransmision(versionEditar.getTransmision());
                version.setTraccion(versionEditar.getTraccion());
                version.setModelo(versionEditar.getModelo());
                versionEditada = version;
            }
            }
        }
    return versionEditada;
  }
  
  public boolean eliminarVersion(int id){
     VersionModel versionEliminada = null;
      
      if (!listaversion.isEmpty()){
            for (VersionModel version : listaversion){
            if (version.getIdVersion() == IdVersion){
                 versionEliminada =version;
            }
            }
        }
      
      listaversion.remove(versionEliminada);
      
    return true;
  }
    
    
}
