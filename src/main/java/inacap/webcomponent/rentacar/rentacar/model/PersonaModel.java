/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inacap.webcomponent.rentacar.rentacar.model;

import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author USUARIO
 */
public class PersonaModel {
    private int idPersona;
    private String rutPersona;
    private String nombrePersona;
    private String apellidoPersona;
    private Date fechanacimientoPersona;
    private String telefonoPersona;
    private String direccion1Persona;
    private String direccion2Persona;
    private CiudadModel ciudad;
    private TipoPersonaModel tipoPersona;

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getRutPersona() {
        return rutPersona;
    }

    public void setRutPersona(String rutPersona) {
        this.rutPersona = rutPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public Date getFechanacimientoPersona() {
        return fechanacimientoPersona;
    }

    public void setFechanacimientoPersona(Date fechanacimientoPersona) {
        this.fechanacimientoPersona = fechanacimientoPersona;
    }

    public String getTelefonoPersona() {
        return telefonoPersona;
    }

    public void setTelefonoPersona(String telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }

    public String getDireccion1Persona() {
        return direccion1Persona;
    }

    public void setDireccion1Persona(String direccion1Persona) {
        this.direccion1Persona = direccion1Persona;
    }

    public String getDireccion2Persona() {
        return direccion2Persona;
    }

    public void setDireccion2Persona(String direccion2Persona) {
        this.direccion2Persona = direccion2Persona;
    }

    public CiudadModel getCiudad() {
        return ciudad;
    }

    public void setCiudad(CiudadModel ciudad) {
        this.ciudad = ciudad;
    }

    public TipoPersonaModel getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(TipoPersonaModel tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public PersonaModel() {
    }

    public PersonaModel(String rutPersona, String nombrePersona, String apellidoPersona, Date fechanacimientoPersona, String telefonoPersona, String direccion1Persona, String direccion2Persona, CiudadModel ciudad) {
        this.rutPersona = rutPersona;
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.fechanacimientoPersona = fechanacimientoPersona;
        this.telefonoPersona = telefonoPersona;
        this.direccion1Persona = direccion1Persona;
        this.direccion2Persona = direccion2Persona;
        this.ciudad = ciudad;
    }

    private PersonaModel(int idPersona, String rutPersona, String nombrePersona, String apellidoPersona, Date fechanacimientoPersona, String telefonoPersona, String direccion1Persona, String direccion2Persona, CiudadModel ciudad, TipoPersonaModel tipoPersona) {
        this.idPersona = idPersona;
        this.rutPersona = rutPersona;
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.fechanacimientoPersona = fechanacimientoPersona;
        this.telefonoPersona = telefonoPersona;
        this.direccion1Persona = direccion1Persona;
        this.direccion2Persona = direccion2Persona;
        this.ciudad = ciudad;
        this.tipoPersona = tipoPersona;
    }
    
    public static ArrayList<PersonaModel> listapersona=new ArrayList<>() ;
    
    public boolean nuevapersona(PersonaModel nuevaPersona){
    
        int id=0;
        
        if (!listapersona.isEmpty()){
        
            for (PersonaModel persona : listapersona) {
                
                if (persona.getIdPersona()> id){
                
                    id = persona.getIdPersona();
                }
                
            }
        }
        id++;
        listapersona.add(new PersonaModel(id,nuevaPersona.getNombrePersona(),nuevaPersona.getRutPersona(),nuevaPersona.getApellidoPersona(),nuevaPersona.getFechanacimientoPersona(),
        nuevaPersona.getTelefonoPersona(),nuevaPersona.getDireccion1Persona(),nuevaPersona.getDireccion2Persona(),nuevaPersona.getCiudad(),nuevaPersona.getTipoPersona()));
        return true;
    }
    
     public PersonaModel buscaPersona(int idPersonaBuscada){
      PersonaModel Personaencontrada = null;
        if (!listapersona.isEmpty()){
            for (PersonaModel persona : listapersona){
            if (persona.getIdPersona() == idPersonaBuscada){
               Personaencontrada = persona;
            }
            }
        }
    return Personaencontrada;
    }
  
  public PersonaModel editarPersona(int idPersona, PersonaModel personaEditar){
      PersonaModel personaEditada = null;
        if (!listapersona.isEmpty()){
            for (PersonaModel persona : listapersona){
            if (persona.getIdPersona() == idPersona){
                persona.setRutPersona(personaEditar.getRutPersona());
                persona.setNombrePersona(personaEditar.getNombrePersona());
                persona.setApellidoPersona(personaEditar.getApellidoPersona());
                persona.setFechanacimientoPersona(personaEditar.getFechanacimientoPersona());
                persona.setTelefonoPersona(personaEditar.getTelefonoPersona());
                persona.setDireccion1Persona(personaEditar.getDireccion1Persona());
                persona.setDireccion2Persona(personaEditar.getDireccion2Persona());
                persona.setCiudad(personaEditar.getCiudad());
                personaEditada = persona;
            }
            }
        }
    return personaEditada;
  }
  
  public boolean eliminarPersona(int id){
     PersonaModel personaEliminada = null;
      
      if (!listapersona.isEmpty()){
            for (PersonaModel persona : listapersona){
            if (persona.getIdPersona() == idPersona){
                 personaEliminada =persona;
            }
            }
        }
      
      listapersona.remove(personaEliminada);
      
    return true;
  } 
    
    
}
