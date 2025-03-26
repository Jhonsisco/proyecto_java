package com.mycompany.ejercicio4;

/**
 *
 * @author jhon
 */
import java.util.Scanner;

public class Ejercicio4 { 

    public static void verificarEdad() { 
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt(); 
        
        if (edad >= 18) { 
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
        
        scanner.close(); 
    }

    public static void main(String[] args) { 
        verificarEdad(); 
    }
}
