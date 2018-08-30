/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.medicinaPrepagada.resources;

import co.edu.uniandes.csw.medicinaPrepagada.dtos.AdministradorDTO;
import co.edu.uniandes.csw.medicinaPrepagada.exceptions.BusinessLogicException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;

/**
 *
 * @author ni.ramirez10
 */

@Path("administrador")
@Produces("application/json")
@Consumes("application/json")
@RequestScoped
public class AdministradorResource 
{
    private static final Logger LOGGER = Logger.getLogger(AdministradorResource.class.getName());
    
    /**
     * Crea un nuevo administrador con la informacion que se recibe en el cuerpo de la
     * petición y se regresa un objeto identico.
     * @throws BusinessLogicException
     */
    
    @POST
    public AdministradorDTO createAdministrador(AdministradorDTO admi) throws BusinessLogicException 
    {
        LOGGER.log(Level.INFO, "AdministradorResource createAdministrador: input: {0}", admi.toString());
        AdministradorDTO nuevoAdmiDTO = new AdministradorDTO();
        LOGGER.log(Level.INFO, "AdministradorResource createAdministrador: output: {0}", nuevoAdmiDTO.toString());
        return nuevoAdmiDTO;
    }
    
    /**
     * Busca y devuelve todos los adminsitradores que existen en el sistema.
     * @return List - Los administradores encontrados en la
     * aplicación. Si no hay ninguno retorna una lista vacía.
     */
    
    @GET
    public List<AdministradorDTO> getAdministradores() 
    {
        LOGGER.info("AdministradorResource getAdministradores: input: void");
        List<AdministradorDTO> listaAdministradores = listEntity2DetailDTO();
        LOGGER.log(Level.INFO, "AdministradorResource getAdministradores: output: {0}", listaAdministradores.toString());
        return listaAdministradores;
    }
    
    /**
     * Busca el administrador con el id asociado recibido en la URL y lo devuelve.
     * @throws WebApplicationException {@link WebApplicationExceptionMapper} -
     * Error de lógica que se genera cuando no se encuentra el adminsitrador.
     */
    
    @GET
    @Path("{AdministradorId: \\d+}")
    public AdministradorDTO getAdministrador(@PathParam("administradorId") Long administradorId) 
    {
        LOGGER.log(Level.INFO, "AdministradorResource getAdministrador: input: {0}", administradorId);
        /**AdministradorEntity admiEntity = administradorLogic.getAdministrador(administradorId);
        
        if (admiEntity == null) 
        {
            throw new WebApplicationException("El recurso /administrador/" + administradorId + " no existe.", 404);
        }*/
        AdministradorDTO admiDetailDTO = new AdministradorDTO();
        LOGGER.log(Level.INFO, "AdministradorResource getAdministrador: output: {0}", admiDetailDTO.toString());
        return admiDetailDTO;
    }
    
    /**
     * Elimina el administrador con el id asociado recibido en la URL y lo devuelve.
     * @throws WebApplicationException {@link WebApplicationExceptionMapper} -
     * Error de lógica que se genera cuando no se encuentra el adminsitrador.
     */
    
    @DELETE
    @Path("{AdministradorId: \\d+}")
    public void deleteAdministrador(@PathParam ("administradorId") Long administradorId) throws BusinessLogicException
    {
        LOGGER.log(Level.INFO, "AdministradorResource deleteAdministrador: input:(0)", administradorId);
        /**if (AdministradorLogic.getAdministrador(administradorId) == null) 
        {
           throw new WebApplicationException("El recurso /administradores/" + administradorId + " no existe.", 404);
        }
        AdministradorLogic.deleteAdministrador(administradorId); */
        LOGGER.info("AdministradorResource deleteAdministrador: output: void");
    }
    
    /**
     * Modifica el administrador con el id asociado recibido en la URL y lo devuelve.
     * @throws WebApplicationException {@link WebApplicationExceptionMapper} -
     * Error de lógica que se genera cuando no se encuentra el administrador.
     */
    
    @PUT
    @Path("(AdministradorId:\\d+)")
    public AdministradorDTO modificarAdministrador(@PathParam ("administradorId") Long administradorId) throws BusinessLogicException
    {
        LOGGER.log(Level.INFO, "AdministradorResource modificarAdministrador: input:(0)", administradorId);
        AdministradorDTO modificarDetailDto = new AdministradorDTO ();        
        LOGGER.log(Level.INFO,"AdministradorResource modificarAdministrador: output: (0)", modificarDetailDto.toString());
        return modificarDetailDto;
    }
    
    private List<AdministradorDTO> listEntity2DetailDTO() 
    { 
        List<AdministradorDTO> list = new ArrayList<>();
        
        return list;
    }
}
