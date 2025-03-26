/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9;

/**
 *
 * @author jhon
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(2500000);
        
        cuenta.depositar(950000);
        
        cuenta.mostrarSaldo();
    }
}
