package com.mycompany.tp2;

import java.util.Scanner;

/**
 *
 * @author ayrtonpro24
 */
public class ejer2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int n1 = scan.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int n2 = scan.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int n3 = scan.nextInt();

        int mayor = n1;
        if (n2 > mayor) mayor = n2;
        if (n3 > mayor) mayor = n3;

        System.out.println("El mayor es: " + mayor);
    }
}