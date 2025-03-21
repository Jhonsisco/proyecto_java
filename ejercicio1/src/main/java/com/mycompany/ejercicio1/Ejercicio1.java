/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author jhon
 */
import java.util.Scanner;

public class Ejercicio1 {  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        verificarNumero(numero); 
        
        scanner.close();
    }
    public static void verificarNumero(int num) {
        if (num > 0) {
            System.out.println("El número es positivo.");
        } else if (num < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }
} 
