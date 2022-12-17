
package com.portfolio.proyect.controller;

import com.portfolio.proyect.model.Educacion;
import com.portfolio.proyect.model.Persona;
import com.portfolio.proyect.service.EducacionService;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("educacion") //Localhost:8080/educacion
@CrossOrigin(origins = "http://localhost:4200")
public class CEducacion {
     @Autowired
       //Implementamos interfaz
      public EducacionService eduServ;
 

     //----------Estudio end points
    @PostMapping ("/new/estudio")
    public void agregarEstudio (@RequestBody Educacion estu) {
        eduServ.crearEstudio(estu);
    }
    @GetMapping ("/ver/estudios")
    @ResponseBody
    public List <Educacion> verEstudios(){
        return eduServ.verEstudios();
    }
    
    @DeleteMapping ("/delete/estudio/{id}")    
    public void eliminarEstudio(@PathVariable Integer id){
        eduServ.eliminarEstudio(id);
    }   
    
    @GetMapping ("/buscar/estudio/{id}")
    public Educacion buscarEstudio(@PathVariable Integer id){
        return eduServ.buscarEstudio(id);
    }
   
    }

