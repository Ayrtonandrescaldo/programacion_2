package EjercicioCinco;

public class Transferencia implements Pagable{ // Implementamos pagable
    
    // Sobreescribimos el metodo pagar
    @Override
    public void pagar() {
        System.out.println("Pago realizado con transferencia");
    }
    
}
