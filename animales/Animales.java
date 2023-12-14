/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animales;

/**
 *
 * @author Lissette
 */
public class Animales {

    public static void main(String[] args) {
        Gato gato1 = new Gato("Bigotes",14);
        Perro perro1 =new Perro("Copito",15,"Pitbull");
        gato1.maullar();
        gato1.cazar();
        perro1.correr();
        perro1.saltar();
    }
}
