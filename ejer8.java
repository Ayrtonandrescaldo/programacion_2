import java.util.Scanner;

/**
 *
 * @author ayrtonpro24
 */
public class ejer8 {
    public static void main(String[] args) {
        // División usando enteros
        try (Scanner input = new Scanner(System.in)) {
            // División usando enteros
            System.out.print("Ingrese el primer número entero: ");
            int num1 = input.nextInt();
            
            System.out.print("Ingrese el segundo número entero: ");
            int num2 = input.nextInt();
            
            int resultadoInt = num1 / num2;
            System.out.println("Resultado con enteros: " + resultadoInt);
            
            
        }
    }
}
