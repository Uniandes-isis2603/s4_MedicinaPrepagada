/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.medicinaPrepagada.entities;

import java.util.Date;
import javax.persistence.Entity;

import javax.persistence.FetchType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Daniel Ivan Romero
 */
@Entity
public class CitaMedicaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private String comentarios;
    
//    @ManyToOne@
//    private PacitenteEntity pacienteAAtender;
//    

    @ManyToOne//(mappedBy = "citaMedica", fetch=FetchType.EAGER)
    private HorarioAtencionEntity horarioAtencionAsignado;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

//    public PacitenteEntity getPacienteAAtender() {
//        return pacienteAAtender;
//    }
//
//    public void setPacienteAAtender(PacitenteEntity pacienteAAtender) {
//        this.pacienteAAtender = pacienteAAtender;
//    }
//
    public HorarioAtencionEntity getHorarioAtencionAsignado() {
        return horarioAtencionAsignado;
    }

    public void setHorarioAtencionAsignado(HorarioAtencionEntity horarioAtencionAsignado) {
        this.horarioAtencionAsignado = horarioAtencionAsignado;
    }
    
    
    
}
