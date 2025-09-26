/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml;

/**
 *
 * @author ayrtonpro24
 */
public class Main {

    public static void main(String[] args) {
        Autor autor = new Autor("G. G. Márquez", "Colombiana");
        Editorial editorial = new Editorial("Sudamericana", "Calle Falsa 123");
        Libro libro = new Libro("Cien años de soledad", "978-3-16-148410-0", editorial);
        libro.setAutor(autor);

        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());

    }

}
