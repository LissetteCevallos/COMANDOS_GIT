/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animales;

/**
 *
 * @author Lissette
 */
public class Perro {
    String nombre ;//atributos
    int edad;
    String raza;

    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }
    
    public void correr(){
        System.out.println(this.nombre+"  Empezo a correr ");   
    }
    public void saltar(){
        System.out.println(this.nombre+"   Empezara a saltar");
    }
}
