package com.portfolio.proyect.service;




import com.portfolio.proyect.model.Experiencia;
import com.portfolio.proyect.repository.IExperienciaRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ExperienciaService {
    @Autowired
    public IExperienciaRepository expeRepo;  
     
    public List<Experiencia> verExperiencias() {
        return expeRepo.findAll();
    }
    public void crearExperiencia(Experiencia exp) {
        expeRepo.save(exp);
    }

    public void eliminarExperiencia(Integer id) {
        expeRepo.deleteById(id);
    }
 
           
        
      public Experiencia buscarExperiencia(int id) {
        Experiencia exp =  expeRepo.findById(id).orElse(null);
        return exp;
    }
         public void editarExperiencia(Experiencia exp){
        expeRepo.save(exp);  
   }
}
    


