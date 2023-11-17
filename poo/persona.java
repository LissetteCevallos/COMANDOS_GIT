/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author Lissette
 */
public class persona {
    String nombre; //atributo
    int edad; //atributo 
    String apellido;
public persona(String nombre , int edad,String apellido ){
    this.nombre =nombre;//contructor
    this.edad = edad; 
    this.apellido =apellido;
  // crear un metodo
}
public void comer ( ){ //metodo
    //dentro de los parentecis del void podemos poner variables locales 
    System.out.println(this.nombre+" Empezo a comer "); 
}  
public void jugar(){
    System.out.println("Empezo a jugar");
}
}
