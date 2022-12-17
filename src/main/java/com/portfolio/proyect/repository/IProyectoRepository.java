
package com.portfolio.proyect.repository;

import com.portfolio.proyect.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IProyectoRepository extends JpaRepository <Proyecto, Integer>{
                                                          //Heredamos Proyecto y Long es el tipo de dato del ID
    public Object findById(int id);
    
    
    
}
