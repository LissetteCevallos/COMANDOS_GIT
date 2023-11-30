/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;
import java.util.Scanner;//permite ingresar datos por teclado
/**
 *
 * @author Lissette
 */
public class Calculadora {

    public static void main(String[] args) {
    operaciones  metodo = new operaciones();//creamos un objeto
    Scanner entrada= new Scanner(System.in);
    int num1,num2,resultado,opcion;
    boolean op=true;//opcion verdadera para que se ejecute todos las opciones
        
        System.out.println("1.suma");
        System.out.println("2. resta");
        System.out.println("3.multiplicacion");
        System.out.println("4.división");
        System.out.println("5.salir");
        System.out.println("Ingrese la opcion a elegir:");
        opcion = entrada.nextInt();
        
        if(opcion ==5){
            System.out.println("saliendo de la calculadora");
        }else{
            switch (opcion){
                case 1 : {
                    System.out.println("Ingrese el primer numero");
                    num1 = entrada.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    num2 = entrada.nextInt();
                    resultado = metodo.suma(num1,num2);
                    System.out.println("La suma es:"+resultado);
                    break;
                }
                case 2 :{
                    System.out.println("Ingrese el primer numero");
                    num1 = entrada.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    num2 = entrada.nextInt();
                    resultado = metodo.resta(num1,num2);
                    System.out.println("La resta es:"+resultado);
                    break;
                }
                case 3 : {
                    System.out.println("Ingrese el primer numero");
                    num1 = entrada.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    num2 = entrada.nextInt();
                    resultado = metodo.mult(num1,num2);
                    System.out.println("La multiplicación es:"+resultado);
                    break;
                }
                case 4 : {
                    System.out.println("Ingrese el primer numero");
                    num1 = entrada.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    num2 = entrada.nextInt();
                    resultado = metodo.div(num1,num2);
                    System.out.println("La división es:"+resultado);
                    break;
                }
                    
            }
        }
    }
    
        
    }

