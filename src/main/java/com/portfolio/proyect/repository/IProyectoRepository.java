
package com.portfolio.proyect.repository;

import com.portfolio.proyect.model.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IProyectoRepository extends JpaRepository <Proyecto, Integer>{
                                                          //Heredamos Proyecto y Long es el tipo de dato del ID
  
    
    public Optional<Proyecto> findById(Long id);
    
}
