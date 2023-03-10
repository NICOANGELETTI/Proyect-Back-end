package com.portfolio.proyect.service;



import com.portfolio.proyect.model.Educacion;
import com.portfolio.proyect.repository.IEducacionRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional

public class EducacionService  {
    
  @Autowired
  public IEducacionRepository estuRepo;  
    
  
    
    public List<Educacion> list(){
        return estuRepo.findAll();
    }
    
    public Optional<Educacion> getOne(int id){
        return estuRepo.findById(id);
    }
    

    
    public void crearEstudio(Educacion educacion){
        estuRepo.save(educacion);
    }
    
    public void eliminarEstudio(int id){
        estuRepo.deleteById(id);
    }
    
    public boolean existsById(int id){
        return estuRepo.existsById(id);
    }
    /*    public Optional<Educacion> getByName(String edu){
        return estuRepo.findByName(edu);
    }
    public boolean existsByName(String edu){
        return estuRepo.existsByName(edu);
    }*/
    
      public Educacion buscarEducacion(int id) {
        Educacion educa = estuRepo.findById(id).orElse(null);
        return educa;
    }
}

