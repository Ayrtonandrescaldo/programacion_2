
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayrtonpro24
 */
public class ejer10 {
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("ingrese el stock actual del producto: ");
        int stockActual = scan.nextInt();

        System.out.print("ingrese la cantidad vendida: ");
        int cantidadVendida = scan.nextInt();

        System.out.print("ingrese la cantidad recibida: ");
        int cantidadRecibida = scan.nextInt();

        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        System.out.println("el nuevo stock del producto es: " + nuevoStock);
    }
}

    

