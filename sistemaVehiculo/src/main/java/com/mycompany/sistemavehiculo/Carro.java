package com.mycompany.sistemavehiculo;

public class Carro extends Vehiculo {

    // Constructor
    public Carro(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }

    @Override
    public void acelerar() {
        System.out.println("El carro está acelerando a alta velocidad...");
    }

    @Override
    public void frenar() {
        System.out.println("El carro está frenando con frenos de disco...");
    }
}
