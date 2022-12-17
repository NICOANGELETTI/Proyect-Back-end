
package com.portfolio.proyect.controller;

import com.portfolio.proyect.model.Persona;
import com.portfolio.proyect.service.PersonaService;

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
@RequestMapping("persona") //Localhost:8080/persona
@CrossOrigin(origins = "http://localhost:4200")
public class CPersona {
     @Autowired
       //Implementamos interfaz
      public PersonaService persoServ;
 
 
    
    @PostMapping ("/new/persona")
      //Recibiremos el json de la persona a agregar mediante @RequestBody
    public void agregarPersonas(@RequestBody Persona pers) {
            persoServ.crearPersona(pers);
    }
    
    //Consultar la lista de personas , nos devuelve las personas que cargamos en formato json desde -->Body-->raw
    
    @GetMapping("/ver/personas")
    @ResponseBody //Lo que devuelve la funcion la devuelve en el cuerpo de la respuesta (@ResponseBody)
    public List<Persona> verPersonas() {
        return persoServ.verPersonas();
    
}
    
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona(@PathVariable int id) {
        persoServ.borrarPersona(id);
    }
   
    }


