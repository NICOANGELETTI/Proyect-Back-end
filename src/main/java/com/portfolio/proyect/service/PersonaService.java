package com.portfolio.proyect.service;



import com.portfolio.proyect.model.Persona;
import com.portfolio.proyect.repository.IPersonaRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



//Esta clase tendra la implementacion de todos los metodos declarados en PersonaService.java
@Service
@Transactional
public class PersonaService {
    
    //Inyectamos dependencia de PersonaRepository nuestro intermedario JPA
    @Autowired
    public IPersonaRepository persoRepo; 
    
    //Implemento metodo Login
    
   
    
    
    //Implementamos todos los metodos de IPersonaService. Implementamos la logica aqui 

    
    public List<Persona> verPersonas() {
        //Implementamos metodo de buscar todos
      return persoRepo.findAll();
    }

    
    public void crearPersona(Persona per) {
      
        persoRepo.save(per);
    }
    
    
    public void borrarPersona(int id) {
        persoRepo.deleteById(id);
    }

    /*@Override 
    public void editarPersona(Persona per){
        persoRepo.
    }
 /*
    @Override
    public  Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }*/

    public Persona loginPersona(String email, String clave) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
} 
