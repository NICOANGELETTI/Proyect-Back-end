package com.portfolio.proyect.service;



import com.portfolio.proyect.model.Experiencia;
import com.portfolio.proyect.model.Persona;
import com.portfolio.proyect.repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

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
 
    public Experiencia buscarExperiencia(Integer id) {
        return expeRepo.findById(id).orElse(null);           
    }                
}
    

