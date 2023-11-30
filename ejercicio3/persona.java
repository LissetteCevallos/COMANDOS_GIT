/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author Lissette
 */
public class persona {
    String nombre;
    int edad ;
    private String cedula;

    public persona(String nombre, int edad, int cedula) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getcedula(){
        return cedula;
    }
    public void setcedula(String cedula){
        
        this.cedula=cedula ;
    }
   
    public void comer(){

    }
    public void domir(){
    
    }
}

