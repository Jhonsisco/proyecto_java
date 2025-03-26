package com.mycompany.sistemaproductos;

public class Alimento extends Producto {
    private String fechaVencimiento;

    public Alimento(String nombre, String codigo, double precio, String fechaVencimiento) {
        super(nombre, codigo, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Alimento: " + nombre + " | Código: " + codigo + " | Precio: $" + precio + " | Vence: " + fechaVencimiento);
    }
}
