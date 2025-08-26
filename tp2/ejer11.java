
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayrtonpro24
 */
public class ejer11 {

    static double descuentoEspecial = 0.10;

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuentoEspecial;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("el descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("el precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("ingrese el precio del producto: ");
        double precio = scan.nextDouble();

        calcularDescuentoEspecial(precio);
    }
}

    

