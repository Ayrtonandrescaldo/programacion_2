/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayrtonpro24
 */
public class ejer13 {
    public static void mostrarPrecios(double[] precios, int indice) {
        if (indice >= precios.length) {
            return;
        }
        System.out.println("precio: $" + precios[indice]);
        mostrarPrecios(precios, indice + 1);
    }

    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("precios originales:");
        mostrarPrecios(precios, 0);

        precios[2] = 129.99;

        System.out.println("precios modificados:");
        mostrarPrecios(precios, 0);
    }
}

    

