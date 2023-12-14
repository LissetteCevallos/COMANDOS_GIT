/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deber;

/**
 *
 * @author Lissette
 */
public class Vehiculo {
    String marca;//atributos
    int año;
    String color;

    public Vehiculo(String marca, int año, String color) {//constructor
        this.marca = marca;//instancia
        this.año = año;
        this.color = color;
    }
    public void velocidad(){//metodo
        System.out.println(this.marca+" Su vehiculo a alcanzado una velocidad de 60km/h puede resivir una multa");
    }
}
