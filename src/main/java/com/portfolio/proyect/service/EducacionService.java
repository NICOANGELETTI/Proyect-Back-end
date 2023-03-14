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
    
  
    
    public List<Educacion> list() {
        return estuRepo.findAll();
    }
    
    
    public void crearEstudio(Educacion estudio) {
        estuRepo.save(estudio);
    }
    
    
    public void eliminarEstudio(Integer id) {
        estuRepo.deleteById(id);
    }
    
    
    public Educacion buscarEstudio(Integer id) {
        return estuRepo.findById(id).orElse(null);           
    }      
    
         public Educacion buscarEducacion(int id) {
        Educacion edu =  estuRepo.findById(id).orElse(null);
        return edu;
    }
 
   public void editarEducacion(Educacion edu){
        estuRepo.save(edu);  
   }
       /*public boolean existsByName(String edu){
         return estuRepo.existsByName(edu);
     }
       
         public Optional<Educacion> getByName(String edu){
         return estuRepo.findByName(edu);
     }
         
             public boolean existById(int id){
        return estuRepo.existsById(id);
    }*/
        public Optional<Educacion> getOne(int id){
        return estuRepo.findById(id);
    }
   
    }

