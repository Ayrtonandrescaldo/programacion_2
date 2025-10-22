package EjercicioCuatro;

public class Vaca extends Animal{ // extendemos de animal
    // Sobreescribimos hacer sonido
    @Override
    public void hacerSonido(){
        System.out.println("MUUU!!");
    }
}
