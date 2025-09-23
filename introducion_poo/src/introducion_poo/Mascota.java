/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introducion_poo;

/**
 *
 * @author ayrtonpro24
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("mascota: " + nombre + " | especie: " + especie + " | Edad: " + edad);
    }
    public void cumplirAnios() {
        edad++;
    }
    public static void main(String[] args) {
        Mascota m1 = new Mascota("mia", "perro", 4);
        m1.mostrarInfo();
        m1.cumplirAnios();
        m1.mostrarInfo();
    }
}

    

