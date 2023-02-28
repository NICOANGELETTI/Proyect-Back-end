package com.portfolio.proyect.repository;



import java.util.List;
import com.portfolio.proyect.model.Experiencia;
import com.portfolio.proyect.model.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
                //Implementamos una Interfaz que se encarga de extender de JpaRepository y nos da todos los metodos propios de JPA
public interface IExperienciaRepository extends JpaRepository <Experiencia, Integer>{
                                                          //Heredamos persona y Long es el tipo de dato del ID
    public Optional<Experiencia> findById(int id);
    public boolean existsById(int id);
    
    
}
