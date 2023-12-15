/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba1;

/**
 *
 * @author Lissette
 */
import java.util.Scanner;
class persona {
    public String nombre;
    public int edad;
    private String cedula;

    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        Scanner scanner = new Scanner(System.in);

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Ingrese la cedula: ");
                this.cedula = scanner.nextLine();

                validInput = true;
            } catch (Exception e) {
                System.out.println("Error!!! Ingresa una cedula válida.");
                scanner.nextLine();
            }
        }
    }

    public void comer() {
        System.out.println("Persona comiendo");
    }

    public void dormir() {
        System.out.println("Persona durmiendo");
    }
}

