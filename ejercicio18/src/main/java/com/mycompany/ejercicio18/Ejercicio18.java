package com.mycompany.ejercicio18;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhon
 */
public class Ejercicio18 { 

    public static void main(String[] args) {
     
        List<CuentaBancaria> cuentas = new ArrayList<>();

        
        cuentas.add(new CuentaBancaria("12345", 1500.50));
        cuentas.add(new CuentaBancaria("67890", 2000.75));
        cuentas.add(new CuentaBancaria("54321", 800.25));
        cuentas.add(new CuentaBancaria("98765", 3200.00));

        
        double saldoTotal = sumarSaldos(cuentas);
        System.out.println("Saldo total de todas las cuentas: $" + saldoTotal);
    }

    
    public static double sumarSaldos(List<CuentaBancaria> cuentas) {
        double total = 0; 
        int i = 0; 

        do {
            total += cuentas.get(i).getSaldo(); 
            i++; 
        } while (i < cuentas.size());

        return total; 
    }
}
