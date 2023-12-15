/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica2;
import java.util.Scanner;

/*
Construir un progama que al recibir como dato el radio de un articulo,calcule
e imorima tanto su area como
 */
public class Practica2 {
    
public Practica2(){
    Scanner entrada = new Scanner(System.in);
        double rad,area,longitud = 0;
        
        System.out.println("Ingrese el radio del circulo");
        rad=entrada.nextDouble();
        
        area=Math.PI*Math.pow(rad,2);
        
        System.out.println("El area del circulo es "+area);
        System.out.println("La longitud de la circunferencia es"+longitud);
}
    
    public static void main(String[] args) {
        Practica2 solucion = new Practica2();
    }
    
}
