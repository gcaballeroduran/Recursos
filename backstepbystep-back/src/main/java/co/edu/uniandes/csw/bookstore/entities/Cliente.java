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
public class Cliente extends BaseEntity implements Serializable {
    
    // Atributos
    private String nombre;
    private String apellido;
    private Long id;
    private String direccion;
    private int telefono;
    private String mail;
    private int celular;
    private int numPuntos;
    
    // Metodos

    /**
     * Modifica el nombre
     * @param nombre
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Modifica el apellido
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Modifica el id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Modifica la direccion
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Modifica el numero de telefono
     * @param telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Modifica el mail
     * @param mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * Modifica el celular
     * @param celular
     */
    public void setCelular(int celular) {
        this.celular = celular;
    }

    /**
     * Modifica el numero de puntos
     * @param numPuntos
     */
    public void setNumPuntos(int numPuntos) {
        this.numPuntos = numPuntos;
    }

    /**
     * Obtiene el atributo nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el atributo apellido
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Obtiene el atributo id
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * Obtiene el atributo direccion
     * @return direcion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Obtiene el atributo telefono
     * @return telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Obtiene el atributo mail
     * @return mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * Obtiene el atributo celular
     * @return celular
     */
    public int getCelular() {
        return celular;
    }

    /**
     * Obtiene el atributo numPuntos
     * @return  numPuntos
     */
    public int getNumPuntos() {
        return numPuntos;
    }
  
    
}
