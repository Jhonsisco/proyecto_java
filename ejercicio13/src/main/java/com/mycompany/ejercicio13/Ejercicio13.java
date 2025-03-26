package com.mycompany.ejercicio13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jhon
 */
public class Ejercicio13 { 

    public static void main(String[] args) {
       
        List<Libro> libros = new ArrayList<>();

        
        libros.add(new Libro("Cien años de soledad", "Gabriel García Márquez"));
        libros.add(new Libro("El principito", "Antoine de Saint-Exupéry"));
        libros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes"));
        libros.add(new Libro("1984", "George Orwell"));
        libros.add(new Libro("Orgullo y prejuicio", "Jane Austen"));

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el título del libro a buscar: ");
        String tituloBuscado = scanner.nextLine();

        
        buscarLibroPorTitulo(libros, tituloBuscado);

        scanner.close();
    }

    
    public static void buscarLibroPorTitulo(List<Libro> libros, String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) { 
                System.out.println("Libro encontrado. Autor: " + libro.getAutor());
                return; 
            }
        }
        System.out.println("Libro no encontrado.");
    }
}
