package com.mycompany.ejercicio11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhon
 */
public class Ejercicio11 { 

    public static void main(String[] args) {
       
        List<Producto> productos = new ArrayList<>();

       
        productos.add(new Producto("Tablet", 850000));
        productos.add(new Producto("Celular", 670000));
        productos.add(new Producto("Portatil", 2500000));

        
        mostrarProductos(productos);
    }

   
    public static void mostrarProductos(List<Producto> productos) {
        System.out.println("Lista de productos:");
        for (Producto p : productos) {
            System.out.println("Nombre: " + p.getNombre() + ", Precio: $" + p.getPrecio());
        }
    }
}
