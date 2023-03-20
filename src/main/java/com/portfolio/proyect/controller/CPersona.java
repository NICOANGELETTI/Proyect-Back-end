
package com.portfolio.proyect.controller;

import com.portfolio.proyect.model.Persona;
import com.portfolio.proyect.service.PersonaService;
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
@RequestMapping("persona") //Localhost:8080/persona
@CrossOrigin(origins = {"https://portfolio-frontend-nico.web.app/persona"})
public class CPersona {
     @Autowired
       
      public PersonaService persoServ;
 
 
  //Creo con metodo POST
    @PostMapping ("/nueva/personas")
    @ResponseBody
    public void create(@RequestBody Persona pers) {
            persoServ.crearPersona(pers);
    }
    
   
    //Traigo lista con metodo GET
    @GetMapping("/lista")
    @ResponseBody //Lo que devuelve la funcion la devuelve en el cuerpo de la respuesta (@ResponseBody)
        public ResponseEntity<List<Persona>> verPersonas() {
             List<Persona> verPersonas = persoServ.verPersonas();
           return new ResponseEntity(verPersonas, HttpStatus.OK);
    
}
      
    //Borro con metodo DELETE
    @DeleteMapping ("/delete/persona/{id}")
    public void borrarPersona(@PathVariable int id) {
        persoServ.borrarPersona(id);
    }
    
   //Actualizo con metodo PUT
    @PutMapping("/update/{id}")
    public Persona editarPersona(@PathVariable int id,
            @RequestParam("nombre") String nuevoNombre ,
            @RequestParam("apellido") String nuevoApellido ,
            @RequestParam("tituloDeveloper") String nuevoTitulo ,
            @RequestParam("url_imagenperfil") String nuevoUrl,
            @RequestParam("edad") int nuevaEdad)
           
            
            {
        Persona persona = persoServ.buscarPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setTituloDeveloper(nuevoTitulo);
        persona.setUrl_imagenperfil(nuevoUrl);
        persona.setEdad(nuevaEdad);
         persoServ.crearPersona(persona);
         
       return persona;
    } 
    }


