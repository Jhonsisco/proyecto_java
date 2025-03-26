package com.mycompany.sistemaproductos;

public class Ropa extends Producto {
    private String talla;

    public Ropa(String nombre, String codigo, double precio, String talla) {
        super(nombre, codigo, precio);
        this.talla = talla;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Ropa: " + nombre + " | Código: " + codigo + " | Precio: $" + precio + " | Talla: " + talla);
    }
}
