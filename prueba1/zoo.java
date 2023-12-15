/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba1;
import java.util.Scanner;

/**
 *
 * @author Lissette
 */

class zoo {
    String nombre;
    int edad;
    private int numeroRegistro;

    public zoo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        Scanner scanner = new Scanner(System.in);

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Ingrese el número de registro: ");
                this.numeroRegistro = scanner.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Error!!! Ingresa un número de registro válido.");
                scanner.nextLine();
            }
        }
    }

    public void comer() {
        System.out.println("Zoo comiendo");
    }

    public void dormir() {
        System.out.println("Zoo durmiendo");
    }
}
