package com.mycompany.ejercicio9;

/**
 *
 * @author jhon
 */
public class CuentaBancaria { 
    private double saldo; 
    
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

 
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Se han depositado $" + monto);
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }
}
