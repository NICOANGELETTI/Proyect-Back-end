
package com.portfolio.proyect.service;

import com.portfolio.proyect.model.Proyecto;
import com.portfolio.proyect.repository.IProyectoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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
    
}
