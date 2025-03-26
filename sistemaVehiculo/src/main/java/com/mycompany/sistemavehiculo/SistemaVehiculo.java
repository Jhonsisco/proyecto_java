package com.mycompany.sistemavehiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // Crear objetos de tipo Vehiculo
        Vehiculo carro = new Carro("Toyota", "Corolla", 2022);
        Vehiculo moto = new Moto("Yamaha", "MT-07", 2021);
        Vehiculo bicicleta = new Bicicleta("Specialized", "Rockhopper", 2020);

        // Crear lista de vehículos
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(carro);
        vehiculos.add(moto);
        vehiculos.add(bicicleta);

        // Usar polimorfismo para llamar a los métodos acelerar() y frenar()
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Marca: " + vehiculo.getMarca() + ", Modelo: " + vehiculo.getModelo() + ", Año: " + vehiculo.getAnio());
            vehiculo.acelerar();  // Llamada al método acelerar() según el tipo de vehículo
            vehiculo.frenar();    // Llamada al método frenar() según el tipo de vehículo
            System.out.println();
        }
    }
}
