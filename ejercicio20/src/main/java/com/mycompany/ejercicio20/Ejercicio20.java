package com.mycompany.ejercicio20;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhon
 */
public class Ejercicio20 {

    public static void main(String[] args) {
      
        List<Libro> libros = new ArrayList<>();

      
        libros.add(new Libro("IT", "Stephen King"));
        libros.add(new Libro("Dune", "Frank Herbert"));
        libros.add(new Libro("1984", "George Orwell"));
        libros.add(new Libro("El Quijote", "Miguel de Cervantes"));
        libros.add(new Libro("Ojo", "Autor Original"));

        
        mostrarYActualizarLibros(libros);
    }

 
    public static void mostrarYActualizarLibros(List<Libro> libros) {
        for (Libro libro : libros) {
            System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor());

            
            if (libro.getTitulo().length() < 5) {
                libro.setAutor("Desconocido");
            }
        }

      
        System.out.println("\n--- Lista actualizada ---");
        for (Libro libro : libros) {
            System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor());
        }
    }
}
