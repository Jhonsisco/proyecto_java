package com.mycompany.ejercicio5;

/**
 *
 * @author jhon
 */
import java.util.Scanner;

public class Ejercicio5 { 

    public static void calcularDescuento(double monto) { 
        if (monto >= 100) { 
            System.out.println("Tiene un descuento del 10%.");
        } else {
            System.out.println("No tiene descuento.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el monto de compra: ");
        double monto = scanner.nextDouble();
        
        calcularDescuento(monto);
        
        scanner.close(); 
    }
}
