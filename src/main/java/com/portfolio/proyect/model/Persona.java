
package com.portfolio.proyect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Autoincrementales
    private int id;
    
    private String nombre;
    
    private String apellido;
    
    private String tituloDeveloper;
     
    private String url_imagenperfil;
    
    private int edad;
    
    
   
    private String acercade;
    public Persona() {
    }

    public Persona( String nombre, String apellido, String tituloDeveloper, String url_imagenperfil, int edad, String acercade) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tituloDeveloper = tituloDeveloper;
        this.url_imagenperfil = url_imagenperfil;
        this.edad = edad;
        this.acercade = acercade;
    }



}

