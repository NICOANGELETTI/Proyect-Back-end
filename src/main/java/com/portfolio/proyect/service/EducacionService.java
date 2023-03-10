package com.portfolio.proyect.service;



import com.portfolio.proyect.model.Educacion;
import com.portfolio.proyect.repository.IEducacionRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD

=======
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
>>>>>>> refs/remotes/origin/master
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional

public class EducacionService  {
    
  @Autowired
  public IEducacionRepository estuRepo;  
    
  
    
<<<<<<< HEAD
    public List<Educacion> list(){
=======
    public List<Educacion> list() {
>>>>>>> refs/remotes/origin/master
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
    
<<<<<<< HEAD
      public Educacion buscarEducacion(int id) {
        Educacion educa = estuRepo.findById(id).orElse(null);
        return educa;
    }
}
=======
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
>>>>>>> refs/remotes/origin/master

