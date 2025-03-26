package com.mycompany.ejercicio6;

/**
 *
 * @author jhon
 */
public class persona { 
    private String nombre; 
    private int edad; 

   
    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

 
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }
}
