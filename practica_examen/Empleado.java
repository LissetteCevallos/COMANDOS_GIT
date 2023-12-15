/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_examen;

/**
 *
 * @author Lissette
 */
public class Empleado {
    
    String nombre;
    String apellido;
    int edad;
    private String salario;

    public Empleado(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getSalario() {
        return salario;
    }
    
    public void calcular_bono(){
        String salario;
        
        
    }
    
    public void mostrar_informacion (){
        System.out.println("El nombre es"+this.nombre);
        System.out.println("El apellido es"+this.apellido);
        System.out.println("La edad es "+this.edad);
        System.out.println("El salario es"+ getSalario());
        
    }
   

    
    
    
    
}
