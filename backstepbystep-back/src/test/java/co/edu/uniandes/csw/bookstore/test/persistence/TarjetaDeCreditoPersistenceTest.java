/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.bookstore.test.persistence;

import co.edu.uniandes.csw.bookstore.entities.TarjetaDeCredito;
import co.edu.uniandes.csw.bookstore.persistence.TarjetaDeCreditoPersistence;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

/**
 *
 * @author estudiante
 */

@RunWith(Arquillian.class)
public class TarjetaDeCreditoPersistenceTest {
    
    @Inject 
    private TarjetaDeCreditoPersistence ep;
    
    @PersistenceContext
    private EntityManager em;
    
   @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addPackage(TarjetaDeCredito.class.getPackage())
                .addPackage(TarjetaDeCreditoPersistence.class.getPackage())
                .addAsManifestResource("META-INF/persistence.xml", "persistence.xml")
                .addAsManifestResource("META-INF/beans.xml", "beans.xml");
    }
    
    @Test
    public void createTest(){
        
        PodamFactory factory = new PodamFactoryImpl();
        TarjetaDeCredito tarjeta = factory.manufacturePojo(TarjetaDeCredito.class);
        TarjetaDeCredito result = ep.create(tarjeta);
        Assert.assertNotNull(result);
        
        TarjetaDeCredito entity = em.find(TarjetaDeCredito.class, result.getid());
        Assert.assertEquals(tarjeta.getNumero(), entity.getNumero());
        
        Assert.assertEquals(tarjeta.getDireccion(), entity.getDireccion());
        
        Assert.assertEquals(tarjeta.getCVV(), entity.getCVV());
        
        Assert.assertEquals(tarjeta.getDireccion(), entity.getDireccion());
        
        Assert.assertEquals(tarjeta.getVence(), entity.getVence());  
    }
    
    
}
