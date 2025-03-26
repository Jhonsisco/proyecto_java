package com.mycompany.sistemavehiculo;

public class Moto extends Vehiculo {

    // Constructor
    public Moto(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }

    @Override
    public void acelerar() {
        System.out.println("La moto está acelerando a gran velocidad...");
    }

    @Override
    public void frenar() {
        System.out.println("La moto está frenando con frenos de tambor...");
    }
}
