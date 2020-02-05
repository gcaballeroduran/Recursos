/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.bookstore.persistence;

import co.edu.uniandes.csw.bookstore.entities.Cliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author estudiante
 */
@Stateless
public class ClientePersistence {
     
    @PersistenceContext(unitName = "UniversidadPU") protected EntityManager em;
    
    public Cliente create (Cliente cliente){
        
       em.persist(cliente);
       return cliente;
    }
}
