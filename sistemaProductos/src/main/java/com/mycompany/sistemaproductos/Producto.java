package com.mycompany.sistemaproductos;

public abstract class Producto implements IProducto {
    protected String nombre;
    protected String codigo;
    protected double precio;

    public Producto(String nombre, String codigo, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract void mostrarDetalles();
}
