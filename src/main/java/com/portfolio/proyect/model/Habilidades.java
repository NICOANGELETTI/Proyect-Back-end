
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
public class Habilidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Autoincrementales
    private int id;
    
    private String habilidad;
    
    private int porcentaje;

    public Habilidades(int id, String habilidad, int porcentaje) {
        this.id = id;
        this.habilidad = habilidad;
        this.porcentaje = porcentaje;
    }
    
      
      
}