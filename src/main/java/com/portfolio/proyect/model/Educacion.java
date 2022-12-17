
package com.portfolio.proyect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Autoincrementales
    private int id;
    
    private String url_imagen;
    
    private String titulo;
    
    private String inicio;
    
    private String fin;

    private String Institucion;

    public Educacion(int id, String url_imagen, String titulo, String inicio, String fin, String Institucion) {
        this.id = id;
        this.url_imagen = url_imagen;
        this.titulo = titulo;
        this.inicio = inicio;
        this.fin = fin;
        this.Institucion = Institucion;
    }

    
}