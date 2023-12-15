/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_examen;
import java.util.Scanner;


public class Practica_Examen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean datosCorrectos = false;
    do {    
    try {    
            System.out.print("Ingrese el nombre del empelado: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el apellido del empleado: ");
            String apellido = scanner.nextLine();
            System.out.print("Ingrese el salario del empleado: ");
            double salario = scanner.nextInt();
            System.out.print("Ingrese la edad del empleado: ");
            int edad = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Ingrese el lenguaje que utiliza empleado: ");
            String lenguajeprogram = scanner.nextLine();

            Desarrollador Desarrollador1 =new Desarrollador(nombre,apellido,edad,lenguajeprogram);
            //String Salario = Desarrollador1.setSalario(salario);
            System.out.println("\n");
            Desarrollador1.calcular_bono();
            System.out.println("\n");
            Desarrollador1.mostrar_informacion();
        
             datosCorrectos = true;          
        
        }catch(NumberFormatException e){
            
            System.out.println("Error: Ingrese un número válido para la edad.");
        }
    } while (!datosCorrectos);
        datosCorrectos = false;
        System.out.println("Se registro el Desarollador");
        
    do {    
    try {    
        
        System.out.print("Ingrese el nombre del empelado: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del empleado: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese el salario del empleado: ");
        double salario = scanner.nextInt();
        System.out.print("Ingrese la edad del empleado: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el departamento del empleado: ");
        String departamentos = scanner.nextLine();
        
        Gerente Gerente1 = new Gerente (nombre,apellido,edad,departamentos);
       // String Salario = Gerente1.setSalario(salario);
        System.out.println("\n");
        Gerente1.calcular_bono();
        System.out.println("\n");
        Gerente1.mostrar_informacion();
        
    }catch(NumberFormatException e)
        {
        System.out.println("Error: Ingrese un número válido para la edad.");
        }
    
    } while (!datosCorrectos);
   
        datosCorrectos = false;
        System.out.println("Se registro el Gerente ");
    
    }
}

