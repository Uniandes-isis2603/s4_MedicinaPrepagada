/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.medicinaPrepagada.persistence;

import co.edu.uniandes.csw.medicinaPrepagada.entities.CitaMedicaEntity;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Daniel Ivan Romero
 */
@Stateless
public class CitaMedicaPersistence {
    private static final Logger LOGGER = Logger.getLogger(CitaMedicaPersistence.class.getName());
    
    @PersistenceContext(unitName = "MedisistemasPU")
    protected EntityManager em;
    
     /**
     * Método para persisitir la entidad en la base de datos.
     * @param CitaMedicaEntity objeto CitaMedica que se creará en la base de datos
     * @return devuelve la entidad creada con un id dado por la base de datos.
     */
    
    public CitaMedicaEntity create(CitaMedicaEntity CitaMedicaEntity) 
    {
        LOGGER.log(Level.INFO, "Creando una nueva CitaMedica");
        em.persist(CitaMedicaEntity);
        LOGGER.log(Level.INFO, "CitaMedica creada");
        return CitaMedicaEntity;
    }
    
    /**
     * Devuelve todos las CitaMedicas de la base de datos.
     * @return una lista con todos los CitaMedicas que encuentre en la base de datos,
     */
    
    public List<CitaMedicaEntity> findAll() 
    {
        LOGGER.log(Level.INFO, "Consultando todas las CitaaMedicaes");
        Query q = em.createQuery("select u from CitaMedicaEntity u", CitaMedicaEntity.class);
        return q.getResultList();
    }
    
    /**
     * Busca la CitaMedica con el id que se envía de parametro
     * @param citaId: id correspondiente al CitaMedica buscado.
     * @return un CitaMedica. 
     */
    
    public CitaMedicaEntity find(Long citaId) 
    {
        LOGGER.log(Level.INFO, "Consultando la CitaMedica con id={0}", citaId);
        return em.find(CitaMedicaEntity.class, citaId);
    }
    
    /**
     * Actualiza una CitaMedica.
     * @param citaEntity: el CitaMedica que viene con nueva informacion. 
     * @return un CitaMedica con los cambios aplicados.
     */
    
    public CitaMedicaEntity update(CitaMedicaEntity citaEntity) 
    {
        LOGGER.log(Level.INFO, "Actualizando la CitaMedica con id={0}", citaEntity.getId());
        return em.merge(citaEntity);
    }
    
    /**
     * Borra una CitaMedica de la base de datos con el id que entra por parametro
     * @param citaId: id correspondiente al citansitrador a borrar.
     */
    
    public void delete(Long citaId) 
    {
        LOGGER.log(Level.INFO, "Borrando la CitaMedica con id={0}", citaId);
        CitaMedicaEntity citaEntity = em.find(CitaMedicaEntity.class, citaId);
        em.remove(citaEntity);
    }
}
