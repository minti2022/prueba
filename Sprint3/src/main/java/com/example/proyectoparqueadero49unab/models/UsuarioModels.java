package com.example.proyectoparqueadero49unab.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioModels {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(unique = true, nullable = false)

private Long id;
private String email;
private String nombre;
private Integer prioridad;
private String telefono;

public void setId(Long id) {
    this.id = id;
}

public Long getId() {
    return id;
}


public void setEmail(String email) {
    this.email = email;
}

public String getEmail() {
    return email;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getNombre() {
    return nombre;
}

public void setPrioridad(Integer prioridad) {
    this.prioridad = prioridad;
}

public int getPrioridad() {
    return prioridad;
}

public void setTelefono(String telefono) {
    this.telefono = telefono;
}

public String getTelefono() {
    return telefono;
}

}




