package Excepciones;

import java.util.Scanner;

public class ExcepcionPersonalizada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese una edad");
        int edad = Integer.parseInt(scan.nextLine());
        if (edad <= 0 || edad >= 120) {
            throw new EdadInvalidaException("Ingreso una edad invalida");
        }

    }

}