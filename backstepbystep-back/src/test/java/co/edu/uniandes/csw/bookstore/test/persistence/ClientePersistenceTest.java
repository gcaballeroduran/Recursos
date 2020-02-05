/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.bookstore.test.persistence;

import co.edu.uniandes.csw.bookstore.entities.Cliente;
import co.edu.uniandes.csw.bookstore.persistence.ClientePersistence;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

/**
 *
 * @author estudiante
 */

@RunWith(Arquillian.class)
public class ClientePersistenceTest {
    
    @Inject 
    private ClientePersistence ep;
    
    @PersistenceContext
    private EntityManager em;
    
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addPackage(Cliente.class.getPackage())
                .addPackage(ClientePersistence.class.getPackage())
                .addAsManifestResource("META-INF/persistence.xml", "persistence.xml")
                .addAsManifestResource("META-INF/beans.xml", "beans.xml");
    }
    
     @Test
    public void createTest(){
        
        PodamFactory factory = new PodamFactoryImpl();
        Cliente cliente = factory.manufacturePojo(Cliente.class);
        Cliente result = ep.create(cliente);
        Assert.assertNotNull(result); 
        
        Cliente entity = em.find(Cliente.class, result.getId());
        Assert.assertEquals(cliente.getNombre(), entity.getNombre());
        
        Assert.assertEquals(cliente.getDireccion(), entity.getDireccion());
        
        Assert.assertEquals(cliente.getApellido(), entity.getApellido());
        
        Assert.assertEquals(cliente.getDireccion(), entity.getDireccion());
        
        Assert.assertEquals(cliente.getCelular(), entity.getCelular());  
        
        Assert.assertEquals(cliente.getMail(), entity.getMail()); 
        
        Assert.assertEquals(cliente.getNumPuntos(), entity.getNumPuntos()); 
        
        Assert.assertEquals(cliente.getTelefono(), entity.getTelefono()); 
    }
}
