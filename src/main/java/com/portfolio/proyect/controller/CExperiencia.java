
package com.portfolio.proyect.controller;


import com.portfolio.proyect.model.Experiencia;
import com.portfolio.proyect.service.ExperienciaService;
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
@RequestMapping("experiencia") //Localhost:8080/persona
@CrossOrigin(origins = "http://localhost:4200")
public class CExperiencia {
    //Implementamos interfaz 
    @Autowired
      public ExperienciaService expeServ;
 
   
       
    //Creo y guardo mediente POST
    @PostMapping ("/nueva/experiencia")
    public void crearExperiencia(@RequestBody Experiencia pers) {
            expeServ.crearExperiencia(pers);
    
    }
    
    //Llamo la lista con GET
    @GetMapping("lista")
    @ResponseBody //Lo que devuelve la funcion la devuelve en el cuerpo de la respuesta (@ResponseBody)
    public ResponseEntity<List<Experiencia>> verExperiencias() {
        List<Experiencia> verExperiencias = expeServ.verExperiencias();
        return new ResponseEntity(verExperiencias, HttpStatus.OK);
    
}
    //Borro con Delete
    @DeleteMapping ("delete/experiencia/{id}")
    public void eliminarExperiencia(@PathVariable int id) {
        expeServ.eliminarExperiencia(id);
    }
    //Ver experiencia por id
    //@GetMapping ("/buscar_experiencia/{id}")
    //public Optional<Experiencia> buscarExperiencia(@PathVariable int id){
    //    return expeServ.buscarExperiencia(id);
    //}
   
    //Actualizo con metodo PUT por id
    @PutMapping("update/{id}")
    public Experiencia editarExperiencia(@PathVariable int id,
            @RequestParam("puesto") String nuevoPuesto ,
            @RequestParam("inicio") String nuevoInicio ,
            @RequestParam("fin") String nuevoFin ,
            @RequestParam("empresa") String nuevaEmpresa)
           
            
            {
        Experiencia exp = expeServ.buscarExperiencia(id);
        
        exp.setPuesto(nuevoPuesto);
        exp.setInicio(nuevoInicio);
        exp.setFin(nuevoFin);
        exp.setEmpresa(nuevaEmpresa);
     
         expeServ.crearExperiencia(exp);
         
       return exp;
    } 


}