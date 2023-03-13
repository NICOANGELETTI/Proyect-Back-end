
package com.portfolio.proyect.controller;

import com.portfolio.proyect.Security.Message;
import com.portfolio.proyect.model.Educacion;
import com.portfolio.proyect.service.EducacionService;
import io.micrometer.common.util.StringUtils;
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
    
    @GetMapping ("/buscar/estudio/{id}")
    public Educacion buscarEstudio(@PathVariable Integer id){
        return eduServ.buscarEstudio(id);
    }
    
  
    
   

     /*@PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody Educacion edu){
        if(!eduServ.existById(id))
            return new ResponseEntity(new Message("ID inexistente"), HttpStatus.BAD_REQUEST);
        
        if(eduServ.existsByName(edu.getTitulo()) && eduServ.getByName(edu.getTitulo()).get().getId() != id)
            return new ResponseEntity(new Message(" educacion existente"), HttpStatus.BAD_REQUEST);
        
        if(StringUtils.isBlank(edu.getTitulo()))
            return new ResponseEntity(new Message("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Educacion educacion = eduServ.getOne(id).get();
        educacion.setTitulo(edu.getTitulo());
        educacion.setInicio(edu.getInicio());
        educacion.setFin(edu.getFin());
        educacion.setUrl_imagen(edu.getUrl_imagen());
        educacion.setInstitucion(edu.getInstitucion());
        
        eduServ.crearEstudio(educacion);
        return new ResponseEntity(new Message("Experiencia actualizada con éxito"), HttpStatus.OK);
    }*/ 
}

