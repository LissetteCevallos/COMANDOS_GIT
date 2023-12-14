/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen;
import java.util.Scanner;
/**
 *
 * @author Lissette
 */
public class EXAMEN {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        boolean datosCorrectos = false;
    do {    
    try {    
            System.out.print("Ingrese el titulo del libro: ");
            String titulo = scanner.nextLine();
            System.out.print("Ingrese el autor del libro ");
            String autor = scanner.nextLine();
            System.out.print("Ingrese el año del libro ");
            int anio_public = scanner.nextInt();
            
            scanner.nextLine();
            System.out.print("Ingrese el genero del libro: ");
            String Genero = scanner.nextLine();

             LibroFiccion ficc =new LibroFiccion(titulo,autor,Genero);
           // int anio_public = ficc.setAnio_public(anio_public);
            System.out.println("\n");
            ficc.mostrar_informacion();
            System.out.println("\n");
            ficc.calcular_edad();
        
             datosCorrectos = true;          
        
        }catch(NumberFormatException e){
            
            System.out.println("Error: Ingrese un número válido para el año.");
        }
    } while (!datosCorrectos);
        datosCorrectos = false;
        System.out.println("El año es ");
        
    do {    
    try {    
        
        System.out.print("Ingrese el titulo del libro: ");
         String titulo = scanner.nextLine();
         System.out.print("Ingrese el autor del libro ");
         String autor = scanner.nextLine();
         System.out.print("Ingrese el año del libro ");
            int anio_public = scanner.nextInt();
        System.out.print("Ingrese el tema del libro ");
         String tema = scanner.nextLine();
        
        LibroNoFiccion no_fic = new LibroNoFiccion(titulo,autor,tema);
        no_fic.calcular_edad();
        System.out.println("\n");
        no_fic.mostrar_informacion();
        
    }catch(NumberFormatException e)
        {
        System.out.println("Error: Ingrese un año valido.");
        }
    
    } while (!datosCorrectos);
   
        datosCorrectos = false;
        System.out.println("Se registro el año");
    
    }
    
}

         
       
            
        
    


