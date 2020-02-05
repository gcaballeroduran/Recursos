/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.bookstore.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author estudiante
 */
@Entity
public class TarjetaDeCredito extends BaseEntity implements Serializable {
   
  // Atributos
    private Long id;
    private int numero;
    private int CVV;
    private String direccion;
    private Date vence;
    
  // Metodos

    /**
     * Modifica el id del usuario
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Modifica el numero 
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Modifica el CVV
     * @param CVV
     */
    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    /**
     * Modifica la direccion
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Modifica la fecha de vencimiento
     * @param vence
     */
    public void setVence(Date vence) {
        this.vence = vence;
    }

    /**
     * Obtiene el atributo id
     * @return id 
     */
    public Long getid() {
        return id;
    }

    /**
     * Obtiene el atributo numero
     * @return numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Obtiene el atributo CVV
     * @return CVV
     */
    public int getCVV() {
        return CVV;
    }

    /**
     * Obtiene el atributo direccion
     * @return direccion 
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Obtiene el atributo vence
     * @return vence
     */
    public Date getVence() {
        return vence;
    }

    
    
    
}
