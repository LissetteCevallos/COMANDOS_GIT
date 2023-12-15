/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_examen;

/**
 *
 * @author Lissette
 */
public class Desarrollador extends Empleado{

    public String lenguajeprogram;

    public Desarrollador(String nombre, String apellido, int edad,String lenguaje) {
        super(nombre, apellido, edad);
        this.lenguajeprogram = lenguaje;
    }

   
}
