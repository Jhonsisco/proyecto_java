package com.mycompany.sistemaproductos;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaProducto {
    private static ArrayList<Producto> productos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- Menú de Gestión de Productos ---");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Mostrar Todos los Productos");
            System.out.println("3. Buscar Producto por Código");
            System.out.println("4. Eliminar Producto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    mostrarProductos();
                    break;
                case 3:
                    buscarProducto();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 5);
        scanner.close();
    }

    private static void agregarProducto() {
        System.out.println("\nSeleccione el tipo de producto:");
        System.out.println("1. Electrónico");
        System.out.println("2. Alimento");
        System.out.println("3. Ropa");
        System.out.print("Opción: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese código del producto: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingrese precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        switch (tipo) {
            case 1:
                System.out.print("Ingrese marca: ");
                String marca = scanner.nextLine();
                productos.add(new Electronico(nombre, codigo, precio, marca));
                break;
            case 2:
                System.out.print("Ingrese fecha de vencimiento: ");
                String fecha = scanner.nextLine();
                productos.add(new Alimento(nombre, codigo, precio, fecha));
                break;
            case 3:
                System.out.print("Ingrese talla: ");
                String talla = scanner.nextLine();
                productos.add(new Ropa(nombre, codigo, precio, talla));
                break;
            default:
                System.out.println("Opción inválida.");
        }
        System.out.println("Producto agregado.");
    }

    private static void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            for (Producto p : productos) {
                p.mostrarDetalles();
            }
        }
    }

    private static void buscarProducto() {
        System.out.print("Ingrese código del producto: ");
        String codigo = scanner.nextLine();
        for (Producto p : productos) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                p.mostrarDetalles();
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    private static void eliminarProducto() {
        System.out.print("Ingrese código del producto a eliminar: ");
        String codigo = scanner.nextLine();
        productos.removeIf(p -> p.getCodigo().equalsIgnoreCase(codigo));
        System.out.println("Producto eliminado.");
    }
}
