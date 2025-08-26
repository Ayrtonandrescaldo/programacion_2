
import java.util.Scanner;


public class ejer9 {
    /*
}
    Composición de funciones para calcular costo de envío y total de compra.
a. calcularCostoEnvio(double peso, String zona): Calcula el costo de
envío basado en la zona de envío (Nacional o Internacional) y el peso del
paquete.
Nacional: $5 por kg
Internacional: $10 por kg
b. calcularTotalCompra(double precioProducto, double
costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
el costo de envío.
Desde main(), solicita el peso del paquete, la zona de envío y el precio
del producto. Luego, muestra el total a pagar.
Ejemplo de entrada/salida:
Ingrese el precio del producto: 50
Ingrese el peso del paquete en kg: 2
Ingrese la zona de envío (Nacional/Internacional): Nacional
El costo de envío es: 10.0
El total a pagar es: 60.0
*/
    
    
    
    
    
    
    

    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("internacional")) {
            return peso * 10;
        } else {
            return 0;
        }
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("ingrese el precio del producto: ");
        double precioProducto = scan.nextDouble();

        System.out.print("ingrese el peso del paquete en kg: ");
        double peso = scan.nextDouble();
        scan.nextLine();

        System.out.print("ingrese la zona de envío (nacional/internacional): ");
        String zona = scan.nextLine();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("el costo de envío es: " + costoEnvio);
        System.out.println("el total a pagar es: " + total);
    }
}

    
    

