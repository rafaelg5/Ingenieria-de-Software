/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapeo;

/**
 *
 * @author Rafael
 */
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Rafael
 */
@Entity
@Table(name="persona")
public class Persona {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "idpersona")
    private int id_persona;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "fechanac")
    private String fechanac;
    
    @Column(name = "carrera")
    private String carrera;
    
    //Ejemplo anotacion OneToMany
    @OneToOne(mappedBy="persona_user")
    private User user_persona;

    /**
     * @return the id_persona
     */
    public int getId_persona() {
        return id_persona;
    }

    /**
     * @param id_persona the id_persona to set
     */
    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fechanac
     */
    public String getFechanac() {
        return fechanac;
    }

    /**
     * @param fechanac the fechanac to set
     */
    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the user_persona
     */
    public User getUser_persona() {
        return user_persona;
    }

    /**
     * @param user_persona the users_persona to set
     */
    public void setUser_persona(User user_persona) {
        this.user_persona = user_persona;
    }

    
}