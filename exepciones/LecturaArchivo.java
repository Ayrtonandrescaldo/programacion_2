package Excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LecturaArchivo {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del archivo txt: ");
        String nombre = scan.nextLine();
        
        try {
            File archivo = new File(nombre);
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            System.out.println(br.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no fue encontrado.");
        } catch(IOException ex){
            System.out.println("Error de E/S");
            System.out.println(ex.getMessage());
        }
    }
    
}