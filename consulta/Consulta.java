/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consulta;

/**
 *
 * @author Lissette
 * buble for_each
 */
public class Consulta {

    public static void main(String[] args) {
        String[] nombres={"Lissette","Carolina","Mateo","David","jessica","sofia"};
        
      /*  for(int i=0;i<4;i++){
            
            System.out.println(nombres[i]);
        }
        */
//for each
            for(String i:nombres){  
                
                System.out.println("Nombres: "+i);
                
            }
    }
}
