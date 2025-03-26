package com.mycompany.ejercicio19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jhon
 */
public class Ejercicio19 { 

    public static void main(String[] args) {
      
        List<Persona> personas = new ArrayList<>();

        
        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("Maria", 30));
        personas.add(new Persona("Carlos", 22));
        personas.add(new Persona("Ana", 28));

       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre a buscar: ");
        String nombreBuscado = scanner.nextLine();

      
        buscarPersonaPorNombre(personas, nombreBuscado);

        scanner.close(); 
    }

    
    public static void buscarPersonaPorNombre(List<Persona> personas, String nombre) {
        int i = 0; 
        boolean encontrada = false; 

        while (i < personas.size()) {
            if (personas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Persona encontrada: " + personas.get(i).getNombre() + ", Edad: " + personas.get(i).getEdad());
                encontrada = true;
                break; 
            }
            i++;
        }

        
        if (!encontrada) {
            System.out.println("Persona no encontrada en la lista.");
        }
    }
}
