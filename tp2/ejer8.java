import java.util.Scanner;

public class ejer8 {
    
    /*Cálculo del Precio Final con impuesto y descuento.
Crea un método calcularPrecioFinal(double impuesto, double
descuento) que calcule el precio final de un producto en un e-commerce. La
fórmula es:
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times
Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de
impuesto y el porcentaje de descuento, llama al método y muestra el precio
final.
Ejemplo de entrada/salida:
Ingrese el precio base del producto: 100
Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): 10
Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): 5
El precio final del producto es: 105.0
*/
    
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double imp = impuesto / 100;
        double desc = descuento / 100;
        return precioBase + (precioBase * imp) - (precioBase * desc);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("ingrese el precio base del producto: ");
        double precioBase = scan.nextDouble();

        System.out.print("ingrese el impuesto en porcentaje (ejemplo: 10 para 10%): ");
        double impuesto = scan.nextDouble();

        System.out.print("ingrese el descuento en porcentaje (ejemplo: 5 para 5%): ");
        double descuento = scan.nextDouble();

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("el precio final del producto es: " + precioFinal);
    }
}
