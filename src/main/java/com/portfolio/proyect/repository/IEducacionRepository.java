package com.portfolio.proyect.repository;



import com.portfolio.proyect.model.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
                //Implementamos una Interfaz que se encarga de extender de JpaRepository y nos da todos los metodos propios de JPA
public interface IEducacionRepository extends JpaRepository <Educacion, Integer>{
                                                          //Heredamos persona y Long es el tipo de dato del ID
    public Optional findById(Long id);
  /*public boolean existsByName(String edu);
        public Optional findByName(String edu);*/ 
    
}
