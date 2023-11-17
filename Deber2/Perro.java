/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo2;

/**
 *
 * @author Lissette
 */
public class Perro {
    String nombre;
    int edad;
    String raza;
  public Perro(String nombre,int edad, String raza){
      this.nombre = nombre;
      this.edad = edad;
      this.raza = raza;
  }
  public void  ladrar(){
      System.out.println(this.nombre+"  El perro esta ladrando");
  }
}
