package modelo;

public class Persona implements PuedeCantar {

    @Override
    public void cantar() {
        System.out.println("LA PERSONA CANTA ASI: DO RE MI FA SOL LA SI...");
    }
    
}
