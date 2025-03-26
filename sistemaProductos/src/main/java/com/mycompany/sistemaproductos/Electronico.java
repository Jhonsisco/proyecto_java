package com.mycompany.sistemaproductos;

public class Electronico extends Producto {
    private String marca;

    public Electronico(String nombre, String codigo, double precio, String marca) {
        super(nombre, codigo, precio);
        this.marca = marca;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Electrónico: " + nombre + " | Código: " + codigo + " | Precio: $" + precio + " | Marca: " + marca);
    }
}
