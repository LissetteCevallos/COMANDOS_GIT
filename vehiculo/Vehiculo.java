/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehiculo;
import java.util.Scanner;
/**
 *
 * @author Lissette
 */
public class Vehiculo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int vehiculo;
        
        System.out.println("Ingrese la velocidad del vehiculo: ");
        vehiculo= entrada.nextInt();
        
        if(vehiculo > 50){
            System.out.println(" El vehiculo sera multado");
        }
       
    }
}
