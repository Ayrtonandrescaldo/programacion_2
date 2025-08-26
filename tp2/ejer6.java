
import java.util.Scanner;




/*Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y
cuente cuántos son positivos, negativos y cuántos son ceros.
Ejemplo de entrada/salida:
Ingrese el número 1: -5
Ingrese el número 2: 3
Ingrese el número 3: 0
Ingrese el número 4: -1
Ingrese el número 5: 6
Ingrese el número 6: 0
Ingrese el número 7: 9
Ingrese el número 8: -3
Ingrese el número 9: 4
Ingrese el número 10: -8
Resultados:
Positivos: 4
Negativos: 4
Ceros: 2
*/


public class ejer6 { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numerosnegativos = 0;
        int numerospositivos = 0;
        int ceros = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = scan.nextInt();

            if (num > 0) {
                numerospositivos++;
            } else if (num < 0) {
                numerosnegativos++;
            } else {
                ceros++;
            }
        }

        // Mostramos resultados
        System.out.println("\nResultados: ");
        System.out.println("Positivos: " + numerospositivos);
        System.out.println("Negativos: " + numerosnegativos);
        System.out.println("Ceros: " + ceros);
    }
}
