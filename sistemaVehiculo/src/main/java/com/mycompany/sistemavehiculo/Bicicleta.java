package com.mycompany.sistemavehiculo;

public class Bicicleta extends Vehiculo {

    // Constructor
    public Bicicleta(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }

    @Override
    public void acelerar() {
        System.out.println("La bicicleta está acelerando con pedales...");
    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta está frenando con frenos manuales...");
    }
}
