package com.mycompany.ejercicio15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jhon
 */
public class Ejercicio15 { 

    public static void main(String[] args) {
      
        List<Persona> personas = new ArrayList<>();

       
        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("María", 30));
        personas.add(new Persona("Carlos", 28));
        personas.add(new Persona("Ana", 22));

        
        System.out.println("Lista de personas antes del cambio:");
        for (Persona p : personas) {
            p.mostrarDatos();
        }

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngrese el nombre actual de la persona: ");
        String nombreActual = scanner.nextLine();

        System.out.print("Ingrese el nuevo nombre: ");
        String nuevoNombre = scanner.nextLine();

        
        cambiarNombre(personas, nombreActual, nuevoNombre);

        
        System.out.println("\nLista de personas después del cambio:");
        for (Persona p : personas) {
            p.mostrarDatos();
        }

        scanner.close();
    }

    
    public static void cambiarNombre(List<Persona> personas, String nombreActual, String nuevoNombre) {
        boolean encontrado = false;
        for (Persona p : personas) {
            if (p.getNombre().equalsIgnoreCase(nombreActual)) { 
                p.setNombre(nuevoNombre);
                System.out.println("\nNombre cambiado con éxito.");
                encontrado = true;
                break; 
            }
        }
        if (!encontrado) {
            System.out.println("\nNo se encontró a una persona con ese nombre.");
        }
    }
}
