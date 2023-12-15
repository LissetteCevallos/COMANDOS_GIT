/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_examen;

/**
 *
 * @author Lissette
 */
public class Gerente extends Empleado{
    String departament;

    public Gerente(String nombre, String apellido, int edad,String departamentos) {
        super(nombre, apellido, edad);
        this.departament = departamentos;
    }
   
}
