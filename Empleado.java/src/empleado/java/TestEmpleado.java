/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado.java;

/**
 *
 * @author ayrtonpro24
 */
public class TestEmpleado {
    
    public static void main(String[] args) {
        Empleado e1 = new Empleado(1, "Andres Caldo", "Programador", 60000);
        Empleado e2 = new Empleado("Sofia Guitierrez", "Diseniadora");
        Empleado e3 = new Empleado("Carlos Gomez", "Tester");

        e1.actualizarSalario(10); 
        e2.actualizarSalario(5000); 
        e3.actualizarSalario(15); 
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println("total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
