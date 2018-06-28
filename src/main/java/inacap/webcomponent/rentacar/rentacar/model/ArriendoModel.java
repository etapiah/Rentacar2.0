/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inacap.webcomponent.rentacar.rentacar.model;

import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "arriendo")
public class ArriendoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idArriendo;
    private Date fechaArriendo;
    private Time horaArriendo;
    
    @ManyToOne
    @JoinColumn(name = "id_persona")
    private PersonaModel personamodel;
    
    @ManyToOne
    @JoinColumn(name = "id_persona")
    private PersonaModel clientemodel;
    
    @ManyToOne
    @JoinColumn(name = "id_vehiculo")
    private PersonaModel vehiculomodel;
    
    @ManyToOne
    @JoinColumn(name = "id_medio_pago")
    private PersonaModel mediopagomodel;
    
    

    public int getIdArriendo() {
        return idArriendo;
    }

    public void setIdArriendo(int idArriendo) {
        this.idArriendo = idArriendo;
    }

    public Date getFechaArriendo() {
        return fechaArriendo;
    }

    public void setFechaArriendo(Date fechaArriendo) {
        this.fechaArriendo = fechaArriendo;
    }

    public Time getHoraArriendo() {
        return horaArriendo;
    }

    public void setHoraArriendo(Time horaArriendo) {
        this.horaArriendo = horaArriendo;
    }

    public PersonaModel getPersonamodel() {
        return personamodel;
    }

    public void setPersonamodel(PersonaModel personamodel) {
        this.personamodel = personamodel;
    }

    public PersonaModel getClientemodel() {
        return clientemodel;
    }

    public void setClientemodel(PersonaModel clientemodel) {
        this.clientemodel = clientemodel;
    }

    public PersonaModel getVehiculomodel() {
        return vehiculomodel;
    }

    public void setVehiculomodel(PersonaModel vehiculomodel) {
        this.vehiculomodel = vehiculomodel;
    }

    public PersonaModel getMediopagomodel() {
        return mediopagomodel;
    }

    public void setMediopagomodel(PersonaModel mediopagomodel) {
        this.mediopagomodel = mediopagomodel;
    }

    public ArriendoModel() {
    }

    public ArriendoModel(int idArriendo, Date fechaArriendo, Time horaArriendo, PersonaModel personamodel, PersonaModel clientemodel, PersonaModel vehiculomodel, PersonaModel mediopagomodel) {
        this.idArriendo = idArriendo;
        this.fechaArriendo = fechaArriendo;
        this.horaArriendo = horaArriendo;
        this.personamodel = personamodel;
        this.clientemodel = clientemodel;
        this.vehiculomodel = vehiculomodel;
        this.mediopagomodel = mediopagomodel;
    }
    
     

   
 

   
    
}
