
package com.portfolio.proyect.controller;


import com.portfolio.proyect.model.Habilidades;
import com.portfolio.proyect.service.HabilidadesService;
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
@RequestMapping("habilidades") //Localhost:8080/persona
@CrossOrigin(origins = {"https://proyect-back-end.onrender.com"})
public class CHabilidades {
     @Autowired
    
      public HabilidadesService habServ;
 
     
     //Traigo la lista mediante GET
     @GetMapping("/lista")
    @ResponseBody 
    public ResponseEntity<List<Habilidades>> traerHabilidades() {
        List<Habilidades> traerHabilidades = habServ.traerHabilidades();
        return new ResponseEntity(traerHabilidades, HttpStatus.OK);
    
}
  
   
      /* @GetMapping("/buscar/habilidad/{id}")
    @ResponseBody //Lo que devuelve la funcion la devuelve en el cuerpo de la respuesta (@ResponseBody)
    public Optional<Habilidades> traerHabilidadPorId(@PathVariable int id) {
        return habServ.traerHabilidadPorId(id);
    
}*/
 //Creo con metodo POST
@PostMapping ("/nueva/habilidad")
      //Recibiremos el json de la persona a agregar mediante @RequestBody
    public void guardarHabilidad(@RequestBody Habilidades habilidad) {
            habServ.guardarHabilidad(habilidad);
    }
    //Borro con metodo DELETE
    @DeleteMapping ("/delete/habilidad/{id}")
    public void eliminarHabilidad(@PathVariable int id) {
        habServ.eliminarHabilidad(id);
    }
    //Actualizo con metodo PUT
     @PutMapping("update/{id}")
    public Habilidades editarHabilidad(@PathVariable int id,
            @RequestParam("habilidad") String nuevaHabilidad ,
            @RequestParam("porcentaje") int nuevoPorcentaje)
       
            
            {
        Habilidades hab = habServ.buscarHabilidades(id);
        
        hab.setHabilidad(nuevaHabilidad);
        hab.setPorcentaje(nuevoPorcentaje);
        habServ.guardarHabilidad(hab);
         
       return hab;
    }

    }       



