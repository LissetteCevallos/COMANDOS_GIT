/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animales;

/**
 *
 * @author Lissette
 */
public class Gato {
    String nombre;//atributos
    int edad;

    public Gato(String nombre, int edad) {
        this.nombre = nombre;// iteraciones
        this.edad = edad;
    }
    public void maullar(){
        System.out.println(this.nombre+"Comenzo a maullar");
    }
    public void cazar(){
        System.out.println(this.nombre+" Va a cazar un raton");
    }
}
