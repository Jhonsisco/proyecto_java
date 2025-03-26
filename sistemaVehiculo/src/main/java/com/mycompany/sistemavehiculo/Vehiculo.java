package com.mycompany.sistemavehiculo;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;

    // Constructor
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Métodos
    public void acelerar() {
        System.out.println("El vehículo está acelerando...");
    }

    public void frenar() {
        System.out.println("El vehículo está frenando...");
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }
}
