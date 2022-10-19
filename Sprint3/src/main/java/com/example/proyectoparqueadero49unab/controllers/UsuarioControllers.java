package com.example.proyectoparqueadero49unab.controllers;


import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyectoparqueadero49unab.models.UsuarioModels;
import com.example.proyectoparqueadero49unab.service.UsuarioService;

@RestController
@RequestMapping("/usuario")


public class UsuarioControllers {

@Autowired
UsuarioService usuarioService;
@PostMapping
public UsuarioModels guardarUsuario(@RequestBody UsuarioModels usuario){

    return this.usuarioService.guardarUsuario(usuario);

}
    

        //Listar usuarios

        @RequestMapping
        public ArrayList<UsuarioModels> obtenersuarios(){

            return this.usuarioService.obtenerusuarios();
        }

        @DeleteMapping(path = "/{id}")
        public String eliminarid(@PathVariable("id") Long id){
            boolean ok = this.usuarioService.Eliminar(id);

            if(ok){
                 return "Se eliminó con éxito " + id;
            } else{
                return "No se eliminó con éxito" + id;
            }    
        }

        //Buscar por id
        @GetMapping(path = "/{id}")
        public Optional<UsuarioModels>obtenerusuarioId 
        (@PathVariable("id") Long id){

            return this.usuarioService.obtenerusuarioId(id);
        }



        //Buscar por prioridad

        @RequestMapping("/query")
        public ArrayList<UsuarioModels> obtenerdatosporprioridad(@RequestParam("prioridad")Integer prioridad){
            return this.usuarioService.obtenerusuarioprioridad(prioridad);
    
        }


        //Buscar por telefono

        @RequestMapping("/querytele")
        public ArrayList<UsuarioModels> obtenerdatosportelefono(@RequestParam("telefono")String telefono){
            return this.usuarioService.obtenerusuariotelefono(telefono);
        }

        //Buscar por email

        @RequestMapping("/queryemail")
        public ArrayList<UsuarioModels> obtenerdatosporemail(@RequestParam("email")String email){
            return this.usuarioService.obtenerusuarioporemail(email);
    
        }

        //Buscar por nombre

        @RequestMapping("/querynombre")
        public ArrayList<UsuarioModels> obtenerdatospornombre(@RequestParam("nombre")String nombre){
            return this.usuarioService.obtenerusuariopornombre(nombre);
    
        }


    }
