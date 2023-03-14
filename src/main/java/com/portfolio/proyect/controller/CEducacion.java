
package com.portfolio.proyect.controller;


import com.portfolio.proyect.model.Educacion;

import com.portfolio.proyect.service.EducacionService;

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
   
     //Llamo a la lista
    @GetMapping ("/lista")
    public ResponseEntity<List<Educacion>> list(){
        List<Educacion> list = eduServ.list();
        return new ResponseEntity(list,HttpStatus.OK);
    }
      //Creo metodo Post
    @PostMapping ("/nuevo/estudio")
    public void create (@RequestBody Educacion estu) {
        eduServ.crearEstudio(estu);
    }
 
        //Elimino con metodo Delete
    @DeleteMapping ("/delete/estudio/{id}")    
    public String eliminarEstudio(@PathVariable Integer id){
        eduServ.eliminarEstudio(id);
        return "la persona fue borrada correctamente";
    }   
    //Traigo por ID
    @GetMapping ("/buscar/estudio/{id}")
    public Educacion buscarEstudio(@PathVariable Integer id){
        return eduServ.buscarEstudio(id);
    }
    
        //Actualizo por ID
      @PutMapping("update/{id}")
    public Educacion editarEducacion(@PathVariable int id,
            @RequestParam("titulo") String nuevoTitulo ,
            @RequestParam("institucion") String nuevaInstitucion ,
            @RequestParam("url_imagen") String nuevaUrl_Imagen ,
            @RequestParam("inicio") String nuevoInicio,
            @RequestParam("fin") String nuevoFin)
           
            
            {
        Educacion edu = eduServ.buscarEducacion(id);
        
        edu.setTitulo(nuevoTitulo);
        edu.setInstitucion(nuevaInstitucion);
        edu.setFin(nuevoFin);
        edu.setUrl_imagen(nuevaUrl_Imagen);
        edu.setInicio(nuevoInicio);
        edu.setFin(nuevoFin);
     
         eduServ.crearEstudio(edu);
         
       return edu;
    } 

}