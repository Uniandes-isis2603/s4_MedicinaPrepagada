/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.medicinaPrepagada.dtos;

import java.io.Serializable;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author estudiante
 */
public class MedicoDetailDTO extends MedicoDTO implements Serializable{
    
    private List<HorarioAtencionDTO> horariosAtencion;
    
    public MedicoDetailDTO (){
        super();
    }
    
     @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    /**
     * @return the horariosAtencion
     */
    public List<HorarioAtencionDTO> getHorariosReservados() {
        return horariosAtencion;
    }

    /**
     * @param horariosAtencion the horariosAtencion to set
     */
    public void setHorariosReservados(List<HorarioAtencionDTO> horariosAtencion) {
        this.horariosAtencion = horariosAtencion;
    }
}
