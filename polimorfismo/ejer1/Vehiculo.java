package EjercicioUno;

public class Vehiculo {
    // Declaramos los atributos de la clase padre protegidos
    protected String marca;
    protected String modelo;

    // Creamos su constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // Metodo para mostrar la informacionde un vehivulo, el cual vamos a sobreescribir luego
    public void mostrarInfo(){
        System.out.println("Modelo: " + modelo + " ,marca: " + marca);
    }
}