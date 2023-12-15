/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica1;
import java.util.Scanner;
/*Construye un programa que ,al recibir como datos el costo de un articulo vendido
y la cantidad e dinero
1.El cambio que se debe entregar al cliente,si el pago efectuado es mayor que el precio del producto
2.¿Que pasa si el cliente paga exactamente lo que vale el producto?
3.La cantidad de dinero que falta por pagar,si el pago efectuado es menor que el precio del producto */

public class Practica1 {
    Scanner entrada = new Scanner(System.in);
    
   public Practica1(){
       
        float pre, pag, cambio, faltante;
        System.out.println("Ingrese el precio del articulo");
        pre=entrada.nextFloat();
        System.out.println("Cuanto a pagado el cliente");
        pag=entrada.nextFloat();
        
        cambio=pag-pre;
        faltante=pre-pag;
        
        if(cambio<0){
            System.out.println("Falta dinero en el pago"+faltante);
            
        }
        else if (cambio==0){
            
            System.out.println("Su pago fue exitoso.No tiene cambio");
        }
        else if (cambio>0){
            System.out.println("El cambio a dar es "+cambio);
        }
    }
   
    public static void main(String[] args) {
        Practica1 solucion = new Practica1(){
            
        };
    }
}
