
        /*Validación de Nota entre 0 y 10 (do-while).
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
hasta que ingrese un valor válido.
Ejemplo de entrada/salida:
Ingrese una nota (0-10): 15
Error: Nota inválida. Ingrese una nota entre 0 y 10.
Ingrese una nota (0-10): -2
Error: Nota inválida. Ingrese una nota entre 0 y 10.
Ingrese una nota (0-10): 8
Nota guardada correctamente.*/
import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;

        do {
            System.out.print("Ingrese una nota (0-10): ");
            input = scan.nextInt();

            if (input < 0 || input > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }

        } while (input < 0 || input > 10);

        System.out.println("Nota guardada correctamente: " + input);
    }
}

       
    

