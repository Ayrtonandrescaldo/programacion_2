package Excepciones;

import java.util.Scanner;

public class ConversionNumeroACadena {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un texto que pueda ser convertido a entero");
        String textoAConvertir = scan.nextLine();
        
        try {
            int textoConvertido = Integer.parseInt(textoAConvertir);
            System.out.println("El número convertido es: " + textoConvertido);
        } catch (NumberFormatException ex) {
            System.out.println("Error: El texto ingresado no es un número entero válido.");
        }
    }
    
}