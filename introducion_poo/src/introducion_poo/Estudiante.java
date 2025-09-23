/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introducion_poo;

/**
 *
 * @author ayrtonpro24
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }  
    public void mostrarInfo() {
        System.out.println("nombre: " + nombre + " " + apellido);
        System.out.println("curso: " + curso);
        System.out.println("calificación: " + calificacion);
        System.out.println(".......................................");
    }

    public void subirCalificacion(double puntos) {
        this.calificacion += puntos;
        System.out.println("se aumentó la calificación en " + puntos + " puntos.");
    }

    public void bajarCalificacion(double puntos) {
        this.calificacion -= puntos;
        System.out.println("se redujo la calificación en " + puntos + " puntos.");
    }
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Ayrton", "Caldo", "programación II", 7.5);

        estudiante1.mostrarInfo();

        estudiante1.subirCalificacion(1.5);
        estudiante1.mostrarInfo();

        estudiante1.bajarCalificacion(2.0);
        estudiante1.mostrarInfo();
    }
}

    

