package com.portfolio.proyect.service;



import com.portfolio.proyect.model.Habilidades;

import com.portfolio.proyect.repository.IHabilidadesRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class HabilidadesService {
    
    @Autowired
   IHabilidadesRepository habRepo;
    
    // Armamos 4 metodos
 
    public List<Habilidades> traerHabilidades() {
        return habRepo.findAll();
    }
    
    //public Optional<Habilidades> traerHabilidadPorId (int id) {
      //  return habRepo.findById(id);
   // }
    
    public void guardarHabilidad (Habilidades habilidad) {
        habRepo.save(habilidad);
    }
    
    public void eliminarHabilidad (int id) {
        habRepo.deleteById(id);
    }
    public Habilidades buscarHabilidades(int id) {
        Habilidades hab =  habRepo.findById(id).orElse(null);
        return hab;
    }
         public void editarHabilidad(Habilidades hab){
        habRepo.save(hab);  
   }

    
}
