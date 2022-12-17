
package com.portfolio.proyect.controller;

import com.portfolio.proyect.model.Persona;
import com.portfolio.proyect.model.Proyecto;
import com.portfolio.proyect.service.ProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("proyecto") //Localhost:8080/persona
@CrossOrigin(origins = "http://localhost:4200")
public class CProyecto {
     @Autowired
       //Implementamos interfaz
      public ProyectoService proyectServ;

     
 
    
    //Consultar la lista de proyectos , nos devuelve los proyectos que cargamos en formato json desde -->Body-->raw
    
    @GetMapping("/lista_proyectos")
    @ResponseBody
    public List<Proyecto> getAllProyectos() {
        return proyectServ.traerProyectos();
    
   
}
    //Busqueda por ID
    /*@GetMapping("/traer_proyecto/{id}")
    public ResponseEntity<Proyecto> getProyectoById(@PathVariable("id") int id) {
        try {
            Proyecto proyecto = proyectServ.traerProyectoPorId(id).get();
            return new ResponseEntity(proyecto, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }*/
       
    

    
       @PostMapping("/crear/proyecto")
       @ResponseBody
      public void guardarProyecto(@RequestBody Proyecto proyecto){
          proyectServ.guardarProyecto(proyecto);
      }
       
       
       
       
    @DeleteMapping("/delete/{id}")
    public void deleteProyecto(@PathVariable("id") int id) {
        proyectServ.eliminarProyecto(id);
    }

    }
   
    


