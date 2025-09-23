/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introducion_poo;

/**
 *
 * @author ayrtonpro24
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    } 
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

    public void setAnioPublicacion(int anio) {
        if (anio > 1400 && anio <= 2025) {
            this.anioPublicacion = anio;
        } else {
            System.out.println("año no valido");
        }
    }
    public void mostrarInfo() {
        System.out.println("libro: " + titulo + " autor: " + autor +
                "  año: " + anioPublicacion);
    }
    public static void main(String[] args) {
        Libro l1 = new Libro("El Quijote", "Cervantes", 1605);
        l1.mostrarInfo();
        l1.setAnioPublicacion(1300); 
        l1.setAnioPublicacion(2005); 
        l1.mostrarInfo();
    }
}
