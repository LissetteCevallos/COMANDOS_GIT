/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.excepciones;

/**
 *
 * @author Lissette
 */
public class Excepciones {

    public static void main(String[] args) {
       int []numeros= {1,2,3};
       try{
           int numero =numeros[2];
           System.out.println("El resultado es"+numero);  
       }catch (ArrayIndexOutOfBoundsException ex){
           System.out.println("La posicion que queremos optener no existe");
       }
    }
}
