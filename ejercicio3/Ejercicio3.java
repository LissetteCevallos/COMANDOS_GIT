/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;
import java.util.Scanner;
/**
 *
 * @author Lissette
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
    
 do{
        try{
       
        System.out.println("Ingrese el nombre:");
        String nombre= entrada.next();
        entrada.nextLine();
        System.out.println("Ingrese su edad");
        int edad =entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su cedula");
        int cedula =entrada.nextInt();
        entrada.nextLine();
       
        break;
        }
        catch (Exception e){
                System.out.println("Error al capturar el tipo de dato");
        
        }
    }while (true);
    
   }
}

