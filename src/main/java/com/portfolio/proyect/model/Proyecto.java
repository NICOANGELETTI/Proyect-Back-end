
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
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Autoincrementales
    private int id;
    
    private String urlImagen;
    
    private String titulo;
    
    private String descripcion;
    
    private String urlProyect; 

    public Proyecto(int id, String urlImagen, String titulo, String descripcion, String urlProyect) {
        this.id = id;
        this.urlImagen = urlImagen;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.urlProyect = urlProyect;
    }
    
    
    }