/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba1;

/**
 *
 * @author Lissette
 */
class cuidador extends persona {
    public int numeroId;

    public cuidador(String nombre, int edad, int numeroId) {
        super(nombre, edad);
        this.numeroId = numeroId;
    }

    public void alimentarAnimales() {
        System.out.println("Cuidador alimentando animales");
    }
}
