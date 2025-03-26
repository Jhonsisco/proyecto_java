package com.mycompany.ejercicio14;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhon
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        
        List<CuentaBancaria> cuentas = new ArrayList<>();

        
        cuentas.add(new CuentaBancaria("123456", 800.000));
        cuentas.add(new CuentaBancaria("789012", 1500.000));
        cuentas.add(new CuentaBancaria("345678", 900.000));
        cuentas.add(new CuentaBancaria("901234", 350.000));

        
        double saldoTotal = calcularSaldoTotal(cuentas);
        
        
        System.out.println("El saldo total de todas las cuentas es: $" + saldoTotal);
    }

   
    public static double calcularSaldoTotal(List<CuentaBancaria> cuentas) {
        double total = 0;
        for (CuentaBancaria cuenta : cuentas) {
            total += cuenta.getSaldo(); 
        }
        return total;
    }
}
