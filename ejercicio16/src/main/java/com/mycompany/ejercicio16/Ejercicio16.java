package com.mycompany.ejercicio16;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhon
 */
public class Ejercicio16 { 

    public static void main(String[] args) {
        
        List<Producto> productos = new ArrayList<>();

        
        productos.add(new Producto("Laptop", 750.000));
        productos.add(new Producto("Teclado", 250.000));
        productos.add(new Producto("Mouse", 80.000));
        productos.add(new Producto("Monitor", 980.000));
        productos.add(new Producto("Impresora", 650.000));
        productos.add(new Producto("Audífonos", 45.000));

       
        System.out.println("Lista de productos:");
        for (Producto p : productos) {
            p.mostrarDatos();
        }

        
        System.out.println("\nProductos con precio mayor a $50:");
        mostrarProductosCaros(productos);
    }

    
    public static void mostrarProductosCaros(List<Producto> productos) {
        for (int i = 0; i < productos.size(); i++) { 
            if (productos.get(i).getPrecio() > 50) {
                productos.get(i).mostrarDatos();
            }
        }
    }
}
