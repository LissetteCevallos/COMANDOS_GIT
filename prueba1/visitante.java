/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba1;

/**
 *
 * @author Lissette
 */
class visitante extends persona {
    public int numeroCarnet;

    public visitante(String nombre, int edad, int numeroCarnet) {
        super(nombre, edad);
        this.numeroCarnet = numeroCarnet;
    }

    public void comprar() {
        System.out.println("Visitante comprando");
    }
}
