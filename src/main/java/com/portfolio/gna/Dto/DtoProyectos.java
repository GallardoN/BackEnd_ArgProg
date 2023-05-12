/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.gna.Dto;

import jakarta.validation.constraints.NotBlank;


public class DtoProyectos {
    @NotBlank
    private String nombre;
    @NotBlank
    private String link;
    @NotBlank
    private String descripcion;
    
    
    //Constructores

    public DtoProyectos() {
    }

    public DtoProyectos(String nombre, String link, String descripcion) {
        this.nombre = nombre;
        this.link = link;
        this.descripcion = descripcion;
    }
    
    
    //Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
