package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        String nombre = "";
        double precioUnitario = 0;

        do {
            System.out.println("MENU");
            System.out.println("1. Agregar nuevo peluche");
            System.out.println("2. Calcular costo de venta");
            System.out.println("3. Mostrar información de un peluche");
            System.out.println("4. Editar precio unitario de un peluche");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del peluche: ");
                    nombre = teclado.next();
                    System.out.print("Ingrese el precio unitario del peluche: ");
                    precioUnitario = teclado.nextDouble();
                    
                    break;
                case 2:
                    double costoVenta = calcularCostoVenta(precioUnitario);
                    System.out.println("El costo de venta es: " + costoVenta);
                    break;
                case 3:
                    mostrarInformacionPeluche(nombre, precioUnitario);
                    break;
                case 4:
                    System.out.print("Ingrese el nuevo precio unitario del peluche: ");
                    precioUnitario = teclado.nextDouble();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

            System.out.println();

        } while (opcion != 5);


    }

    public static double calcularCostoVenta(double precioUnitario) {
        double iva = 0.19;
        return precioUnitario + (precioUnitario * iva);
    }

    public static void mostrarInformacionPeluche(String nombre, double precioUnitario) {
        double costoVenta = calcularCostoVenta(precioUnitario);
        System.out.println("Información del peluche:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio unitario: " + precioUnitario);
        System.out.println("Precio de venta: " + costoVenta);
    }
}
