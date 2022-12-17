
package com.portfolio.proyect.controller;

import com.portfolio.proyect.model.Habilidades;
import com.portfolio.proyect.model.Persona;
import com.portfolio.proyect.service.HabilidadesService;

import java.util.List;
import java.util.Optional;
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
@RequestMapping("habilidadeds") //Localhost:8080/persona
@CrossOrigin(origins = "http://localhost:4200")
public class CHabilidades {
     @Autowired
       //Implementamos interfaz
      public HabilidadesService habServ;
 
      @GetMapping("/traer_habilidades")
    @ResponseBody //Lo que devuelve la funcion la devuelve en el cuerpo de la respuesta (@ResponseBody)
    public List<Habilidades> traerHabilidades() {
        return habServ.traerHabilidades();
    
}
   
       /*   @GetMapping("/traer_habilidadesPorID")
    @ResponseBody //Lo que devuelve la funcion la devuelve en el cuerpo de la respuesta (@ResponseBody)
    public Optional<Habilidades> traerHabilidadPorId(@PathVariable int id) {
        return habServ.traerHabilidadPorId(id);
    
}*/
 
@PostMapping ("/nueva/habilidad")
      //Recibiremos el json de la persona a agregar mediante @RequestBody
    public void guardarHabilidad(@RequestBody Habilidades habilidad) {
            habServ.guardarHabilidad(habilidad);
    }
    @DeleteMapping ("/delete_habilidad/{id}")
    public void eliminarHabilidad(@PathVariable int id) {
        habServ.eliminarHabilidad(id);
    }
    
    

    }       



