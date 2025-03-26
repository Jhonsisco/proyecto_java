package com.mycompany.ejercicio17;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhon
 */
public class Ejercicio17 { 

    public static void main(String[] args) {
        
        List<Estudiante> estudiantes = new ArrayList<>();

        
        estudiantes.add(new Estudiante("Juan", 5.0));
        estudiantes.add(new Estudiante("María", 4.5));
        estudiantes.add(new Estudiante("Carlos", 3.5));
        estudiantes.add(new Estudiante("Ana", 4.5));
        estudiantes.add(new Estudiante("Luis", 5.0));
        estudiantes.add(new Estudiante("Elena", 3.5));

       
        int totalAprobados = contarAprobados(estudiantes);
        System.out.println("Total de estudiantes aprobados: " + totalAprobados);
    }

   
    public static int contarAprobados(List<Estudiante> estudiantes) {
        int contador = 0; 
        int i = 0;

        while (i < estudiantes.size()) { 
            if (estudiantes.get(i).getCalificacion() >= 60) {
                contador++; 
            }
            i++; 
        }
        return contador;
    }
}
