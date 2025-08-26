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
public class ejer3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese su edad: ");
        int edad = scan.nextInt();
        
         if (edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad < 18) {
            System.out.println("Eres un Adolescente.");
        } else if (edad < 60) {
            System.out.println("Eres un Adulto.");
        } else {
            System.out.println("Eres un Adulto mayor.");
    }    
}
    }
