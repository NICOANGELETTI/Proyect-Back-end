
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
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Autoincrementales
    private int id;
    
    private String puesto;
    
    private String inicio;
    
    private String fin;
          
    private String empresa;

    public Experiencia(int id, String puesto, String inicio, String fin, String empresa) {
        this.id = id;
        this.puesto = puesto;
        this.inicio = inicio;
        this.fin = fin;
        this.empresa = empresa;
    }

    
    
}