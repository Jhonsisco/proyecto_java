package com.mycompany.ejercicio2;

/**
 *
 * @author jhon
 */
import java.util.Scanner;

public class Ejercicio2 { 

    public static void esParOImpar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt(); 
        
        String resultado = (numero % 2 == 0) ? "par" : "impar"; 
        
        System.out.println("El número " + numero + " es " + resultado + ".");
        
        scanner.close(); 
    }

    public static void main(String[] args) {
        esParOImpar(); 
    }
}
