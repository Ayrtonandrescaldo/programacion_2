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
        Usuario user = new Usuario("Elena Soto", "elena@gmail.com");
        GeneradorQR gen = new GeneradorQR();
        gen.generar("ABC-123", user); // dependencia de creación

    }
}
