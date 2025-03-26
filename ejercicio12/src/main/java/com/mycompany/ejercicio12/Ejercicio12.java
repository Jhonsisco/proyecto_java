package com.mycompany.ejercicio12;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhon
 */
public class Ejercicio12 { 

    public static void main(String[] args) {
       
        List<Estudiante> estudiantes = new ArrayList<>();

       
        estudiantes.add(new Estudiante("Jhon", 19));
        estudiantes.add(new Estudiante("Luisa", 25));
        estudiantes.add(new Estudiante("JUlian", 18));
        estudiantes.add(new Estudiante("Carlos", 20));
        estudiantes.add(new Estudiante("Pedro", 25));

       
        mostrarEstudiantesAprobados(estudiantes);
    }

    
    public static void mostrarEstudiantesAprobados(List<Estudiante> estudiantes) {
        System.out.println("Estudiantes aprobados:");
        for (Estudiante e : estudiantes) {
            if (e.getCalificacion() >= 60) { 
                System.out.println("Nombre: " + e.getNombre() + ", Calificación: " + e.getCalificacion());
            }
        }
    }
}
