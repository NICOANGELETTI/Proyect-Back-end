package com.portfolio.proyect.service;



import com.portfolio.proyect.model.Educacion;
import com.portfolio.proyect.repository.IEducacionRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class EducacionService  {
    
  @Autowired
  public IEducacionRepository estuRepo;  
    
  
    
    public List<Educacion> verEstudios() {
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

   
    
    
}
