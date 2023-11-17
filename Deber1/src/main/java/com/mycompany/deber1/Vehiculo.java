/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deber1;

/**
 *
 * @author Lissette
 */
public class Vehiculo {
    String marca;
    int año;
    int velocidad;
    String matricula;

    public Vehiculo(String marca, int año, int velocidad, String matricula) {
        this.marca = marca;
        this.año = año;
        this.velocidad = velocidad;
        this.matricula = matricula;
    }
   
    public void mover(){
        System.out.println("El auto comenzo a moverse");
    }
    public void trayectoria(){
        if (velocidad > 50){
            System.out.println("Recibira una multa");
        }
    }
}

