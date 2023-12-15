/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba1;

/**
 *
 * @author Lissette
 */
public class leon  extends zoo {
    int numeroVacunas;

    public leon(String nombre, int edad, int numeroVacunas) {
        super(nombre, edad);
        this.numeroVacunas = numeroVacunas;
    }

    public void rugir() {
        System.out.println("León rugiendo");
    }

    public void cazar() {
        System.out.println("León cazando");
    }
}
