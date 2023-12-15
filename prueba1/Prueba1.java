
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba1;
import java.util.Scanner;
/**
 *
 * @author Lissette
 */
public class Prueba1 {

    public static void main(String[] args) {
      
        visitante visitante = visitanteCons();
        visitante.comer();
        visitante.dormir();
        visitante.comprar();

        cuidador cuidador = cuidadorCons();
        cuidador.comer();
        cuidador.dormir();
        cuidador.alimentarAnimales();

        leon leon = leonCons();
        leon.comer();
        leon.dormir();
        leon.rugir();
        leon.cazar();

        pinguino pinguino = pinguinoCons();
        pinguino.comer();
        pinguino.dormir();
        pinguino.nadar();
        pinguino.pescar();
    }

    private static visitante visitanteCons() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del visitante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del visitante: ");
        int edad = getIntInput(scanner, "Ingrese una edad válida: ");
        System.out.print("Ingrese el número de carnet del visitante: ");
        int numeroCarnet = getIntInput(scanner, "Ingrese un número de carnet válido: ");
        return new visitante(nombre, edad, numeroCarnet);
    }

    private static cuidador cuidadorCons() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cuidador: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del cuidador: ");
        int edad = getIntInput(scanner, "Ingrese una edad válida: ");
        System.out.print("Ingrese el número de ID del cuidador: ");
        int numeroId = getIntInput(scanner, "Ingrese un número de ID válido: ");
        return new cuidador(nombre, edad, numeroId);
    }

    private static leon leonCons() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del león: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del león: ");
        int edad = getIntInput(scanner, "Ingrese una edad válida: ");
        System.out.print("Ingrese el número de vacunas del león: ");
        int numeroVacunas = getIntInput(scanner, "Ingrese un número de vacunas válido: ");
        return new leon(nombre, edad, numeroVacunas);
    }

    private static pinguino pinguinoCons() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del pingüino: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del pingüino: ");
        int edad = getIntInput(scanner, "Ingrese una edad válida: ");
        return new pinguino(nombre, edad);
    }

    private static int getIntInput(Scanner scanner, String errorMessage) {
        int input = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                input = scanner.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Error: " + errorMessage);
                scanner.nextLine();
            }
        }
        return input;
    }
}
    

