
package com.portfolio.proyect.controller;

import com.portfolio.proyect.Security.Controller.Mensaje;
import com.portfolio.proyect.Security.Message;
import com.portfolio.proyect.model.Educacion;
import com.portfolio.proyect.service.EducacionService;
import io.micrometer.common.util.StringUtils;
import static java.lang.System.console;
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
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("educacion") //Localhost:8080/educacion
@CrossOrigin(origins = "http://localhost:4200")
public class CEducacion {
     @Autowired //Implementamos interfaz

            public EducacionService eduServ;
 

     //----------Estudio end points
   
    @GetMapping ("/lista")
    public ResponseEntity<List<Educacion>> list(){
        List<Educacion> list = eduServ.list();
        return new ResponseEntity(list,HttpStatus.OK);
    }
      
    @PostMapping ("/nuevo/estudio")
    public void create (@RequestBody Educacion estu) {
        eduServ.crearEstudio(estu);
    }
 
    
    @DeleteMapping ("/delete/estudio/{id}")    
    public String eliminarEstudio(@PathVariable Integer id){
        eduServ.eliminarEstudio(id);
        return "la persona fue borrada correctamente";
    }   
    /*
    @GetMapping ("/buscar/estudio/{id}")
    public Educacion buscarEstudio(@PathVariable Integer id){
        return eduServ.buscarEstudio(id);
    }
*/
    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") int id){
        if(!eduServ.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }
        Educacion educacion = eduServ.getOne(id).get();
        return new ResponseEntity(educacion , HttpStatus.OK);
    }
     /*  @PutMapping("/update/{id}")
    public String editarEducacion(@RequestBody Educacion edu) {
        eduServ.crearEstudio(edu);
          return"La educacion fue editada correctamente" ;
    }*/
 /*ANDA CORRECTAMENTE INGRESANDO POR JSON*/
    /*@PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody Educacion edu){
        if(!eduServ.existsById(id))
            return new ResponseEntity(new Message("ID inexistente"), HttpStatus.NOT_FOUND);
        
         
        if(StringUtils.isBlank(edu.getTitulo()))
            return new ResponseEntity(new Message("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Educacion educacion = eduServ.getOne(id).get();
        educacion.setTitulo(edu.getTitulo());
        educacion.setInicio(edu.getInicio());
        educacion.setFin(edu.getFin());
        educacion.setUrl_imagen(edu.getUrl_imagen());
        educacion.setInstitucion(edu.getInstitucion());
        
        eduServ.crearEstudio(educacion);
        return new ResponseEntity(new Message("Educacion actualizada con éxito"), HttpStatus.OK);
    }*/
    
     @PutMapping ("/update/{id}")
    public Educacion editarEducacion(@PathVariable int id, 
                                 @RequestParam("titulo") String nuevoTitulo, 
                                 @RequestParam("institucion") String nuevaInstitucion, 
                                 @RequestParam("url_imagen") String nuevaUrl,
                                 @RequestParam("inicio") String nuevoInicio,
                                 @RequestParam("fin") String nuevoFin){
                                
        Educacion edus = eduServ.buscarEducacion(id);
        
        edus.setInstitucion(nuevaInstitucion);
        edus.setTitulo(nuevoTitulo);
        edus.setUrl_imagen(nuevaUrl);
        edus.setInicio(nuevoInicio);
        edus.setFin(nuevoFin);
        
        
        eduServ.crearEstudio(edus);
        return edus;
}
}


