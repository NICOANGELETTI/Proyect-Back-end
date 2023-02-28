
package com.portfolio.proyect.service;

import com.portfolio.proyect.model.Proyecto;
import com.portfolio.proyect.repository.IProyectoRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ProyectoService {
    
    @Autowired
    IProyectoRepository proyectRepo;
    
     public List<Proyecto> traerProyectos() {
        return proyectRepo.findAll();
    }
   
     //Busqueda por ID
  //  public Optional<Proyecto> traerProyectoPorId(int id) {
   //    return proyectRepo.findById(int id);
   //}
    
    public void guardarProyecto(Proyecto proyecto) {
        proyectRepo.save(proyecto);
    }
    
    public void eliminarProyecto(int id) {
        proyectRepo.deleteById(id);
    }
     public Proyecto buscarProyecto(int id) {
        Proyecto proy =  proyectRepo.findById(id).orElse(null);
        return proy;
    }
         public void editarHabilidad(Proyecto hab){
        proyectRepo.save(hab);  
   }
}
