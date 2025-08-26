/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2;

import java.util.Scanner;

/**
 *
 * @author ayrtonpro24
 */
public class ejer5 { 
    public static void main(String[] args) {
       /* . Suma de Números Pares (while).  
Escribe un programa que solicite números al usuario y sume solo los 
números pares. El ciclo debe continuar hasta que el usuario ingrese el número 
0, momento en el que se debe mostrar la suma total de los pares ingresados. 
Ejemplo de entrada/salida: 
Ingrese un número (0 para terminar): 4 
Ingrese un número (0 para terminar): 7 
Ingrese un número (0 para terminar): 2 
Ingrese un número (0 para terminar): 0 
La suma de los números pares es: 6*/
        Scanner scan = new Scanner(System.in);
       int numeropares = 0;
      
       int input;
        
        System.out.print("Ingrese un número (0 para terminar): ");
        input = scan.nextInt();

        while (input != 0) {
            if (input % 2 == 0) {
                numeropares += input; // sumo solo si es par
            }
            System.out.print("Ingrese un número (0 para terminar): ");
            input = scan.nextInt(); // pido de nuevo
        }

        System.out.println("La suma de los números pares es: " + numeropares);
    }
}
    

