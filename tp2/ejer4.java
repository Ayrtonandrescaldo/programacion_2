package com.mycompany.tp2;

import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Pedimos el precio
        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();

        // Pedimos la categoría
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = scan.next().toUpperCase().charAt(0);

        double descuento = 0;

        if (categoria == 'A') {
            descuento = 0.10;
        } else if (categoria == 'B') {
            descuento = 0.15;
        } else if (categoria == 'C') {
            descuento = 0.20;
        } else {
            System.out.println("Categoría inválida.");
            return; // corta el programa si la categoría no es válida
        }

        double precioFinal = precio - (precio * descuento);

        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }
}
