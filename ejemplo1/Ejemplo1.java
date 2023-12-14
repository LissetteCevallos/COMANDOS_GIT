/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplo1;
import java.util.Scanner;
/**
 *
 * @author Lissette
 */
public class Ejemplo1 {

    //ejemplo de porque es importabte limpiar el baffer
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in); // 'in' significa entrada, 'out' significa salida
        // Ejemplo de lectura de datos
        System.out.print("Ingrese su nombre: ");
        String nombre = lectura.nextLine(); // Leemos un dato tipo cadena de caracteres
        System.out.print("Ingrese su edad: ");
        int edad = lectura.nextInt(); // Leemos un dato tipo entero
        System.out.print("Salario: ");
        float salario = lectura.nextFloat();
        // Limpiar el buffer después de leer un entero
          lectura.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = lectura.nextLine();
// ¿Qué pasará si no limpiamos el buffer?
        System.out.println("¿Qué pasará si no limpiamos el buffer?");

        System.out.print("Ingrese su nombre2: ");
        String nombre2 = lectura.nextLine();
        System.out.print("Ingrese su edad2: ");
        int edad2 = lectura.nextInt();
        System.out.print("Salario2: ");
        float salario2 = lectura.nextFloat();
        System.out.print("Ingrese su apellido: ");
        String apellido2 = lectura.nextLine();
        // Cerrar el scanner al finalizar
        lectura.close();
        
    }
}
