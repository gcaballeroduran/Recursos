/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.bookstore.persistence;

import co.edu.uniandes.csw.bookstore.entities.Administrador;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author estudiante
 */
@Stateless
public class AdministradorPersistence {
    
    @PersistenceContext(unitName = "UniversidadPU") protected EntityManager em;
    
     public Administrador create (Administrador administracion){
        
       em.persist(administracion);
       
       return administracion;
    }
    
}
