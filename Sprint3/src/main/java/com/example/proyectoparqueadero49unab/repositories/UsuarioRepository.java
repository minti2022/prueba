package com.example.proyectoparqueadero49unab.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.example.proyectoparqueadero49unab.models.UsuarioModels;

public interface UsuarioRepository extends CrudRepository<UsuarioModels, Long>{

    public abstract ArrayList<UsuarioModels> findByPrioridad(Integer prioridad);
    public abstract ArrayList<UsuarioModels> findBytelefono(String telefono);
    public abstract ArrayList<UsuarioModels> findByemail(String email);
    public abstract ArrayList<UsuarioModels> findBynombre(String nombre);
    
    
}
