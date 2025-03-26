package com.mycompany.ejercicio10;

/**
 *
 * @author jhon
 */
public class Animal { 
    private String nombre; 

    
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

   
    public void mostrarNombre() {
        System.out.println("El nombre del animal es: " + nombre);
    }
}
