/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.bookstore.entities;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author estudiante
 */
@Entity
public class Administrador extends BaseEntity implements Serializable{
    
    //Atributos
    private Long id;
    private String credenciales;
    
 
    //Metodos

    /**
     * Obtiene el atributo id
     * @return id 
     */
    
    public Long getId() {
        return id;
    }

    /**
     * Obtiene el atributo credenciales
     * @return credenciales
     */
    public String getCredenciales() {
        return credenciales;
    }

    /**
     * Modifica el id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Modifica las credenciales
     * @param credenciales
     */
    public void setCredenciales(String credenciales) {
        this.credenciales = credenciales;
    }
   
}
