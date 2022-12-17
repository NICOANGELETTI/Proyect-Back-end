
package com.portfolio.proyect.controller;

import com.portfolio.proyect.model.Experiencia;
import com.portfolio.proyect.model.Persona;
import com.portfolio.proyect.service.ExperienciaService;

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
@RequestMapping("experiencia") //Localhost:8080/persona
@CrossOrigin(origins = "http://localhost:4200")
public class CExperiencia {
     @Autowired
       //Implementamos interfaz
      public ExperienciaService expServ;
 
   
       
    
    @PostMapping ("/new/persona")
      //Recibiremos el json de la persona a agregar mediante @RequestBody
    public void crearExperiencia(@RequestBody Experiencia pers) {
            expServ.crearExperiencia(pers);
    }
    
    //Consultar la lista de personas , nos devuelve las personas que cargamos en formato json desde -->Body-->raw
    
    @GetMapping("/ver/personas")
    @ResponseBody //Lo que devuelve la funcion la devuelve en el cuerpo de la respuesta (@ResponseBody)
    public List<Experiencia> verExperiencias() {
        return expServ.verExperiencias();
    
}
    
    @DeleteMapping ("/delete/{id}")
    public void eliminarExperiencia(@PathVariable int id) {
        expServ.eliminarExperiencia(id);
    }
    @GetMapping ("/buscar/estudio/{id}")
    public Experiencia buscarExperiencia(@PathVariable Integer id){
        return expServ.buscarExperiencia(id);
    }
    }

