package com.example.proyectoparqueadero49unab.service;


import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectoparqueadero49unab.models.UsuarioModels;
import com.example.proyectoparqueadero49unab.repositories.UsuarioRepository;

@Service
public class UsuarioService {

@Autowired
UsuarioRepository usuarioRepository;

//Guardar datos personas
public UsuarioModels guardarUsuario(UsuarioModels usuario){
return usuarioRepository.save(usuario);

        }

    //Buscar dato por id
    public Optional <UsuarioModels> obtenerusuarioId(Long id){

        return usuarioRepository.findById(id);

    }


    //Buscar datos por prioridad

   // public ArrayList<UsuarioModels> obtenerusuarioprioridad(Integer prioridad){

       // return usuarioRepository.findByPrioridad(Id);


   // }

    //Listar usuarios
    
    public ArrayList<UsuarioModels> obtenerusuarios(){

        return(ArrayList<UsuarioModels>)usuarioRepository.findAll();
    }

    //Eliminar persona

    public boolean Eliminar(Long id){
        try{
            usuarioRepository.deleteById(id);
            return true;

        } catch (Exception er) {

            return false;
        }
    }

    //Buscar datos por prioridad

    public ArrayList<UsuarioModels>obtenerusuarioprioridad(Integer prioridad){
        return usuarioRepository.findByPrioridad(prioridad);


    }

    //Buscar datos por telefono

    public ArrayList<UsuarioModels>obtenerusuariotelefono(String telefono){
        return usuarioRepository.findBytelefono(telefono);


    }

    //Buscar datos por email

    public ArrayList<UsuarioModels>obtenerusuarioporemail(String email){
        return usuarioRepository.findByemail(email);
    }

     //Buscar datos por nombre
     public ArrayList<UsuarioModels>obtenerusuariopornombre(String nombre){
        return usuarioRepository.findByemail(nombre);
    }


}
