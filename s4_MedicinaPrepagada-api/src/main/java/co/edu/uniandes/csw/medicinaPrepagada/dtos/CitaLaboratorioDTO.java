/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.medicinaPrepagada.dtos;

import co.edu.uniandes.csw.medicinaPrepagada.entities.CitaLaboratorioEntity;
import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author Santiago Rojas
 */
public class CitaLaboratorioDTO implements Serializable {
    
    /**
     * Id de la cita
     */
    private Long id;
    /**
     * fecha de la cita
     */
    private Date fecha;
    /**
     * especialidad de la cita
     */
    private String especialidad;
    /**
     * comentarios de la cita
     */
    private String comentarios;
    /**
     *Recomendaciones para la cita
     */
    private String recomendaciones;
    /**
     * El paciente que pidio la cita
     */
    private PacienteDTO paciente;
    /**
     * Laboratorio donde la cita se llevara acabo
     */
    private LaboratorioDTO laboratorio;
    
    // Constructor de clase vacio
    public CitaLaboratorioDTO ()
    {
        
    }
     /**
     * Crea un objeto CitaLaboratorioDTO a partir de un objeto CitaLaboratorioEntity.
     *
     * @param pCitaLaboratorioEntity CitaLaboratorioEntity desde la cual se va a crear el
     * nuevo DTO.
     *
     */ 
    public CitaLaboratorioDTO(CitaLaboratorioEntity pCitaLaboratorioEntity) {
        if (pCitaLaboratorioEntity != null) {
            this.id = pCitaLaboratorioEntity.getId();
            this.comentarios = pCitaLaboratorioEntity.getComentarios();
            this.especialidad= pCitaLaboratorioEntity.getEspecialidad();
            this.fecha=pCitaLaboratorioEntity.getDate();
            this.recomendaciones=pCitaLaboratorioEntity.getRecomendaciones();
            this.paciente = new PacienteDTO(pCitaLaboratorioEntity.getPaciente());
            this.laboratorio = new LaboratorioDTO(pCitaLaboratorioEntity.getLaboratorio());
        }

    }
    /**
     * Convierte un objeto CitaLaboratorioDTO a CitaLaboratorioEntity.
     *
     * @return Nueva objeto CitaLaboratorioEntity.
     *
     */
    public CitaLaboratorioEntity toEntity() 
    {
        CitaLaboratorioEntity citaLabEntity = new CitaLaboratorioEntity();

        citaLabEntity.setId(this.getId());
        citaLabEntity.setComentarios(this.comentarios);
        citaLabEntity.setDate(this.fecha);
        citaLabEntity.setEspecialidad(this.especialidad);
        citaLabEntity.setLaboratorio(this.laboratorio.toEntity());
        citaLabEntity.setPaciente(this.paciente.toEntity());
      

        return citaLabEntity;
    }
    
    public void setId (Long pId)
    {
        this.id = pId;
    }
    
    public Long getId ()
    {
        return this.id;
    }
    
    public void setDate (Date pFecha)
    {
        this.fecha = pFecha;
    }
            
    public Date getDate ()
    {
         return this.fecha;
    }
    
    public void setEspecialidad (String pEspecialidad)
    {
        this.especialidad = pEspecialidad;
    }
    
    public String getEspecialidad ()
    {
        return this.especialidad;
    }
    
    public void setComentarios (String pComentarios)
    {
        this.comentarios = pComentarios;
    }
    
    public String getComentarios ()
    {
        return this.comentarios;
    }
    
    public void setRecomendaciones (String pRecomendaciones)
    {
        this.recomendaciones = pRecomendaciones;
    }
    
    public String getRecomendaciones ()
    {
        return this.recomendaciones;
    }
    
    public void setPaciente(PacienteDTO pPaciente)
    {
        this.paciente=pPaciente;
    }
    public PacienteDTO getPaciente()
    {
        return this.paciente;
    }
    
    public void setLaboratorio(LaboratorioDTO pLab)
    {
        this.laboratorio=pLab;
    }
    public LaboratorioDTO getLab()
    {
        return this.laboratorio;
    }
    
      @Override
    public String toString() 
    {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
    
    
    
    
}
