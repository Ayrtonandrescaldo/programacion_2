package Interfaces;

import java.util.ArrayList;

public class Pedido implements Pagable { // Extendemos de pagable
    // Declaramos atributos
    ArrayList<Producto> productos;
    private String estado;
    private Cliente cliente;
    
    // Creamos el constructor inicializando el array
    public Pedido(String estado, Cliente cliente) {
        this.estado = estado;
        this.cliente = cliente;
        this.productos = new ArrayList();
    }
    
    // Metodo para agregar un producto al array
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    // Sobreescribimos el metodo calcular total
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        
        return total;
    }
    
    // Metodo para notificar el estado del pedido al cliente
    public void notificarEstado(String nuevoestado) {
        this.estado = nuevoestado;
        cliente.notificarCamboDeEstado(nuevoestado);
    }
    
}
