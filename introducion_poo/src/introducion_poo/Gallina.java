/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introducion_poo;

/**
 *
 * @author ayrtonpro24
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina) {
        this.idGallina = idGallina;
        this.edad = 0;
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() {
        huevosPuestos++;
    }

    public void envejecer() {
        edad++;
    }

    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + " edad: " + edad + " huevos: " + huevosPuestos);
    }

    public static void main(String[] args) {
        Gallina g1 = new Gallina(1);
        Gallina g2 = new Gallina(2);

        g1.envejecer(); g1.ponerHuevo();
        g2.envejecer(); g2.envejecer(); g2.ponerHuevo(); g2.ponerHuevo();

        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}

