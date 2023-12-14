/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author Lissette
 */
public class Libro {
    String titulo;
    String autor;
    private int anio_publicacion;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void setAnio_public(int anio_public) {
        
        this.anio_publicacion = anio_public;
    }

    public int getAnio_public() {
        
        return anio_publicacion;
    }
    public void calcular_edad(){
        
        
    }
    
    public void mostrar_informacion(){
        System.out.println("El titulo es"+this.titulo);
        System.out.println("El autor es"+this.autor);
        System.out.println("El año de publicacion es"+ getAnio_public());
    }
   
    
    
}

