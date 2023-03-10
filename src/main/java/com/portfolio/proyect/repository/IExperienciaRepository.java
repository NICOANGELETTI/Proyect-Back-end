package com.portfolio.proyect.repository;



<<<<<<< HEAD
import com.portfolio.proyect.model.Educacion;
=======
>>>>>>> refs/remotes/origin/master
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
<<<<<<< HEAD
    public Optional<Educacion> findById(int id);
=======
    public Optional<Experiencia> findById(int id);
>>>>>>> refs/remotes/origin/master
    public boolean existsById(int id);
    
    
}
