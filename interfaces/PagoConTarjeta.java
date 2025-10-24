package Interfaces;

public class PagoConTarjeta implements Pago{

    @Override
    public void procesarPago(double monto) {
        System.out.println("El total es: " + monto);
        System.out.println("El pago se realizo con éxito!");
    }
    
}
