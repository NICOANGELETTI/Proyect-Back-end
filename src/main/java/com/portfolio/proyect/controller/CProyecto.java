
package com.portfolio.proyect.controller;


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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("proyecto") //Localhost:8080/proyecto
@CrossOrigin(origins = {"https://proyect-back-end.onrender.com"})
public class CProyecto {
     @Autowired
       
      public ProyectoService proyectServ;

     
 
    
    
    //Traigo Lista con metodo GET
    @GetMapping("lista")
    @ResponseBody 
    public ResponseEntity<List<Proyecto>> traerProyectos(){
        List<Proyecto> traerProyectos = proyectServ.traerProyectos();
        return new ResponseEntity(traerProyectos, HttpStatus.OK);
    
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
       
    

    //Creo con metodo POST
       @PostMapping("/nuevo/proyecto")
       @ResponseBody
      public void guardarProyecto(@RequestBody Proyecto proyecto){
          proyectServ.guardarProyecto(proyecto);
      }
       
       
       
       //Borro con metodo DELETE
    @DeleteMapping("/delete/proyecto/{id}")
    public void deleteProyecto(@PathVariable("id") int id) {
        proyectServ.eliminarProyecto(id);
    }

    
   //Actualizo con metodo PUT
    @PutMapping("update/{id}")
    public Proyecto editarProyecto(@PathVariable int id,
            @RequestParam("urlImagen") String nuevoUrlImagen ,
            @RequestParam("titulo") String nuevoTitulo ,
            @RequestParam("descripcion") String nuevaDescripcion ,
            @RequestParam("urlProyect") String nuevoUrlProyect)
           
            
            {
        Proyecto proy = proyectServ.buscarProyecto(id);
        
        proy.setUrlImagen(nuevoUrlImagen);
        proy.setTitulo(nuevoTitulo);
        proy.setDescripcion(nuevaDescripcion);
        proy.setUrlProyect(nuevoUrlProyect);
     
         proyectServ.guardarProyecto(proy);
         
       return proy;
    } 

}
