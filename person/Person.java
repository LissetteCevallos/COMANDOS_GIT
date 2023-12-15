/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.person;

/**
 *
 * @author Lissette
 */
public class Person {

    private String nombre;
    private int edad;

    public Person(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
   public void setEdad(int edad) {
        
      if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

  public static void main(String[] args) {
        
        Person person = new Person("Jaime", 25);

        System.out.println("Nombre: " + person.getNombre());
        System.out.println("Edad: " + person.getEdad());

        person.setEdad(-10);

        person.setEdad(30);

        System.out.println("Nueva Edad: " + person.getEdad());
}

}
