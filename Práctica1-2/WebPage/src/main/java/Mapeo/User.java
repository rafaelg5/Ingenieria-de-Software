/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapeo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Rafael
 */
@Entity
@Table(name="user")
public class User {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "iduser")
    private int id_user;
    
    @Column(name = "correo")
    private String correo;
    
    @Column(name = "password")
    private String password;
        
    @OneToOne
    @JoinColumn(name="persona_id")
    private Persona persona_user;

    /**
     * @return the id_user
     */
    public int getId_user() {
        return id_user;
    }

    /**
     * @param id_user the id_user to set
     */
    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the persona_user
     */
    public Persona getPersona_user() {
        return persona_user;
    }

    /**
     * @param persona_user the persona_user to set
     */
    public void setPersona_user(Persona persona_user) {
        this.persona_user = persona_user;
    }

    
}
