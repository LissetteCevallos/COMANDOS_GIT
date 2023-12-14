/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author Lissette
 */
public class LibroNoFiccion extends Libro{
    
    public String Tema;

    public LibroNoFiccion(String titulo, String autor,String tema) {
        super(titulo, autor);
        this.Tema=tema;
    }
    
    
}
