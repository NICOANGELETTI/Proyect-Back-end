
package com.portfolio.proyect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Autoincrementales
    private int id;
    
    private String nombre;
    
    private String apellido;
    
    private int edad;
    
    @Lob
    private String acercade;
    public Persona() {
    }

    
    public Persona(String nombre, String apellido, int edad) {
       
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }


}

