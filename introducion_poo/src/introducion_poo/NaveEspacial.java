/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introducion_poo;

/**
 *
 * @author ayrtonpro24
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + "ha despegado");
        } else {
            System.out.println("no hay suficiente combustible para despegar.");
        }
    }
    public void avanzar(int distancia) {
        int consumo = distancia * 2;
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " km.");
        } else {
            System.out.println("no hay suficiente combustible para avanzar.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= MAX_COMBUSTIBLE) {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades.");
        } else {
            combustible = MAX_COMBUSTIBLE;
            System.out.println("se llenó el tanque al máximo.");
        }
    }

    public void mostrarEstado() {
        System.out.println("nave: " + nombre + "combustible: " + combustible);
    }

    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial("apollo", 50);
        nave.mostrarEstado();
        nave.avanzar(20);
        nave.recargarCombustible(30);
        nave.despegar();
        nave.avanzar(20);
        nave.mostrarEstado();
    }
}